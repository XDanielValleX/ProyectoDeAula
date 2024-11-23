package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Gui.MenusProfesor;

import java.awt.Font;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelEstudiantes extends javax.swing.JPanel {

    public PanelEstudiantes() {
        initComponents();

        jTableEstudiantes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTableEstudiantes.getTableHeader().setOpaque(false);
        jTableEstudiantes.getTableHeader().setBackground(new Color(32, 136, 203));
        jTableEstudiantes.getTableHeader().setForeground(new Color(255, 255, 255));
        jTableEstudiantes.setRowHeight(25);

        // Deshabilitar reordenación de columnas
        jTableEstudiantes.getTableHeader().setReorderingAllowed(false);

        // Deshabilitar edición de celdas
        jTableEstudiantes.setDefaultEditor(Object.class, null);

        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstudiantes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSeparator11 = new javax.swing.JSeparator();
        buscar = new javax.swing.JLabel();
        text_buscar = new javax.swing.JTextField();
        button_buscar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JPanel();
        botonEliminarTxt = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        jTableEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Estudiante", "Nombre(s)", "Apellido(s)", "Fecha de Nacimiento", "Email", "Genero", "Identificacion", "Telefono", "Semestre", "Grupo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableEstudiantes.setFocusable(false);
        jTableEstudiantes.setRowHeight(25);
        jTableEstudiantes.setSelectionBackground(new java.awt.Color(0, 153, 204));
        jTableEstudiantes.setShowHorizontalLines(true);
        jTableEstudiantes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableEstudiantes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 370));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 180, 10));

        buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(59, 75, 82));
        buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscar.setText("Buscar:");
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 60, 30));

        text_buscar.setBorder(null);
        text_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(text_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 180, 30));

        button_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/Unicolombo/s3/poo/Proyecto_De_Aula/vistas/iconos/vaso (2).png"))); // NOI18N
        button_buscar.setBorder(null);
        button_buscar.setBorderPainted(false);
        button_buscar.setContentAreaFilled(false);
        button_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_buscarMouseExited(evt);
            }
        });
        button_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(button_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 40, 50));

        BotonEliminar.setBackground(new java.awt.Color(1, 174, 250));

        botonEliminarTxt.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        botonEliminarTxt.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonEliminarTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/Unicolombo/s3/poo/Proyecto_De_Aula/vistas/iconos/borrar_23.png"))); // NOI18N
        botonEliminarTxt.setText("Eliminar");
        botonEliminarTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        botonEliminarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEliminarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEliminarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BotonEliminarLayout = new javax.swing.GroupLayout(BotonEliminar);
        BotonEliminar.setLayout(BotonEliminarLayout);
        BotonEliminarLayout.setHorizontalGroup(
            BotonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonEliminarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotonEliminarLayout.setVerticalGroup(
            BotonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonEliminarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void text_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_buscarActionPerformed

    private void button_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_buscarMouseClicked

    }//GEN-LAST:event_button_buscarMouseClicked

    private void button_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_buscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_button_buscarMouseEntered

    private void button_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_buscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_button_buscarMouseExited

    private void button_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_buscarActionPerformed
        String codigoEstudiante = text_buscar.getText().trim();
        buscarEstudiante(codigoEstudiante);
    }//GEN-LAST:event_button_buscarActionPerformed

    private void botonEliminarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarTxtMouseClicked
        int filaSeleccionada = jTableEstudiantes.getSelectedRow();
        if (filaSeleccionada != -1) {
            String codigoEstudiante = (String) jTableEstudiantes.getValueAt(filaSeleccionada, 0);
            eliminarEstudiante(codigoEstudiante);
        } else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un estudiante de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarTxtMouseClicked

    private void botonEliminarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarTxtMouseEntered
        BotonEliminar.setBackground(new Color(1, 105, 150));
    }//GEN-LAST:event_botonEliminarTxtMouseEntered

    private void botonEliminarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarTxtMouseExited
        BotonEliminar.setBackground(new Color(1, 174, 250));
    }//GEN-LAST:event_botonEliminarTxtMouseExited

    private void cargarDatos() {
        try {
            Connection conexion = ConexionBD.conectar();
            PreparedStatement pst = conexion.prepareStatement("SELECT * FROM estudiantes");
            ResultSet rs = pst.executeQuery();

            DefaultTableModel modelo = (DefaultTableModel) jTableEstudiantes.getModel();
            modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos

            while (rs.next()) {
                Object[] fila = {
                    rs.getString("Codigo_Estudiante"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Nacimiento"),
                    rs.getString("Email"),
                    rs.getString("Genero"),
                    rs.getString("Identificacion"),
                    rs.getString("Telefono"),
                    rs.getString("Semestre"),
                    rs.getString("Grupo")
                };
                modelo.addRow(fila);
            }

            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void buscarEstudiante(String codigoEstudiante) {
        try {
            Connection conexion = ConexionBD.conectar();
            PreparedStatement pst = conexion.prepareStatement("SELECT * FROM estudiantes WHERE Codigo_Estudiante = ?");
            pst.setString(1, codigoEstudiante);
            ResultSet rs = pst.executeQuery();

            DefaultTableModel modelo = (DefaultTableModel) jTableEstudiantes.getModel();
            modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos

            if (rs.next()) {
                Object[] fila = {
                    rs.getString("Codigo_Estudiante"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Nacimiento"),
                    rs.getString("Email"),
                    rs.getString("Genero"),
                    rs.getString("Identificacion"),
                    rs.getString("Telefono"),
                    rs.getString("Semestre"),
                    rs.getString("Grupo")
                };
                modelo.addRow(fila);
            } else {
                JOptionPane.showMessageDialog(this, "Estudiante no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }

            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void eliminarEstudiante(String codigoEstudiante) {
        try {
            Connection conexion = ConexionBD.conectar();
            PreparedStatement pst = conexion.prepareStatement("DELETE FROM estudiantes WHERE Codigo_Estudiante = ?");
            pst.setString(1, codigoEstudiante);
            int filasAfectadas = pst.executeUpdate();

            if (filasAfectadas > 0) {
                cargarDatos(); // Actualizar la tabla después de la eliminación
                JOptionPane.showMessageDialog(this, "Estudiante eliminado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún estudiante con ese código", "Error", JOptionPane.ERROR_MESSAGE);
            }

            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public class ConexionBD {

        private static final String URL = "jdbc:mysql://localhost/plataforma";
        private static final String USER = "root";
        private static final String PASSWORD = "";

        public static Connection conectar() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
    }

    public static void main(String[] args) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonEliminar;
    private javax.swing.JLabel botonEliminarTxt;
    private javax.swing.JLabel buscar;
    private javax.swing.JButton button_buscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JTable jTableEstudiantes;
    private javax.swing.JTextField text_buscar;
    // End of variables declaration//GEN-END:variables
}
