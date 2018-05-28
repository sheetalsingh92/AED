/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supplierdirectory;

import java.util.ArrayList;

/**
 *
 * @author Anamika
 */

public class ProductCatalog {
    
    //private Product product;
    //productCatalog ProductCatalog =new ProductCatalog();
    
    private ArrayList<Product> productCat;
    
    public ProductCatalog(){
        this.productCat = new ArrayList<>();
    
}

    public ArrayList<Product> getProductCat() {
        return productCat;
    }

    public void setProductCat(ArrayList<Product> productCat) {
        this.productCat = productCat;
    }
   
    
    public Product addProduct()
    {
        Product product = new Product();
        this.productCat.add(product);
        return product;
    }
    
    
/**
    public Product addProduct(){
              Product product = new Product();
       
        this.productCatalog.add(product);
        //(product);
             return product;
    }
    
}
**/
}