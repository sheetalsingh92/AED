/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supplierdirectory;

/**
 *
 * @author Anamika
 */
public class Supplier {
    private String supplierName;
    //private String supplierId;
    private ProductCatalog productCatalog;
    
    public Supplier(){
        productCatalog = new ProductCatalog();
    }
    
    

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }**/
    
//    public void populateSupplier(){
//        
//    }
    
}
