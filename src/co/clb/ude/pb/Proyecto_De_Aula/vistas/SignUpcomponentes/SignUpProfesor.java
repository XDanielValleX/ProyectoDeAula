/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.vistas.SignUpcomponentes;

import java.awt.event.FocusAdapter;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.toedter.calendar.JTextFieldDateEditor;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author daniel
 */
public class SignUpProfesor extends javax.swing.JPanel {

    /**
     * Creates new form Profesor
     */
    public SignUpProfesor() {
        initComponents();
        configurarCamposTexto();
        
        grupoGenero();

        configurarDateChooser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        nombrePoTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        correoPoTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelCorrreo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelContraseña = new javax.swing.JLabel();
        contraseñaPoTxt = new javax.swing.JPasswordField();
        SignUpBoton = new javax.swing.JPanel();
        SignUpTxt = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        apellidoPoTxt = new javax.swing.JTextField();
        jLabelGenero = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabelConfirmarContraseña = new javax.swing.JLabel();
        confirmarContraseñaPoTxt = new javax.swing.JPasswordField();
        jLabelID = new javax.swing.JLabel();
        IDPoTxt = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        gMujer = new javax.swing.JRadioButton();
        gHombre = new javax.swing.JRadioButton();
        jLabelFechaNacimiento = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jDateChooserPo = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImagen.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/clb/ude/pb/Proyecto_De_Aula/vistas/iconos/profesor.png"))); // NOI18N
        jLabelImagen.setText("Profesor");
        jPanel1.add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 40));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNombre.setText("Nombre(s)");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 132, 33));

        nombrePoTxt.setForeground(new java.awt.Color(204, 204, 204));
        nombrePoTxt.setText("Ingrese su(s) Nombre(s)");
        nombrePoTxt.setBorder(null);
        nombrePoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombrePoTxtMousePressed(evt);
            }
        });
        nombrePoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePoTxtActionPerformed(evt);
            }
        });
        jPanel1.add(nombrePoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 166, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 166, -1));

        correoPoTxt.setForeground(new java.awt.Color(204, 204, 204));
        correoPoTxt.setText("Ingrese su correo");
        correoPoTxt.setBorder(null);
        correoPoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                correoPoTxtMousePressed(evt);
            }
        });
        correoPoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoPoTxtActionPerformed(evt);
            }
        });
        jPanel1.add(correoPoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 160, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, -1));

        jLabelCorrreo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelCorrreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCorrreo.setText("Correo");
        jPanel1.add(jLabelCorrreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 96, 33));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, -1));

        jLabelContraseña.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelContraseña.setText("Contraseña");
        jPanel1.add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 96, 33));

        contraseñaPoTxt.setForeground(new java.awt.Color(204, 204, 204));
        contraseñaPoTxt.setText("jPasswordField1");
        contraseñaPoTxt.setBorder(null);
        contraseñaPoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaPoTxtMousePressed(evt);
            }
        });
        contraseñaPoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaPoTxtActionPerformed(evt);
            }
        });
        jPanel1.add(contraseñaPoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 30));

        SignUpBoton.setBackground(new java.awt.Color(1, 174, 250));

        SignUpTxt.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        SignUpTxt.setForeground(new java.awt.Color(255, 255, 255));
        SignUpTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignUpTxt.setText("Guardar");
        SignUpTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        SignUpTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUpTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUpTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SignUpBotonLayout = new javax.swing.GroupLayout(SignUpBoton);
        SignUpBoton.setLayout(SignUpBotonLayout);
        SignUpBotonLayout.setHorizontalGroup(
            SignUpBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );
        SignUpBotonLayout.setVerticalGroup(
            SignUpBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel1.add(SignUpBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 350, -1, -1));

        jLabelApellido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelApellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelApellido.setText("Apellido(s)");
        jPanel1.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 132, 33));

        apellidoPoTxt.setForeground(new java.awt.Color(204, 204, 204));
        apellidoPoTxt.setText("Ingrese su(s) Apellido(s)");
        apellidoPoTxt.setBorder(null);
        apellidoPoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidoPoTxtMousePressed(evt);
            }
        });
        apellidoPoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoPoTxtActionPerformed(evt);
            }
        });
        jPanel1.add(apellidoPoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 166, 30));

        jLabelGenero.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelGenero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelGenero.setText("Genero");
        jPanel1.add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 132, 33));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 180, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 170, -1));

        jLabelConfirmarContraseña.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelConfirmarContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelConfirmarContraseña.setText("Confirmar Contraseña");
        jPanel1.add(jLabelConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 120, 33));

        confirmarContraseñaPoTxt.setForeground(new java.awt.Color(204, 204, 204));
        confirmarContraseñaPoTxt.setText("jPasswordField1");
        confirmarContraseñaPoTxt.setBorder(null);
        confirmarContraseñaPoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmarContraseñaPoTxtMousePressed(evt);
            }
        });
        confirmarContraseñaPoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarContraseñaPoTxtActionPerformed(evt);
            }
        });
        jPanel1.add(confirmarContraseñaPoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 170, 30));

        jLabelID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelID.setText("ID");
        jPanel1.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 132, 33));

        IDPoTxt.setForeground(new java.awt.Color(204, 204, 204));
        IDPoTxt.setText("Numero de Identificacion");
        IDPoTxt.setBorder(null);
        IDPoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IDPoTxtMousePressed(evt);
            }
        });
        IDPoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDPoTxtActionPerformed(evt);
            }
        });
        jPanel1.add(IDPoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 166, 30));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 166, -1));

        gMujer.setText("Mujer");
        gMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gMujerActionPerformed(evt);
            }
        });
        jPanel1.add(gMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 80, 30));

        gHombre.setText("Hombre");
        gHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gHombreActionPerformed(evt);
            }
        });
        jPanel1.add(gHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 80, 30));

        jLabelFechaNacimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFechaNacimiento.setText("Fecha de nacimiento");
        jPanel1.add(jLabelFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 132, 33));

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 166, -1));

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 180, 10));
        jPanel1.add(jDateChooserPo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 180, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void nombrePoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombrePoTxtMousePressed
        if (nombrePoTxt.getText().equals("Ingrese su(s) Nombre(s)")) {
            nombrePoTxt.setText("");
            nombrePoTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_nombrePoTxtMousePressed

    private void nombrePoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePoTxtActionPerformed

    private void correoPoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoPoTxtMousePressed
        if (correoPoTxt.getText().equals("Ingrese su correo")) {
            correoPoTxt.setText("");
            correoPoTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_correoPoTxtMousePressed

    private void correoPoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoPoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoPoTxtActionPerformed

    private void contraseñaPoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaPoTxtMousePressed
        if (String.valueOf(contraseñaPoTxt.getPassword()).equals("•••••••••••••••")) {
            contraseñaPoTxt.setText("");
            contraseñaPoTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_contraseñaPoTxtMousePressed

    private void contraseñaPoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaPoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaPoTxtActionPerformed

    private void SignUpTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpTxtMouseClicked
        if (!validarEntrada()) {
            return;
        } else {
            if (insertarProfesorBD()) {
                javax.swing.JOptionPane.showMessageDialog(jPanel1, "Registrado Correctamente");
                limpiarCampos();
            } else {
                javax.swing.JOptionPane.showMessageDialog(jPanel1, "Error al registrar el profesor", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_SignUpTxtMouseClicked

    private void SignUpTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpTxtMouseEntered
        SignUpBoton.setBackground(new Color(1, 105, 150));
    }//GEN-LAST:event_SignUpTxtMouseEntered

    private void SignUpTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpTxtMouseExited
        SignUpBoton.setBackground(new Color(1, 174, 250));
    }//GEN-LAST:event_SignUpTxtMouseExited

    private void apellidoPoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoPoTxtMousePressed
        if (apellidoPoTxt.getText().equals("Ingrese su(s) Apellido(s)")) {
            apellidoPoTxt.setText("");
            apellidoPoTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_apellidoPoTxtMousePressed

    private void apellidoPoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoPoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoPoTxtActionPerformed

    private void confirmarContraseñaPoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarContraseñaPoTxtMousePressed
        if (String.valueOf(confirmarContraseñaPoTxt.getPassword()).equals("•••••••••••••••")) {
            confirmarContraseñaPoTxt.setText("");
            confirmarContraseñaPoTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_confirmarContraseñaPoTxtMousePressed

    private void confirmarContraseñaPoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarContraseñaPoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarContraseñaPoTxtActionPerformed

    private void IDPoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDPoTxtMousePressed
        if (IDPoTxt.getText().equals("Numero de Identificacion")) {
            IDPoTxt.setText("");
            IDPoTxt.setForeground(Color.black);
        }

        restaurarTextoPredeterminado();
    }//GEN-LAST:event_IDPoTxtMousePressed

    private void IDPoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDPoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDPoTxtActionPerformed

    private void gMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gMujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gMujerActionPerformed

    private void gHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gHombreActionPerformed

    private void configurarDateChooser() {
        jDateChooserPo.setDateFormatString("d/MM/yyyy");
        jDateChooserPo.getDateEditor().setEnabled(false);
        jDateChooserPo.setSelectableDateRange(new java.util.Date(0), new java.util.Date()); // Esto permite seleccionar fechas hasta la fecha actual
    }

    private void grupoGenero() {
        botonesGenero = new ButtonGroup();
        botonesGenero.add(gHombre);
        botonesGenero.add(gMujer);
    }
    
    private void configurarCamposTexto() {
        IDPoTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (!Character.isDigit(caracter)) {
                    e.consume();
                }
            }
        });

        nombrePoTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (!Character.isLetter(caracter) && !Character.isWhitespace(caracter)) {
                    e.consume();
                }
            }
        });

        apellidoPoTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (!Character.isLetter(caracter) && !Character.isWhitespace(caracter)) {
                    e.consume();
                }
            }
        });

        TextosPredeterminado(nombrePoTxt, "Ingrese su(s) Nombre(s)");
        TextosPredeterminado(apellidoPoTxt, "Ingrese su(s) Apellido(s)");
        TextosPredeterminado(correoPoTxt, "Ingrese su correo");
        TextosPredeterminado(contraseñaPoTxt, "•••••••••••••••");
        TextosPredeterminado(confirmarContraseñaPoTxt, "•••••••••••••••");
        TextosPredeterminado(IDPoTxt, "Numero de Identificacion");

        agregarFocusListener(nombrePoTxt, "Ingrese su(s) Nombre(s)");
        agregarFocusListener(apellidoPoTxt, "Ingrese su(s) Apellido(s)");
        agregarFocusListener(correoPoTxt, "Ingrese su correo");
        agregarFocusListener(contraseñaPoTxt, "•••••••••••••••");
        agregarFocusListener(confirmarContraseñaPoTxt, "•••••••••••••••");
        agregarFocusListener(IDPoTxt, "Numero de Identificacion");
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
        TextosPredeterminado(nombrePoTxt, "Ingrese su(s) Nombre(s)");
        TextosPredeterminado(apellidoPoTxt, "Ingrese su(s) Apellido(s)");
        TextosPredeterminado(correoPoTxt, "Ingrese su correo");
        TextosPredeterminado(contraseñaPoTxt, "•••••••••••••••");
        TextosPredeterminado(confirmarContraseñaPoTxt, "•••••••••••••••");
        TextosPredeterminado(IDPoTxt, "Numero de Identificacion");
        botonesGenero.clearSelection();

        if (jDateChooserPo != null) {
            JTextFieldDateEditor editor = (JTextFieldDateEditor) jDateChooserPo.getDateEditor();
            editor.setText("dd/mm/yyyy");
            editor.setForeground(Color.gray);
            jDateChooserPo.setDate(null);
        }
    }

    private void restaurarTextoPredeterminado() {
        if (nombrePoTxt.getText().isEmpty()) {
            TextosPredeterminado(nombrePoTxt, "Ingrese su(s) Nombre(s)");
        }
        if (apellidoPoTxt.getText().isEmpty()) {
            TextosPredeterminado(apellidoPoTxt, "Ingrese su(s) Apellido(s)");
        }
        if (correoPoTxt.getText().isEmpty()) {
            TextosPredeterminado(correoPoTxt, "Ingrese su correo");
        }
        if (String.valueOf(contraseñaPoTxt.getPassword()).isEmpty()) {
            TextosPredeterminado(contraseñaPoTxt, "•••••••••••••••");
        }
        if (String.valueOf(confirmarContraseñaPoTxt.getPassword()).isEmpty()) {
            TextosPredeterminado(confirmarContraseñaPoTxt, "•••••••••••••••");
        }
        if (IDPoTxt.getText().isEmpty()) {
            TextosPredeterminado(IDPoTxt, "Numero de Identificacion");
        }
        
        if (jDateChooserPo.getDate() == null) {
            JTextFieldDateEditor editor = (JTextFieldDateEditor) jDateChooserPo.getDateEditor();
            editor.setText("dd/mm/yyyy");
            editor.setForeground(Color.gray);
        }
    }

    // Fin de metodos visuales
    
    private class ValidadorJDateChooser {

        public static boolean esFechaValida(JDateChooser jDateChooser) {
            if (jDateChooser.getDate() == null) {
                return false;
            }

            java.util.Date fechaNacimiento = jDateChooser.getDate();
            java.util.Calendar calNacimiento = java.util.Calendar.getInstance();
            calNacimiento.setTime(fechaNacimiento);

            java.util.Calendar calActual = java.util.Calendar.getInstance();

            int edad = calActual.get(java.util.Calendar.YEAR) - calNacimiento.get(java.util.Calendar.YEAR);
            int mesActual = calActual.get(java.util.Calendar.MONTH);
            int mesNacimiento = calNacimiento.get(java.util.Calendar.MONTH);
            int diaActual = calActual.get(java.util.Calendar.DAY_OF_MONTH);
            int diaNacimiento = calNacimiento.get(java.util.Calendar.DAY_OF_MONTH);

            if (mesNacimiento > mesActual || (mesNacimiento == mesActual && diaNacimiento > diaActual)) {
                edad--;
            }

            int edadMinima = 18;
            int edadMaxima = 100;

            return (edad >= edadMinima && edad <= edadMaxima);
        }
    }
    
    private class ValidacionContrseña {

        public static boolean contraseñasCoinciden(String contraseña, String confirmarContraseña) {
            return contraseña.equals(confirmarContraseña);
        }
    }

    private static boolean esCorreoValido(String correoElectronico) {
        String patron = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(correoElectronico);
        return matcher.matches();
    }

    private boolean validarGenero() {
        return gHombre.isSelected() || gMujer.isSelected();
    }

    private boolean validarEntrada() {
        if (!ValidadorJDateChooser.esFechaValida(jDateChooserPo)) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe seleccionar una fecha valida", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!validarGenero()) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe seleccionar su genero", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar que el ID sea de 10 dígitos
        if (IDPoTxt.getText().trim().length() != 8 && IDPoTxt.getText().trim().length() != 10 && IDPoTxt.getText().trim().length() != 11) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe ingresar un numero de Identificacion valido", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar que la contraseña tenga al menos 6 caracteres
        if (String.valueOf(contraseñaPoTxt.getPassword()).trim().length() < 6) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe ingresar una contraseña más larga (al menos 6 caracteres)", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!esCorreoValido(correoPoTxt.getText())) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe Ingresar un correo electrónico válido.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String contraseña = String.valueOf(contraseñaPoTxt.getPassword());
        String confirmarContraseña = String.valueOf(confirmarContraseñaPoTxt.getPassword());

        if (!ValidacionContrseña.contraseñasCoinciden(contraseña, confirmarContraseña)) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Las contraseñas no coinciden", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (nombrePoTxt.getText().equals("Ingrese su(s) Nombre(s)")
                || apellidoPoTxt.getText().equals("Ingrese su(s) Apellido(s)")
                || correoPoTxt.getText().equals("Ingrese su correo")
                || String.valueOf(contraseñaPoTxt.getPassword()).equals("•••••••••••••••")
                || String.valueOf(confirmarContraseñaPoTxt.getPassword()).equals("•••••••••••••••")
                || IDPoTxt.getText().equals("Numero de Identificacion")) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Debe llenar todos los campos de informacion", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!ValidacionContrseña.contraseñasCoinciden(contraseña, confirmarContraseña)) {
            javax.swing.JOptionPane.showMessageDialog(jPanel1, "Las contraseñas no coinciden");
            return false;
        }

        return true;
    }

    private boolean insertarProfesorBD() {
        Connection cn = null;
        PreparedStatement pst = null;

        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost/plataforma", "root", "");
            pst = cn.prepareStatement("INSERT INTO profesores (Identificacion, Nombre, Apellidos, Email, Contraseña, Nacimiento, Genero, Tipo_Usuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

            // Convertir la fecha de jCalendar a java.sql.Date
            java.util.Date date = jDateChooserPo.getDate();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());

            String genero = gHombre.isSelected() ? "Hombre" : "Mujer";

            // Establecer los parámetros de la consulta SQL
            pst.setInt(1, Integer.parseInt(IDPoTxt.getText().trim()));
            pst.setString(2, nombrePoTxt.getText().trim());
            pst.setString(3, apellidoPoTxt.getText().trim());
            pst.setString(4, correoPoTxt.getText().trim());
            pst.setString(5, String.valueOf(contraseñaPoTxt.getPassword()));
            pst.setDate(6, sqlDate);
            pst.setString(7, genero);
            pst.setString(8, "Profesor");

            // Ejecutar la consulta
            int filasInsertadas = pst.executeUpdate();
            return filasInsertadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDPoTxt;
    private javax.swing.JPanel SignUpBoton;
    private javax.swing.JLabel SignUpTxt;
    private javax.swing.JTextField apellidoPoTxt;
    private javax.swing.ButtonGroup botonesGenero;
    private javax.swing.JPasswordField confirmarContraseñaPoTxt;
    private javax.swing.JPasswordField contraseñaPoTxt;
    private javax.swing.JTextField correoPoTxt;
    private javax.swing.JRadioButton gHombre;
    private javax.swing.JRadioButton gMujer;
    private com.toedter.calendar.JDateChooser jDateChooserPo;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelConfirmarContraseña;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelCorrreo;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nombrePoTxt;
    // End of variables declaration//GEN-END:variables
}
