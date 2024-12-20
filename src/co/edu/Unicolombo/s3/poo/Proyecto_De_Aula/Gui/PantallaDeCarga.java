/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Gui;

import static java.awt.SystemColor.text;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */

public class PantallaDeCarga extends javax.swing.JFrame {

    /**
     * Creates new form PantallaDeCarga
     */
    public PantallaDeCarga() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PorcentajejLabel = new javax.swing.JLabel();
        NombrejLabel = new javax.swing.JLabel();
        CargandojLabel = new javax.swing.JLabel();
        CargandojProgressBar = new javax.swing.JProgressBar();
        jSeparator1 = new javax.swing.JSeparator();
        ImagenDeCargajLabel = new javax.swing.JLabel();
        FondoImagenjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PorcentajejLabel.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        PorcentajejLabel.setForeground(new java.awt.Color(255, 255, 255));
        PorcentajejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PorcentajejLabel.setText("0%");
        jPanel1.add(PorcentajejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 540, 30, 30));

        NombrejLabel.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        NombrejLabel.setForeground(new java.awt.Color(255, 255, 255));
        NombrejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombrejLabel.setText("Student SPhere");
        jPanel1.add(NombrejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 420, -1));

        CargandojLabel.setBackground(new java.awt.Color(0, 0, 0));
        CargandojLabel.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        CargandojLabel.setForeground(new java.awt.Color(255, 255, 255));
        CargandojLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CargandojLabel.setText("Cargando...");
        jPanel1.add(CargandojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 440, 40));
        jPanel1.add(CargandojProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 930, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 420, 10));

        ImagenDeCargajLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/Unicolombo/s3/poo/Proyecto_De_Aula/vistas/iconos/imagePerson3-Photoroom.png"))); // NOI18N
        jPanel1.add(ImagenDeCargajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 370, 310));

        FondoImagenjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/Unicolombo/s3/poo/Proyecto_De_Aula/vistas/imagenes/artistic-blurry-colorful-wallpaper-background.jpg"))); // NOI18N
        FondoImagenjLabel.setPreferredSize(new java.awt.Dimension(900, 530));
        jPanel1.add(FondoImagenjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
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
            java.util.logging.Logger.getLogger(PantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
}
    public void iniciarCarga() {
    new Thread(() -> {
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100); // Simula el tiempo de carga
                PorcentajejLabel.setText(i + "%");
                CargandojProgressBar.setValue(i);

                if (i == 10) {
                    CargandojLabel.setText("Agregando módulos...");
                }
                if (i == 20) {
                    CargandojLabel.setText("Cargando módulos...");
                }
                if (i == 50) {
                    CargandojLabel.setText("Conectando con la Base de Datos...");
                }
                if (i == 70) {
                    CargandojLabel.setText("Conexión exitosa...");
                }
                if (i == 80) {
                    CargandojLabel.setText("Lanzando aplicación...");
                }
            }
            // Al finalizar la carga, mostrar el menú principal
            dispose(); // Cierra la pantalla de carga
            java.awt.EventQueue.invokeLater(() -> {
                new VentanaPrincipalLogIn().setVisible(true);
            });
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }).start();
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CargandojLabel;
    private javax.swing.JProgressBar CargandojProgressBar;
    private javax.swing.JLabel FondoImagenjLabel;
    private javax.swing.JLabel ImagenDeCargajLabel;
    private javax.swing.JLabel NombrejLabel;
    private javax.swing.JLabel PorcentajejLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
