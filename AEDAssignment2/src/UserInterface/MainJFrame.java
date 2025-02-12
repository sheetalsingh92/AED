/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Patient;
import Business.VitalSign;

/**
 *
 * @author Sheetal
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private Patient patientdetails;
    private VitalSign vitalsign;
    public MainJFrame() {
        initComponents();
        patientdetails = new Patient();
        vitalsign = new VitalSign();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btncreateVitalSign = new javax.swing.JButton();
        btnviewVitalSign = new javax.swing.JButton();
        btncreatePatient = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btncreateVitalSign.setText("CreateVitalSign");
        btncreateVitalSign.setEnabled(false);
        btncreateVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateVitalSignActionPerformed(evt);
            }
        });

        btnviewVitalSign.setText("ViewVitalSign");
        btnviewVitalSign.setEnabled(false);
        btnviewVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewVitalSignActionPerformed(evt);
            }
        });

        btncreatePatient.setText("Create Patient");
        btncreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreatePatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btncreateVitalSign))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btncreatePatient)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnviewVitalSign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btncreatePatient)
                .addGap(31, 31, 31)
                .addComponent(btncreateVitalSign)
                .addGap(34, 34, 34)
                .addComponent(btnviewVitalSign)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateVitalSignActionPerformed
        // TODO add your handling code here:
         CreateVitalSignJPanel createVitalSign = new CreateVitalSignJPanel(patientdetails);
        jSplitPane1.setRightComponent(createVitalSign);
        btncreatePatient.setEnabled(false);
        btnviewVitalSign.setEnabled(true);
        
    }//GEN-LAST:event_btncreateVitalSignActionPerformed

    private void btncreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreatePatientActionPerformed
        // TODO add your handling code here:
         btncreateVitalSign.setEnabled(true); 
        CreatePatientJPanel createPatient = new CreatePatientJPanel(patientdetails);
        jSplitPane1.setRightComponent(createPatient);
        
    }//GEN-LAST:event_btncreatePatientActionPerformed

    private void btnviewVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewVitalSignActionPerformed
        // TODO add your handling code here:
        btncreatePatient.setEnabled(false);
           ViewJPanel viewPatient = new ViewJPanel(patientdetails);
        jSplitPane1.setRightComponent(viewPatient);
        
      
    }//GEN-LAST:event_btnviewVitalSignActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreatePatient;
    private javax.swing.JButton btncreateVitalSign;
    private javax.swing.JButton btnviewVitalSign;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
