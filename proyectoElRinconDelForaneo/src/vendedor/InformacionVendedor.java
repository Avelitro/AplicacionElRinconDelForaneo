/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vendedor;

import clases.DatabaseConnection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author octavio
 */
public class InformacionVendedor extends javax.swing.JFrame {

    /**
     * Creates new form InformacionVendedor
     */
    ArrayList<String> Establecimiento = new ArrayList<>();
    DatabaseConnection servicio;
    private long idEstablecimiento;
    public InformacionVendedor() {
        initComponents();
        servicio = new DatabaseConnection();
    }
    public InformacionVendedor(long idEstablecimiento) 
    {
        initComponents();
        servicio = new DatabaseConnection();
        this.idEstablecimiento=idEstablecimiento;
        informacionVendedor(this.idEstablecimiento);
    }
    private void informacionVendedor(long idEstablecimiento)
    {
        servicio = new DatabaseConnection();
        if(servicio.Conectar()){
            Establecimiento = servicio.getEstablecimiento(idEstablecimiento);
            nombreEstablecimiento.setText(Establecimiento.get(0));
            direccionEstablecimiento.setText(Establecimiento.get(1));
            telefonoEstablecimiento.setText(Establecimiento.get(2));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error al conectar");
        }   
    }
    public void guardarInfo(String nombreEstablecimiento, String direccion, String telefono)
    {
        if(servicio.actualizarVendedor(nombreEstablecimiento,direccion,Long.parseLong(telefono),this.idEstablecimiento))
        {
            JOptionPane.showMessageDialog(null, "Datos modificados");
        }
    }
     public JPanel getFondo() {
        return Background ;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        telefonoEstablecimiento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombreEstablecimiento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        direccionEstablecimiento = new javax.swing.JTextField();
        ButtonAcept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(253, 253, 253));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre del establecimiento");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, 33));
        Background.add(telefonoEstablecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 722, -1));

        jLabel2.setText("Numero telefónico");
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 210, 33));

        nombreEstablecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEstablecimientoActionPerformed(evt);
            }
        });
        Background.add(nombreEstablecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 722, -1));

        jLabel3.setText("Dirección del establecimiento");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, 33));

        direccionEstablecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionEstablecimientoActionPerformed(evt);
            }
        });
        Background.add(direccionEstablecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 722, -1));

        ButtonAcept.setBackground(new java.awt.Color(255, 0, 6));
        ButtonAcept.setForeground(new java.awt.Color(254, 254, 254));
        ButtonAcept.setText("Guardar");
        ButtonAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptActionPerformed(evt);
            }
        });
        Background.add(ButtonAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreEstablecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEstablecimientoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nombreEstablecimientoActionPerformed

    private void direccionEstablecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionEstablecimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionEstablecimientoActionPerformed

    private void ButtonAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceptActionPerformed
        // TODO add your handling code here:
        guardarInfo(nombreEstablecimiento.getText(),direccionEstablecimiento.getText(),telefonoEstablecimiento.getText());
    }//GEN-LAST:event_ButtonAceptActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton ButtonAcept;
    private javax.swing.JTextField direccionEstablecimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombreEstablecimiento;
    private javax.swing.JTextField telefonoEstablecimiento;
    // End of variables declaration//GEN-END:variables
}