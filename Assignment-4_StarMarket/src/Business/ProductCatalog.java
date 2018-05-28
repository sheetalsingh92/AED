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
public class ProductCatalog {
    
      private ArrayList<Product> productList;

    public ProductCatalog() {
        productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public Product addProduct(Product p) {
        
        productList.add(p);
        return p;
    }

    public void deleteProduct(Product p) {
        productList.remove(p);
    }

    public Product searchProduct(int i) {
        for (Product p : productList) {
            if (p.getProductID()== i) {
                return p;
            }
        }
        return null;
    }
    
      public Product searchProductName(String i) {
        for (Product p : productList) {
            if (p.getProductName().equals(i)) {
                return p;
            }
        }
        return null;
    }

    
}
