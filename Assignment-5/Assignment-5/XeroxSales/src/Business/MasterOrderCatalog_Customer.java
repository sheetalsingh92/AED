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
public class MasterOrderCatalog_Customer {
        private ArrayList<Order> orderCatalog;
    
    public MasterOrderCatalog_Customer() {
        orderCatalog = new ArrayList<>();
    }
    
    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }
    
    public Order addOrder(Order o) {
        //Order o= new Order();
        orderCatalog.add(o);
        return o;
    }
      public void deleteOrder(Order o)
    {
        orderCatalog.remove(o);
    }
}
