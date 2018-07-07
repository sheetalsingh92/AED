/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.Patient.Patient;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Security.Activity;
import Business.Security.SessionLog;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkRequestDoctor;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prashant
 */
public class AssignPatienttoDoctorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private EnterpriseDirectory enterpriseDirectory;
    private Patient patient;
    private SessionLog session;

    public AssignPatienttoDoctorJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EnterpriseDirectory enterpriseDirectory,SessionLog session) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.enterpriseDirectory = enterpriseDirectory;
        this.organization = organization;
        patient = new Patient();
          this.session=session;
          Activity a = session.getActivityDirectory().addActivity();
        a.setActivityTime(new Date());
        a.setPanelName("AssignPatienttoDoctorJPanel");
        populateTable();

    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblworkRequest.getModel();

        model.setRowCount(0);

        for (WorkRequest request : ((DoctorOrganization) organization).getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getEmployeeName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmployeeName();
            row[3] = request.getStatusatDoctor();
            row[4] = ((WorkRequestDoctor) request).getPatient().getName();

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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblworkRequest = new javax.swing.JTable();
        btnassign = new javax.swing.JButton();
        btnprocessRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        tblworkRequest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblworkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MESSAGE", "SENDER", "RECEIVER", "STATUS", "NAME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblworkRequest);
        if (tblworkRequest.getColumnModel().getColumnCount() > 0) {
            tblworkRequest.getColumnModel().getColumn(0).setResizable(false);
            tblworkRequest.getColumnModel().getColumn(1).setResizable(false);
            tblworkRequest.getColumnModel().getColumn(2).setResizable(false);
            tblworkRequest.getColumnModel().getColumn(3).setResizable(false);
            tblworkRequest.getColumnModel().getColumn(4).setResizable(false);
        }

        btnassign.setBackground(new java.awt.Color(0, 0, 0));
        btnassign.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnassign.setForeground(new java.awt.Color(255, 255, 255));
        btnassign.setText("ASSIGN TO ME");
        btnassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignActionPerformed(evt);
            }
        });

        btnprocessRequest.setBackground(new java.awt.Color(0, 0, 0));
        btnprocessRequest.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnprocessRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnprocessRequest.setText("PROCESS REQUEST");
        btnprocessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocessRequestActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setText(" DOCTOR ASSIGNMENT");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("<< BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(629, 629, 629))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(btnassign, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(btnprocessRequest))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(443, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprocessRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnassign, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignActionPerformed

        int selectedRow = tblworkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Select a row!!");
            return;
        }

        WorkRequestDoctor request = (WorkRequestDoctor) tblworkRequest.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatusatDoctor("Pending");
        populateTable();

    }//GEN-LAST:event_btnassignActionPerformed

    private void btnprocessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocessRequestActionPerformed

        int selectedRow = tblworkRequest.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Select patient to proceed");
            return;
        }
        WorkRequestDoctor request = (WorkRequestDoctor) tblworkRequest.getValueAt(selectedRow, 0);

        if (request.getReceiver() == null) {
            JOptionPane.showMessageDialog(this, "Assign the patient to the Doctor 1st to process");
            return;
        }

        if (tblworkRequest.getValueAt(selectedRow, 2) == null) {
            JOptionPane.showMessageDialog(this, "Assign the patient to the Doctor 1st to process");
            return;
        }
        request.setStatusatDoctor("completed");
        patient = (Patient) request.getPatient();
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request, patient,session);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnprocessRequestActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnassign;
    private javax.swing.JButton btnprocessRequest;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblworkRequest;
    // End of variables declaration//GEN-END:variables
}
