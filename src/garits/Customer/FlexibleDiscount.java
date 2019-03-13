/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author jaimik
 */

package garits.Customer;

public class FlexibleDiscount extends DiscountPlan {
    
    private double discountRate;
    private double credit;

    public FlexibleDiscount(double discountRate, double credit) {
        this.discountRate = discountRate;
        this.credit = credit;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
    
    
    
}
