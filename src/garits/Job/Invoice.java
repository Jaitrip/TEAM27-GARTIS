/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.Job;


import garits.Stock.Part;
import java.util.List;

/**
 *
 * @author jaimik
 */
public class Invoice {
    
    private int invoiceNumber;
    private String customerName;
    private String vehicleRegistration;
    private String jobDescription;
    private double labourCost;
    private double totalCost;
    private List<Part> partsUsed;

    public Invoice(int invoiceNumber, String customerName, String vehicleRegistration, String jobDescription, double labourCost, double totalCost, List<Part> partsUsed) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.vehicleRegistration = vehicleRegistration;
        this.jobDescription = jobDescription;
        this.labourCost = labourCost;
        this.totalCost = totalCost;
        this.partsUsed = partsUsed;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public double getLabourCost() {
        return labourCost;
    }

    public void setLabourCost(double labourCost) {
        this.labourCost = labourCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public List<Part> getPartsUsed() {
        return partsUsed;
    }

    public void setPartsUsed(List<Part> partsUsed) {
        this.partsUsed = partsUsed;
    }
    
    
    
    
    
}
