/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdministrativeRole;

import Business.Business;
import Business.CustomerDirectory;
import Business.Product;
import Business.ProductCatalog;
import Business.SalesPersonDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sheetal
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

      private Business business;
  
    private JPanel userProcessContainer;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,Business business) {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
  
       this.business = business;
        
              
       
       
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmanageProducts = new javax.swing.JButton();
        btnmanageSalesPerson = new javax.swing.JButton();
        btnviewReports = new javax.swing.JButton();

        btnmanageProducts.setText("Manage Products");
        btnmanageProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageProductsActionPerformed(evt);
            }
        });

        btnmanageSalesPerson.setText("Manage SalesPerson");
        btnmanageSalesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageSalesPersonActionPerformed(evt);
            }
        });

        btnviewReports.setText("ViewReports");
        btnviewReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmanageSalesPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmanageProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnviewReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(408, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnmanageProducts)
                .addGap(47, 47, 47)
                .addComponent(btnmanageSalesPerson)
                .addGap(44, 44, 44)
                .addComponent(btnviewReports)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnmanageProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageProductsActionPerformed
       ManageProductsJPanel panel = new ManageProductsJPanel(userProcessContainer,business);
        userProcessContainer.add("ManageProductsJPanel",panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnmanageProductsActionPerformed

    private void btnmanageSalesPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageSalesPersonActionPerformed
        ManageSalesPersonJPanel panel = new ManageSalesPersonJPanel(userProcessContainer,business);
        userProcessContainer.add("ManageSalesPersonJPanel",panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnmanageSalesPersonActionPerformed

    private void btnviewReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewReportsActionPerformed
       ViewReports panel = new ViewReports(userProcessContainer,business);
        userProcessContainer.add("ViewReports",panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);  
    }//GEN-LAST:event_btnviewReportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmanageProducts;
    private javax.swing.JButton btnmanageSalesPerson;
    private javax.swing.JButton btnviewReports;
    // End of variables declaration//GEN-END:variables
}
