/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;
import java.util.Date;

public class Patient {

    private String name;
    private String guardianName;
    private String age;
    private String patientEmailID;
    private String address;
    private Date chkupDate;
    private int patientId;
    private String Image;
    private ImageDirectory imageDirectory;

    private static int count = 1;
    private ArrayList<PatientDirectory> patientDetails;

    public Patient() {
        patientDetails = new ArrayList<PatientDirectory>();
        imageDirectory = new ImageDirectory();
        patientId = count;
        ++count;

    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getPatientEmailID() {
        return patientEmailID;
    }

    public void setPatientEmailID(String patientEmailID) {
        this.patientEmailID = patientEmailID;
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getChkupDate() {
        return chkupDate;
    }

    public void setChkupDate(Date chkupDate) {
        this.chkupDate = chkupDate;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + "";

    }

    

    public ArrayList<PatientDirectory> getPatientDetails() {
        return patientDetails;
    }

    public PatientDirectory addpatientDetails() {
        PatientDirectory plist = new PatientDirectory();
        patientDetails.add(plist);
        return plist;
    }

    public ImageDirectory getImageDirectory() {
        return imageDirectory;
    }

    public void setImageDirectory(ImageDirectory imageDirectory) {
        this.imageDirectory = imageDirectory;
    }

   

}
