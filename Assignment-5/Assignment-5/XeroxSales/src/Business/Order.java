/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sheetal
 */
public class Order {
    
    private static int count=1;
    private ArrayList<OrderItem> orderItemList;
   private int OrderID;
   
    
    
    public Order()
    {
        
        OrderID =count ;
        count++;
        
        
        orderItemList = new ArrayList<OrderItem>();
        
    }


    public int getOrderID() {
        return OrderID;
    }
    
    

    public ArrayList<OrderItem> getOrderList() {
        return orderItemList;
    }

    public void setOrderList(ArrayList<OrderItem> orderList) {
        this.orderItemList = orderList;
    }
    
     public void removeOrderItem(OrderItem o) {
        orderItemList.remove(o);
    }
    
    public OrderItem addOrderItem() {
        OrderItem o = new OrderItem();
        orderItemList.add(o);
        return o;
    }
    
        @Override
    public String toString()
    {
        return String.valueOf(this.OrderID);
    }
    
 
    
}
