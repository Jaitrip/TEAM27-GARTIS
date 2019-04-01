/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.Job;

/**
 *
 * @author jaimik
 */
public class Invoice {
    
    private String invoiceNumber;
    private String jobNumber;
    private String dateOfInvoice;
    private String datePaymentDue;
    private String grandTotal;
    private String labourCost;
    private String partCost;
    private String status;
    private String totalTimeTaken;

    public Invoice(String invoiceNumber, String jobNumber, String dateOfInvoice, String datePaymentDue, String grandTotal, String labourCost, String partCost, String status, String totalTimeTaken) {
        this.invoiceNumber = invoiceNumber;
        this.jobNumber = jobNumber;
        this.dateOfInvoice = dateOfInvoice;
        this.datePaymentDue = datePaymentDue;
        this.grandTotal = grandTotal;
        this.labourCost = labourCost;
        this.partCost = partCost;
        this.status = status;
        this.totalTimeTaken = totalTimeTaken;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getDateOfInvoice() {
        return dateOfInvoice;
    }

    public void setDateOfInvoice(String dateOfInvoice) {
        this.dateOfInvoice = dateOfInvoice;
    }

    public String getDatePaymentDue() {
        return datePaymentDue;
    }

    public void setDatePaymentDue(String datePaymentDue) {
        this.datePaymentDue = datePaymentDue;
    }

    public String getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getLabourCost() {
        return labourCost;
    }

    public void setLabourCost(String labourCost) {
        this.labourCost = labourCost;
    }

    public String getPartCost() {
        return partCost;
    }

    public void setPartCost(String partCost) {
        this.partCost = partCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalTimeTaken() {
        return totalTimeTaken;
    }

    public void setTotalTimeTaken(String totalTimeTaken) {
        this.totalTimeTaken = totalTimeTaken;
    }
    
    
    
    
    
}