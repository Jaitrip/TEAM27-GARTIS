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
public class Customer {
    private String customerID;
    private String customerName;
    private String customerAddress;
    private String customerPostcode;
    private String customerEmail;
    private Date date;
    private long telephpneNumber;

    public Customer(String customerID, String customerName, String customerAddress, String customerPostcode, String customerEmail, Date date, long telephpneNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPostcode = customerPostcode;
        this.customerEmail = customerEmail;
        this.date = date;
        this.telephpneNumber = telephpneNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPostcode() {
        return customerPostcode;
    }

    public void setCustomerPostcode(String customerPostcode) {
        this.customerPostcode = customerPostcode;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getTelephpneNumber() {
        return telephpneNumber;
    }

    public void setTelephpneNumber(long telephpneNumber) {
        this.telephpneNumber = telephpneNumber;
    }
    
    
}
