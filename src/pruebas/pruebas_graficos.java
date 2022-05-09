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
package pruebas;

import com.evelyn.conexion.ConexionBiblioteca;
import com.mysql.jdbc.ResultSetMetaData;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author evelo
 */
public class pruebas_graficos {

    ConexionBiblioteca conexion = new ConexionBiblioteca();
    
    public void mostrar() throws IOException {

        try {
            String sentencia = "SELECT ID_libro, COUNT(*) AS 'Cantidad_prestamos' FROM tbl_prestamo GROUP BY ID_libro ORDER BY Cantidad_prestamos DESC LIMIT 10";
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            ResultSet re = ver.executeQuery(sentencia);
            
            DefaultCategoryDataset datos = new DefaultCategoryDataset();
            while(re.next()) {
                datos.setValue(re.getInt("Cantidad_prestamos"), re.getString("ID_libro"), re.getString("ID_libro"));
            }
            
            JFreeChart chart = ChartFactory.createBarChart3D("Libros más prestados", "ID de los libros", "Cantidad de préstamos", datos, PlotOrientation.VERTICAL, true, true, false);
            
            int ancho = 350;
            int alto = 350;
            File f = new File("src\\com\\evelyn\\graficos\\prueba.png");
            ChartUtilities.saveChartAsPNG(f, chart, alto, ancho);
            conexion.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(pruebas_graficos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
