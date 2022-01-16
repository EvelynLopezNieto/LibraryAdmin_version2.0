package Cuerpo;

import conexion.ConexionBiblioteca;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lectores.OperacionesLectores;
import libros.OperacionesLibros;
import prestamos.OperacionesPrestamos;
import rojerusan.RSPanelsSlider;

public class Ventana_Principal extends javax.swing.JFrame {

    ConexionBiblioteca conexion = new ConexionBiblioteca();
    OperacionesLibros libros = new OperacionesLibros();
    OperacionesPrestamos prestamos = new OperacionesPrestamos();
    OperacionesLectores lectores = new OperacionesLectores();

    public Ventana_Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/image/icono_desktop.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBotonesMenu = new javax.swing.JPanel();
        btnRegLibros = new rojeru_san.complementos.RSButtonHover();
        btnLibros = new rojeru_san.complementos.RSButtonHover();
        btnRegLector = new rojeru_san.complementos.RSButtonHover();
        btnPrestamos = new rojeru_san.complementos.RSButtonHover();
        btnRegPrestamos = new rojeru_san.complementos.RSButtonHover();
        btnBienvenida = new rojeru_san.complementos.RSButtonHover();
        btnLector = new rojeru_san.complementos.RSButtonHover();
        btnEstadisticas = new rojeru_san.complementos.RSButtonHover();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        pnlBienvenida = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        pnlPrestamos = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        lblPrestamosEncontrados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();
        txtFiltroPrestamos = new javax.swing.JTextField();
        btnSearchPrestamo = new javax.swing.JButton();
        cbFiltroSearchPrestamos = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        btnReportePrestamo = new javax.swing.JButton();
        pnlRegPrestamos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rSLabelImage3 = new necesario.RSLabelImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInfLibroPrestamo = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtFechaEntrega = new javax.swing.JTextField();
        txtFechaPres = new javax.swing.JTextField();
        txtIDlectorPres = new javax.swing.JTextField();
        txtIDlibroPres = new javax.swing.JTextField();
        txtIDprestamo = new javax.swing.JTextField();
        rbtnMatutino = new javax.swing.JRadioButton();
        rbtnVespertino = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        rbtnInterno = new javax.swing.JRadioButton();
        rbtnExterno = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        cbEstadoPrestamo = new javax.swing.JComboBox<>();
        calenPrestamo = new rojeru_san.componentes.RSCalendar();
        btnRegistrarPrestamo = new javax.swing.JButton();
        btnUpdatePrestamo = new javax.swing.JButton();
        btnCancelarPrestamo = new javax.swing.JButton();
        btnLimpiarFormPrestamo = new javax.swing.JButton();
        pnlLibros = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        lblLibrosEncontrados = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        txtFiltroLibros = new javax.swing.JTextField();
        btnSearchLibro = new javax.swing.JButton();
        cbFiltroSearchLibros = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        btnReporteLibros = new javax.swing.JButton();
        pnlRegLibros = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSLabelImage1 = new necesario.RSLabelImage();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEjemplarLibro = new javax.swing.JTextField();
        txtAreaConocimiento = new javax.swing.JTextField();
        txtCiudadPublicacion = new javax.swing.JTextField();
        txtAnioPublicacion = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtNameAutor = new javax.swing.JTextField();
        txtNameLibro = new javax.swing.JTextField();
        txtIDregLibro = new javax.swing.JTextField();
        btnLimpiarFormLibro = new javax.swing.JButton();
        btnRegistrarLibro = new javax.swing.JButton();
        btnUpdateLibro = new javax.swing.JButton();
        btnCancelarRegLibro = new javax.swing.JButton();
        pnlLector = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        lblLectoresEncontrados = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLectores = new javax.swing.JTable();
        txtFiltroLectores = new javax.swing.JTextField();
        btnSearchLector = new javax.swing.JButton();
        cbFiltroSearchLectores = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        btnReporteLectores = new javax.swing.JButton();
        pnlRegLector = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rSLabelImage4 = new necesario.RSLabelImage();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIDregLector = new javax.swing.JTextField();
        txtNameLector = new javax.swing.JTextField();
        txtApePaterno = new javax.swing.JTextField();
        txtApeMaterno = new javax.swing.JTextField();
        txtEdadLector = new javax.swing.JTextField();
        txtTelefonoLector = new javax.swing.JTextField();
        txtDomicilioLector = new javax.swing.JTextField();
        btnRegistrarLector = new javax.swing.JButton();
        btnUpdateLector = new javax.swing.JButton();
        btnCancelarRegLector = new javax.swing.JButton();
        btnLimpiarFormLectores = new javax.swing.JButton();
        pnlEstadisticas = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setPreferredSize(new java.awt.Dimension(1300, 686));
        setSize(new java.awt.Dimension(1300, 680));

