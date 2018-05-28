/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Sheetal
 */
public class Customer extends Person{
    
    private int customerID;
    private static int count=1;
    private int salesVolume;
    
    private MasterOrderCatalog_Customer masterOrderCatalog_Customer;
    private ProductCatalog productCatalog;
    
   public Customer()
   {
       
       customerID = count;
       count++;
       masterOrderCatalog_Customer = new MasterOrderCatalog_Customer();
       productCatalog = new ProductCatalog();
   }
   
     public int getSalesVolume() {
        return salesVolume;
    }

    /**
     * @param salesVolume the salesVolume to set
     */
    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }

    public MasterOrderCatalog_Customer getMasterOrderCatalog_Customer() {
        return masterOrderCatalog_Customer;
    }

    public void setMasterOrderCatalog_Customer(MasterOrderCatalog_Customer masterOrderCatalog_Customer) {
        this.masterOrderCatalog_Customer = masterOrderCatalog_Customer;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
        @Override
    public String toString()
    {
        return String.valueOf(this.customerID);
    } 
}
