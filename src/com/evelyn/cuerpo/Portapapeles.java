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
package com.evelyn.cuerpo;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Evelyn López Nieto
 */
public class Portapapeles {

    public void copyToClipboard(String cadena) {
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection texto = new StringSelection(cadena);
        cb.setContents(texto, texto);
    }

    public void pasteFromClipboard(JTextField cajaText) {
        try {
            // Se obtiene el Clipboard y su contenido
            Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
            Transferable t = cb.getContents(this);

            // Construimos el DataFlavor correspondiente a String.
            DataFlavor dataFlavorStringJava;
            dataFlavorStringJava = new DataFlavor("application/x-java-serialized-object; class=java.lang.String");
            // Si el dato se puede obtener como String, lo obtenemos.
            if (t.isDataFlavorSupported(dataFlavorStringJava)) {
                String texto = (String) t.getTransferData(dataFlavorStringJava);
                cajaText.setText(texto);
            }
        } catch (ClassNotFoundException | UnsupportedFlavorException | IOException ex) {
            Logger.getLogger(Portapapeles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
