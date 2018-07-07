/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CaregiverRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
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
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sheetal
 */
public class RequestTeacherJPanel extends javax.swing.JPanel {

       private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
    private EnterpriseDirectory entdir;
    private WorkRequest req;
    private UserAccount account;
    private Patient patient;
    private SessionLog session;
     
    public RequestTeacherJPanel(JPanel userProcessContainer,UserAccount account,Enterprise enterprise,EnterpriseDirectory entdir,WorkRequest req,Patient patient,SessionLog session) 
    {      initComponents();
           this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account= account;
       this.entdir=entdir;
        this.patient=patient;
        this.req=req;
        this.session=session;
        String name = patient.getName();
        lblname.setText(name);
          lblenterpriseName.setText(enterprise.getName());
          Activity a = session.getActivityDirectory().addActivity();
        a.setActivityTime(new Date());
        a.setPanelName("RequestTeacherJPanel");
    }
      

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnrequestCaretaker = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtmessage = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        lblenterpriseName = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PATIENT NAME");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CAREGIVER'S REQUEST TO TEACHER");

        btnrequestCaretaker.setBackground(new java.awt.Color(0, 0, 0));
        btnrequestCaretaker.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnrequestCaretaker.setForeground(new java.awt.Color(255, 255, 255));
        btnrequestCaretaker.setText("REQUEST TEACHER");
        btnrequestCaretaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrequestCaretakerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MESSAGE");

        txtmessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtmessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmessageActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        lblenterpriseName.setText("<value>");

        lblname.setText("jLabel2");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(587, 587, 587))
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(txtmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(btnrequestCaretaker))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(lblname))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblenterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblenterpriseName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblname))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addComponent(btnrequestCaretaker, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnrequestCaretakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrequestCaretakerActionPerformed

        String message = txtmessage.getText();
        
        if(message.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter message for Teacher's Request");
            return;
        }
        WorkRequestTeacher request = new WorkRequestTeacher();

        request.setMessage(message);
        request.setSender(account);
        request.setStatusatTeacher("Sent");
       
        request.setPatient(patient);

        Organization org = null;
        Enterprise ent=null;
        for(Enterprise e:entdir.getEnterpriseList())
        {

            for (Organization organization :e.getOrgDir().getOrganizationList())
            {
                if (organization instanceof YogaTeacherOrganization){
                    org = organization;
                    ent = e;

                    break;
                }
                
               
            }

        }

        if (org!=null)
        {
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);

        }

        JOptionPane.showMessageDialog(this,"Message Sent to Yoga Teacher");
        //  populateReqTable();
   
        txtmessage.setText("");

    }//GEN-LAST:event_btnrequestCaretakerActionPerformed

    private void txtmessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmessageActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
                                           
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnrequestCaretaker;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblenterpriseName;
    private javax.swing.JLabel lblname;
    private javax.swing.JTextField txtmessage;
    // End of variables declaration//GEN-END:variables
}
