/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.Job;

import garits.Control.Mechanic;
import garits.Stock.Part;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jaimik
 */
public class Job {
    
    private int jobNumber;
    private double estimatedHours;
    private double actualHours;
    private Date dateBookedIn;
    private double cost;
    private String vehicleRegistration;
    private String jobType;
    private List<Task> listOfTasks;
    private Mechanic mechanic;
    private List<Part> partsUsed;

    public Job(int jobNumber, double estimatedHours, double actualHours, Date dateBookedIn, double cost, String vehicleRegistration, String jobType, List<Task> listOfTasks, Mechanic mechanic, List<Part> partsUsed) {
        this.jobNumber = jobNumber;
        this.estimatedHours = estimatedHours;
        this.actualHours = actualHours;
        this.dateBookedIn = dateBookedIn;
        this.cost = cost;
        this.vehicleRegistration = vehicleRegistration;
        this.jobType = jobType;
        this.listOfTasks = listOfTasks;
        this.mechanic = mechanic;
        this.partsUsed = partsUsed;
    }
    

    public int getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(int jobNumber) {
        this.jobNumber = jobNumber;
    }

    public double getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(double estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public double getActualHours() {
        return actualHours;
    }

    public void setActualHours(double actualHours) {
        this.actualHours = actualHours;
    }

    public Date getDateBookedIn() {
        return dateBookedIn;
    }

    public void setDateBookedIn(Date dateBookedIn) {
        this.dateBookedIn = dateBookedIn;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public List<Task> getListOfTasks() {
        return listOfTasks;
    }

    public void setListOfTasks(List<Task> listOfTasks) {
        this.listOfTasks = listOfTasks;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public List<Part> getPartsUsed() {
        return partsUsed;
    }

    public void setPartsUsed(List<Part> partsUsed) {
        this.partsUsed = partsUsed;
    }
    
    
    
    
}
