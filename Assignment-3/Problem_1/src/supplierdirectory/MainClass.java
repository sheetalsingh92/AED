/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supplierdirectory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
 

    
    public static void main(String[] args)
    {
        
        Product product = new Product();   
        ProductCatalog productCatalog= new ProductCatalog();
        Supplier supplier = new Supplier();
        SupplierDirectory supplierDirectory = new SupplierDirectory();
        
        
        ArrayList supplierAdd = new ArrayList();
        supplierAdd.add("Dell");
        supplierAdd.add("HP");
        supplierAdd.add("Lenovo");
        supplierAdd.add("Apple");
        supplierAdd.add("Toshiba");
        
        ArrayList productAdd = new ArrayList();
        productAdd.add("Charger");
        productAdd.add("Speakers");
        productAdd.add("Home Theater");
        productAdd.add("HeadPhones");
        productAdd.add("Power Banks");
        productAdd.add("Laptop");
        productAdd.add("Tablet");
        productAdd.add("Mobile");
        productAdd.add("Earphones");
        productAdd.add("USB");
        
        
        for (int i = 0; i<supplierAdd.size(); i++){
            Supplier sup = supplierDirectory.addSupplier();
            sup.setSupplierName(supplierAdd.get(i).toString());
                
            for (int a=0; a<10; a++){
                Product prod = sup.getProductCatalog().addProduct();
                prod.setProductName(productAdd.get(a).toString());
                
            }
        }
        for (Supplier suplr : supplierDirectory.getSupplierCat()){
            System.out.println("");
            System.out.println("Supplier Name is : " +suplr.getSupplierName());
            System.out.println("Products are: ");
                
            for (Product prdct : suplr.getProductCatalog().getProductCat()){
                
             System.out.println(prdct.getProductName());   
                
            }
        }
        
        
    
    }}
