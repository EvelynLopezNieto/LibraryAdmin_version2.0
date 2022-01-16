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
package libros;

import com.mysql.jdbc.ResultSetMetaData;
import conexion.ConexionBiblioteca;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Evelyn López Nieto
 */
public class OperacionesLibros {

    ConexionBiblioteca conexion = new ConexionBiblioteca();
    String cabecera[] = {"ID del libro", "Nombre del libro", "Nombre del autor", "Editorial", "Año de publicación", "Ciudad", "Área de conocimiento", "Ejemplares"};
    String datos[][] = {};

    ResultSet re = null;
    ResultSetMetaData rM = null;
    int nColumnas = 0;
    Object[] datosTabla;

    public void registrarLibro(String ID, String nombreLibro, String autorLibro, String editorialLibro,
           String anioPublic, String ciudadPublic, String areaConocimiento, int ejemplares) {

        try {
            String sentencia = "INSERT INTO tbl_libro VALUES('" + ID + "','" + nombreLibro + "','" + autorLibro + "',"
                   + "'" + editorialLibro + "','" + anioPublic + "','" + ciudadPublic + "','" + areaConocimiento + "'," + ejemplares + ")";
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro fallido. Error de la aplicación..." + ex, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarLibro(String ID) {
        try {
            String sentencia = "DELETE FROM tbl_libro WHERE ID_libro = '" + ID + "'";
            Connection con = conexion.obConexion();
            Statement eliminar = conexion.crearSentencia();
            eliminar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Eliminación fallida. Error de la aplicación..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizarLibro(String ID, String nombreLibro, String autorLibro, String editorialLibro,
           String anioPublic, String ciudadPublic, String areaConocimiento, int ejemplares) {
        try {
            String sentencia = "UPDATE tbl_libro set nombre_libro='" + nombreLibro + "',"
                   + "autor_libro='" + autorLibro + "',editorial_libro='" + editorialLibro + "',"
                   + "anio_publicacion='" + anioPublic + "',ciudad_publicacion='" + ciudadPublic + "',"
                   + "area_conocimiento='" + areaConocimiento + "',ejemplares=" + ejemplares + ""
                   + " where ID_libro='" + ID + "'";
            Connection con = conexion.obConexion();
            Statement actualizar = conexion.crearSentencia();
            actualizar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Actualización fallida. Error de la aplicación..." + e, "¡¡Error de la aplicación!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarLibros(JTable tbl_libros, JLabel mensajeReg) {
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
        tbl_libros.setModel(tabla);

        try {
            String sentencia = "SELECT * FROM tbl_libro ORDER BY nombre_libro ASC";
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

    public boolean validarNumeros(String dato) {
        return dato.matches("[0-9]*");
    }
}
