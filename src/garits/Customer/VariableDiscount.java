/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.Customer;

/**
 *
 * @author jaimik
 */
public class VariableDiscount extends DiscountPlan {
    private double discountRate; 
    private double serviceDiscountRate;
    private double partsDiscountRate;

    public VariableDiscount(double discountRate, double serviceDiscountRate, double partsDiscountRate) {
        this.discountRate = discountRate;
        this.serviceDiscountRate = serviceDiscountRate;
        this.partsDiscountRate = partsDiscountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getServiceDiscountRate() {
        return serviceDiscountRate;
    }

    public void setServiceDiscountRate(double serviceDiscountRate) {
        this.serviceDiscountRate = serviceDiscountRate;
    }

    public double getPartsDiscountRate() {
        return partsDiscountRate;
    }

    public void setPartsDiscountRate(double partsDiscountRate) {
        this.partsDiscountRate = partsDiscountRate;
    }
    
    
}
