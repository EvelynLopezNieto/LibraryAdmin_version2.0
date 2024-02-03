/*
 * Copyright (C) 2023 evelo
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

import org.codehaus.groovy.ast.ClassNode;

/**
 *
 * @author evelo
 */
public class ExecSplash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Splash splash = new Splash();
        
        splash.setVisible(true);
        try {
            int vuelta;
            String porcentaje;
            
            for(vuelta = 0; vuelta<=100; vuelta++){
                Thread.sleep(75);
                porcentaje = String.valueOf(vuelta);
                splash.rSProgCircle.setValue(vuelta);
                splash.rSProgCircle.setString(porcentaje+"%");
            }
        } catch (Exception e) {
        }
        splash.dispose();
        LOGIN login = new LOGIN();
        login.setVisible(true);
    }
    
}
