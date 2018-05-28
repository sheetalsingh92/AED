/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarMarketAdmin;

import Business.Store;
import Business.StoreDirectory;
import InitializationFile.AddStoreJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sheetal
 */
public class ManageStoresJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private StoreDirectory storeDirectory;
    public ManageStoresJPanel(JPanel upc, StoreDirectory storeDirectory) {
        initComponents();
        this.upc=upc;
        this.storeDirectory=storeDirectory;
        
         DefaultTableModel dtm = (DefaultTableModel) tblstoredetails.getModel();
        dtm.setRowCount(0);
        for (Store s : storeDirectory.getStoreList()) {
            Object row[] = new Object[2];
            row[0] = s;
           
            row[1] = s.getStoreLocation();
           
            dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstoredetails = new javax.swing.JTable();
        btnviewDetails = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnaddStore = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Stores List");

        tblstoredetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Store Name", "Store Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblstoredetails);

        btnviewDetails.setText("View Details");
        btnviewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewDetailsActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnaddStore.setText("Add Store");
        btnaddStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddStoreActionPerformed(evt);
            }
        });

        btnback.setText("<<Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnviewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnaddStore)
                            .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnback)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnviewDetails)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnaddStore)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(btnback)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewDetailsActionPerformed
  int selectedRow = tblstoredetails.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a store from the table");
            return;
        }
        Store s = (Store) tblstoredetails.getValueAt(selectedRow, 0);
        UpdateStoreJPanel panel = new UpdateStoreJPanel(s,upc);
        upc.add("UpdateStoreJPanel", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);        // TODO add your handling code here:
    }//GEN-LAST:event_btnviewDetailsActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
          int selectedRow = tblstoredetails.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a store from table to delete");
            return;
        }
        Store s = (Store)tblstoredetails.getValueAt(selectedRow,0);
        storeDirectory.deleteStore(s);
       
        JOptionPane.showMessageDialog(this, "Store Details deleted Successfully");
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnaddStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddStoreActionPerformed
        AddStoreJPanel panel = new AddStoreJPanel(upc,storeDirectory);
        upc.add("AddStoreJPanel", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_btnaddStoreActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddStore;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnviewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblstoredetails;
    // End of variables declaration//GEN-END:variables
}
