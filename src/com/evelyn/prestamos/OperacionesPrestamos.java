/*
 * Copyright (C) 2022 Evelyn López Nieto
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.evelyn.prestamos;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.evelyn.conexion.ConexionBiblioteca;
import ds.desktop.notify.DesktopNotify;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Evelyn López Nieto
 */
public class OperacionesPrestamos {
    
    ConexionBiblioteca conexion = new ConexionBiblioteca();
    String cabecera[] = {"ID préstamo", "ID libro", "ID lector", "Fecha préstamo", "Fecha entrega", "Turno", "Tipo préstamo", "Status"};
    String datos[][] = {};
    
    ResultSet re = null;
    ResultSetMetaData rM = null;
    int nColumnas = 0;
    Object[] datosTabla;
    
    public void registrarPrestamo(String IDLibro, String IDLector, String fechaPrestamo,
           String fechaEntrega, String turno, String tipoPrestamo, String estado) {
        
        try {
            String sentencia = "INSERT INTO tbl_prestamo VALUES(NULL,'" + IDLibro + "',"
                   + "'" + IDLector + "','" + fechaPrestamo + "','" + fechaEntrega + "','" + turno + "',"
                   + "'" + tipoPrestamo + "','" + estado + "')";
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro fallido. Error de la aplicación..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void regHistorialPrestamo(String IDLibro, String IDLector, String fechaPrestamo,
           String fechaEntrega, String turno, String tipoPrestamo) {
        try {
            String sentencia = "INSERT INTO tbl_historial_prestamo VALUES(NULL,'" + IDLibro + "',"
                   + "'" + IDLector + "','" + fechaPrestamo + "','" + fechaEntrega + "','" + turno + "',"
                   + "'" + tipoPrestamo + "')";
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro fallido. Error de la aplicación..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarPrestamo(int ID) {
        try {
            String sentencia = "DELETE FROM tbl_prestamo WHERE ID_prestamo = " + ID + "";
            Connection con = conexion.obConexion();
            Statement eliminar = conexion.crearSentencia();
            eliminar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Eliminación fallida. Error de la aplicación..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarPrestamo(int IDPrestamo, String IDLibro, String IDLector, String fechaPrestamo,
           String fechaEntrega, String turno, String tipoPrestamo, String estado) {
        try {
            String sentencia = "UPDATE tbl_prestamo SET ID_libro='" + IDLibro + "',"
                   + "ID_lector='" + IDLector + "',fecha_prestamo='" + fechaPrestamo + "',"
                   + "fecha_entrega='" + fechaEntrega + "',turno='" + turno + "',"
                   + "tipo_prestamo='" + tipoPrestamo + "',status_prestamo= '" + estado + "'"
                   + " WHERE ID_prestamo= " + IDPrestamo + "";
            Connection con = conexion.obConexion();
            Statement actualizar = conexion.crearSentencia();
            actualizar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Actualización fallida. Error de la aplicación..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarEstadoActualPrestamos() {
        try {
            String sentencia = "UPDATE tbl_prestamo SET status_prestamo = 'Vencido' WHERE fecha_entrega = CURDATE()";
            Connection con = conexion.obConexion();
            Statement actualizar = conexion.crearSentencia();
            actualizar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Actualización fallida. Error de la aplicación..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarEstadoEntregado(int IDpres, String idLib) {
        try {
            String sentencia = "UPDATE tbl_prestamo SET status_prestamo = 'Entregado' WHERE ID_prestamo = " + IDpres + "";
            String sentencia2 = "UPDATE tbl_libro SET ejemplares = ejemplares + 1 WHERE ID_libro = '"+idLib+"'";
            Connection con = conexion.obConexion();
            Statement actualizarPres = conexion.crearSentencia();
            Statement actualizarLib = conexion.crearSentencia();
            actualizarPres.executeUpdate(sentencia);
            actualizarLib.executeUpdate(sentencia2);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Actualización fallida. Error de la aplicación..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void notifyAvencer() {
        String sentencia = "SELECT COUNT(*) AS 'Notificados_vencer' FROM tbl_prestamo WHERE fecha_entrega = CURDATE();";
        
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            re = verBusqueda.executeQuery(sentencia);
            String numVencer = null;
            while (re.next()) {
                numVencer = (re.getString("Notificados_vencer"));
            }
            DesktopNotify.showDesktopMessage("Notificación de vencidos", "Según la revisión de registros, existen " + numVencer + ""
                   + " préstamos totales que vencen el día de hoy. Para ver cuáles son,"
                   + " vaya al panel de préstamos y realice la búsqueda.", DesktopNotify.INFORMATION);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage("Error de consulta de préstamos", "Ocurrió un error con la apliación, por lo tanto,"
                   + " no se puede mostrar el total de préstamos vencidos de hoy..." + e, DesktopNotify.ERROR);
        }
    }
    
    public void mostrarPrestamos(JTable tbl_prestamos, JLabel mensajeReg) {
        DefaultTableModel tabla = new DefaultTableModel(datos, cabecera) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 8) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tbl_prestamos.setModel(tabla);
        
        try {
            String sentencia = "SELECT * FROM tbl_prestamo ORDER BY fecha_prestamo DESC";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            re = ver.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            int cantFilas = 0;
            datosTabla = new Object[nColumnas];
            
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tabla.addRow(datosTabla);
            }
            for (int j = 0; j < tabla.getRowCount(); j++) {
                cantFilas = j + 1;
            }
            
            mensajeReg.setText("Registros encontrados: " + cantFilas);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al cargar los datos a la tabla..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void filtroSearchPrestamo(JTable tbl_prestamos, String dato, JLabel mensajeReg, String columna) {
        DefaultTableModel tabla = new DefaultTableModel(datos, cabecera) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 8) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tbl_prestamos.setModel(tabla);
        try {
            String sentencia = "SELECT * FROM tbl_prestamo WHERE " + columna + " = '" + dato + "' ORDER BY fecha_prestamo DESC";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            re = ver.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            int cantFilas = 0;
            datosTabla = new Object[nColumnas];
            
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tabla.addRow(datosTabla);
            }
            for (int j = 0; j < tabla.getRowCount(); j++) {
                cantFilas = j + 1;
            }
            
            mensajeReg.setText("Registros encontrados: " + cantFilas);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al cargar los datos a la tabla..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void filtroID (JTable tbl_prestamos, int dato, JLabel mensajeReg, String columna) {
        DefaultTableModel tabla = new DefaultTableModel(datos, cabecera) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 8) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tbl_prestamos.setModel(tabla);
        try {
            String sentencia = "SELECT * FROM tbl_prestamo WHERE " + columna + " = '" + dato + "' ORDER BY fecha_prestamo DESC";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            re = ver.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            int cantFilas = 0;
            datosTabla = new Object[nColumnas];
            
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tabla.addRow(datosTabla);
            }
            for (int j = 0; j < tabla.getRowCount(); j++) {
                cantFilas = j + 1;
            }
            
            mensajeReg.setText("Registros encontrados: " + cantFilas);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al cargar los datos a la tabla..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargarDatosPresForm(int IDpres, JTextField idPres, JTextField idLib, JTextField idLec, JTextField datePres, JTextField dateEntrega,
           JRadioButton matutino, JRadioButton vespertino, JRadioButton interno, JRadioButton externo, JComboBox estado) {
        try {
            String sentencia = "SELECT ID_prestamo, ID_libro, ID_lector, fecha_prestamo, fecha_entrega, turno, tipo_prestamo, status_prestamo"
                   + " FROM tbl_prestamo WHERE ID_prestamo = " + IDpres + "";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            re = ver.executeQuery(sentencia);
            if (re.next()) {
                idPres.setText(re.getString("ID_prestamo"));
                idLib.setText(re.getString("ID_libro"));
                idLec.setText(re.getString("ID_lector"));
                datePres.setText(re.getString("fecha_prestamo"));
                dateEntrega.setText(re.getString("fecha_entrega"));
                String turno = re.getString("turno");
                if (turno.equals("Matutino")) {
                    matutino.setSelected(true);
                } else if (turno.equals("Vespertino")) {
                    vespertino.setSelected(true);
                }
                String tipo = re.getString("tipo_prestamo");
                if (tipo.equals("Interno")) {
                    interno.setSelected(true);
                } else if (tipo.equals("Externo")) {
                    externo.setSelected(true);
                }
                estado.setSelectedItem(re.getString("status_prestamo"));
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al cargar los datos al formulario..."+e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean validarNumeros(String dato) {
        return dato.matches("[0-9]*");
    }
}
