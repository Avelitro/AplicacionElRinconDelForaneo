/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaces;

import clases.DatabaseConnection;
import entity.usuario;
import clases.validacion;
import control.RegistrarUsuario;
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
    private RegistrarUsuario servicio2;
    /**
     * Creates new form P_Registro
     */
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        tfCorreo = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        tfTipoUsuario = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MensajeNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        MensajeApellido = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        MensajeCorreo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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

        tfPassword.setText("2580");
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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 120, -1));

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

        MensajeNombre.setForeground(new java.awt.Color(254, 254, 254));
        MensajeNombre.setText("Nombre");
        jPanel1.add(MensajeNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        tfNombre.setText("Escribe tu nombre (s)");
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        jPanel1.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 430, -1));

        MensajeApellido.setForeground(new java.awt.Color(254, 254, 254));
        MensajeApellido.setText("Apellidos");
        jPanel1.add(MensajeApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        tfApellido.setText("Escribe tu apellido (s)");
        tfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(tfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 430, -1));

        MensajeCorreo.setForeground(new java.awt.Color(254, 254, 254));
        MensajeCorreo.setText("Correo");
        jPanel1.add(MensajeCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreoActionPerformed
        // TODO add your handling code here:
        servicio.Conectar();
        System.out.println(servicio.getUsuarioByCorreo(tfCorreo.getText()));
        servicio.Desconectar();
    }//GEN-LAST:event_tfCorreoActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void tfTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTipoUsuarioActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(tfNombre.getText().equals("") || tfApellido.getText().equals("") || tfCorreo.getText().equals("") || tfPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Llene todos los campos.");
        }
        else{
            if(servicio.Conectar()){
                if (mValidacion.ValidarEmail(tfCorreo.getText().trim())) 
                {
                    if(servicio.getUsuarioByCorreo(tfCorreo.getText()) == null) 
                    {
                        envDataUser(tfNombre.getText(),tfApellido.getText(),tfCorreo.getText(),tfPassword.getText(),tfTipoUsuario.getSelectedItem().toString());
                    }
                    else
                    {
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
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel MensajeApellido;
    private javax.swing.JLabel MensajeCorreo;
    private javax.swing.JLabel MensajeNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JComboBox<String> tfTipoUsuario;
    // End of variables declaration//GEN-END:variables
    public void envDataUser(String nombre, String apellidos, String correo, String password, String tipoUsuario)
    { 
        usuario nUsuario = new usuario();
        nUsuario.setIdUsuario(0);
        nUsuario.setNombres(tfNombre.getText());
        nUsuario.setApellidos(apellidos);
        nUsuario.setCorreo(tfCorreo.getText());
        //Encriptación de la contraseña
        nUsuario.setContrasena(nUsuario.encriptar(tfPassword.getText()));
        nUsuario.setTipoUsuario(tfTipoUsuario.getSelectedItem().toString());
        if(servicio2.envDataUser(nUsuario))
        {
            registroCorrecto();
        }
        else
        {
            registroIncorrecto();
        }
       System.out.println("Nombre: "+ nombre);
       System.out.println("Apellidos: "+ apellidos);
       System.out.println("Correo: "+ correo);
       System.out.println("Password: "+ password);
       System.out.println("TipoUsuario: "+ tipoUsuario);
    }
    private void registroCorrecto()
    {
        JOptionPane.showMessageDialog(null, "Usuario Creado Correctamente.");
        this.dispose();
    }
    private void registroIncorrecto()
    {
        JOptionPane.showMessageDialog(null, "¡ERROR! El usuario no se pudo crear");
    }
}

