/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CaregiverRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.CaregiverOrganization;
import Business.Organization.Organization;
import Business.Organization.YogaTeacherOrganization;
import Business.Patient.Patient;
import Business.Security.Activity;
import Business.Security.SessionLog;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkRequestCaretaker;
import Business.WorkQueue.WorkRequestTeacher;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prashant
 */
public class CaregiverWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CaregiverWorkAreaJPanel
     */
         private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
   private EnterpriseDirectory enterpriseDirectory;
   private Patient patient;
   private SessionLog session;
  
    public CaregiverWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise,EnterpriseDirectory enterpriseDirectory,SessionLog session) {
        initComponents();
        this.organization=organization;
         this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise =enterprise;
        this.enterpriseDirectory=enterpriseDirectory;
        this.session=session;
        patient=new Patient();
          Activity a = session.getActivityDirectory().addActivity();
        a.setActivityTime(new Date());
        a.setPanelName("CaregiverWorkAreaJPanel");
    
        lblenterpriseName.setText(enterprise.getName());
        this.organization = organization;
        
        populateTable();
      
    }
    
    public void populateTable(){
       
        DefaultTableModel model = (DefaultTableModel)tblcaregiverWorkRequest.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : ((CaregiverOrganization)organization).getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] =request;
            row[1] = ((WorkRequestCaretaker)request).getPatient().getName();
          row[2] = request.getSender().getEmployee().getEmployeeName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmployeeName();
            row[4] = request.getStatusatCaretaker();
            row[5] = ((WorkRequestCaretaker)request). getProblem();
            model.addRow(row);
           
    
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblenterpriseName = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        btnviewReport = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcaregiverWorkRequest = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 255));

        assignJButton.setBackground(new java.awt.Color(0, 0, 0));
        assignJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("ASSIGN REQUEST TO MYSELF");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setBackground(new java.awt.Color(0, 0, 0));
        processJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        processJButton.setForeground(new java.awt.Color(255, 255, 255));
        processJButton.setText("PROCESS REQUEST");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CAREGIVER WORK AREA");

        lblenterpriseName.setText("jLabel1");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE");

        btnviewReport.setBackground(new java.awt.Color(0, 0, 0));
        btnviewReport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnviewReport.setForeground(new java.awt.Color(255, 255, 255));
        btnviewReport.setText("VIEW REPORT");
        btnviewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewReportActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("<< BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tblcaregiverWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MESSAGE", "PATIENT NAME", "SENDER", "RECEIVER", "STATUS", "BEHAVIOURAL PROBLEM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblcaregiverWorkRequest);
        if (tblcaregiverWorkRequest.getColumnModel().getColumnCount() > 0) {
            tblcaregiverWorkRequest.getColumnModel().getColumn(0).setResizable(false);
            tblcaregiverWorkRequest.getColumnModel().getColumn(1).setResizable(false);
            tblcaregiverWorkRequest.getColumnModel().getColumn(2).setResizable(false);
            tblcaregiverWorkRequest.getColumnModel().getColumn(3).setResizable(false);
            tblcaregiverWorkRequest.getColumnModel().getColumn(4).setResizable(false);
            tblcaregiverWorkRequest.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblenterpriseName)
                                .addGap(340, 340, 340)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(assignJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(429, 429, 429))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1245, 1245, 1245)
                        .addComponent(btnviewReport)))
                .addGap(0, 122, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(316, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblenterpriseName)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnviewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(400, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(493, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = tblcaregiverWorkRequest.getSelectedRow();
        if (selectedRow < 0){
         JOptionPane.showMessageDialog(this, "Select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);   
            return;
        }
        WorkRequestCaretaker request = (WorkRequestCaretaker)tblcaregiverWorkRequest.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        request.setStatusatCaretaker("Pending");
         request.setAssignment("Request Received");
        populateTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = tblcaregiverWorkRequest.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequestCaretaker request = (WorkRequestCaretaker)tblcaregiverWorkRequest.getValueAt(selectedRow, 0);
        Patient patient= (Patient)request.getPatient();
        if(request.getReceiver()==null){
             JOptionPane.showMessageDialog(this, "First assign the request in order to Proceed");
             return;
        }
         
         if(tblcaregiverWorkRequest.getValueAt(selectedRow, 2)==null)
         {
            JOptionPane.showMessageDialog(this, "First assign the request in order to Proceed");
            return;
         }
        request.setStatusatCaretaker("Completed");
        request.setAssignment("Request Received");
        ProcessWorkRequestJPanelC processWorkRequestJPanel = new ProcessWorkRequestJPanelC( userProcessContainer, userAccount, enterprise, enterpriseDirectory, request,patient,session);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void btnviewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewReportActionPerformed
  int row = tblcaregiverWorkRequest.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
           try{
        WorkRequestCaretaker request = (WorkRequestCaretaker)tblcaregiverWorkRequest.getValueAt(row, 0);
        
        String report = request.getReport().toString();
      Desktop.getDesktop().open(new File(report));
           }
           catch(IOException e)
           {
               
           } 
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnviewReportActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnviewReport;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblenterpriseName;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable tblcaregiverWorkRequest;
    // End of variables declaration//GEN-END:variables
}
