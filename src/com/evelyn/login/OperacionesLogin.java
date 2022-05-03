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
package com.evelyn.login;

import com.evelyn.conexion.ConexionBiblioteca;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Evelyn López Nieto
 */
public class OperacionesLogin {

    ConexionBiblioteca conexion = new ConexionBiblioteca();
    

    public void validarAcceso(String user, String pass) {
        try {
            String sentencia = "SELECT usuario, pass FROM tbl_usuarioSis";
            Connection con = conexion.obConexion();
            Statement consultaD = conexion.crearSentencia();
            ResultSet re = consultaD.executeQuery(sentencia);
            ResultSetMetaData rM = (ResultSetMetaData) re.getMetaData();
            int cantColumnas = rM.getColumnCount();
            Object[] datosUser = new Object[cantColumnas];
            while (re.next()) {
                for (int i = 0; i < cantColumnas; i++) {
                    datosUser[i] = re.getObject(i + 1);
                }
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al conectar a la base de datos..."+e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void registrarUsuario(String nombre, String paterno, String materno, String telefono, String turno,
           String usuario, String pass) {
        try {
            String sentencia = "INSERT INTO tbl_usuarioSis VALUES(NULL,'"+nombre+"','"+paterno+"','"+materno+"',"
                   + "'"+telefono+"','"+turno+"','"+usuario+"','"+pass+"')";
            Connection con = conexion.obConexion();
            Statement registro = conexion.crearSentencia();
            registro.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al registrar..."+e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargarCredenciales(JTextField txNombre, JTextField txPat, JTextField txMat, JTextField txTel,
           JRadioButton rMatutino, JRadioButton rVespertino, JTextField txUser, JTextField txPass) {
        try {
            String sentencia = "SELECT nombre_usuario, apePat_usuario, apeMat_usuario, telefono_usuario, turno, usuario,"
                   + "pass FROM tbl_usuarioSis WHERE ID_usuario=1";
            Connection con = conexion.obConexion();
            Statement consulta = conexion.crearSentencia();
            ResultSet re = consulta.executeQuery(sentencia);
            if (re.next()) {
                txNombre.setText(re.getString("nombre_usuario"));
                txPat.setText(re.getString("apePat_usuario"));
                txMat.setText(re.getString("apeMat_usuario"));
                txTel.setText(re.getString("telefono_usuario"));
                String turno = re.getString("turno");
                if(turno.equals("Matutino")) {
                    rMatutino.setSelected(true);
                } else if(turno.equals("Vespertino")) {
                    rVespertino.setSelected(true);
                }
                txUser.setText(re.getString("usuario"));
                txPass.setText(re.getString("pass"));
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al cargar los datos..."+e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarCredenciales(String nombre, String paterno, String materno, String telefono, String turno,
           String usuario, String pass) {
        try {
            String sentencia = "UPDATE tbl_usuarioSis SET nombre_usuario='"+nombre+"',apePat_usuario='"+paterno+"',"
                   + "apeMat_usuario='"+materno+"',telefono_usuario='"+telefono+"',turno='"+turno+"',usuario='"+usuario+"',"
                   + "pass='"+pass+"' WHERE ID_usuario=1";
            Connection con = conexion.obConexion();
            Statement actualizar = conexion.crearSentencia();
            actualizar.executeUpdate(sentencia);
            conexion.cerrarConexion();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al actualizar los datos..."+e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarCredenciales() {
        try {
            String sentencia = "DELETE FROM tbl_usuarioSis WHERE ID_usuario = 1";
            Connection con = conexion.obConexion();
            Statement eliminar = conexion.crearSentencia();
            eliminar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al eliminar las credenciales..."+e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
