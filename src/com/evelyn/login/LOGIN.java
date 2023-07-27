/*
 * Copyright (C) 2021 Evelyn López Nieto
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

import com.evelyn.cuerpo.Ventana_Principal;
import com.mysql.jdbc.ResultSetMetaData;
import com.evelyn.conexion.ConexionBiblioteca;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Evelyn López Nieto
 */
public class LOGIN extends javax.swing.JFrame {

    ImageIcon logo = new ImageIcon("src/images/icono_desktop.png");
    ConexionBiblioteca conexion = new ConexionBiblioteca();
    OperacionesLogin login = new OperacionesLogin();

    public LOGIN() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(logo.getImage());
        revisarTablaVacía();
        login.cargarUcombo(cbUsuarioSis);
    }

    public void revisarTablaVacía() {
        try {
            String sentencia = "SELECT * FROM tbl_usuarioSis";
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            ResultSet re = verBusqueda.executeQuery(sentencia);
            if (!re.next()) {
                this.lblFormRegUser.setText("Registrar usuario");
                this.lblNombre.setVisible(false);
                this.txtNombre.setVisible(false);
                this.lblPaterno.setVisible(false);
                this.txtPaterno.setVisible(false);
                this.lblMaterno.setVisible(false);
                this.txtMaterno.setVisible(false);
                this.lblTelefono.setVisible(false);
                this.txtTelefono.setVisible(false);
                this.lblTurno.setVisible(false);
                this.cbTurno.setVisible(false);
                this.lblUser.setVisible(false);
                this.txtUserReg.setVisible(false);
                this.lblPass.setVisible(false);
                this.txtPassReg.setVisible(false);
                this.btnRegUser.setVisible(false);
            } else {
                this.lblFormRegUser.setVisible(false);
                this.lblNombre.setVisible(false);
                this.txtNombre.setVisible(false);
                this.lblPaterno.setVisible(false);
                this.txtPaterno.setVisible(false);
                this.lblMaterno.setVisible(false);
                this.txtMaterno.setVisible(false);
                this.lblTelefono.setVisible(false);
                this.txtTelefono.setVisible(false);
                this.lblTurno.setVisible(false);
                this.cbTurno.setVisible(false);
                this.lblUser.setVisible(false);
                this.txtUserReg.setVisible(false);
                this.lblPass.setVisible(false);
                this.txtPassReg.setVisible(false);
                this.btnRegUser.setVisible(false);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelImage1 = new rojerusan.RSPanelImage();
        txtUsuario = new RSMaterialComponent.RSTextFieldIconTwo();
        rSPanelImage2 = new rojerusan.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnIngresar = new RSMaterialComponent.RSButtonFormaIcon();
        btnCerrar = new RSMaterialComponent.RSButtonIconOne();
        lblFormRegUser = new javax.swing.JLabel();
        btnRegUser = new javax.swing.JButton();
        txtUserReg = new javax.swing.JTextField();
        txtPassReg = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        cbTurno = new javax.swing.JComboBox<>();
        lblTelefono = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        lblPaterno = new javax.swing.JLabel();
        lblMaterno = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtPassword = new rojeru_san.rsfield.RSPassViewBD();
        cbUsuarioSis = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/images/thumb-350-411522.jpg"))); // NOI18N

        txtUsuario.setBackground(new java.awt.Color(51, 51, 51));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorderColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setColorIcon(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        txtUsuario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        txtUsuario.setPhColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setPlaceholder("Ingrese usuario");

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/images/thumb (2).png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage2Layout = new javax.swing.GroupLayout(rSPanelImage2);
        rSPanelImage2.setLayout(rSPanelImage2Layout);
        rSPanelImage2Layout.setHorizontalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );
        rSPanelImage2Layout.setVerticalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar sesión");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnIngresar.setBackground(new java.awt.Color(204, 0, 0));
        btnIngresar.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnIngresar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ARROW_FORWARD);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(102, 0, 0));
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setBackgroundHover(new java.awt.Color(204, 102, 0));
        btnCerrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblFormRegUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFormRegUser.setForeground(new java.awt.Color(255, 204, 0));
        lblFormRegUser.setText("Registrar usuario");
        lblFormRegUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFormRegUserMouseClicked(evt);
            }
        });

        btnRegUser.setBackground(new java.awt.Color(255, 0, 0));
        btnRegUser.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        btnRegUser.setForeground(new java.awt.Color(255, 255, 255));
        btnRegUser.setText("Registrarme");
        btnRegUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegUserActionPerformed(evt);
            }
        });

        txtUserReg.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtPassReg.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        lblUser.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuario:");

        lblPass.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setText("Contraseña:");

        txtTelefono.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        cbTurno.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        cbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Matutino", "Vespertino" }));

        lblTelefono.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Teléfono:");

        lblTurno.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(255, 255, 255));
        lblTurno.setText("Turno:");

        txtPaterno.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtMaterno.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        lblPaterno.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        lblPaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblPaterno.setText("Apellido paterno:");

        lblMaterno.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        lblMaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblMaterno.setText("Apellido materno:");

        txtNombre.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        lblNombre.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        txtPassword.setBackground(new java.awt.Color(51, 51, 51));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtPassword.setBotonColor(new java.awt.Color(255, 0, 0));
        txtPassword.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        txtPassword.setPlaceholder("Ingrese contraseña");

        cbUsuarioSis.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(rSPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblFormRegUser)))
                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUserReg, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(txtTelefono)
                                        .addComponent(txtPaterno))
                                    .addComponent(lblPaterno)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblUser))
                                .addGap(18, 18, 18)
                                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPass)
                                    .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTurno)
                                        .addComponent(lblMaterno)
                                        .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPassReg, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                            .addComponent(txtMaterno))
                                        .addComponent(cbTurno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelImage1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegUser)
                        .addGap(127, 127, 127))))
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbUsuarioSis, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombre)
                .addGap(113, 113, 113)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelImage1Layout.createSequentialGroup()
                        .addComponent(cbUsuarioSis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFormRegUser))
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaterno)
                            .addComponent(lblPaterno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(lblTurno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUser)
                            .addComponent(lblPass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usuario = this.txtUsuario.getText();
        String password = this.txtPassword.getText();
        String nombre = this.cbUsuarioSis.getSelectedItem().toString();

        try {
            String sentencia = "SELECT usuario, pass FROM tbl_usuarioSis WHERE nombre_usuario = '"+ nombre + "'";
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

            if (usuario.equals(datosUser[0]) && password.equals(datosUser[1])) {
                conexion.cerrarConexion();
                Ventana_Principal principal = new Ventana_Principal();
                this.dispose();
                principal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Acceso inválido", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un problema con el sistema..." + e, "Error del sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void lblFormRegUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFormRegUserMouseClicked
        this.lblNombre.setVisible(true);
        this.txtNombre.setVisible(true);
        this.lblPaterno.setVisible(true);
        this.txtPaterno.setVisible(true);
        this.lblMaterno.setVisible(true);
        this.txtMaterno.setVisible(true);
        this.lblTelefono.setVisible(true);
        this.txtTelefono.setVisible(true);
        this.lblTurno.setVisible(true);
        this.cbTurno.setVisible(true);
        this.lblUser.setVisible(true);
        this.txtUserReg.setVisible(true);
        this.lblPass.setVisible(true);
        this.txtPassReg.setVisible(true);
        this.btnRegUser.setVisible(true);
    }//GEN-LAST:event_lblFormRegUserMouseClicked

    private void btnRegUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegUserActionPerformed
        String nombre = this.txtNombre.getText();
        String paterno = this.txtPaterno.getText();
        String materno = this.txtMaterno.getText();
        String telefono = this.txtTelefono.getText();
        String turno = this.cbTurno.getSelectedItem().toString();
        String usuario = this.txtUserReg.getText();
        String pass = this.txtPassReg.getText();
        
        login.registrarUsuario(nombre, paterno, materno, telefono, turno, usuario, pass);
        JOptionPane.showMessageDialog(this, "Usuario registrado correctamente", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        this.lblFormRegUser.setVisible(false);
                this.lblNombre.setVisible(false);
                this.txtNombre.setVisible(false);
                this.lblPaterno.setVisible(false);
                this.txtPaterno.setVisible(false);
                this.lblMaterno.setVisible(false);
                this.txtMaterno.setVisible(false);
                this.lblTelefono.setVisible(false);
                this.txtTelefono.setVisible(false);
                this.lblTurno.setVisible(false);
                this.cbTurno.setVisible(false);
                this.lblUser.setVisible(false);
                this.txtUserReg.setVisible(false);
                this.lblPass.setVisible(false);
                this.txtPassReg.setVisible(false);
                this.btnRegUser.setVisible(false);
    }//GEN-LAST:event_btnRegUserActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconOne btnCerrar;
    private RSMaterialComponent.RSButtonFormaIcon btnIngresar;
    private javax.swing.JButton btnRegUser;
    private javax.swing.JComboBox<String> cbTurno;
    private javax.swing.JComboBox<String> cbUsuarioSis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFormRegUser;
    private javax.swing.JLabel lblMaterno;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel lblUser;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelImage rSPanelImage2;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassReg;
    private rojeru_san.rsfield.RSPassViewBD txtPassword;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUserReg;
    private RSMaterialComponent.RSTextFieldIconTwo txtUsuario;
    // End of variables declaration//GEN-END:variables
}
