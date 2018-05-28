/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StoreAdmin;

import Business.Product;
import Business.Store;
import java.util.Arrays;
import javax.swing.JPanel;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Sheetal
 */
public class ProfitableProductsJPanel extends javax.swing.JPanel {

    
     private JPanel upc;
   private Business.StoreDirectory storeDirectory;
            
    public ProfitableProductsJPanel(JPanel upc,Business.StoreDirectory storeDirectory) {
        initComponents();
          this.upc=upc;
        this.storeDirectory=storeDirectory;
        
         cmbstorelist.removeAllItems();
        for (Store s : storeDirectory.getStoreList()) {
            cmbstorelist.addItem(s);
        }
        Store s = (Store) cmbstorelist.getSelectedItem();
        double [] a= new double [5];
        String name;
      DefaultCategoryDataset dataset =new DefaultCategoryDataset();
        for(Product p: s.getInventoryDirectory().getInventoryList())
        {  double cost= p.getMarkedPrice() - p.getSellingPrice();
        
        int len= s.getInventoryDirectory().getInventoryList().size();
        
            for(int i=0;i<len;i++)
           
            {
               a[i] = cost;
            }
            
            Arrays.sort(a);
             for(int i=0;i<5;i++)
             {name= p.getProductName();
             }
             
            // System.out.println(name +""+ a[i]);
             
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbstorelist = new javax.swing.JComboBox();

        cmbstorelist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(cmbstorelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(415, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cmbstorelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbstorelist;
    // End of variables declaration//GEN-END:variables
}
