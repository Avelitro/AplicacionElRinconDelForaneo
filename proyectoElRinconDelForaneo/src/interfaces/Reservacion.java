/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaces;

import clases.DatabaseConnection;
import entity.Platillos;
import entity.establecimiento;
import entity.usuario;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author octavio
 */
public class Reservacion extends javax.swing.JDialog {

    /**
     * Creates new form Reservacion
     */
    ArrayList<Platillos> listPlatillos = new ArrayList<>();
    ArrayList<Integer> listSelect = new ArrayList<>();
    private DatabaseConnection servicio;
    private long idEstablecimiento;
    private long idUsuario;
    DefaultTableModel dtm = new DefaultTableModel();
    private boolean[] editable = {false,false,false,true,true};
    
    // Constructor vacio
    public Reservacion() {
        initComponents();
        this.servicio = new DatabaseConnection();        
    }
    
    public Reservacion(long idEstablecimiento,long idUsuario) {
        initComponents();
        this.idEstablecimiento = idEstablecimiento;
        this.idUsuario = idUsuario;
        this.servicio = new DatabaseConnection();
        
        dtm = new DefaultTableModel(new String[]{"Nombre del platillo","Descripción","Precio","Cantidad","Selección"}, 0) {
 
            Class[] types = new Class[]{
                java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Integer.class,java.lang.Boolean.class
            };
 
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
            public boolean isCellEditable(int row, int column){
                return editable[column];
            }
        };
        
        PlatillosTabla.setModel(dtm);
        
        if(servicio.Conectar()){
            listPlatillos = servicio.listarPlatillosValidos(this.idEstablecimiento);
        }
        else
            JOptionPane.showMessageDialog(null, "Error al conectar"); 
        for(Platillos reco:listPlatillos)
            listarPlatillo(reco);
        
        
    }
    
