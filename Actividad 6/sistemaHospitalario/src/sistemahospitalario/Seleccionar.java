/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahospitalario;

/**
 *
 * @author DELL
 */
public class Seleccionar extends javax.swing.JFrame {

    /**
     * Creates new form Seleccionar
     */
    public Seleccionar() {
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
        jCombSeleccion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        bottSiguie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jCombSeleccion.setBackground(new java.awt.Color(204, 204, 204));
        jCombSeleccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCombSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicos", "Pacientes", "Centro de Servicio" }));
        jCombSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombSeleccionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Selecciona tipo de información");

        bottSiguie.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bottSiguie.setText("Siguiente");
        bottSiguie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottSiguieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(bottSiguie))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jCombSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jCombSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(bottSiguie, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
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

    private void jCombSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombSeleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombSeleccionActionPerformed

    private void bottSiguieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottSiguieActionPerformed
        // TODO add your handling code here:
        siguiente();
    }//GEN-LAST:event_bottSiguieActionPerformed
   public void  siguiente(){
     String siguien="";
        siguien=siguien+jCombSeleccion.getSelectedItem().toString();    
       
    if (siguien.equals("Pacientes")) {                           
        Pacientes sisa = new Pacientes();
        sisa.setVisible(true);
        }
    if (siguien.equals("Medicos")) {                           
        Medicos medi = new Medicos();
        medi.setVisible(true);
        } 
    if (siguien.equals("Centro de Servicio")) {                           
          CentroDeServicio CentSe = new CentroDeServicio();
          CentSe.setVisible(true);
        }  
       
         
        
   }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottSiguie;
    private javax.swing.JComboBox<String> jCombSeleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
