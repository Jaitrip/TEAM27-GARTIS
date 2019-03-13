/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.Customer;

import java.util.Date;

/**
 *
 * @author jaimik
 */
public class Vehicle {
    private String registrationNumber;
    private String make;
    private String model;
    private String engSerialNumber;
    private String colour;
    private int chassisNumber;
    private Date lastMOTDate;
    private Date lastServiceDate;

    public Vehicle(String registrationNumber, String make, String model, String engSerialNumber, String colour, int chassisNumber, Date lastMOTDate, Date lastServiceDate) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.engSerialNumber = engSerialNumber;
        this.colour = colour;
        this.chassisNumber = chassisNumber;
        this.lastMOTDate = lastMOTDate;
        this.lastServiceDate = lastServiceDate;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngSerialNumber() {
        return engSerialNumber;
    }

    public void setEngSerialNumber(String engSerialNumber) {
        this.engSerialNumber = engSerialNumber;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(int chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public Date getLastMOTDate() {
        return lastMOTDate;
    }

    public void setLastMOTDate(Date lastMOTDate) {
        this.lastMOTDate = lastMOTDate;
    }

    public Date getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(Date lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }
    
    
    
    
         
}
