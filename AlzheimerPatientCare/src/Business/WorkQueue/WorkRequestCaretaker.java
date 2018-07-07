/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author Prashant
 */
public class WorkRequestCaretaker extends WorkRequest{
    private String assignment;
    private String report;
    private Patient patient;
    String problem;
    String prescription;
 

   
  

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    
    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

   


   
    
}
