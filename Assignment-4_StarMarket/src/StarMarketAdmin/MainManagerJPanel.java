/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarMarketAdmin;

import Business.ProductCatalog;
import Business.StoreDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sheetal
 */
public class MainManagerJPanel extends javax.swing.JPanel {

     private ProductCatalog pc;
   private JPanel upc;
   private StoreDirectory storeDirectory;
   
    public MainManagerJPanel(ProductCatalog pc,JPanel upc,StoreDirectory storeDirectory) {
        initComponents();
        this.pc=pc;
        this.upc=upc;
        this.storeDirectory=storeDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmanageProductCatalog = new javax.swing.JButton();
        btnmanageStores = new javax.swing.JButton();

        btnmanageProductCatalog.setText("Manage Product Catalog >>");
        btnmanageProductCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageProductCatalogActionPerformed(evt);
            }
        });

        btnmanageStores.setText("Manage Stores >>");
        btnmanageStores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageStoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmanageProductCatalog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmanageStores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnmanageProductCatalog)
                .addGap(62, 62, 62)
                .addComponent(btnmanageStores)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnmanageProductCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageProductCatalogActionPerformed
         ManageProductJPanel panel = new ManageProductJPanel(pc,upc,storeDirectory);
        upc.add("ManageProductJPanel", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
                                          
    }//GEN-LAST:event_btnmanageProductCatalogActionPerformed

    private void btnmanageStoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageStoresActionPerformed
        ManageStoresJPanel panel = new ManageStoresJPanel(upc,storeDirectory);
        upc.add("ManageStoresJPanel", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_btnmanageStoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmanageProductCatalog;
    private javax.swing.JButton btnmanageStores;
    // End of variables declaration//GEN-END:variables
}
