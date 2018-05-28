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
public class Patient {
    
    private String ID;
    private String Name;
    private int Age;
    private String Gender;
    private String DoctorName;
     private VitalSignHistory vitalsignHistory;
     
     public Patient()
     {
         vitalsignHistory=new VitalSignHistory();
     }

    public VitalSignHistory getVitalsignHistory() {
        return vitalsignHistory;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
}
