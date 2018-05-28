/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supplierdirectory;

import com.sun.org.apache.xalan.internal.Version;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Anamika
 */
public class SupplierDirectory {
    
    
    
      
    //String[] supplierCat = new String[]{"Dell","HP","Apple","Toshiba","Lenovo"};
    
    
    

    /**
     * @param args the command line arguments
     */
   
    
    //ProductCatalog productCatalog;
    
    
    private ArrayList<Supplier> supplierDir;
    
    public SupplierDirectory(){
        this.supplierDir= new ArrayList<>();
    }

    

    public ArrayList<Supplier> getSupplierCat() {
        return supplierDir;
    }

    public void setSupplierCat(ArrayList<Supplier> supplierDir) {
        this.supplierDir = supplierDir;
    }
    
    public Supplier addSupplier(){ 
        Supplier supplier = new Supplier();
        this.supplierDir.add(supplier);
        return supplier;
    }  
     
       //supplierCat.add("Dell");
    
    
     /**  
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Brand;
        Scanner in = new Scanner(System.in);
      
    String[] SupplierDirectory = new String[]{"Dell","HP","Apple","Toshiba","Lenovo"};
    System.out.println(Arrays.toString(SupplierDirectory));
    
    System.out.println("Enter a Brand out of the 5 brands mentioned above");
      Brand = in.nextLine();
      System.out.println("You entered " +Brand);
     
      
      Product product = new Product();
      
      if (Brand== "Dell")
      {
       
    product.setProductName("P1");
    product.setAvailability("Available");
    product.setPrice(Float.parseFloat("$7500"));
    product.setDiscount(Float.parseFloat("2%"));
    
        
        //System.out.println(Arrays.toString(productCat.add(product)));
    
    System.out.println("Name: " +product.getProduct());
    System.out.println("You entered " +Brand);
    System.out.println("You entered " +Brand);
    System.out.println("You entered " +Brand);
    
    }
    **/
    
}

