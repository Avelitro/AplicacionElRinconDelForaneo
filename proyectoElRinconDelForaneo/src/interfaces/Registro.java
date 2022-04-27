/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaces;

import clases.DatabaseConnection;
import clases.usuario;
import clases.validacion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author octavio
 */
public class Registro extends javax.swing.JDialog {
    private DatabaseConnection servicio;
    private validacion mValidacion;
    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        servicio = new DatabaseConnection();
        mValidacion = new validacion();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    Registro() {
        servicio = new DatabaseConnection();
        mValidacion = new validacion();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfCorreo = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        tfTipoUsuario = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 53, 164));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfCorreo.setText("Escribe tu correo electrónico");
        tfCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(tfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 430, -1));

        tfPassword.setText("Contraseña");
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 430, -1));

        tfTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Negocio" }));
        tfTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTipoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(tfTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 430, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Aceptar");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 120, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuenta (2).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 480, 70));

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 480, -1));

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Tipo de usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        tfNombre.setText("Escribe tu nombre (s)");
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        jPanel1.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 430, -1));

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Apellidos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        tfApellido.setText("Escribe tu apellido (s)");
        tfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(tfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 430, -1));

        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Correo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Contraseña");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTipoUsuarioActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void tfCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreoActionPerformed
        // TODO add your handling code here:
        servicio.Conectar();
        System.out.println(servicio.getUsuarioByCorreo(tfCorreo.getText()));
        servicio.Desconectar();
    }//GEN-LAST:event_tfCorreoActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if(tfNombre.getText().equals("") || tfApellido.getText().equals("") || tfCorreo.getText().equals("") || tfPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Llene todos los campos.");
        }
        else{
            if(servicio.Conectar()){
                if (mValidacion.ValidarEmail(tfCorreo.getText().trim())) {
                    if(servicio.getUsuarioByCorreo(tfCorreo.getText()) == null) {
                        String apellidoPaterno,apellidoMaterno,apellidos[];
                        apellidos = tfApellido.getText().split(" ");
                        apellidoPaterno = apellidos[0];
                        apellidoMaterno = apellidos[1];
                        usuario nUsuario = new usuario();
                        nUsuario.setIdUsuario(0);
                        nUsuario.setNombres(tfNombre.getText());
                        nUsuario.setApellidoPaterno(apellidoPaterno);
                        nUsuario.setApellidoMaterno(apellidoMaterno);
                        nUsuario.setCorreo(tfCorreo.getText());
                        nUsuario.setContrasena(nUsuario.encriptar(tfPassword.getText()));
                        nUsuario.setTipoUsuario(tfTipoUsuario.getSelectedItem().toString());
                        if(servicio.createUsuario(nUsuario)){
                            JOptionPane.showMessageDialog(null, "Usuario Creado Correctamente.");
                            this.dispose();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "El usuario no se pudo crear.");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Correo ya usado.");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Correo invalido.");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Error al conectar");
            }
            //servicio.Desconectar();
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registro dialog = new Registro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JComboBox<String> tfTipoUsuario;
    // End of variables declaration//GEN-END:variables
}
