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
package com.evelyn.estadisticas;

import com.evelyn.conexion.ConexionBiblioteca;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Evelyn López Nieto
 */
public class Estadisticas {
    
    ConexionBiblioteca conexion = new ConexionBiblioteca();
    
    //LOS LIBROS MÁS PRESTADOS (GRÁFICO DE BARRAS)
    public void libMasPrestados () {
        try {
            String sentencia = "SELECT ID_libro, COUNT(*) AS 'Cantidad_prestamos' FROM tbl_prestamo GROUP BY ID_libro ORDER BY Cantidad_prestamos DESC LIMIT 5";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            ResultSet re = ver.executeQuery(sentencia);
            
            DefaultCategoryDataset datos = new DefaultCategoryDataset();
            while(re.next()) {
                datos.setValue(re.getInt("Cantidad_prestamos"), re.getString("ID_libro"), re.getString("ID_libro"));
            }
            
            JFreeChart chart = ChartFactory.createBarChart3D("Libros más prestados", "ID de los libros", "Cantidad de préstamos", datos, PlotOrientation.VERTICAL, true, true, false);
            
            int ancho = 250;
            int alto = 250;
            File f = new File("src\\com\\evelyn\\graficos\\librosMasPrestados.png");
            ChartUtilities.saveChartAsPNG(f, chart, alto, ancho);
            conexion.cerrarConexion();
        } catch (IOException | SQLException e) {
        }
    }
    
    //LOS ALUMNOS CON MÁS PRÉSTAMOS (GRÁFICO DE BARRAS)
    public void alumMasPrestamo () {
        try {
            String sentencia = "SELECT ID_lector, COUNT(*) AS 'Cantidad_prestamos' FROM tbl_prestamo GROUP BY ID_lector ORDER BY Cantidad_prestamos DESC LIMIT 5";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            ResultSet re = ver.executeQuery(sentencia);
            
            DefaultCategoryDataset datos = new DefaultCategoryDataset();
            while(re.next()) {
                datos.setValue(re.getInt("Cantidad_prestamos"), re.getString("ID_lector"), re.getString("ID_lector"));
            }
            
            JFreeChart chart = ChartFactory.createBarChart3D("Lectores con más préstamos", "ID de los alumnos", "Cantidad de préstamos", datos, PlotOrientation.VERTICAL, true, true, false);
            
            int ancho = 250;
            int alto = 250;
            File f = new File("src\\com\\evelyn\\graficos\\alumnosMasPrestamos.png");
            ChartUtilities.saveChartAsPNG(f, chart, alto, ancho);
            conexion.cerrarConexion();
        } catch (IOException | SQLException e) {
        }
    }
    
    //CANTIDAD DE PRÉSTAMOS EN CADA TURNO (GRÁFICO CIRCULAR)
    public void prestamosTurno () {
        try {
            String sentencia = "SELECT turno, COUNT(*) AS 'Cantidad' FROM tbl_prestamo GROUP BY turno";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            ResultSet re = ver.executeQuery(sentencia);
            
            DefaultPieDataset dataset = new DefaultPieDataset();
            while(re.next()) {
                dataset.setValue(re.getString("turno"), re.getInt("Cantidad"));
            }
           
            JFreeChart chart = ChartFactory.createPieChart("Préstamos en cada turno",dataset, true, true, false);
            
            int ancho = 250;
            int alto = 250;
            File f = new File("src\\com\\evelyn\\graficos\\prestamosTurno.png");
            ChartUtilities.saveChartAsPNG(f, chart, alto, ancho);
            conexion.cerrarConexion();
        } catch (IOException | SQLException e) {
        }
    }
    
    //CANTIDAD DE PRÉSTAMOS POR TIPO (GRÁFICO CIRCULAR)
    public void prestamosTipo () {
        try {
            String sentencia = "SELECT tipo_prestamo, COUNT(*) AS 'Cantidad' FROM tbl_prestamo GROUP BY tipo_prestamo";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            ResultSet re = ver.executeQuery(sentencia);
            
            DefaultPieDataset dataset = new DefaultPieDataset();
            while(re.next()) {
                dataset.setValue(re.getString("tipo_prestamo"), re.getInt("Cantidad"));
            }
           
            JFreeChart chart = ChartFactory.createPieChart("Préstamos por tipo",dataset, true, true, false);
            
            int ancho = 250;
            int alto = 250;
            File f = new File("src\\com\\evelyn\\graficos\\prestamosTipo.png");
            ChartUtilities.saveChartAsPNG(f, chart, alto, ancho);
            conexion.cerrarConexion();
        } catch (IOException | SQLException e) {
        }
    }
    
    //LIBROS SIN STOCK
    public void sinStock (JLabel label) {
        try {
            String sentencia = "SELECT COUNT(*) AS 'Libros_sin_stock' FROM tbl_libro WHERE ejemplares = 0";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            ResultSet re = ver.executeQuery(sentencia);
            
            if(re.next()) {
                label.setText(re.getString("Libros_sin_stock"));
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
        }
    }
    
    //PRÉSTAMOS DURANTE EL DÍA
    public void prestamosDia (JLabel label) {
        try {
            String sentencia = "SELECT COUNT(*) AS 'Prestamos' FROM tbl_prestamo WHERE fecha_prestamo = CURRENT_DATE";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            ResultSet re = ver.executeQuery(sentencia);
            
            if(re.next()) {
                label.setText(re.getString("Prestamos"));
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
        }
    }
    
    //ENTREGAS DURANTE EL DÍA
    public void entregasDia (JLabel label) {
        try {
            String sentencia = "SELECT COUNT(*) AS 'Entregas' FROM tbl_prestamo WHERE status_prestamo = 'Entregado AND fecha_entrega = CURRENT_DATE'";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            ResultSet re = ver.executeQuery(sentencia);
            
            if(re.next()) {
                label.setText(re.getString("Entregas"));
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
        }
    }
    
    //ENTREGAS PARA EL DÍA
    public void entregaParaDia (JLabel label) {
        try {
            String sentencia = "SELECT COUNT(*) AS 'Entregas' FROM tbl_prestamo WHERE fecha_entrega = CURRENT_DATE";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            ResultSet re = ver.executeQuery(sentencia);
            
            if(re.next()) {
                label.setText(re.getString("Entregas"));
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
        }
    }
    
    //PRÉSTAMOS VENCIDOS
    public void vencidos(JLabel label) {
        try {
            String sentencia = "SELECT COUNT(*) AS 'Vencidos' FROM tbl_prestamo WHERE status_prestamo = 'Vencido'";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            ResultSet re = ver.executeQuery(sentencia);
            
            if(re.next()) {
                label.setText(re.getString("Vencidos"));
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
        }
    }
}
