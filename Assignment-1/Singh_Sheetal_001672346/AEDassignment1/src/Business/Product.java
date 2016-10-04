package Business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sheetal
 */
public class Product {

    private String carManufacturingYear;
    private String carModel;
    private String fuel;
    private String vehicleID;
    private String miles;
    private String batteryStatus;
    private String EngineStatus;
    private String OilStatus;
    private String serviceDate;
    private String serviceDescription;
    private String customerName;
    private String customerPhoneNumber;
    private String customerEmailAddress;

 public String getCarManufacturingYear() {
        return carManufacturingYear;
    }

    public void setCarManufacturingYear(String carManufacturingYear) {
        this.carManufacturingYear = carManufacturingYear;
    }
    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public String getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(String batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public String getEngineStatus() {
        return EngineStatus;
    }

    public void setEngineStatus(String EngineStatus) {
        this.EngineStatus = EngineStatus;
    }

    public String getOilStatus() {
        return OilStatus;
    }

    public void setOilStatus(String OilStatus) {
        this.OilStatus = OilStatus;
    }
    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

}
