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
public class SalesPerson extends Person{
    
    private int SalesPersonID;
    private int commision;
    private static int count =1;
     private MasterOrderCatalog_SalesPerson masterOrderCatalog_SalesPerson;
    private ProductCatalog productCatalog;
    private int salesVolume;
    
    public SalesPerson()
    {
       
       SalesPersonID= count;
       count++;
       masterOrderCatalog_SalesPerson = new MasterOrderCatalog_SalesPerson();
       
    }

    public MasterOrderCatalog_SalesPerson getMasterOrderCatalog_SalesPerson() {
        return masterOrderCatalog_SalesPerson;
    }

 

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        this.commision = commision;
    }
    
        @Override
    public String toString()
    {
        return String.valueOf(this.SalesPersonID);
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }
    

    
   
}
