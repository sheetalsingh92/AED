/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Sheetal
 */
public class InventoryDirectory {
   
     
      private ArrayList<Product> inventoryList;
      

    public InventoryDirectory() {
        inventoryList = new ArrayList<Product>();
    }

    public ArrayList<Product> getInventoryList() {
        return inventoryList;
    }


    public Product addProductinInventory( Product s) {
       
         
        inventoryList.add(s);
        return s;
    }

    public void deleteProductinInventory(Product s) {
        inventoryList.remove(s);
    }

    public Product searchProduct(String i) {
       for (Product p : inventoryList) {
            if (p.getProductName().equals(i)) {
             return p;
            }
        }
       return null;
   }
    
}
