/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesPerson;

        
import Business.Business;
import Business.Customer;
import Business.Order;
import Business.OrderItem;
import Business.SalesPerson;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class viewSoldOrderJPanel extends javax.swing.JPanel {

     private Business business;
    private JPanel userProcessContainer;
    SalesPerson s;
    public viewSoldOrderJPanel(JPanel userProcessContainer,Business business,SalesPerson s) {
        initComponents();
         this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.s=s;
      
        
        cmborderdetails.removeAllItems();
        for (Order order : s.getMasterOrderCatalog_SalesPerson().getOrderCatalog()) {
        cmborderdetails.addItem(order);
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
        cmborderdetails = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        txtcommision = new javax.swing.JTextField();
        btnviewcommision = new javax.swing.JButton();

        jLabel1.setText("Orders");

        cmborderdetails.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmborderdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmborderdetailsActionPerformed(evt);
            }
        });

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Item Name", "Price", "Target Price", "Floor Price", "Ceiling Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        txtcommision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcommisionActionPerformed(evt);
            }
        });

        btnviewcommision.setText("View Commision");
        btnviewcommision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewcommisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmborderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnviewcommision)
                                .addGap(37, 37, 37)
                                .addComponent(txtcommision, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmborderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcommision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnviewcommision))
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmborderdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmborderdetailsActionPerformed
              
       if (cmborderdetails.getSelectedItem() != null)  
       {
        DefaultTableModel dtm = (DefaultTableModel) orderTable.getModel();
      // Customer c = (Customer)cmbcustomerdetails.getSelectedItem();
       Order order = (Order)cmborderdetails.getSelectedItem();
        dtm.setRowCount(0);
        //for (Order order : c.getMasterOrderCatalog_Customer().getOrderCatalog()){
            for (OrderItem orderItem : order.getOrderList()) {
              
               Object row[] = new Object[8];
             row[0] = orderItem;
            row[1] = orderItem.getProduct().getProductName();
            row[2] = orderItem.getSalesPrice();
            row[3] = orderItem.getProduct().getTargetPrice();
            row[4] = orderItem.getProduct().getFloorPrice();
            row[5] = orderItem.getProduct().getCeilingPrice();
            row[6] = orderItem.getQuantity();
            row[7] = orderItem.getSalesPrice() * orderItem.getQuantity();
            
                dtm.addRow(row);
            }
       }
                                                

    }//GEN-LAST:event_cmborderdetailsActionPerformed

    private void txtcommisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcommisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcommisionActionPerformed

    private void btnviewcommisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewcommisionActionPerformed
         int comm = 0;
        if (cmborderdetails.getSelectedItem() != null)
         {
        Order order = (Order) cmborderdetails.getSelectedItem();
            for(OrderItem orderItem : order.getOrderList())
            {
               
                if (orderItem.getSalesPrice()>orderItem.getProduct().getTargetPrice())
                {
                    comm = comm+ (2*(orderItem.getSalesPrice()*(orderItem.getProduct().getTargetPrice())));
                }
            }
         }
        
        s.setCommision(comm);
        txtcommision.setText(String.valueOf(s.getCommision()));
    }//GEN-LAST:event_btnviewcommisionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnviewcommision;
    private javax.swing.JComboBox cmborderdetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField txtcommision;
    // End of variables declaration//GEN-END:variables
}
