/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;
import java.util.Date;


public class PatientDirectory {
 private String behaviouralProblem;
   private Date chkupdate;
   private String Prescription;
      private Patient child;
    private ArrayList<Patient> patientlist;
 
    public PatientDirectory()
    {
        patientlist=new ArrayList<Patient>();
       
    } 

    public ArrayList<Patient> getPatientlist() {
        return patientlist;
    }

    public void setPatientlist(ArrayList<Patient> patientlist) {
        this.patientlist = patientlist;
    }

    public String getBehaviouralProblem() {
        return behaviouralProblem;
    }

    public void setBehaviouralProblem(String behaviouralProblem) {
        this.behaviouralProblem = behaviouralProblem;
    }

    public Date getChkupdate() {
        return chkupdate;
    }

    public void setChkupdate(Date chkupdate) {
        this.chkupdate = chkupdate;
    }

    public String getPrescription() {
        return Prescription;
    }

    public void setPrescription(String Prescription) {
        this.Prescription = Prescription;
    }

    public Patient getChild() {
        return child;
    }

    public void setChild(Patient child) {
        this.child = child;
    }
    
   
    
    public Patient add(Patient p){
       // Patient p =new Patient();
        patientlist.add(p);
        return p;
       }
    
    public void deletePatient(Patient ch){
        patientlist.remove(ch);
    }
    
    public Patient searchChild(int id){
        for(Patient c:patientlist)
        {
            if(c.getPatientId()==id)
                return c;
        }
        return null;
    }
      
     public Patient checkIfChiIdUserNameIsUnique(String childUserId)
    {
        for (Patient ch : patientlist)
        {
            if (ch.getName().equals(childUserId))
                return ch;
        }
        return null;
    }
            
}
