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
public class Product {
   private static int count=0;
    private int ProductID;
    private String ProductName;
    private int Availability;
    private double MarkedPrice;
    private double SellingPrice;
    private String Productdesc;
    private String DiscountAvailability;
    private String Manufacturer;
    private String ManufacturingPlace;
    private String ManufacturingDate;
    private String ProductCategory;
    private int quantity;
    
    
    
    public Product()
    {
         count++;
        ProductID = count;
        
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }
    
    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getAvailability() {
        return Availability;
    }

    public void setAvailability(int Availability) {
        this.Availability = Availability;
    }

    public double getMarkedPrice() {
        return MarkedPrice;
    }

    public void setMarkedPrice(double MarkedPrice) {
        this.MarkedPrice = MarkedPrice;
    }

    public double getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(double SellingPrice) {
        this.SellingPrice = SellingPrice;
    }

    public String getProductdesc() {
        return Productdesc;
    }

    public void setProductdesc(String Productdesc) {
        this.Productdesc = Productdesc;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public String getDiscountAvailability() {
        return DiscountAvailability;
    }

    public void setDiscountAvailability(String DiscountAvailability) {
        this.DiscountAvailability = DiscountAvailability;
    }

    public String getManufacturingPlace() {
        return ManufacturingPlace;
    }

    public void setManufacturingPlace(String ManufacturingPlace) {
        this.ManufacturingPlace = ManufacturingPlace;
    }

    public String getManufacturingDate() {
        return ManufacturingDate;
    }

    public void setManufacturingDate(String ManufacturingDate) {
        this.ManufacturingDate = ManufacturingDate;
    }

    public String getProductCategory() {
        return ProductCategory;
    }
    
     @Override
    public String toString()
    {
        return String.valueOf(this.ProductID);
    }
    

    public void setProductCategory(String ProductCategory) {
        this.ProductCategory = ProductCategory;
    }

  
    
    
    
    
  
}
