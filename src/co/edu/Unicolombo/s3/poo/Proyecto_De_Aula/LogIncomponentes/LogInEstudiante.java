/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.LogIncomponentes;

import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain.Usuario;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Gui.VentanaMenuEstudiante;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class LogInEstudiante extends javax.swing.JPanel {

    /**
     * Creates new form Estudiante
     */
    public LogInEstudiante() {
        initComponents();
        configurarCamposTexto();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigoEstTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        correoEstTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        contraseñaEstTxt = new javax.swing.JPasswordField();
        loginBoton = new javax.swing.JPanel();
        loginTxt = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/Unicolombo/s3/poo/Proyecto_De_Aula/iconos/tipo.png"))); // NOI18N
        jLabel1.setText("Estudiante");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("CODIGO ESTUDIANTE");

        codigoEstTxt.setForeground(new java.awt.Color(204, 204, 204));
        codigoEstTxt.setText("Ingrese su codigo estudiante");
        codigoEstTxt.setBorder(null);
        codigoEstTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                codigoEstTxtMousePressed(evt);
            }
        });
        codigoEstTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoEstTxtActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        correoEstTxt.setForeground(new java.awt.Color(204, 204, 204));
        correoEstTxt.setText("Ingrese su correo");
        correoEstTxt.setBorder(null);
        correoEstTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                correoEstTxtMousePressed(evt);
            }
        });
        correoEstTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoEstTxtActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("CORREO");

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("CONTRASEÑA");

        contraseñaEstTxt.setForeground(new java.awt.Color(204, 204, 204));
        contraseñaEstTxt.setText("jPasswordField1");
        contraseñaEstTxt.setBorder(null);
        contraseñaEstTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaEstTxtMousePressed(evt);
            }
        });
        contraseñaEstTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaEstTxtActionPerformed(evt);
            }
        });

        loginBoton.setBackground(new java.awt.Color(1, 174, 250));

        loginTxt.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        loginTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTxt.setText("Acceder");
        loginTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        loginTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBotonLayout = new javax.swing.GroupLayout(loginBoton);
        loginBoton.setLayout(loginBotonLayout);
        loginBotonLayout.setHorizontalGroup(
            loginBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );
        loginBotonLayout.setVerticalGroup(
            loginBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(contraseñaEstTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(correoEstTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(codigoEstTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(loginBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoEstTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoEstTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaEstTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(loginBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 410));
    }// </editor-fold>//GEN-END:initComponents


    private void codigoEstTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoEstTxtMousePressed
        if (codigoEstTxt.getText().equals("Ingrese su codigo estudiante")) {
            codigoEstTxt.setText("");
            codigoEstTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_codigoEstTxtMousePressed

    private void codigoEstTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoEstTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoEstTxtActionPerformed

    private void correoEstTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoEstTxtMousePressed
        if (correoEstTxt.getText().equals("Ingrese su correo")) {
            correoEstTxt.setText("");
            correoEstTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_correoEstTxtMousePressed

    private void correoEstTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoEstTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoEstTxtActionPerformed

    private void contraseñaEstTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaEstTxtMousePressed
        if (String.valueOf(contraseñaEstTxt.getPassword()).equals("•••••••••••••••")) {
            contraseñaEstTxt.setText("");
            contraseñaEstTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_contraseñaEstTxtMousePressed

    private void contraseñaEstTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaEstTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaEstTxtActionPerformed

    private void loginTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseClicked
        if (!validarEntrada()) {
            return;
        } else {
            if (validarEntradaBD()) {
                Usuario.codigoEstudiante = codigoEstTxt.getText().trim();
                Usuario.email = correoEstTxt.getText().trim();
                Usuario.contrasena = String.valueOf(contraseñaEstTxt.getPassword()).trim();
                Usuario.esEstudiante = true;

                SwingUtilities.getWindowAncestor(this).dispose();
                VentanaMenuEstudiante ventanaMenu = new VentanaMenuEstudiante();
                ventanaMenu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Los datos no son válidos. Por favor revisa e intenta de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loginTxtMouseClicked

    private void loginTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseEntered
        loginBoton.setBackground(new Color(1, 105, 150));
    }//GEN-LAST:event_loginTxtMouseEntered

    private void loginTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseExited
        loginBoton.setBackground(new Color(1, 174, 250));
    }//GEN-LAST:event_loginTxtMouseExited

    private void configurarCamposTexto() {
        codigoEstTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (!Character.isDigit(caracter)) {
                    e.consume();
                }
            }
        });

        TextosPredeterminado(codigoEstTxt, "Ingrese su codigo estudiante");
        TextosPredeterminado(correoEstTxt, "Ingrese su correo");
        TextosPredeterminado(contraseñaEstTxt, "•••••••••••••••");

        agregarFocusListener(codigoEstTxt, "Ingrese su codigo estudiante");
        agregarFocusListener(correoEstTxt, "Ingrese su correo");
        agregarFocusListener(contraseñaEstTxt, "•••••••••••••••");

    }

    private void TextosPredeterminado(javax.swing.JTextField campo, String texto) {
        campo.setForeground(Color.gray);
        campo.setText(texto);
    }

    private void agregarFocusListener(javax.swing.JTextField campo, String texto) {
        campo.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (campo.getText().equals(texto)) {
                    campo.setText("");
                    campo.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (campo.getText().isEmpty()) {
                    campo.setText(texto);
                    campo.setForeground(Color.gray);
                }
            }
        });
    }

    private void limpiarCampos() {
        TextosPredeterminado(codigoEstTxt, "Ingrese su codigo estudiante");
        TextosPredeterminado(correoEstTxt, "Ingrese su correo");
        TextosPredeterminado(contraseñaEstTxt, "•••••••••••••••");
    }

    private void restaurarTextoPredeterminado() {
        if (codigoEstTxt.getText().isEmpty()) {
            TextosPredeterminado(codigoEstTxt, "Ingrese su codigo estudiante");
        }
        if (correoEstTxt.getText().isEmpty()) {
            TextosPredeterminado(correoEstTxt, "Ingrese su correo");
        }
        if (String.valueOf(contraseñaEstTxt.getPassword()).isEmpty()) {
            TextosPredeterminado(contraseñaEstTxt, "•••••••••••••••");
        }
    }

    // Fin de metodos visuales
    private static boolean esCorreoValido(String correoElectronico) {
        String patron = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(patron);

        Matcher matcher = pattern.matcher(correoElectronico);

        return matcher.matches();
    }

    private boolean validarEntrada() {
        // Verificar que todos los campos estén llenos
        if (codigoEstTxt.getText().isEmpty()
                || codigoEstTxt.getText().equals("Ingrese su codigo estudiante")
                || correoEstTxt.getText().isEmpty()
                || correoEstTxt.getText().equals("Ingrese su correo")
                || String.valueOf(contraseñaEstTxt.getPassword()).isEmpty()
                || String.valueOf(contraseñaEstTxt.getPassword()).equals("•••••••••••••••")) {

            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe llenar todos los campos de informacion para continuar", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Verificar formato del correo electrónico
        if (!esCorreoValido(correoEstTxt.getText())) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Correo electrónico inválido");
            correoEstTxt.requestFocus();
            return false;
        }

        return true;
    }
    
   

    private boolean validarEntradaBD() {
        String codigoEstudiante = codigoEstTxt.getText().trim();
        String correo = correoEstTxt.getText().trim();
        String contraseña = String.valueOf(contraseñaEstTxt.getPassword()).trim();

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/plataforma", "root", "");
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM estudiantes WHERE Codigo_Estudiante=? AND Email=? AND Contraseña=?");

            pst.setString(1, codigoEstudiante);
            pst.setString(2, correo);
            pst.setString(3, contraseña);

            ResultSet rs = pst.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoEstTxt;
    private javax.swing.JPasswordField contraseñaEstTxt;
    private javax.swing.JTextField correoEstTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel loginBoton;
    private javax.swing.JLabel loginTxt;
    // End of variables declaration//GEN-END:variables
}