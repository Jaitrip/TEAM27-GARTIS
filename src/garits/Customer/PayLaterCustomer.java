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
public class PayLaterCustomer extends Customer {
    
    private Date nextPaymentDue;
    private boolean latePaymentsDue;
    private double moneyOwed;
    
    public PayLaterCustomer(String customerID, String customerName, String customerAddress, String customerPostcode, String customerEmail, Date date, long telephpneNumber, Date nextPaymentDue, boolean latePaymentsDue, double moneyOwed) {
        super(customerID, customerName, customerAddress, customerPostcode, customerEmail, date, telephpneNumber);
    }

    public Date getNextPaymentDue() {
        return nextPaymentDue;
    }

    public void setNextPaymentDue(Date nextPaymentDue) {
        this.nextPaymentDue = nextPaymentDue;
    }

    public boolean isLatePaymentsDue() {
        return latePaymentsDue;
    }

    public void setLatePaymentsDue(boolean latePaymentsDue) {
        this.latePaymentsDue = latePaymentsDue;
    }

    public double getMoneyOwed() {
        return moneyOwed;
    }

    public void setMoneyOwed(double moneyOwed) {
        this.moneyOwed = moneyOwed;
    }
    
    
    
}
