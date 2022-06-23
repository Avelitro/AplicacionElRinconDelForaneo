/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vendedor;
import entity.Platillos;
import javax.swing.JPanel;
import clases.DatabaseConnection;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author octavio
 */
public class ActualizarMenu extends javax.swing.JFrame {
    /*
     * Creates new form ActualizarMenu
     */
    ArrayList<Platillos> listPlatillos = new ArrayList<>();
    ArrayList<Integer> listSelect = new ArrayList<>();
    DatabaseConnection servicio;
    private long idEstablecimiento;
    DefaultTableModel dtm = new DefaultTableModel();
                
    public ActualizarMenu(long idEstablecimiento) {
        initComponents();
        this.idEstablecimiento = idEstablecimiento;
        servicio = new DatabaseConnection();
        String[] titulo = new String[]{"Nombre del platillo","Descripción","Precio","Selección"};
        dtm.setColumnIdentifiers(titulo);
        PlatillosTabla.setModel(dtm);
        
        if(servicio.Conectar()){
            listPlatillos = servicio.recibirPlatillos(this.idEstablecimiento);
        }
        else
            JOptionPane.showMessageDialog(null, "Error al conectar");            
        
        for(Platillos reco:listPlatillos)
            listarPlatillo(reco);
        
        addCheckBox(PlatillosTabla);
        
        PlatillosTabla.setDefaultRenderer (Object.class, new MiRender());
    }
    
    public class MiRender extends DefaultTableCellRenderer{
        @Override
        public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column){
 
            super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, 3);
            if ( servicio.marcadorChecbox(listPlatillos.get(row).getIdPlatillo()) == 1 ){
               this.setOpaque(true);
               this.setBackground(Color.RED);
               this.setForeground(Color.BLACK);
            } else {
               this.setOpaque(true);
               this.setBackground(Color.BLACK);
               this.setForeground(Color.WHITE);
            }
            return this;
        }
    }
    //Constructor vacio
    public ActualizarMenu() {
        initComponents();
        servicio = new DatabaseConnection();
    }
    public JPanel getFondo() {
        return Background ;
    }
    
    public void listarPlatillo(Platillos platillo){
       dtm.addRow(new Object[]{
           platillo.getNombrePlatillo(), platillo.getDescripcion(), String.valueOf(platillo.getPrecio())
       });
    }
    
    public void addCheckBox(JTable table){
        TableColumn tc = table.getColumnModel().getColumn(3);
        tc.setCellEditor(table.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(table.getDefaultRenderer(Boolean.class));
         
    }
    
    public boolean IsSelected(int row, int column, JTable table){    
        return table.getValueAt(row, column) != null;                       
    }
    
    public void marcaError(){
        JOptionPane.showMessageDialog(null, "No hay platillos disponibles");
    }
    
    public void modificarMenu(){
        if(PlatillosTabla.getRowCount() > 0)
            for(int i = 0; i < PlatillosTabla.getRowCount();i++){
                if  (IsSelected(i, 3, PlatillosTabla)){
                    System.out.println("col: " + i);
                    servicio.modificarMenu(listPlatillos.get(i).getIdPlatillo(),1);
                }
                    
                else
                    servicio.modificarMenu(listPlatillos.get(i).getIdPlatillo(),0);
            }
 
        else
            marcaError();
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
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PlatillosTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(27, 53, 164));
        Background.setMaximumSize(new java.awt.Dimension(5000, 2147483647));
        Background.setMinimumSize(new java.awt.Dimension(480, 480));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Actualizar menú");
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, -1));

        jToggleButton1.setBackground(new java.awt.Color(255, 0, 3));
        jToggleButton1.setForeground(new java.awt.Color(254, 254, 254));
        jToggleButton1.setText("Actualizar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        Background.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 120, -1));

        PlatillosTabla.setBackground(new java.awt.Color(4, 2, 2));
        PlatillosTabla.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        PlatillosTabla.setForeground(new java.awt.Color(254, 254, 254));
        jScrollPane1.setViewportView(PlatillosTabla);

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1000, 230));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/platoReservar.png"))); // NOI18N
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1000, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        modificarMenu();
        JOptionPane.showMessageDialog(null, "El meú se ha actualizado");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JTable PlatillosTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}