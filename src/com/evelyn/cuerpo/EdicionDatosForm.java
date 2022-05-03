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

import com.evelyn.conexion.ConexionBiblioteca;
import javax.swing.JOptionPane;
import com.evelyn.lectores.OperacionesLectores;
import com.evelyn.libros.OperacionesLibros;
import com.evelyn.prestamos.OperacionesPrestamos;

/**
 *
 * @author Evelyn López Nieto
 */
public class EdicionDatosForm extends javax.swing.JDialog {

    ConexionBiblioteca conexion = new ConexionBiblioteca();
    OperacionesPrestamos pres = new OperacionesPrestamos();
    OperacionesLectores lec = new OperacionesLectores();
    OperacionesLibros lib = new OperacionesLibros();

    public EdicionDatosForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.txtIDpresEdicion.setEnabled(false);
        this.txtIDlibEdicion.setEnabled(false);
        this.txtIDlecEdicion.setEnabled(false);
        this.pnlVacio.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloEdicionPres = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlVacio = new javax.swing.JPanel();
        pnlUpdateLector = new javax.swing.JPanel();
        txtIDlecEdicion = new javax.swing.JTextField();
        txtNomLecEdicion = new javax.swing.JTextField();
        txtPatLecEdicion = new javax.swing.JTextField();
        txtMatLecEdicion = new javax.swing.JTextField();
        txtEdadLecEdicion = new javax.swing.JTextField();
        txtTeleLecEdicion = new javax.swing.JTextField();
        txtDomLecEdicion = new javax.swing.JTextField();
        txtGradoLecEdicion = new javax.swing.JTextField();
        txtGrupoLecEdicion = new javax.swing.JTextField();
        btnActualizarLecEdicion = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pnlUpdateLibro = new javax.swing.JPanel();
        txtIDlibEdicion = new javax.swing.JTextField();
        txtNombreLibEdicion = new javax.swing.JTextField();
        txtAutorLibEdicion = new javax.swing.JTextField();
        txtEditorialLibEdicion = new javax.swing.JTextField();
        txtAnioLibEdicion = new javax.swing.JTextField();
        txtCiudadLibEdicion = new javax.swing.JTextField();
        txtAreaLibEdicion = new javax.swing.JTextField();
        txtEjemplarLibEdicion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnEditarLib = new javax.swing.JButton();
        pnlUpdatePrestamo = new javax.swing.JPanel();
        calendarPresEdicion = new rojeru_san.componentes.RSCalendar();
        txtIDpresEdicion = new javax.swing.JTextField();
        txtIDlibEdicionPres = new javax.swing.JTextField();
        txtIDlecEdicionPres = new javax.swing.JTextField();
        txtFechaPresEdicion = new javax.swing.JTextField();
        txtFechaEntregEdicion = new javax.swing.JTextField();
        btnCargaFechaPres = new javax.swing.JButton();
        btnCargarFechaPres = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbtnMatEdicion = new javax.swing.JRadioButton();
        rbtnVesEdicion = new javax.swing.JRadioButton();
        rbtnIntEdicion = new javax.swing.JRadioButton();
        rbtnExtEdicion = new javax.swing.JRadioButton();
        cbStatusEdicion = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnEditarPres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        lblTituloEdicionPres.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        lblTituloEdicionPres.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloEdicionPres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloEdicionPres.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lblTituloEdicionPres, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTituloEdicionPres)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        pnlVacio.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnlVacioLayout = new javax.swing.GroupLayout(pnlVacio);
        pnlVacio.setLayout(pnlVacioLayout);
        pnlVacioLayout.setHorizontalGroup(
            pnlVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        pnlVacioLayout.setVerticalGroup(
            pnlVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel2.add(pnlVacio, "card5");

        pnlUpdateLector.setBackground(new java.awt.Color(204, 204, 204));
        pnlUpdateLector.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIDlecEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLector.add(txtIDlecEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 280, 40));

        txtNomLecEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLector.add(txtNomLecEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 55, 280, 40));

        txtPatLecEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLector.add(txtPatLecEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 280, 40));

        txtMatLecEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLector.add(txtMatLecEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 145, 280, 40));

        txtEdadLecEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLector.add(txtEdadLecEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 140, 40));

        txtTeleLecEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLector.add(txtTeleLecEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 235, 280, 40));

        txtDomLecEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLector.add(txtDomLecEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 280, 40));

        txtGradoLecEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLector.add(txtGradoLecEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 325, 280, 40));

        txtGrupoLecEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLector.add(txtGrupoLecEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 280, 40));

        btnActualizarLecEdicion.setBackground(new java.awt.Color(153, 0, 0));
        btnActualizarLecEdicion.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnActualizarLecEdicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1024.jpg"))); // NOI18N
        btnActualizarLecEdicion.setText("Actualizar");
        btnActualizarLecEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarLecEdicionActionPerformed(evt);
            }
        });
        pnlUpdateLector.add(btnActualizarLecEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 170, -1));

        jLabel17.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel17.setText("ID de lector:");
        pnlUpdateLector.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel18.setText("Nombre:");
        pnlUpdateLector.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 65, -1, -1));

        jLabel19.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel19.setText("Apellido paterno:");
        pnlUpdateLector.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 110, -1, -1));

        jLabel20.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel20.setText("Apellido materno:");
        pnlUpdateLector.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 155, -1, -1));

        jLabel21.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel21.setText("Edad:");
        pnlUpdateLector.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel22.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel22.setText("Teléfono:");
        pnlUpdateLector.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 245, -1, -1));

        jLabel23.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel23.setText("Domicilio:");
        pnlUpdateLector.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jLabel24.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel24.setText("Grado:");
        pnlUpdateLector.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 335, -1, -1));

        jLabel25.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel25.setText("Grupo:");
        pnlUpdateLector.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jPanel2.add(pnlUpdateLector, "card4");

        pnlUpdateLibro.setBackground(new java.awt.Color(204, 204, 204));
        pnlUpdateLibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIDlibEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLibro.add(txtIDlibEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 240, 40));

        txtNombreLibEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLibro.add(txtNombreLibEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 470, 40));

        txtAutorLibEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLibro.add(txtAutorLibEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 470, 40));

        txtEditorialLibEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLibro.add(txtEditorialLibEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 470, 40));

        txtAnioLibEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLibro.add(txtAnioLibEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 470, 40));

        txtCiudadLibEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLibro.add(txtCiudadLibEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 470, 40));

        txtAreaLibEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLibro.add(txtAreaLibEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 470, 40));

        txtEjemplarLibEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdateLibro.add(txtEjemplarLibEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 240, 40));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel1.setText("ID del libro:");
        pnlUpdateLibro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel10.setText("Nombre del libro:");
        pnlUpdateLibro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel11.setText("Autor del libro:");
        pnlUpdateLibro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel12.setText("Editorial:");
        pnlUpdateLibro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel13.setText("Año de publicación:");
        pnlUpdateLibro.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 220, -1, -1));

        jLabel14.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel14.setText("Ciudad:");
        pnlUpdateLibro.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel15.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel15.setText("Área de conocimiento:");
        pnlUpdateLibro.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel16.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel16.setText("Ejemplares:");
        pnlUpdateLibro.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        btnEditarLib.setBackground(new java.awt.Color(153, 0, 0));
        btnEditarLib.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnEditarLib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1024.jpg"))); // NOI18N
        btnEditarLib.setText("Actualizar");
        btnEditarLib.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEditarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLibActionPerformed(evt);
            }
        });
        pnlUpdateLibro.add(btnEditarLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 200, -1));

        jPanel2.add(pnlUpdateLibro, "card3");

        pnlUpdatePrestamo.setBackground(new java.awt.Color(204, 204, 204));
        pnlUpdatePrestamo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlUpdatePrestamo.add(calendarPresEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 400, -1));

        txtIDpresEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdatePrestamo.add(txtIDpresEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 250, 40));

        txtIDlibEdicionPres.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdatePrestamo.add(txtIDlibEdicionPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 250, 40));

        txtIDlecEdicionPres.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdatePrestamo.add(txtIDlecEdicionPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 250, 40));

        txtFechaPresEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdatePrestamo.add(txtFechaPresEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 250, 40));

        txtFechaEntregEdicion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pnlUpdatePrestamo.add(txtFechaEntregEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 250, 40));

        btnCargaFechaPres.setText("<-");
        pnlUpdatePrestamo.add(btnCargaFechaPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 45, 40));

        btnCargarFechaPres.setText("<-");
        pnlUpdatePrestamo.add(btnCargarFechaPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 45, 40));

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel2.setText("ID de préstamo:");
        pnlUpdatePrestamo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel3.setText("ID del libro:");
        pnlUpdatePrestamo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel4.setText("ID del lector:");
        pnlUpdatePrestamo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de préstamo:");
        pnlUpdatePrestamo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de entrega:");
        pnlUpdatePrestamo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        rbtnMatEdicion.setBackground(new java.awt.Color(204, 204, 204));
        rbtnMatEdicion.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        rbtnMatEdicion.setText("Matutino");
        pnlUpdatePrestamo.add(rbtnMatEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        rbtnVesEdicion.setBackground(new java.awt.Color(204, 204, 204));
        rbtnVesEdicion.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        rbtnVesEdicion.setText("Vespertino");
        pnlUpdatePrestamo.add(rbtnVesEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        rbtnIntEdicion.setBackground(new java.awt.Color(204, 204, 204));
        rbtnIntEdicion.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        rbtnIntEdicion.setText("Interno");
        pnlUpdatePrestamo.add(rbtnIntEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        rbtnExtEdicion.setBackground(new java.awt.Color(204, 204, 204));
        rbtnExtEdicion.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        rbtnExtEdicion.setText("Externo");
        pnlUpdatePrestamo.add(rbtnExtEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        cbStatusEdicion.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        cbStatusEdicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Vigente", "Entregado", "Vencido" }));
        pnlUpdatePrestamo.add(cbStatusEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        jLabel7.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel7.setText("Turno:");
        pnlUpdatePrestamo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel8.setText("Tipo de préstamo");
        pnlUpdatePrestamo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel9.setText("Estado del préstamo:");
        pnlUpdatePrestamo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        btnEditarPres.setBackground(new java.awt.Color(153, 0, 0));
        btnEditarPres.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnEditarPres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1024.jpg"))); // NOI18N
        btnEditarPres.setText("Actualizar");
        btnEditarPres.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEditarPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPresActionPerformed(evt);
            }
        });
        pnlUpdatePrestamo.add(btnEditarPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 200, -1));

        jPanel2.add(pnlUpdatePrestamo, "card2");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 890, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPresActionPerformed
        String idL = this.txtIDlibEdicionPres.getText();
        String idLe = this.txtIDlecEdicionPres.getText();
        String fP = this.txtFechaPresEdicion.getText();
        String fE = this.txtFechaEntregEdicion.getText();
        String turno = null;
        if (this.rbtnMatEdicion.isSelected()) {
            turno = this.rbtnMatEdicion.getText();
        } else if (this.rbtnVesEdicion.isSelected()) {
            turno = this.rbtnVesEdicion.getText();
        }
        String tipo = null;
        if (this.rbtnIntEdicion.isSelected()) {
            tipo = this.rbtnIntEdicion.getText();
        } else if (this.rbtnExtEdicion.isSelected()) {
            tipo = this.rbtnExtEdicion.getText();
        }
        String estado = this.cbStatusEdicion.getSelectedItem().toString();

        if (this.txtIDlibEdicionPres.getText().isEmpty() || this.txtIDlecEdicionPres.getText().isEmpty()
               || this.txtFechaPresEdicion.getText().isEmpty() || this.txtFechaEntregEdicion.getText().isEmpty()
               || !this.rbtnMatEdicion.isSelected() && !this.rbtnVesEdicion.isSelected()
               || !this.rbtnIntEdicion.isSelected() && !this.rbtnExtEdicion.isSelected()) {
            JOptionPane.showMessageDialog(this, "Hacen falta datos. Por favor, complete el formulario.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int idP = Integer.parseInt(this.txtIDpresEdicion.getText());
            pres.actualizarPrestamo(idP, idL, idLe, fP, fE, turno, tipo, estado);
            int valor = JOptionPane.showConfirmDialog(null, "El registro se ha actualizado con éxito.", "Mensaje", JOptionPane.YES_OPTION);
            if (valor == JOptionPane.YES_OPTION) {
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnEditarPresActionPerformed

    private void btnEditarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLibActionPerformed
        String idLib = this.txtIDlibEdicion.getText();
        String nLib = this.txtNombreLibEdicion.getText();
        String aLib = this.txtAutorLibEdicion.getText();
        String editLib = this.txtEditorialLibEdicion.getText();
        String anio = this.txtAnioLibEdicion.getText();
        String ciudad = this.txtCiudadLibEdicion.getText();
        String area = this.txtAreaLibEdicion.getText();
        String ejem = this.txtEjemplarLibEdicion.getText();

        if (this.txtNombreLibEdicion.getText().isEmpty() || this.txtAutorLibEdicion.getText().isEmpty()
               || this.txtEditorialLibEdicion.getText().isEmpty() || this.txtAnioLibEdicion.getText().isEmpty()
               || this.txtCiudadLibEdicion.getText().isEmpty() || this.txtAreaLibEdicion.getText().isEmpty()
               || this.txtEjemplarLibEdicion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hacen falta datos.\n"
                   + "Por favor complete los datos.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (lib.validarNumeros(ejem)) {
                int ejemplar = Integer.parseInt(ejem);
                lib.actualizarLibro(idLib, nLib, aLib, editLib, anio, ciudad, area, ejemplar);
                int valor = JOptionPane.showConfirmDialog(null, "El registro se ha actualizado con éxito.", "Mensaje", JOptionPane.YES_OPTION);
                if (valor == JOptionPane.YES_OPTION) {
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese dato numérico en los ejemplares.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEditarLibActionPerformed

    private void btnActualizarLecEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarLecEdicionActionPerformed
        String idL = this.txtIDlecEdicion.getText();
        String n = this.txtNomLecEdicion.getText();
        String p = this.txtPatLecEdicion.getText();
        String m = this.txtMatLecEdicion.getText();
        String edad = this.txtEdadLecEdicion.getText();
        String tel = this.txtTeleLecEdicion.getText();
        String dom = this.txtDomLecEdicion.getText();
        String grado = this.txtGradoLecEdicion.getText();
        String grupo = this.txtGrupoLecEdicion.getText();

        if (this.txtNomLecEdicion.getText().isEmpty() || this.txtPatLecEdicion.getText().isEmpty()
               || this.txtMatLecEdicion.getText().isEmpty() || this.txtEdadLecEdicion.getText().isEmpty()
               || this.txtTeleLecEdicion.getText().isEmpty() || this.txtDomLecEdicion.getText().isEmpty()
               || this.txtGradoLecEdicion.getText().isEmpty() || this.txtGrupoLecEdicion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hacen falta datos. Por favor, complete el formulario.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            lec.actualizarLector(idL, n, p, m, edad, tel, dom, grado, grupo);
            int valor = JOptionPane.showConfirmDialog(null, "El registro se ha actualizado con éxito.", "Mensaje", JOptionPane.YES_OPTION);
            if (valor == JOptionPane.YES_OPTION) {
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnActualizarLecEdicionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EdicionDatosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicionDatosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicionDatosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicionDatosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EdicionDatosForm dialog = new EdicionDatosForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarLecEdicion;
    private javax.swing.JButton btnCargaFechaPres;
    private javax.swing.JButton btnCargarFechaPres;
    private javax.swing.JButton btnEditarLib;
    private javax.swing.JButton btnEditarPres;
    private rojeru_san.componentes.RSCalendar calendarPresEdicion;
    public javax.swing.JComboBox<String> cbStatusEdicion;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblTituloEdicionPres;
    public javax.swing.JPanel pnlUpdateLector;
    public javax.swing.JPanel pnlUpdateLibro;
    public javax.swing.JPanel pnlUpdatePrestamo;
    public javax.swing.JPanel pnlVacio;
    public javax.swing.JRadioButton rbtnExtEdicion;
    public javax.swing.JRadioButton rbtnIntEdicion;
    public javax.swing.JRadioButton rbtnMatEdicion;
    public javax.swing.JRadioButton rbtnVesEdicion;
    public javax.swing.JTextField txtAnioLibEdicion;
    public javax.swing.JTextField txtAreaLibEdicion;
    public javax.swing.JTextField txtAutorLibEdicion;
    public javax.swing.JTextField txtCiudadLibEdicion;
    public javax.swing.JTextField txtDomLecEdicion;
    public javax.swing.JTextField txtEdadLecEdicion;
    public javax.swing.JTextField txtEditorialLibEdicion;
    public javax.swing.JTextField txtEjemplarLibEdicion;
    public javax.swing.JTextField txtFechaEntregEdicion;
    public javax.swing.JTextField txtFechaPresEdicion;
    public javax.swing.JTextField txtGradoLecEdicion;
    public javax.swing.JTextField txtGrupoLecEdicion;
    public javax.swing.JTextField txtIDlecEdicion;
    public javax.swing.JTextField txtIDlecEdicionPres;
    public javax.swing.JTextField txtIDlibEdicion;
    public javax.swing.JTextField txtIDlibEdicionPres;
    public javax.swing.JTextField txtIDpresEdicion;
    public javax.swing.JTextField txtMatLecEdicion;
    public javax.swing.JTextField txtNomLecEdicion;
    public javax.swing.JTextField txtNombreLibEdicion;
    public javax.swing.JTextField txtPatLecEdicion;
    public javax.swing.JTextField txtTeleLecEdicion;
    // End of variables declaration//GEN-END:variables
}