    public void listarPlatillo(Platillos platillo){
        Object fila[] = new Object[5];
        fila[0] = platillo.getNombrePlatillo();
        fila[1] = platillo.getDescripcion();
        fila[2] = String.valueOf(platillo.getPrecio());
        fila[3] = 1;
        fila[4] = false;
        dtm.addRow(fila);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        Icono = new javax.swing.JLabel();
        TituloVentana = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PlatillosTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(27, 53, 164));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAceptar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonAceptar.setForeground(new java.awt.Color(254, 254, 254));
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setToolTipText("");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 140, 30));

        jButtonCancelar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonCancelar.setForeground(new java.awt.Color(254, 254, 254));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 140, 30));

        Icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N
        jPanel2.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 670, -1));

        TituloVentana.setForeground(new java.awt.Color(254, 254, 254));
        TituloVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloVentana.setText("Reservación de platillo");
        jPanel2.add(TituloVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 670, -1));

        PlatillosTabla.setBackground(new java.awt.Color(11, 7, 7));
        PlatillosTabla.setForeground(new java.awt.Color(254, 254, 254));
        PlatillosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        PlatillosTabla.setToolTipText("");
        jScrollPane1.setViewportView(PlatillosTabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 680, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        String [] opciones = {"Cancelar","Aceptar"};
        int opcion = JOptionPane.showOptionDialog(null, "¿Estás seguro?", "Reservación", 0, JOptionPane.QUESTION_MESSAGE , null, opciones, "");
        
        if(opcion == 1)
            reservacion();

    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservacion().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono;
    private javax.swing.JTable PlatillosTabla;
    private javax.swing.JLabel TituloVentana;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    public void reservacion() {
        boolean selecciono = false;
        String aux;
        int cantidad,error = 0;
        if(PlatillosTabla.getRowCount() > 0)
            for(int i = 0; i < PlatillosTabla.getRowCount();i++){
                if(IsSelected(i, 4, PlatillosTabla)){
                    cantidad = (int) PlatillosTabla.getValueAt(i, 3);
                    if(cantidad < 1 || cantidad > 5){
                        selecciono = false;
                        error = 1;
                        break;
                    }
                        selecciono = true;
                }
            }
        if(selecciono){
            String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            String token = "";
            do {
            token = "";
            for (int x = 0; x < 7; x++) {
                int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
                char caracterAleatorio = banco.charAt(indiceAleatorio);
                token += caracterAleatorio;
            }
            } while (servicio.existeToken(token));
            enviarDatosReservacion(token);
        }
        else
            marcaError(error);
    }
    public void enviarDatosReservacion(String token){
        long idReservacion = servicio.createReservacion(this.idUsuario,token), idPlatillo;
        int cantidad;
        
        double total=0;
        ArrayList<String> NombrePlatillos = new ArrayList<>();
        for(int i = 0; i < PlatillosTabla.getRowCount();i++){
            if(IsSelected(i, 4, PlatillosTabla)){
                String cant=" de: ";
                idPlatillo = listPlatillos.get(i).getIdPlatillo();
                cantidad = (int) PlatillosTabla.getValueAt(i, 3);
                servicio.createReservacionPlatillo(idReservacion,idPlatillo,cantidad);
                //Obteniendo el precio total
                total=(listPlatillos.get(i).getPrecio()*cantidad)+total;
                cant=String.valueOf(cantidad)+cant;
                cant=cant+listPlatillos.get(i).getNombrePlatillo();
                NombrePlatillos.add(cant);
                
            }
        }
        enviarCorreo(total,NombrePlatillos,token);
        JOptionPane.showMessageDialog(null, "Reservacion Exitosa. Se ha enviado correo con datos de su reservacion.");
        this.dispose();
        
    }
    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    public boolean IsSelected(int row, int column, JTable table){
        return (boolean)table.getValueAt(row, column);                       
    }
    public void marcaError(int error){
        if(error == 0)
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún platillo.", "¡Seleccione algún platillo!", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "El limite de reserva es 5 por platillo.","¡Exediste el número de platillo!",JOptionPane.ERROR_MESSAGE);
    }
    public void enviarCorreo(double total,ArrayList NombresPlatillos,String token)
    {
        establecimiento nEstablecimiento = new establecimiento();
        usuario nUsuario = new usuario();
        nEstablecimiento=servicio.listOneEstablecimiento(this.idEstablecimiento);
        System.out.println(nEstablecimiento.getCorreoEstablecimiento());
        nUsuario=servicio.listOneUsuario(this.idUsuario);
        
        String correo="proyectoutm007@gmail.com";
        String contra="qdrqpvghhdergvkl";
        
        Properties p= new Properties();
       p.put("mail.smtp.host","smtp.gmail.com");
       p.setProperty("mail.smtp.starttls.enable","true");
       p.put("mail.smtp.ssl.trust","smtp.gmail.com");
       p.setProperty("mail.smtp.port","587");
       p.setProperty("mail.smtp.user",correo);
       p.setProperty("mail.smtp.auth","true");
       Session s = Session.getDefaultInstance(p);
       MimeMessage mensaje= new MimeMessage(s);
       //Correo al vendedor
        try {
            mensaje.setFrom(new InternetAddress(correo));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(nEstablecimiento.getCorreoEstablecimiento()));
            mensaje.setSubject("Reservacion de platillos");
            mensaje.setText(
                    "Platillos ordenados: "+ NombresPlatillos +
                    " \nEl total a pagar es: " + total +
                    " \nCodigo de reservacion: " +token
            );
            Transport t = s.getTransport("smtp");
            t.connect(correo, contra);
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
        } catch (AddressException ex) {
            Logger.getLogger(Reservacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Reservacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Correo al cliente
        try {
            mensaje.setFrom(new InternetAddress(correo));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(nUsuario.getCorreo()));
            mensaje.setSubject("Reservacion de platillos");
            mensaje.setText(
                    "Platillos ordenados: "+ NombresPlatillos +
                    " \nEl total a pagar es: " + total +
                    " \nCodigo de reservacion: " +token
            );
            Transport t = s.getTransport("smtp");
            t.connect(correo, contra);
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
        } catch (AddressException ex) {
            Logger.getLogger(Reservacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Reservacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