        pnlBotonesMenu.setBackground(new java.awt.Color(0, 153, 204));
        pnlBotonesMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegLibros.setBackground(new java.awt.Color(255, 255, 255));
        btnRegLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/registro_libro.png"))); // NOI18N
        btnRegLibros.setText("Registrar libro");
        btnRegLibros.setToolTipText("Registrar libro");
        btnRegLibros.setColorHover(new java.awt.Color(204, 204, 204));
        btnRegLibros.setColorText(new java.awt.Color(0, 0, 0));
        btnRegLibros.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnRegLibros.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnRegLibros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegLibros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegLibrosActionPerformed(evt);
            }
        });
        pnlBotonesMenu.add(btnRegLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 110, 150));

        btnLibros.setBackground(new java.awt.Color(255, 255, 255));
        btnLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/libro.png"))); // NOI18N
        btnLibros.setText("Libros");
        btnLibros.setToolTipText("Administrar libros");
        btnLibros.setColorHover(new java.awt.Color(204, 204, 204));
        btnLibros.setColorText(new java.awt.Color(0, 0, 0));
        btnLibros.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnLibros.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnLibros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLibros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });
        pnlBotonesMenu.add(btnLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, 150));

        btnRegLector.setBackground(new java.awt.Color(255, 255, 255));
        btnRegLector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/usuario-sin-foto (2).png"))); // NOI18N
        btnRegLector.setText("Registrar lector");
        btnRegLector.setToolTipText("Registrar lectores");
        btnRegLector.setColorHover(new java.awt.Color(204, 204, 204));
        btnRegLector.setColorText(new java.awt.Color(0, 0, 0));
        btnRegLector.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnRegLector.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnRegLector.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegLector.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegLectorActionPerformed(evt);
            }
        });
        pnlBotonesMenu.add(btnRegLector, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 110, 150));

        btnPrestamos.setBackground(new java.awt.Color(255, 255, 255));
        btnPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/prestamos.png"))); // NOI18N
        btnPrestamos.setText("Préstamos");
        btnPrestamos.setToolTipText("Administrar préstamos");
        btnPrestamos.setColorHover(new java.awt.Color(204, 204, 204));
        btnPrestamos.setColorText(new java.awt.Color(0, 0, 0));
        btnPrestamos.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnPrestamos.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnPrestamos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrestamos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamosActionPerformed(evt);
            }
        });
        pnlBotonesMenu.add(btnPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 150));

        btnRegPrestamos.setBackground(new java.awt.Color(255, 255, 255));
        btnRegPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/registro_prestamo.png"))); // NOI18N
        btnRegPrestamos.setText("Registrar préstamo");
        btnRegPrestamos.setToolTipText("Registrar préstamos");
        btnRegPrestamos.setColorHover(new java.awt.Color(204, 204, 204));
        btnRegPrestamos.setColorText(new java.awt.Color(0, 0, 0));
        btnRegPrestamos.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnRegPrestamos.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnRegPrestamos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegPrestamos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegPrestamosActionPerformed(evt);
            }
        });
        pnlBotonesMenu.add(btnRegPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 110, 150));

        btnBienvenida.setBackground(new java.awt.Color(255, 255, 255));
        btnBienvenida.setText("Bienvenido(a)");
        btnBienvenida.setToolTipText("");
        btnBienvenida.setColorText(new java.awt.Color(0, 0, 0));
        btnBienvenida.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnBienvenida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBienvenida.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBienvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBienvenidaActionPerformed(evt);
            }
        });
        pnlBotonesMenu.add(btnBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 110, 150));

        btnLector.setBackground(new java.awt.Color(255, 255, 255));
        btnLector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/registro_lector.png"))); // NOI18N
        btnLector.setText("Lectores");
        btnLector.setToolTipText("Administrar lectores");
        btnLector.setColorHover(new java.awt.Color(204, 204, 204));
        btnLector.setColorText(new java.awt.Color(0, 0, 0));
        btnLector.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnLector.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnLector.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLector.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLectorActionPerformed(evt);
            }
        });
        pnlBotonesMenu.add(btnLector, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 110, 150));

        btnEstadisticas.setBackground(new java.awt.Color(255, 255, 255));
        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tendencia.png"))); // NOI18N
        btnEstadisticas.setText("Estadísticas");
        btnEstadisticas.setToolTipText("Estadísticas");
        btnEstadisticas.setColorHover(new java.awt.Color(204, 204, 204));
        btnEstadisticas.setColorText(new java.awt.Color(0, 0, 0));
        btnEstadisticas.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnEstadisticas.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnEstadisticas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstadisticas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        pnlBotonesMenu.add(btnEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 110, 150));

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 255, 255));

        pnlBienvenida.setBackground(new java.awt.Color(0, 153, 204));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/image/icono_sis.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBienvenidaLayout = new javax.swing.GroupLayout(pnlBienvenida);
        pnlBienvenida.setLayout(pnlBienvenidaLayout);
        pnlBienvenidaLayout.setHorizontalGroup(
            pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBienvenidaLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        pnlBienvenidaLayout.setVerticalGroup(
            pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(pnlBienvenida, "card9");

        pnlPrestamos.setBackground(new java.awt.Color(0, 153, 204));
        pnlPrestamos.setName("pnlPrestamos"); // NOI18N

        jLabel27.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("PRÉSTAMOS");

        lblPrestamosEncontrados.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        lblPrestamosEncontrados.setForeground(new java.awt.Color(255, 255, 255));
        lblPrestamosEncontrados.setText("REGISTROS ENCONTRADOS:");

        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID préstamo", "ID libro", "ID lector", "Fecha préstamo", "Fecha entrega", "Turno", "Tipo de préstamo", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblPrestamos);

        txtFiltroPrestamos.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N

        btnSearchPrestamo.setBackground(new java.awt.Color(153, 0, 0));
        btnSearchPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1027.jpg"))); // NOI18N

        cbFiltroSearchPrestamos.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        cbFiltroSearchPrestamos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Fecha de préstamo", "Fecha de entrega", "Turno", "Tipo de préstamo", "Estado" }));

        jLabel29.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Filtro de búsqueda:");

        btnReportePrestamo.setBackground(new java.awt.Color(153, 0, 0));
        btnReportePrestamo.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnReportePrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnReportePrestamo.setText("Generar reporte");

        javax.swing.GroupLayout pnlPrestamosLayout = new javax.swing.GroupLayout(pnlPrestamos);
        pnlPrestamos.setLayout(pnlPrestamosLayout);
        pnlPrestamosLayout.setHorizontalGroup(
            pnlPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrestamosLayout.createSequentialGroup()
                .addGroup(pnlPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrestamosLayout.createSequentialGroup()
                        .addGroup(pnlPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrestamosLayout.createSequentialGroup()
                                .addGap(445, 445, 445)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPrestamosLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblPrestamosEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 442, Short.MAX_VALUE))
                    .addGroup(pnlPrestamosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(pnlPrestamosLayout.createSequentialGroup()
                                .addGroup(pnlPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbFiltroSearchPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlPrestamosLayout.createSequentialGroup()
                                        .addComponent(txtFiltroPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearchPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(214, 214, 214)
                                        .addComponent(btnReportePrestamo)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(pnlPrestamosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPrestamosLayout.setVerticalGroup(
            pnlPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrestamosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFiltroSearchPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReportePrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtFiltroPrestamos)
                    .addComponent(btnSearchPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrestamosEncontrados)
                .addContainerGap())
        );

        rSPanelsSlider1.add(pnlPrestamos, "card8");

        pnlRegPrestamos.setBackground(new java.awt.Color(204, 204, 204));
        pnlRegPrestamos.setName("pnlRegPrestamos"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRO DE PRÉSTAMOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rSLabelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img_prestamo.png"))); // NOI18N

        jScrollPane1.setFont(new java.awt.Font("MV Boli", 0, 11)); // NOI18N

        tblInfLibroPrestamo.setFont(new java.awt.Font("MV Boli", 0, 11)); // NOI18N
        tblInfLibroPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(tblInfLibroPrestamo);

        jLabel19.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel19.setText("ID del préstamo:");

        jLabel20.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel20.setText("ID del libro:");

        jLabel21.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel21.setText("ID del lector:");

        jLabel22.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel22.setText("Fecha del préstamo:");

        jLabel23.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel23.setText("Fecha de entrega:");

        txtFechaEntrega.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtFechaPres.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtIDlectorPres.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtIDlibroPres.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtIDprestamo.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        rbtnMatutino.setBackground(new java.awt.Color(204, 204, 204));
        rbtnMatutino.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        rbtnMatutino.setText("Matutino");
        rbtnMatutino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnMatutinoMouseClicked(evt);
            }
        });

        rbtnVespertino.setBackground(new java.awt.Color(204, 204, 204));
        rbtnVespertino.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        rbtnVespertino.setText("Vespertino");
        rbtnVespertino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnVespertinoMouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel24.setText("Turno:");

        jLabel25.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel25.setText("Tipo de préstamo:");

        rbtnInterno.setBackground(new java.awt.Color(204, 204, 204));
        rbtnInterno.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        rbtnInterno.setText("Interno");
        rbtnInterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnInternoMouseClicked(evt);
            }
        });

        rbtnExterno.setBackground(new java.awt.Color(204, 204, 204));
        rbtnExterno.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        rbtnExterno.setText("Externo");
        rbtnExterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnExternoMouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel26.setText("Estado del préstamo:");

        cbEstadoPrestamo.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        cbEstadoPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Vigente", "Entregado", "Vencido" }));

        calenPrestamo.setColorBackground(new java.awt.Color(153, 0, 0));
        calenPrestamo.setColorButtonHover(new java.awt.Color(0, 102, 204));
        calenPrestamo.setColorDiaActual(new java.awt.Color(102, 102, 102));
        calenPrestamo.setFont(new java.awt.Font("MV Boli", 0, 11)); // NOI18N
        calenPrestamo.setFuenteFilas(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        calenPrestamo.setFuenteHead(new java.awt.Font("MV Boli", 1, 15)); // NOI18N

        btnRegistrarPrestamo.setBackground(new java.awt.Color(153, 0, 0));
        btnRegistrarPrestamo.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnRegistrarPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1023.jpg"))); // NOI18N
        btnRegistrarPrestamo.setText("Registrar");
        btnRegistrarPrestamo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnRegistrarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPrestamoActionPerformed(evt);
            }
        });

        btnUpdatePrestamo.setBackground(new java.awt.Color(153, 0, 0));
        btnUpdatePrestamo.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnUpdatePrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdatePrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1024.jpg"))); // NOI18N
        btnUpdatePrestamo.setText("Actualizar");
        btnUpdatePrestamo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnCancelarPrestamo.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelarPrestamo.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnCancelarPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1025.jpg"))); // NOI18N
        btnCancelarPrestamo.setText("Cancelar");
        btnCancelarPrestamo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnLimpiarFormPrestamo.setBackground(new java.awt.Color(153, 0, 0));
        btnLimpiarFormPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1026.jpg"))); // NOI18N
        btnLimpiarFormPrestamo.setToolTipText("Limpiar campos");
        btnLimpiarFormPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarFormPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegPrestamosLayout = new javax.swing.GroupLayout(pnlRegPrestamos);
        pnlRegPrestamos.setLayout(pnlRegPrestamosLayout);
        pnlRegPrestamosLayout.setHorizontalGroup(
            pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                        .addComponent(rSLabelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegPrestamosLayout.createSequentialGroup()
                        .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEstadoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel26))
                    .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel25))
                    .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                        .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFechaEntrega)
                                .addComponent(txtFechaPres)
                                .addComponent(txtIDlectorPres)
                                .addComponent(txtIDlibroPres)
                                .addComponent(txtIDprestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                            .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                                    .addComponent(rbtnInterno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbtnExterno))
                                .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                                    .addComponent(rbtnMatutino)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbtnVespertino)))
                            .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarFormPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calenPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCancelarPrestamo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdatePrestamo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(btnRegistrarPrestamo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 100, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlRegPrestamosLayout.setVerticalGroup(
            pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                        .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel19))
                            .addComponent(txtIDprestamo)
                            .addComponent(btnLimpiarFormPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel20))
                            .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDlibroPres)))
                        .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel21))
                            .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDlectorPres)))
                        .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel22))
                            .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaPres)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnVespertino)
                                    .addComponent(rbtnMatutino))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlRegPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbtnInterno)
                                    .addComponent(rbtnExterno))
                                .addGap(13, 13, 13)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEstadoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegPrestamosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rSLabelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlRegPrestamosLayout.createSequentialGroup()
                        .addComponent(calenPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btnRegistrarPrestamo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdatePrestamo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarPrestamo)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        rSPanelsSlider1.add(pnlRegPrestamos, "card7");

        pnlLibros.setBackground(new java.awt.Color(0, 153, 204));
        pnlLibros.setName("pnlLibros"); // NOI18N

        jLabel30.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("LIBROS");

        lblLibrosEncontrados.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        lblLibrosEncontrados.setForeground(new java.awt.Color(255, 255, 255));
        lblLibrosEncontrados.setText("REGISTROS ENCONTRADOS:");

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID libro", "Nombre", "Autor", "Editorial", "Año publicación", "Ciudad publicación", "Área conocimiento", "Ejemplares"
            }
        ));
        jScrollPane3.setViewportView(tblLibros);

        txtFiltroLibros.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N

        btnSearchLibro.setBackground(new java.awt.Color(153, 0, 0));
        btnSearchLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1027.jpg"))); // NOI18N

        cbFiltroSearchLibros.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        cbFiltroSearchLibros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "ID", "Nombre del libro", "Autor", "Editorial", "Área de conocimiento", "Cantidad de ejemplares" }));

        jLabel32.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Filtro de búsqueda:");

        btnReporteLibros.setBackground(new java.awt.Color(153, 0, 0));
        btnReporteLibros.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnReporteLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLibros.setText("Generar reporte");

        javax.swing.GroupLayout pnlLibrosLayout = new javax.swing.GroupLayout(pnlLibros);
        pnlLibros.setLayout(pnlLibrosLayout);
        pnlLibrosLayout.setHorizontalGroup(
            pnlLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLibrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(457, 457, 457))
            .addGroup(pnlLibrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(pnlLibrosLayout.createSequentialGroup()
                        .addGroup(pnlLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbFiltroSearchLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addGroup(pnlLibrosLayout.createSequentialGroup()
                                .addComponent(txtFiltroLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(235, 235, 235)
                                .addComponent(btnReporteLibros))
                            .addComponent(lblLibrosEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 255, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlLibrosLayout.setVerticalGroup(
            pnlLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLibrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFiltroSearchLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLibrosLayout.createSequentialGroup()
                        .addGroup(pnlLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFiltroLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReporteLibros, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearchLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLibrosEncontrados)
                .addContainerGap())
        );

        rSPanelsSlider1.add(pnlLibros, "card6");

        pnlRegLibros.setBackground(new java.awt.Color(204, 204, 204));
        pnlRegLibros.setName("pnlRegLibros"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESO DE LIBROS AL INVENTARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img_libros.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel11.setText("ID de libro:");

        jLabel12.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel12.setText("Nombre del libro:");

        jLabel13.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel13.setText("Autor del libro:");

        jLabel14.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel14.setText("Editorial:");

        jLabel15.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel15.setText("Año de publicación:");

        jLabel16.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel16.setText("Ciudad:");

        jLabel17.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel17.setText("Área de conocimiento:");

        jLabel18.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel18.setText("Ejemplares:");

        txtEjemplarLibro.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtAreaConocimiento.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtCiudadPublicacion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtAnioPublicacion.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtEditorial.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtNameAutor.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtNameLibro.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtIDregLibro.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        btnLimpiarFormLibro.setBackground(new java.awt.Color(153, 0, 0));
        btnLimpiarFormLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1026.jpg"))); // NOI18N
        btnLimpiarFormLibro.setToolTipText("Limpiar campos");
        btnLimpiarFormLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarFormLibroActionPerformed(evt);
            }
        });

        btnRegistrarLibro.setBackground(new java.awt.Color(153, 0, 0));
        btnRegistrarLibro.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnRegistrarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1023.jpg"))); // NOI18N
        btnRegistrarLibro.setText("Registrar");
        btnRegistrarLibro.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLibroActionPerformed(evt);
            }
        });

        btnUpdateLibro.setBackground(new java.awt.Color(153, 0, 0));
        btnUpdateLibro.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnUpdateLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1024.jpg"))); // NOI18N
        btnUpdateLibro.setText("Actualizar");
        btnUpdateLibro.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnCancelarRegLibro.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelarRegLibro.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnCancelarRegLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarRegLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1025.jpg"))); // NOI18N
        btnCancelarRegLibro.setText("Cancelar");
        btnCancelarRegLibro.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout pnlRegLibrosLayout = new javax.swing.GroupLayout(pnlRegLibros);
        pnlRegLibros.setLayout(pnlRegLibrosLayout);
        pnlRegLibrosLayout.setHorizontalGroup(
            pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlRegLibrosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRegLibrosLayout.createSequentialGroup()
                        .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlRegLibrosLayout.createSequentialGroup()
                                .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                                    .addComponent(txtAnioPublicacion)
                                    .addComponent(txtNameLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                                    .addComponent(txtNameAutor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelarRegLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdateLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlRegLibrosLayout.createSequentialGroup()
                                .addComponent(txtIDregLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnLimpiarFormLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                                .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(94, Short.MAX_VALUE))
                    .addGroup(pnlRegLibrosLayout.createSequentialGroup()
                        .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCiudadPublicacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(txtEjemplarLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAreaConocimiento, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlRegLibrosLayout.setVerticalGroup(
            pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegLibrosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegLibrosLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegLibrosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDregLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiarFormLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegLibrosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegLibrosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNameLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateLibro))))
                .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegLibrosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegLibrosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNameAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarRegLibro))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAnioPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(6, 6, 6)
                .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegLibrosLayout.createSequentialGroup()
                        .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(txtCiudadPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAreaConocimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRegLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEjemplarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegLibrosLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        rSPanelsSlider1.add(pnlRegLibros, "card5");

        pnlLector.setBackground(new java.awt.Color(0, 153, 204));
        pnlLector.setName("pnlLector"); // NOI18N

        jLabel33.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("LECTORES");

        lblLectoresEncontrados.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        lblLectoresEncontrados.setForeground(new java.awt.Color(255, 255, 255));
        lblLectoresEncontrados.setText("REGISTROS ENCONTRADOS:");

        tblLectores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID lector", "Nombre", "Apellido paterno", "Apellido materno", "Edad", "Teléfono", "Domicilio"
            }
        ));
        jScrollPane4.setViewportView(tblLectores);

        txtFiltroLectores.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N

        btnSearchLector.setBackground(new java.awt.Color(153, 0, 0));
        btnSearchLector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1027.jpg"))); // NOI18N

        cbFiltroSearchLectores.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        cbFiltroSearchLectores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "ID", "Nombre", "Apellido paterno", "Apellido materno", "Edad" }));

        jLabel35.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Filtro de búsqueda:");

        btnReporteLectores.setBackground(new java.awt.Color(153, 0, 0));
        btnReporteLectores.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnReporteLectores.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLectores.setText("Generar reporte");

        javax.swing.GroupLayout pnlLectorLayout = new javax.swing.GroupLayout(pnlLector);
        pnlLector.setLayout(pnlLectorLayout);
        pnlLectorLayout.setHorizontalGroup(
            pnlLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLectorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(452, 452, 452))
            .addGroup(pnlLectorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(pnlLectorLayout.createSequentialGroup()
                        .addGroup(pnlLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbFiltroSearchLectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addGroup(pnlLectorLayout.createSequentialGroup()
                                .addComponent(txtFiltroLectores, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchLector, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(248, 248, 248)
                                .addComponent(btnReporteLectores))
                            .addComponent(lblLectoresEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 312, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlLectorLayout.setVerticalGroup(
            pnlLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLectorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFiltroSearchLectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSearchLector, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(txtFiltroLectores))
                    .addComponent(btnReporteLectores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLectoresEncontrados)
                .addContainerGap())
        );

        rSPanelsSlider1.add(pnlLector, "card4");

        pnlRegLector.setBackground(new java.awt.Color(204, 204, 204));
        pnlRegLector.setName("pnlRegLector"); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRO DE LECTORES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        rSLabelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img_lector.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel4.setText("ID de lector:");

        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel6.setText("Apellido paterno:");

        jLabel7.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel7.setText("Apellido materno:");

        jLabel8.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel8.setText("Edad:");

        jLabel9.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel9.setText("Teléfono:");

        jLabel10.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel10.setText("Domicilio:");

        txtIDregLector.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtNameLector.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtApePaterno.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtApeMaterno.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtEdadLector.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtTelefonoLector.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        txtDomicilioLector.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        btnRegistrarLector.setBackground(new java.awt.Color(153, 0, 0));
        btnRegistrarLector.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnRegistrarLector.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarLector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1023.jpg"))); // NOI18N
        btnRegistrarLector.setText("Registrar");
        btnRegistrarLector.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnRegistrarLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLectorActionPerformed(evt);
            }
        });

        btnUpdateLector.setBackground(new java.awt.Color(153, 0, 0));
        btnUpdateLector.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnUpdateLector.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateLector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1024.jpg"))); // NOI18N
        btnUpdateLector.setText("Actualizar");
        btnUpdateLector.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnCancelarRegLector.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelarRegLector.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnCancelarRegLector.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarRegLector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1025.jpg"))); // NOI18N
        btnCancelarRegLector.setText("Cancelar");
        btnCancelarRegLector.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnLimpiarFormLectores.setBackground(new java.awt.Color(153, 0, 0));
        btnLimpiarFormLectores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1026.jpg"))); // NOI18N
        btnLimpiarFormLectores.setToolTipText("Limpiar campos");
        btnLimpiarFormLectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarFormLectoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegLectorLayout = new javax.swing.GroupLayout(pnlRegLector);
        pnlRegLector.setLayout(pnlRegLectorLayout);
        pnlRegLectorLayout.setHorizontalGroup(
            pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlRegLectorLayout.createSequentialGroup()
                .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegLectorLayout.createSequentialGroup()
                        .addComponent(rSLabelImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefonoLector, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegLectorLayout.createSequentialGroup()
                        .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApeMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(txtApePaterno)
                                .addComponent(txtNameLector)
                                .addComponent(txtIDregLector)
                                .addComponent(txtEdadLector, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDomicilioLector, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCancelarRegLector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateLector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarLector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLimpiarFormLectores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        pnlRegLectorLayout.setVerticalGroup(
            pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegLectorLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegLectorLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegLectorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDregLector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiarFormLectores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegLectorLayout.createSequentialGroup()
                        .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtNameLector, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(7, 7, 7)
                        .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(pnlRegLectorLayout.createSequentialGroup()
                        .addComponent(btnRegistrarLector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateLector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarRegLector)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEdadLector, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(13, 13, 13)
                .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRegLectorLayout.createSequentialGroup()
                        .addGap(32, 32, Short.MAX_VALUE)
                        .addComponent(rSLabelImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegLectorLayout.createSequentialGroup()
                        .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefonoLector, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(10, 10, 10)
                        .addGroup(pnlRegLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDomicilioLector, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        rSPanelsSlider1.add(pnlRegLector, "card3");

        pnlEstadisticas.setBackground(new java.awt.Color(0, 153, 204));
        pnlEstadisticas.setName("pnlEstadisticas"); // NOI18N

        javax.swing.GroupLayout pnlEstadisticasLayout = new javax.swing.GroupLayout(pnlEstadisticas);
        pnlEstadisticas.setLayout(pnlEstadisticasLayout);
        pnlEstadisticasLayout.setHorizontalGroup(
            pnlEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        pnlEstadisticasLayout.setVerticalGroup(
            pnlEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );

        rSPanelsSlider1.add(pnlEstadisticas, "card2");

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBotonesMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBotonesMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamosActionPerformed
        this.rSPanelsSlider1.setPanelSlider(20, pnlPrestamos, RSPanelsSlider.DIRECT.UP);
        this.btnBienvenida.setEnabled(true);
        this.btnPrestamos.setEnabled(false);
        this.btnRegPrestamos.setEnabled(true);
        this.btnLibros.setEnabled(true);
        this.btnRegLibros.setEnabled(true);
        this.btnLector.setEnabled(true);
        this.btnRegLector.setEnabled(true);
        this.btnEstadisticas.setEnabled(true);
        prestamos.mostrarPrestamos(tblPrestamos, lblPrestamosEncontrados);
    }//GEN-LAST:event_btnPrestamosActionPerformed

    private void btnRegPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegPrestamosActionPerformed
        this.rSPanelsSlider1.setPanelSlider(20, pnlRegPrestamos, RSPanelsSlider.DIRECT.UP);
        this.btnBienvenida.setEnabled(true);
        this.btnPrestamos.setEnabled(true);
        this.txtIDprestamo.setEnabled(false);
        this.btnRegPrestamos.setEnabled(false);
        this.btnLibros.setEnabled(true);
        this.btnRegLibros.setEnabled(true);
        this.btnLector.setEnabled(true);
        this.btnRegLector.setEnabled(true);
        this.btnEstadisticas.setEnabled(true);
    }//GEN-LAST:event_btnRegPrestamosActionPerformed

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        this.rSPanelsSlider1.setPanelSlider(20, pnlLibros, RSPanelsSlider.DIRECT.UP);
        this.btnBienvenida.setEnabled(true);
        this.btnPrestamos.setEnabled(true);
        this.btnRegPrestamos.setEnabled(true);
        this.btnLibros.setEnabled(false);
        this.btnRegLibros.setEnabled(true);
        this.btnLector.setEnabled(true);
        this.btnRegLector.setEnabled(true);
        this.btnEstadisticas.setEnabled(true);
        libros.mostrarLibros(tblLibros, lblLibrosEncontrados);
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnRegLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegLibrosActionPerformed
        this.rSPanelsSlider1.setPanelSlider(20, pnlRegLibros, RSPanelsSlider.DIRECT.UP);
        this.btnBienvenida.setEnabled(true);
        this.btnPrestamos.setEnabled(true);
        this.btnRegPrestamos.setEnabled(true);
        this.btnLibros.setEnabled(true);
        this.btnRegLibros.setEnabled(false);
        this.btnLector.setEnabled(true);
        this.btnRegLector.setEnabled(true);
        this.btnEstadisticas.setEnabled(true);
    }//GEN-LAST:event_btnRegLibrosActionPerformed

    private void btnLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLectorActionPerformed
        this.rSPanelsSlider1.setPanelSlider(20, pnlLector, RSPanelsSlider.DIRECT.UP);
        this.btnBienvenida.setEnabled(true);
        this.btnPrestamos.setEnabled(true);
        this.btnRegPrestamos.setEnabled(true);
        this.btnLibros.setEnabled(true);
        this.btnRegLibros.setEnabled(true);
        this.btnLector.setEnabled(false);
        this.btnRegLector.setEnabled(true);
        this.btnEstadisticas.setEnabled(true);
        lectores.mostrarLectores(tblLectores, lblLectoresEncontrados);
    }//GEN-LAST:event_btnLectorActionPerformed

    private void btnRegLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegLectorActionPerformed
        this.rSPanelsSlider1.setPanelSlider(20, pnlRegLector, RSPanelsSlider.DIRECT.UP);
        this.btnBienvenida.setEnabled(true);
        this.btnPrestamos.setEnabled(true);
        this.btnRegPrestamos.setEnabled(true);
        this.btnLibros.setEnabled(true);
        this.btnRegLibros.setEnabled(true);
        this.btnLector.setEnabled(true);
        this.btnRegLector.setEnabled(false);
        this.btnEstadisticas.setEnabled(true);
    }//GEN-LAST:event_btnRegLectorActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        this.rSPanelsSlider1.setPanelSlider(20, pnlEstadisticas, RSPanelsSlider.DIRECT.UP);
        this.btnBienvenida.setEnabled(true);
        this.btnPrestamos.setEnabled(true);
        this.btnRegPrestamos.setEnabled(true);
        this.btnLibros.setEnabled(true);
        this.btnRegLibros.setEnabled(true);
        this.btnLector.setEnabled(true);
        this.btnRegLector.setEnabled(true);
        this.btnEstadisticas.setEnabled(false);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void rbtnMatutinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnMatutinoMouseClicked
        if (this.rbtnMatutino.isSelected()) {
            this.rbtnVespertino.setSelected(false);
        }
    }//GEN-LAST:event_rbtnMatutinoMouseClicked

    private void rbtnVespertinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnVespertinoMouseClicked
        if (this.rbtnVespertino.isSelected()) {
            this.rbtnMatutino.setSelected(false);
        }
    }//GEN-LAST:event_rbtnVespertinoMouseClicked

    private void rbtnInternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnInternoMouseClicked
        if (this.rbtnInterno.isSelected()) {
            this.rbtnExterno.setSelected(false);
        }
    }//GEN-LAST:event_rbtnInternoMouseClicked

    private void rbtnExternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnExternoMouseClicked
        if (this.rbtnExterno.isSelected()) {
            this.rbtnInterno.setSelected(false);
        }
    }//GEN-LAST:event_rbtnExternoMouseClicked

    private void btnRegistrarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPrestamoActionPerformed
        String IDlibro = this.txtIDlibroPres.getText();
        String IDlector = this.txtIDlectorPres.getText();
        String fechaPrestamo = this.txtFechaPres.getText();
        String fechaEntrega = this.txtFechaEntrega.getText();
        String turno = null;
        if (this.rbtnMatutino.isSelected()) {
            turno = this.rbtnMatutino.getText();
        } else if (this.rbtnVespertino.isSelected()) {
            turno = this.rbtnVespertino.getText();
        }
        String tipoPrestamo = null;
        if (this.rbtnInterno.isSelected()) {
            tipoPrestamo = this.rbtnInterno.getText();
        } else if (this.rbtnExterno.isSelected()) {
            tipoPrestamo = this.rbtnExterno.getText();
        }
        String estado = this.cbEstadoPrestamo.getSelectedItem().toString();

        if (this.txtIDlibroPres.getText().isEmpty() || this.txtIDlectorPres.getText().isEmpty()
               || this.txtFechaPres.getText().isEmpty() || this.txtFechaEntrega.getText().isEmpty() || this.cbEstadoPrestamo.getSelectedIndex() == 0
               || !this.rbtnMatutino.isSelected() && !this.rbtnVespertino.isSelected() || !this.rbtnInterno.isSelected() && !this.rbtnExterno.isSelected()) {
            JOptionPane.showMessageDialog(this, "Faltan datos por ingresar al formulario.\n"
                   + "Por favor complete los datos.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            prestamos.registrarPrestamo(IDlibro, IDlector, fechaPrestamo, fechaEntrega, turno, tipoPrestamo, estado);
            JOptionPane.showMessageDialog(this, "Préstamo registrado", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            try {
                //investigar cómo obtener el último ID registrado
                String sentencia = "SELECT ID_prestamo FROM tbl_prestamo WHERE ID_prestamo = (SELECT MAX(ID_prestamo) FROM tbl_prestamo)";
                String IDPres = null;
                Connection con = conexion.obConexion();
                Statement ver = conexion.crearSentencia();
                ResultSet re = ver.executeQuery(sentencia);
                if (re.next()) {
                    IDPres = re.getString("ID_prestamo");
                }
                JOptionPane.showMessageDialog(this, "ID del préstamo: " + IDPres +"\n\nEntregue al lector para\n"
                       + "identificar el día de la entrega.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
                conexion.cerrarConexion();
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_btnRegistrarPrestamoActionPerformed

    private void btnRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLibroActionPerformed
        String IDlibro = this.txtIDregLibro.getText();
        String nombreLibro = this.txtNameLibro.getText();
        String autorLibro = this.txtNameAutor.getText();
        String editorial = this.txtEditorial.getText();
        String anioPublicacion = this.txtAnioPublicacion.getText();
        String ciudadPublicacion = this.txtCiudadPublicacion.getText();
        String areaConocimiento = this.txtAreaConocimiento.getText();
        String ejemplares = this.txtEjemplarLibro.getText();

        if (this.txtIDregLibro.getText().isEmpty() || this.txtNameLibro.getText().isEmpty() || this.txtNameAutor.getText().isEmpty()
               || this.txtEditorial.getText().isEmpty() || this.txtAnioPublicacion.getText().isEmpty() || this.txtCiudadPublicacion.getText().isEmpty()
               || this.txtAreaConocimiento.getText().isEmpty() || this.txtEjemplarLibro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan datos por ingresar al formulario.\n"
                   + "Por favor complete los datos.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (libros.validarNumeros(ejemplares)) {
                int ejemplar = Integer.parseInt(ejemplares);
                libros.registrarLibro(IDlibro, nombreLibro, autorLibro, editorial, anioPublicacion, ciudadPublicacion, areaConocimiento, ejemplar);
                JOptionPane.showMessageDialog(this, "Libro registrado", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese dato numérico en los ejemplares.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnRegistrarLibroActionPerformed

    private void btnRegistrarLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLectorActionPerformed
        String IDlector = this.txtIDregLector.getText();
        String nombreLector = this.txtNameLector.getText();
        String paterno = this.txtApePaterno.getText();
        String materno = this.txtApeMaterno.getText();
        String edad = this.txtEdadLector.getText();
        String telefono = this.txtTelefonoLector.getText();
        String domicilio = this.txtDomicilioLector.getText();

        if (this.txtIDregLector.getText().isEmpty() || this.txtNameLector.getText().isEmpty() || this.txtApePaterno.getText().isEmpty()
               || this.txtApeMaterno.getText().isEmpty() || this.txtEdadLector.getText().isEmpty() || this.txtTelefonoLector.getText().isEmpty()
               || this.txtDomicilioLector.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan datos por ingresar al formulario.\n"
                   + "Por favor complete los datos.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            lectores.registrarLector(IDlector, nombreLector, paterno, materno, edad, telefono, domicilio);
            JOptionPane.showMessageDialog(this, "Lector registrado", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnRegistrarLectorActionPerformed

    private void btnBienvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBienvenidaActionPerformed
        this.rSPanelsSlider1.setPanelSlider(20, pnlBienvenida, RSPanelsSlider.DIRECT.UP);
        this.btnBienvenida.setEnabled(false);
        this.btnPrestamos.setEnabled(true);
        this.btnRegPrestamos.setEnabled(true);
        this.btnLibros.setEnabled(true);
        this.btnRegLibros.setEnabled(true);
        this.btnLector.setEnabled(true);
        this.btnRegLector.setEnabled(true);
        this.btnEstadisticas.setEnabled(true);
    }//GEN-LAST:event_btnBienvenidaActionPerformed

    private void btnLimpiarFormPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarFormPrestamoActionPerformed
        this.txtIDprestamo.setText("");
        this.txtIDlibroPres.setText("");
        this.txtIDlectorPres.setText("");
        this.txtFechaPres.setText("");
        this.txtFechaEntrega.setText("");
        if (this.rbtnMatutino.isSelected()) {
            this.rbtnMatutino.setSelected(false);
        }
        if (this.rbtnVespertino.isSelected()) {
            this.rbtnVespertino.setSelected(false);
        }
        if (this.rbtnInterno.isSelected()) {
            this.rbtnInterno.setSelected(false);
        }
        if (this.rbtnExterno.isSelected()) {
            this.rbtnExterno.setSelected(false);
        }
        this.cbEstadoPrestamo.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarFormPrestamoActionPerformed

    private void btnLimpiarFormLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarFormLibroActionPerformed
        this.txtIDregLibro.setText("");
        this.txtNameLibro.setText("");
        this.txtNameAutor.setText("");
        this.txtEditorial.setText("");
        this.txtAnioPublicacion.setText("");
        this.txtCiudadPublicacion.setText("");
        this.txtAreaConocimiento.setText("");
        this.txtEjemplarLibro.setText("");
    }//GEN-LAST:event_btnLimpiarFormLibroActionPerformed

    private void btnLimpiarFormLectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarFormLectoresActionPerformed
        this.txtIDregLector.setText("");
        this.txtNameLector.setText("");
        this.txtApePaterno.setText("");
        this.txtApeMaterno.setText("");
        this.txtEdadLector.setText("");
        this.txtTelefonoLector.setText("");
        this.txtDomicilioLector.setText("");
    }//GEN-LAST:event_btnLimpiarFormLectoresActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnBienvenida;
    private javax.swing.JButton btnCancelarPrestamo;
    private javax.swing.JButton btnCancelarRegLector;
    private javax.swing.JButton btnCancelarRegLibro;
    private rojeru_san.complementos.RSButtonHover btnEstadisticas;
    private rojeru_san.complementos.RSButtonHover btnLector;
    private rojeru_san.complementos.RSButtonHover btnLibros;
    private javax.swing.JButton btnLimpiarFormLectores;
    private javax.swing.JButton btnLimpiarFormLibro;
    private javax.swing.JButton btnLimpiarFormPrestamo;
    private rojeru_san.complementos.RSButtonHover btnPrestamos;
    private rojeru_san.complementos.RSButtonHover btnRegLector;
    private rojeru_san.complementos.RSButtonHover btnRegLibros;
    private rojeru_san.complementos.RSButtonHover btnRegPrestamos;
    private javax.swing.JButton btnRegistrarLector;
    private javax.swing.JButton btnRegistrarLibro;
    private javax.swing.JButton btnRegistrarPrestamo;
    private javax.swing.JButton btnReporteLectores;
    private javax.swing.JButton btnReporteLibros;
    private javax.swing.JButton btnReportePrestamo;
    private javax.swing.JButton btnSearchLector;
    private javax.swing.JButton btnSearchLibro;
    private javax.swing.JButton btnSearchPrestamo;
    private javax.swing.JButton btnUpdateLector;
    private javax.swing.JButton btnUpdateLibro;
    private javax.swing.JButton btnUpdatePrestamo;
    private rojeru_san.componentes.RSCalendar calenPrestamo;
    private javax.swing.JComboBox<String> cbEstadoPrestamo;
    private javax.swing.JComboBox<String> cbFiltroSearchLectores;
    private javax.swing.JComboBox<String> cbFiltroSearchLibros;
    private javax.swing.JComboBox<String> cbFiltroSearchPrestamos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblLectoresEncontrados;
    private javax.swing.JLabel lblLibrosEncontrados;
    private javax.swing.JLabel lblPrestamosEncontrados;
    private javax.swing.JPanel pnlBienvenida;
    private javax.swing.JPanel pnlBotonesMenu;
    private javax.swing.JPanel pnlEstadisticas;
    private javax.swing.JPanel pnlLector;
    private javax.swing.JPanel pnlLibros;
    private javax.swing.JPanel pnlPrestamos;
    private javax.swing.JPanel pnlRegLector;
    private javax.swing.JPanel pnlRegLibros;
    private javax.swing.JPanel pnlRegPrestamos;
    private necesario.RSLabelImage rSLabelImage1;
    private necesario.RSLabelImage rSLabelImage3;
    private necesario.RSLabelImage rSLabelImage4;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JRadioButton rbtnExterno;
    private javax.swing.JRadioButton rbtnInterno;
    private javax.swing.JRadioButton rbtnMatutino;
    private javax.swing.JRadioButton rbtnVespertino;
    private javax.swing.JTable tblInfLibroPrestamo;
    private javax.swing.JTable tblLectores;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTable tblPrestamos;
    private javax.swing.JTextField txtAnioPublicacion;
    private javax.swing.JTextField txtApeMaterno;
    private javax.swing.JTextField txtApePaterno;
    private javax.swing.JTextField txtAreaConocimiento;
    private javax.swing.JTextField txtCiudadPublicacion;
    private javax.swing.JTextField txtDomicilioLector;
    private javax.swing.JTextField txtEdadLector;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEjemplarLibro;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaPres;
    private javax.swing.JTextField txtFiltroLectores;
    private javax.swing.JTextField txtFiltroLibros;
    private javax.swing.JTextField txtFiltroPrestamos;
    private javax.swing.JTextField txtIDlectorPres;
    private javax.swing.JTextField txtIDlibroPres;
    private javax.swing.JTextField txtIDprestamo;
    private javax.swing.JTextField txtIDregLector;
    private javax.swing.JTextField txtIDregLibro;
    private javax.swing.JTextField txtNameAutor;
    private javax.swing.JTextField txtNameLector;
    private javax.swing.JTextField txtNameLibro;
    private javax.swing.JTextField txtTelefonoLector;
    // End of variables declaration//GEN-END:variables
}
