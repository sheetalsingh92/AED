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
public class VitalSign {
    private int respiratoryrate;
    private int heartrate;
    private int bloodpressure;
    private double weight;
    private String status;
    

    public int getRespiratoryrate() {
        return respiratoryrate;
    }

    public void setRespiratoryrate(int respiratoryrate) {
        this.respiratoryrate = respiratoryrate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }

    public int getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(int bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
     @Override
    public String toString() {
        return "" +new java.util.Date(); //To change body of generated methods, choose Tools | Templates.
    }
}
