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
public class CustomerDirectory {
 private ArrayList<Customer> customerList;

public CustomerDirectory()
{
    customerList = new ArrayList<Customer>();
}

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }


public Customer addCustomer()
{
   Customer c = new Customer();
    customerList.add(c);
    return c;
}

public void deleteCustomer(Customer c)
{
    customerList.remove(c);
}

    public Customer bestCustomer()
    {
        ArrayList<Integer> tempcustomerList= new ArrayList<>();
        for(Customer c: customerList)
        {
            tempcustomerList.add(c.getSalesVolume());
        }
        Collections.sort(tempcustomerList, Collections.reverseOrder());
        int quan= tempcustomerList.get(0);
        for(Customer c1: customerList)
        if(quan== c1.getSalesVolume())
        {
            return c1;
        }   
        return null;
    }
}
