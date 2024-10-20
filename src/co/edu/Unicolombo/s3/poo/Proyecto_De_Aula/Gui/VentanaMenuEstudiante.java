/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Gui;

import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Gui.MenusEstudiante.PanelConsultarNotas;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Gui.MenusEstudiante.PanelInfoEstudiante;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Gui.MenusEstudiante.PanelPlanEstudio;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Gui.MenusEstudiante.PanelPrincipal;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Gui.MenusProfesor.PanelReportes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author daniel
 */
public class VentanaMenuEstudiante extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    /**
     * Creates new form VentanaMenu
     */
    public VentanaMenuEstudiante() {
        initComponents();
        fechaActual.setText(fecha());
        
        PanelPrincipal panelPrincipal = new PanelPrincipal();
        panelPrincipal.setSize(660, 420);
        panelPrincipal.setLocation(0, 0);
        
        content.removeAll();
        content.add(panelPrincipal, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pp = new javax.swing.JPanel();
        P2 = new javax.swing.JPanel();
        menuBotones2 = new javax.swing.JPanel();
        Principal = new javax.swing.JPanel();
        principalTxt = new javax.swing.JLabel();
        Informacion = new javax.swing.JPanel();
        informacionTxt = new javax.swing.JLabel();
        Notas = new javax.swing.JPanel();
        notasTxt = new javax.swing.JLabel();
        PlanEstudio = new javax.swing.JPanel();
        planEstudioTxt = new javax.swing.JLabel();
        Reportes = new javax.swing.JPanel();
        reportesTxt = new javax.swing.JLabel();
        CerrarSesionBoton = new javax.swing.JPanel();
        CerrarSesionTxt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fechaActual = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        BarraSuperior = new javax.swing.JPanel();
        ExitBoton = new javax.swing.JPanel();
        Accion = new java.awt.Label();

        Pp.setBackground(new java.awt.Color(255, 255, 255));
        Pp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        P2.setBackground(new java.awt.Color(255, 255, 255));
        P2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuBotones2.setBackground(new java.awt.Color(17, 89, 218));
        menuBotones2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Principal.setBackground(new java.awt.Color(19, 117, 255));

        principalTxt.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        principalTxt.setForeground(new java.awt.Color(255, 255, 255));
        principalTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        principalTxt.setText("Principal");
        principalTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        principalTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                principalTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                principalTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        menuBotones2.add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 50));

        Informacion.setBackground(new java.awt.Color(19, 117, 255));

        informacionTxt.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        informacionTxt.setForeground(new java.awt.Color(255, 255, 255));
        informacionTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        informacionTxt.setText("Info- Estudiante");
        informacionTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        informacionTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                informacionTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                informacionTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                informacionTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout InformacionLayout = new javax.swing.GroupLayout(Informacion);
        Informacion.setLayout(InformacionLayout);
        InformacionLayout.setHorizontalGroup(
            InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InformacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(informacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        InformacionLayout.setVerticalGroup(
            InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InformacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(informacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menuBotones2.add(Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 240, 50));

        Notas.setBackground(new java.awt.Color(19, 117, 255));

        notasTxt.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        notasTxt.setForeground(new java.awt.Color(255, 255, 255));
        notasTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notasTxt.setText("Consultar notas");
        notasTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notasTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notasTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notasTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notasTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout NotasLayout = new javax.swing.GroupLayout(Notas);
        Notas.setLayout(NotasLayout);
        NotasLayout.setHorizontalGroup(
            NotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(NotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NotasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(notasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        NotasLayout.setVerticalGroup(
            NotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(NotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NotasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(notasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menuBotones2.add(Notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 240, 50));

        PlanEstudio.setBackground(new java.awt.Color(19, 117, 255));

        planEstudioTxt.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        planEstudioTxt.setForeground(new java.awt.Color(255, 255, 255));
        planEstudioTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        planEstudioTxt.setText("Plan de Estudio");
        planEstudioTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        planEstudioTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planEstudioTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                planEstudioTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                planEstudioTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PlanEstudioLayout = new javax.swing.GroupLayout(PlanEstudio);
        PlanEstudio.setLayout(PlanEstudioLayout);
        PlanEstudioLayout.setHorizontalGroup(
            PlanEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(PlanEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PlanEstudioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(planEstudioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PlanEstudioLayout.setVerticalGroup(
            PlanEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(PlanEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PlanEstudioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(planEstudioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menuBotones2.add(PlanEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 50));

        Reportes.setBackground(new java.awt.Color(19, 117, 255));

        reportesTxt.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        reportesTxt.setForeground(new java.awt.Color(255, 255, 255));
        reportesTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportesTxt.setText("Reportes");
        reportesTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportesTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportesTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportesTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportesTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ReportesLayout = new javax.swing.GroupLayout(Reportes);
        Reportes.setLayout(ReportesLayout);
        ReportesLayout.setHorizontalGroup(
            ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportesLayout.createSequentialGroup()
                .addComponent(reportesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ReportesLayout.setVerticalGroup(
            ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reportesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuBotones2.add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, 50));

        CerrarSesionBoton.setBackground(new java.awt.Color(1, 174, 250));

        CerrarSesionTxt.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        CerrarSesionTxt.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSesionTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CerrarSesionTxt.setText("Cerrar sesión");
        CerrarSesionTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        CerrarSesionTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarSesionTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarSesionTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarSesionTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CerrarSesionBotonLayout = new javax.swing.GroupLayout(CerrarSesionBoton);
        CerrarSesionBoton.setLayout(CerrarSesionBotonLayout);
        CerrarSesionBotonLayout.setHorizontalGroup(
            CerrarSesionBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CerrarSesionBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CerrarSesionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CerrarSesionBotonLayout.setVerticalGroup(
            CerrarSesionBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CerrarSesionBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CerrarSesionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuBotones2.add(CerrarSesionBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        P2.add(menuBotones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 450));

        jPanel1.setBackground(new java.awt.Color(17, 89, 218));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/Unicolombo/s3/poo/Proyecto_De_Aula/vistas/iconos/informacionUs.png"))); // NOI18N
        jLabel2.setText("Menu Estudiante");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 70));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 140, 10));

        P2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 80));

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos/Informacion/Estudiante");
        P2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 400, 20));

        jLabel3.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hoy es");
        P2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 70, 50));

        fechaActual.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        fechaActual.setForeground(new java.awt.Color(255, 255, 255));
        fechaActual.setText("dd/MM/YYYY");
        P2.add(fechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 170, 50));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/Unicolombo/s3/poo/Proyecto_De_Aula/vistas/imagenes/water-drops-background (1) (1).jpg"))); // NOI18N
        P2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 660, 90));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        P2.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 660, 420));
        content.getAccessibleContext().setAccessibleDescription("");

        BarraSuperior.setBackground(new java.awt.Color(0, 0, 0, 0));
        BarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraSuperiorMouseDragged(evt);
            }
        });
        BarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraSuperiorMousePressed(evt);
            }
        });

        ExitBoton.setBackground(new java.awt.Color(1, 174, 250));

        Accion.setAlignment(java.awt.Label.CENTER);
        Accion.setBackground(new java.awt.Color(255, 255, 255));
        Accion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accion.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        Accion.setText("X");
        Accion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitBotonLayout = new javax.swing.GroupLayout(ExitBoton);
        ExitBoton.setLayout(ExitBotonLayout);
        ExitBotonLayout.setHorizontalGroup(
            ExitBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Accion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );
        ExitBotonLayout.setVerticalGroup(
            ExitBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitBotonLayout.createSequentialGroup()
                .addComponent(Accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraSuperiorLayout.createSequentialGroup()
                .addGap(0, 874, Short.MAX_VALUE)
                .addComponent(ExitBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BarraSuperiorLayout.setVerticalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addComponent(ExitBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        P2.add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void principalTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalTxtMouseClicked
        PanelPrincipal panelPrincipal = new PanelPrincipal();
        panelPrincipal.setSize(660, 420);
        panelPrincipal.setLocation(0, 0);
        
        content.removeAll();
        content.add(panelPrincipal, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_principalTxtMouseClicked

    private void principalTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalTxtMouseEntered
        Principal.setBackground(new Color(14, 144, 255));
    }//GEN-LAST:event_principalTxtMouseEntered

    private void principalTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalTxtMouseExited
        Principal.setBackground(new Color(19, 117, 245));
    }//GEN-LAST:event_principalTxtMouseExited

    private void informacionTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacionTxtMouseClicked
        PanelInfoEstudiante panelInfoEstudiante = new PanelInfoEstudiante();
        panelInfoEstudiante.setSize(660, 420);
        panelInfoEstudiante.setLocation(0, 0);
        
        content.removeAll();
        content.add(panelInfoEstudiante, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_informacionTxtMouseClicked

    private void informacionTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacionTxtMouseEntered
        Informacion.setBackground(new Color(14, 144, 255));
    }//GEN-LAST:event_informacionTxtMouseEntered

    private void informacionTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacionTxtMouseExited
        Informacion.setBackground(new Color(19, 117, 245));
    }//GEN-LAST:event_informacionTxtMouseExited

    private void notasTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notasTxtMouseClicked
        PanelConsultarNotas panelConsultarNotas = new PanelConsultarNotas();
        panelConsultarNotas.setSize(660, 420);
        panelConsultarNotas.setLocation(0, 0);
        
        content.removeAll();
        content.add(panelConsultarNotas, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_notasTxtMouseClicked

    private void notasTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notasTxtMouseEntered
        Notas.setBackground(new Color(14, 144, 255));
    }//GEN-LAST:event_notasTxtMouseEntered

    private void notasTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notasTxtMouseExited
        Notas.setBackground(new Color(19, 117, 245));
    }//GEN-LAST:event_notasTxtMouseExited

    private void planEstudioTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planEstudioTxtMouseClicked
        PanelPlanEstudio panelPlanEstudio = new PanelPlanEstudio();
        panelPlanEstudio.setSize(660, 420);
        panelPlanEstudio.setLocation(0, 0);
        
        content.removeAll();
        content.add(panelPlanEstudio, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_planEstudioTxtMouseClicked

    private void planEstudioTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planEstudioTxtMouseEntered
        PlanEstudio.setBackground(new Color(14, 144, 255));
    }//GEN-LAST:event_planEstudioTxtMouseEntered

    private void planEstudioTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planEstudioTxtMouseExited
        PlanEstudio.setBackground(new Color(19, 117, 245));
    }//GEN-LAST:event_planEstudioTxtMouseExited

    private void reportesTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesTxtMouseClicked
        PanelReportes panelReportes = new PanelReportes();
        panelReportes.setSize(660, 420);
        panelReportes.setLocation(0, 0);
        
        content.removeAll();
        content.add(panelReportes, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_reportesTxtMouseClicked

    private void reportesTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesTxtMouseEntered
        Reportes.setBackground(new Color(14, 144, 255));
    }//GEN-LAST:event_reportesTxtMouseEntered

    private void reportesTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesTxtMouseExited
        Reportes.setBackground(new Color(19, 117, 245));
    }//GEN-LAST:event_reportesTxtMouseExited

    private void AccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccionMouseClicked
        System.exit(0);
    }//GEN-LAST:event_AccionMouseClicked

    private void AccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccionMouseEntered
        Accion.setBackground(new Color(1, 174, 250));
    }//GEN-LAST:event_AccionMouseEntered

    private void AccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccionMouseExited
        Accion.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_AccionMouseExited

    private void BarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraSuperiorMouseDragged

    private void BarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraSuperiorMousePressed

    private void CerrarSesionTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionTxtMouseClicked
        this.dispose();  // Cierra la ventana actual

        VentanaPrincipalLogIn ventanaPrincipalLogIn = new VentanaPrincipalLogIn();
        ventanaPrincipalLogIn.setVisible(true);  // Abre la nueva ventana
    }//GEN-LAST:event_CerrarSesionTxtMouseClicked

    private void CerrarSesionTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionTxtMouseEntered
        CerrarSesionBoton.setBackground(new Color(1, 105, 150));
    }//GEN-LAST:event_CerrarSesionTxtMouseEntered

    private void CerrarSesionTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionTxtMouseExited
        CerrarSesionBoton.setBackground(new Color(1, 174, 250));
    }//GEN-LAST:event_CerrarSesionTxtMouseExited

    private static String fecha(){
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fechaActual);
    }
    
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
            java.util.logging.Logger.getLogger(VentanaMenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenuEstudiante().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Accion;
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JPanel CerrarSesionBoton;
    private javax.swing.JLabel CerrarSesionTxt;
    private javax.swing.JPanel ExitBoton;
    private javax.swing.JPanel Informacion;
    private javax.swing.JPanel Notas;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel PlanEstudio;
    private javax.swing.JPanel Pp;
    private javax.swing.JPanel Principal;
    private javax.swing.JPanel Reportes;
    private javax.swing.JPanel content;
    private javax.swing.JLabel fechaActual;
    private javax.swing.JLabel informacionTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menuBotones2;
    private javax.swing.JLabel notasTxt;
    private javax.swing.JLabel planEstudioTxt;
    private javax.swing.JLabel principalTxt;
    private javax.swing.JLabel reportesTxt;
    // End of variables declaration//GEN-END:variables
}
