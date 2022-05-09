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
package com.evelyn.lectores;

import com.mysql.jdbc.ResultSetMetaData;
import com.evelyn.conexion.ConexionBiblioteca;
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
public class OperacionesLectores {
    
    ConexionBiblioteca conexion = new ConexionBiblioteca();
    String cabecera[] = {"ID lector", "Nombre", "Apellido paterno", "Apellido materno", "Edad", "Teléfono", "Domicilio", "Grado", "Grupo"};
    String datos[][] = {};

    ResultSet re = null;
    ResultSetMetaData rM = null;
    int nColumnas = 0;
    Object[] datosTabla;
    
    public void registrarLector(String ID, String nombre, String apePaterno, String apeMaterno, String edad,
           String telefono, String domicilio, String grado, String grupo) {
        try {
            String sentencia = "INSERT INTO tbl_lector VALUES('" + ID + "','" + nombre + "','" + apePaterno + "',"
                   + "'" + apeMaterno + "','" + edad + "','" + telefono + "','" + domicilio + "', '"+grado+"', '"+grupo+"')";
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro fallido. Error de la aplicación..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarLector(String ID) {
        try {
            String sentencia = "DELETE FROM tbl_lector WHERE ID_lector = '" + ID + "'";
            Connection con = conexion.obConexion();
            Statement eliminar = conexion.crearSentencia();
            eliminar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Eliminación fallida. Error de la aplicación..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarLector(String ID, String nombre, String apePaterno, String apeMaterno, String edad,
           String telefono, String domicilio, String grado, String grupo) {
        try {
            String sentencia = "UPDATE tbl_lector set nombre_lector='" + nombre + "',"
                   + "ape_paterno_lector='" + apePaterno + "',ape_materno_lector='" + apeMaterno + "',"
                   + "edad_lector='" + edad + "',telefono_lector='" + telefono + "',"
                   + "domicilio_lector='" + domicilio + "', grado_alumno = '"+grado+"', grupo_alumno = '"+grupo+"'"
                   + " where ID_lector='" + ID + "'";
            Connection con = conexion.obConexion();
            Statement actualizar = conexion.crearSentencia();
            actualizar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Actualización fallida. Error de la aplicación..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrarLectores(JTable tbl_lectores, JLabel mensajeReg) {
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
        tbl_lectores.setModel(tabla);
        
        try {
            String sentencia = "SELECT * FROM tbl_lector ORDER BY nombre_lector ASC";
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
    
    public void filtroSearchLectores(JTable tbl_lectores, JLabel mensajeReg, String columna, String dato) {
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
        tbl_lectores.setModel(tabla);
        
        try {
            String sentencia = "SELECT * FROM tbl_lector WHERE "+columna+" = '"+dato+"'";
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
    
    public void cargarDatosLectorForm(String idLec, JTextField IDlector, JTextField nom, JTextField pat, JTextField mat,
           JTextField edad, JTextField tel, JTextField domicilio, JTextField grado, JTextField grupo) {
        try {
            String sentencia = "SELECT ID_lector, nombre_lector, ape_paterno_lector, ape_materno_lector, edad_lector, telefono_lector,"
                   + "domicilio_lector, grado_alumno, grupo_alumno FROM tbl_lector WHERE ID_lector = '"+idLec+"'";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            re = ver.executeQuery(sentencia);
            if(re.next()) {
                IDlector.setText(re.getString("ID_lector"));
                nom.setText(re.getString("nombre_lector"));
                pat.setText(re.getString("ape_paterno_lector"));
                mat.setText(re.getString("ape_materno_lector"));
                edad.setText(re.getString("edad_lector"));
                tel.setText(re.getString("telefono_lector"));
                domicilio.setText(re.getString("domicilio_lector"));
                grado.setText(re.getString("grado_alumno"));
                grupo.setText(re.getString("grupo_alumno"));
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al cargar los datos al formulario..."+e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void infoRegistroLector (String IDlec, JTable tbl_l) {
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
        tbl_l.setModel(tabla);
        
        try {
            String sentencia = "SELECT * FROM tbl_lector WHERE ID_lector = '"+IDlec+"'";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            re = ver.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];
            
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tabla.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al cargar los datos a la tabla..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
