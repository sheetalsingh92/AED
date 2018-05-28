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
public class PersonDirectory {
   private ArrayList<Person> personDirectory;
   
    
    public PersonDirectory()
    {
        personDirectory = new ArrayList<>();
       
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

   public Person createPerson(Person pd)
   {
        
       personDirectory.add(pd);
       return pd;
       
       
   }
   
   public void deleteVitalSign(VitalSign vs)
   {
       personDirectory.remove(vs);
   }  
   
      public Person searchAccount(String ID,String Name) {
        for (Person a : personDirectory) {
            if ((a.getPersonID().equals(ID) )|| (a.getPersonName().equals(Name))) {
                return a;
            }
        }
        return null;
      }
}
