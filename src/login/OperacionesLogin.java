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
package login;

import conexion.ConexionBiblioteca;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

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
            
        } catch (SQLException e) {
            
        }
    }
}
