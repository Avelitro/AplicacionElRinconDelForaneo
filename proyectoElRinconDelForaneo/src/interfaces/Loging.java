/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaces;

/**
 *
 * @author octavio
 */
public class Loging extends javax.swing.JDialog {

    /**
     * Creates new form Loging
     */
    public Loging(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jPanel2 = new javax.swing.JPanel();
        jTextCorreo = new javax.swing.JTextField();
        jPasswordReg = new javax.swing.JPasswordField();
        jButtonAceptar = new javax.swing.JButton();
        Icono = new javax.swing.JLabel();
        TituloVentana = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        LabelCorreo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 88, 255));

        jPanel2.setBackground(new java.awt.Color(27, 53, 164));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextCorreo.setText("Ingresa tu correo");
        jPanel2.add(jTextCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 370, -1));

        jPasswordReg.setText("Contraseña");
        jPasswordReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordRegActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 380, 40));

        jButtonAceptar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonAceptar.setForeground(new java.awt.Color(254, 254, 254));
        jButtonAceptar.setText("ACEPTAR");
        jButtonAceptar.setToolTipText("");
        jPanel2.add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 140, -1));

        Icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N
        jPanel2.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 410, -1));

        TituloVentana.setForeground(new java.awt.Color(254, 254, 254));
        TituloVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloVentana.setText("Iniciar sesión");
        jPanel2.add(TituloVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 410, -1));

        Password.setForeground(new java.awt.Color(254, 254, 254));
        Password.setText("Contraseña");
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        LabelCorreo.setForeground(new java.awt.Color(254, 254, 254));
        LabelCorreo.setText("Correo");
        jPanel2.add(LabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordRegActionPerformed

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
            java.util.logging.Logger.getLogger(Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Loging dialog = new Loging(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel TituloVentana;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordReg;
    private javax.swing.JTextField jTextCorreo;
    // End of variables declaration//GEN-END:variables
}