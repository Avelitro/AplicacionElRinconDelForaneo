/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaces;

/**
 *
 * @author octavio
 */
public class Registro extends javax.swing.JDialog {

    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextCorreo = new javax.swing.JTextField();
        jPasswordReg = new javax.swing.JPasswordField();
        jComboTipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextCorreo1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextCorreo2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 53, 164));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextCorreo.setText("Escribe tu correo electrónico");
        jTextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 430, -1));

        jPasswordReg.setText("Contraseña");
        jPasswordReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordRegActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 430, -1));

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Negocio" }));
        jComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 430, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Aceptar");
        jButton1.setToolTipText("");
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

        jTextCorreo1.setText("Escribe tu nombre (s)");
        jTextCorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreo1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 430, -1));

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Apellidos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jTextCorreo2.setText("Escribe tu apellido (s)");
        jTextCorreo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreo2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 430, -1));

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

    private void jComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_jComboTipoActionPerformed

    private void jPasswordRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordRegActionPerformed

    private void jTextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreoActionPerformed

    private void jTextCorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreo1ActionPerformed

    private void jTextCorreo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreo2ActionPerformed

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
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordReg;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextCorreo1;
    private javax.swing.JTextField jTextCorreo2;
    // End of variables declaration//GEN-END:variables
}
