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
public class StoreDirectory {
    
      private ArrayList<Store> storeList;
      private ArrayList<Product> productList;
      

    public StoreDirectory() {
        storeList = new ArrayList<Store>();
        productList = new ArrayList<Product>();
    }

    public ArrayList<Store> getStoreList() {
        return storeList;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public Store addStore( Store s ) {
       
        storeList.add(s);
        return s;
    }

    public void deleteStore(Store s) {
        storeList.remove(s);
    }

    public Store searchStore(int i) {
        for (Store p : storeList) {
            if (p.getStoreID()== i) {
                return p;
            }
        }
        return null;
    }

    
    
}
