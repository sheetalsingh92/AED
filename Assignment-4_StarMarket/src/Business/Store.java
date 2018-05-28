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
public class Store {
 
    private int StoreID;
    private String StoreLocation;
    private String StoreName;
    
    private ProductCatalog productCatalog;
    private InventoryDirectory inventoryDirectory;

    
    public Store()
    {
        
        productCatalog = new ProductCatalog();
        inventoryDirectory = new InventoryDirectory();
    }
    
    
    public int getStoreID() {
        return StoreID;
    }

    public void setStoreID(int StoreID) {
        this.StoreID = StoreID;
    }

    public String getStoreLocation() {
        return StoreLocation;
    }

    public void setStoreLocation(String StoreLocation) {
        this.StoreLocation = StoreLocation;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

  

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(InventoryDirectory inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }
    
        @Override
    public String toString()
    {
        return String.valueOf(this.StoreName);
    }
    
    
    
}
