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

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Evelyn López Nieto
 */
public class UpdateCredenciales extends javax.swing.JDialog {

    ImageIcon logo = new ImageIcon("src/images/icono_desktop.png");
    OperacionesLogin login = new OperacionesLogin();
    
    public UpdateCredenciales(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(logo.getImage());
        login.cargarCredenciales(txtNombreAdmin, txtPaternoAdmin, txtMaternoAdmin, txtTelefonoAdmin,
               rbTMat, rbTVes, txtUsuarioAdmin, txtPassAdmin);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreAdmin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPaternoAdmin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaternoAdmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefonoAdmin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbTMat = new javax.swing.JRadioButton();
        rbTVes = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtUsuarioAdmin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnActualizarAdmin = new javax.swing.JButton();
        btnEliminarAdmin = new javax.swing.JButton();
        btnCancelarMovAdmin = new javax.swing.JButton();
        txtPassAdmin = new rojeru_san.rsfield.RSPassView();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LibraryAdmin - Cuenta de administrador");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUENTA DE ADMINISTRADOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 50));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        txtNombreAdmin.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jPanel2.add(txtNombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 40));

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido paterno:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 120, -1));

        txtPaternoAdmin.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jPanel2.add(txtPaternoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 200, 40));

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido materno:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        txtMaternoAdmin.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jPanel2.add(txtMaternoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 40));

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 70, -1));

        txtTelefonoAdmin.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jPanel2.add(txtTelefonoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 200, 40));

        jLabel6.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Turno:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 50, -1));

        rbTMat.setBackground(new java.awt.Color(0, 153, 204));
        rbTMat.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        rbTMat.setForeground(new java.awt.Color(255, 255, 255));
        rbTMat.setText("Matutino");
        rbTMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbTMatMouseClicked(evt);
            }
        });
        jPanel2.add(rbTMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        rbTVes.setBackground(new java.awt.Color(0, 153, 204));
        rbTVes.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        rbTVes.setForeground(new java.awt.Color(255, 255, 255));
        rbTVes.setText("Vespertino");
        rbTVes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbTVesMouseClicked(evt);
            }
        });
        jPanel2.add(rbTVes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, -1));

        txtUsuarioAdmin.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jPanel2.add(txtUsuarioAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 200, 40));

        jLabel8.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contraseña:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 90, -1));

        btnActualizarAdmin.setBackground(new java.awt.Color(153, 0, 0));
        btnActualizarAdmin.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnActualizarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarAdmin.setText("Actualizar");
        btnActualizarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 100, 40));

        btnEliminarAdmin.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarAdmin.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnEliminarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarAdmin.setText("Eliminar");
        btnEliminarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 100, 40));

        btnCancelarMovAdmin.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelarMovAdmin.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnCancelarMovAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarMovAdmin.setText("Cancelar");
        btnCancelarMovAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMovAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelarMovAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 100, 40));

        txtPassAdmin.setForeground(new java.awt.Color(0, 0, 0));
        txtPassAdmin.setText("rSPassView1");
        txtPassAdmin.setBorderColor(new java.awt.Color(0, 153, 204));
        txtPassAdmin.setBotonColor(new java.awt.Color(0, 0, 0));
        txtPassAdmin.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jPanel2.add(txtPassAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 200, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 530, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbTMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTMatMouseClicked
        if(this.rbTMat.isSelected()) {
            this.rbTVes.setSelected(false);
        }
    }//GEN-LAST:event_rbTMatMouseClicked

    private void rbTVesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTVesMouseClicked
        if(this.rbTVes.isSelected()) {
            this.rbTMat.setSelected(false);
        }
    }//GEN-LAST:event_rbTVesMouseClicked

    private void btnActualizarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAdminActionPerformed
        String nombre = this.txtNombreAdmin.getText();
        String paterno = this.txtPaternoAdmin.getText();
        String materno = this.txtMaternoAdmin.getText();
        String tel = this.txtTelefonoAdmin.getText();
        String turno = null;
        if(this.rbTMat.isSelected()) {
            turno = "Matutino";
        }else if(this.rbTVes.isSelected()) {
            turno = "Vespertino";
        }
        String usuario = this.txtUsuarioAdmin.getText();
        String password = this.txtPassAdmin.getText();
        login.actualizarCredenciales(nombre, paterno, materno, tel, 
               turno, usuario, password);
        JOptionPane.showMessageDialog(this, "Datos actualizados correctamente", "Actualización de datos", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnActualizarAdminActionPerformed

    private void btnEliminarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdminActionPerformed
        login.eliminarCredenciales();
        JOptionPane.showMessageDialog(this, "Credenciales de acceso eliminadas.\n"
               + "El sistema se cerrará cuando usted\n"
               + "cierre este mensaje.", "ELiminación de credenciales", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEliminarAdminActionPerformed

    private void btnCancelarMovAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMovAdminActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCancelarMovAdminActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateCredenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCredenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCredenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCredenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateCredenciales dialog = new UpdateCredenciales(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizarAdmin;
    private javax.swing.JButton btnCancelarMovAdmin;
    private javax.swing.JButton btnEliminarAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JRadioButton rbTMat;
    public javax.swing.JRadioButton rbTVes;
    public javax.swing.JTextField txtMaternoAdmin;
    public javax.swing.JTextField txtNombreAdmin;
    private rojeru_san.rsfield.RSPassView txtPassAdmin;
    public javax.swing.JTextField txtPaternoAdmin;
    public javax.swing.JTextField txtTelefonoAdmin;
    public javax.swing.JTextField txtUsuarioAdmin;
    // End of variables declaration//GEN-END:variables
}
