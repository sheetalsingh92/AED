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
public class Patient {
    private String patientID;
    private String patientName;
    private int age;
    private String doctorName;
    private String pharmacyName;
    private ArrayList<VitalSign> vitalSignHistory;
    
    public Patient()
    {
        vitalSignHistory= new ArrayList<>();
    }
    
     public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

   public VitalSign createVitalSign(VitalSign vs)
   {
        
       vitalSignHistory.add(vs);
       return vs;
       
       
   }
   
   
   public void deleteVitalSign(VitalSign vs)
   {
       vitalSignHistory.remove(vs);
   }
    
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }
    
  
    
}
