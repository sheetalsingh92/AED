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
public class BusinessConfigure {
   
         public  static Business initializeBusiness(){
    Business business =  Business.getInstance();
    
    
    Product p = business.getProductCatalog().addProduct();
    p.setProductName("Bag");
    p.setCeilingPrice(40.45);
    p.setTargetPrice(32);
    p.setFloorPrice(30.45);
    p.setAvailability(20);
    Product p1= business.getProductCatalog().addProduct();
     p1.setProductName("Notebook");
    p1.setCeilingPrice(25.0);
    p1.setTargetPrice(20);
    p1.setFloorPrice(15.0);
    p1.setAvailability(30);
    Customer c = business.getCustomerDirectory().addCustomer();
    c.setFirstName("John");
    c.setLastName("Smith");
    Customer c1= business.getCustomerDirectory().addCustomer();
    c1.setFirstName("Lily");
    c1.setLastName("Dsouza");
    SalesPerson sp = business.getSalesPersonDirectory().addSalesPerson();
    sp.setFirstName("Mac");
    sp.setLastName("John");
    SalesPerson sp1= business.getSalesPersonDirectory().addSalesPerson();
    sp1.setFirstName("Rohan");
    sp1.setLastName("Dsouza");
    return business;
         }
}
  
//        productName = new String[]{"Bag", "NoteBook", "BedFrame", "Cabinet", "Lamp", "Table", "WinterCoat", "Gloves", "Thermals", "Shoes"};
//       // this.ManufacturerName = new String[] {"SwissArmy" , "OrientLongman", "Orient", "Ikea" , "Philips" , "Ikea", "NorthFace", "NorthFace", "PRimark", "TimberLand"};
//        ceilingPrice = new Double[] {40.45D, 50.56D, 70.28D, 20.21D, 43.51D, 62.81D, 56.81D, 98.21D, 90.18D, 78.21D};
//          targetPrice = new Double[] {40.45D, 50.56D, 70.28D, 20.21D, 43.51D, 62.81D, 56.81D, 98.21D, 90.18D, 78.21D};
//         floorPrice = new Double[] {40.45D, 50.56D, 70.28D, 20.21D, 43.51D, 62.81D, 56.81D, 98.21D, 90.18D, 78.21D};
//          firstName = new String[] {"Jack", "Albert","Scott","Lamp", "Table", "WinterCoat", "Gloves", "Thermals", "Shoes","xyz"};
//          lastName = new String[] {"Jack", "Albert","Scott","Lamp", "Table", "WinterCoat", "Gloves", "Thermals", "Shoes","xyz"};
//          availability = new int[] {200,250,300,350,400,450,500,550,600,650};
   


    
    // CustomerDirectory ed = business.getCustomerDirectory();
   //  ProductCatalog productCatalog = new ProductCatalog();
     
     
     
//    for (int i =0; i <10; i++)
//    {
//    //CustomerDirectory  cd = business.getCustomerDirectory();
//    Customer c = business.getCustomerDirectory().addCustomer();
//    c.setFirstName("FirstName"+i);
//    c.setLastName("Last Namr"+i);
//    
//    
//    }
//     
//   
//   
//           for(int j=0; j<10; j++)
//        {
//            Product product = new Product();
//            product.setProductName(productName[j]);
//            product.setCeilingPrice(ceilingPrice[j]);
//            product.setAvailability(availability[j]);
//            //product.setWeight(weight[j]);
//            product.setFloorPrice(floorPrice[j]);
//            product.setTargetPrice(targetPrice[j]);
//        
//            business.getProductCatalog().addProduct(product);
//        } 
//                          
//        
//    return business;
//}
//}
//    

