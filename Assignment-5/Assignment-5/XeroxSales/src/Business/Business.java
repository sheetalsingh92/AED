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
public class Business {
    private static Business business;
    private ProductCatalog productCatalog;
    private CustomerDirectory customerDirectory;
    private SalesPersonDirectory salesPersonDirectory;
    private MainMasterOrder mainMasterOrder;
    
    
    private Business(){
    productCatalog = new ProductCatalog();
    customerDirectory = new CustomerDirectory();
    salesPersonDirectory = new SalesPersonDirectory();
    mainMasterOrder = new MainMasterOrder();
    
    }
    public static Business getInstance()
{
    if(business==null)
    {
        return new Business();
    }
    return business;
}

    public MainMasterOrder getMainMasterOrder() {
        return mainMasterOrder;
    }

    public void setMainMasterOrder(MainMasterOrder mainMasterOrder) {
        this.mainMasterOrder = mainMasterOrder;
    }

  

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public void setSalesPersonDirectory(SalesPersonDirectory salesPersonDirectory) {
        this.salesPersonDirectory = salesPersonDirectory;
    }
    

    
    
}
