/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarMarketAdmin;

import Business.Product;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sheetal
 */
public class UpdateProductsJPanel extends javax.swing.JPanel {

    private Product p;
    private JPanel upc;
    public UpdateProductsJPanel(Product p, JPanel upc) {
        initComponents();
        this.p=p;
        this.upc=upc;
        populateForm();
         txtproductName.setEnabled(false);
        txtAvailability.setEnabled(false);
        txtmarkedPrice.setEnabled(false);
        txtproductdesc.setEnabled(false);
         txtproductCategory.setEnabled(false);
          txtmanufacturingPlace.setEnabled(false);
           txtmanufacturingDate.setEnabled(false);
            txtmanufacturerName.setEnabled(false);
             txtdiscountAvailabilty.setEnabled(false);
        }
        
    private void populateForm() {
        txtproductName.setText(p.getProductName());
        txtAvailability.setText(String.valueOf(p.getAvailability()));
        txtmarkedPrice.setText(String.valueOf (p.getMarkedPrice()));
        txtproductdesc.setText(p.getProductdesc());
        txtproductCategory.setText(p.getProductCategory());
        txtmanufacturingPlace.setText(p.getManufacturingPlace());
        txtmanufacturingDate.setText(p.getManufacturingDate());
        txtmanufacturerName.setText(p.getManufacturer());
        txtdiscountAvailabilty.setText(p.getDiscountAvailability());
        
      
    }
            
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtProductID = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmanufacturingDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtmanufacturingPlace = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtproductName = new javax.swing.JTextField();
        txtmarkedPrice = new javax.swing.JTextField();
        txtmanufacturerName = new javax.swing.JTextField();
        txtAvailability = new javax.swing.JTextField();
        txtproductCategory = new javax.swing.JTextField();
        txtdiscountAvailabilty = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtproductdesc = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Product Details");

        jLabel3.setText("ProductName");

        jLabel4.setText("Availability");

        jLabel5.setText("MarkedPrice");

        jLabel7.setText("Manufacturer Name");

        txtmanufacturingPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmanufacturingPlaceActionPerformed(evt);
            }
        });

        jLabel9.setText("Manufaturing Date");

        jLabel10.setText("Manufacturing Place");

        jLabel11.setText("Product Category");

        jLabel12.setText("Discount Availability");

        btnsave.setText("Save");
        btnsave.setToolTipText("");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel8.setText("Product Desc");

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
                .addContainerGap()
                .addComponent(btnback)
                .addGap(89, 89, 89)
                .addComponent(btnsave)
                .addGap(73, 73, 73)
                .addComponent(btnUpdate)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtproductCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtAvailability, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiscountAvailabilty)
                            .addComponent(txtproductdesc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmarkedPrice))
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3))
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(371, 371, 371)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtmanufacturerName)
                                .addComponent(txtmanufacturingDate)
                                .addComponent(txtmanufacturingPlace)
                                .addComponent(txtproductName, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                    .addContainerGap(180, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmarkedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtproductdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtproductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdiscountAvailabilty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnUpdate))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnback)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(jLabel1)
                    .addGap(81, 81, 81)
                    .addComponent(txtproductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(152, 152, 152)
                    .addComponent(txtmanufacturerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addComponent(txtmanufacturingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)
                    .addComponent(txtmanufacturingPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(157, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtmanufacturingPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmanufacturingPlaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmanufacturingPlaceActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
         p.setProductName(txtproductName.getText().trim());
        p.setMarkedPrice(Double.parseDouble(txtmarkedPrice.getText().trim()));
        p.setProductdesc(txtproductdesc.getText().trim());
        p.setAvailability(Integer.parseInt(txtAvailability.getText().trim()));
        p.setProductCategory(txtproductCategory.getText().trim());
        p.setManufacturer(txtmanufacturerName.getText().trim());
        p.setManufacturingPlace(txtmanufacturingPlace.getText().trim());
        p.setManufacturingDate(txtmanufacturingDate.getText().trim());
        
        p.setDiscountAvailability(txtdiscountAvailabilty.getText().trim());
        btnsave.setEnabled(false);
        btnUpdate.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Product details saved successfully");
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
          btnsave.setEnabled(true);
        txtproductName.setEditable(true);
        txtAvailability.setEnabled(true);
        txtmarkedPrice.setEditable(true);
        txtproductdesc.setEnabled(true);
         txtproductCategory.setEnabled(true);
          txtmanufacturingPlace.setEnabled(true);
           txtmanufacturingDate.setEnabled(true);
            txtmanufacturerName.setEnabled(true);
             txtdiscountAvailabilty.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtdiscountAvailabilty;
    private javax.swing.JTextField txtmanufacturerName;
    private javax.swing.JTextField txtmanufacturingDate;
    private javax.swing.JTextField txtmanufacturingPlace;
    private javax.swing.JTextField txtmarkedPrice;
    private javax.swing.JTextField txtproductCategory;
    private javax.swing.JTextField txtproductName;
    private javax.swing.JTextField txtproductdesc;
    // End of variables declaration//GEN-END:variables
}
