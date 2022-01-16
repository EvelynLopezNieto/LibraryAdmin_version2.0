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
package prestamos;

import com.mysql.jdbc.ResultSetMetaData;
import conexion.ConexionBiblioteca;
import ds.desktop.notify.DesktopNotify;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

    public void actualizarPrestamo(String IDPrestamo, String IDLibro, String IDLector, String fechaPrestamo,
           String fechaEntrega, String turno, String tipoPrestamo, String estado) {
        try {
            String sentencia = "UPDATE tbl_prestamo set ID_libro='" + IDLibro + "',"
                   + "ID_lector='" + IDLector + "',fecha_prestamo='" + fechaPrestamo + "',"
                   + "fecha_entrega='" + fechaEntrega + "',turno='" + turno + "',"
                   + "tipo_prestamo='" + tipoPrestamo + "',status_prestamo=" + estado + ""
                   + " where ID_prestamo='" + IDPrestamo + "'";
            Connection con = conexion.obConexion();
            Statement actualizar = conexion.crearSentencia();
            actualizar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Actualización fallida. Error de la aplicación..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void notifyAvencer() {
        String sentencia = "SELECT COUNT(*) AS 'Notificados_vencer' FROM tbl_prestamo WHERE fecha_entrega BETWEEN CURDATE() and ADDDATE(CURDATE(),INTERVAL 7 DAY);";

        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            re = verBusqueda.executeQuery(sentencia);
            String numVencer = null;
            while (re.next()) {
                numVencer = (re.getString("Notificados_vencer"));
            }
            DesktopNotify.showDesktopMessage("Notificación de vencidos", "Según la revisión de registros, existen " + numVencer + ""
                   + " préstamos totales que están por vencer entre hoy y los próximos 7 días. Para ver cuáles son,"
                   + " vaya al panel de préstamos y realice la búsqueda.", DesktopNotify.INFORMATION);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage("Error de consulta de préstamos", "Ocurrió un error con la apliación, por lo tanto,"
                   + " no se puede mostrar el total de préstamos próximos a vencer de los próximos 7 días..." + e, DesktopNotify.ERROR);
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
    
    public void mostrarIDprestamo(JTextField fecha) {
        try {
            String sentencia = "SELECT ID_prestamo FROM tbl_prestamo WHERE fecha_prestamo = '"+fecha+"'";
            Statement ver = conexion.crearSentencia();
            re = ver.executeQuery(sentencia);
            if(re.next()) {
                String id = re.getString("ID_prestamo");
            }
        } catch (SQLException e) {
        }
    }

    public boolean validarNumeros(String dato) {
        return dato.matches("[0-9]*");
    }
}
