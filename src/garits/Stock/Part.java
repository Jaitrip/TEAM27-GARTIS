/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.Stock;

/**
 *
 * @author jaimik
 */
public class Part {
    
    private int partQuantity;
    private double partCost;

    public Part(int partQuantity, double partCost) {
        this.partQuantity = partQuantity;
        this.partCost = partCost;
    }

    public int getPartQuantity() {
        return partQuantity;
    }

    public void setPartQuantity(int partQuantity) {
        this.partQuantity = partQuantity;
    }

    public double getPartCost() {
        return partCost;
    }

    public void setPartCost(double partCost) {
        this.partCost = partCost;
    }
     
}
