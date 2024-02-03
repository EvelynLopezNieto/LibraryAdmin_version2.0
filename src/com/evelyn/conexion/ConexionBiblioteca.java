/*
 * Copyright (C) 2022 evelo
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
package com.evelyn.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Evelyn López Nieto
 */
public class ConexionBiblioteca {

    private Connection conexionLocal;

    public Connection obConexion() {
        try {
            conexionLocal = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/BIBLIOTECA", "root", "MCSPTV09");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos..." + e, "Enlace a base de datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return conexionLocal;
    }

    public Statement crearSentencia() {
        try {
            return conexionLocal.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

    public void cerrarConexion() {
        try {
            if (conexionLocal != null) {
                conexionLocal.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexión..." + e, "Enlace a base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }
}
