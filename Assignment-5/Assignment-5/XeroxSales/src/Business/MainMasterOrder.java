/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Sheetal
 */
public class MainMasterOrder {
          private ArrayList<Order> mainMasterOrder;
    
    public MainMasterOrder() {
        mainMasterOrder = new ArrayList<>();
    }

    public ArrayList<Order> getMainMasterOrder() {
        return mainMasterOrder;
    }
    
    
    
    public Order addOrder(Order o) {
        //Order o= new Order();
        mainMasterOrder.add(o);
        return o;
    }
      public void deleteOrder(Order o)
    {
        mainMasterOrder.remove(o);
    }  
      
          public Order findByID(int id){
        
        for(Order o: mainMasterOrder){
            if(o.getOrderID()== id){
                return o;
            }
        }
        return null;
    }
}
