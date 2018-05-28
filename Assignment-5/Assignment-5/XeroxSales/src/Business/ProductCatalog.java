/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sheetal
 */
public class ProductCatalog {
  
    private ArrayList<Product> productList;
    
    public ProductCatalog()
    {
        productList= new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addProduct()
    {
        Product p = new Product();
        productList.add(p);
        return p;
    }
    
    public void deleteProduct(Product p)
    {
        productList.remove(p);
    }
    
    public Product bestproduct()
    {
    ArrayList<Integer> tempProductList= new ArrayList<>();
        for(Product p: productList)
        {
            tempProductList.add(p.getSoldQuantity());
        }
        Collections.sort(tempProductList, Collections.reverseOrder());
        int quan= tempProductList.get(0);
        for(Product p1: productList)
        if(quan== p1.getSoldQuantity())
        {
            return p1;
        }   
        return null;
    }
    

}
