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
public class Initialization {
      
    private StoreDirectory storeDirectory;
    private ProductCatalog productCatalog;
    
    String storedirectory[]= new String[]{"Kilmarnock Street", "Huntington Avenue" , "Commonwealth Avenue", "Sidney Street", "Boylston Street"} ;
    String ProductName[];
    String ManufacturerName[];
    Double MarkedP[];
    int[] Availability;
    String DiscountAvailability[];
   
    String Category[];
     String ManufacturingDate[];
      String ManufacuringPlace[];
    String ProductDesc[];
    

    public Initialization() {
        this.ProductName = new String[]{"Bag", "NoteBook", "BedFrame", "Cabinet", "Lamp", "Table", "WinterCoat", "Gloves", "Thermals", "Shoes"};
        this.ManufacturerName = new String[] {"SwissArmy" , "OrientLongman", "Orient", "Ikea" , "Philips" , "Ikea", "NorthFace", "NorthFace", "PRimark", "TimberLand"};
        this.MarkedP = new Double[] {40.45D, 50.56D, 70.28D, 20.21D, 43.51D, 62.81D, 56.81D, 98.21D, 90.18D, 78.21D};
        this.Availability = new int[] {200,250,300,350,400,450,500,550,600,650};
        this.DiscountAvailability= new String[] {"Large", "ExtraLarge", "89","Large", "ExtraLarge", "89","Large", "ExtraLarge", "89","Large"};
        //this.Cate = new int[] {14, 87, 98, 67, 98, 67, 39, 89, 61, 62};
        this.Category = new String[] {"Red" , "Green", "Orange", "Blue", "Yellow", "Violet", "MAroon", "Black", "Green", "Red"};
        this.ProductDesc = new String[] {"Good PRoduct","Good PRoduct","Good PRoduct","Good PRoduct","Good PRoduct","Good PRoduct","Good PRoduct","Good PRoduct","Good PRoduct","Good PRoduct",};
        
    }
    
    public void addelements(StoreDirectory storeDirectory)
    {
    for (int i =0; i <5; i++)
    {
    Store store = new Store();
    store.setStoreName(storedirectory[i]);
    storeDirectory.addStore(store);
    }
    }
    public void addValues(ProductCatalog productCatalog)
    {
        for(int j=0; j<10; j++)
        {
            Product product = new Product();
            product.setProductName(ProductName[j]);
            product.setAvailability(Availability[j]);
           // product.setColor(Color[j]);
           // product.setWeight(weight[j]);
            product.setProductdesc(ProductDesc[j]);
            product.setMarkedPrice(MarkedP[j]);
            product.setManufacturer(ManufacturerName[j]);
            productCatalog.addProduct(product);
            
                    
        }
    }
}

