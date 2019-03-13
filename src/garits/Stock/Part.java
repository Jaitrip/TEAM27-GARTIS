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
    
    private String partName;
    private String partCode;
    private String partManufacturer;
    private String vehicleType;
    private double price;
    private int stockLevel;
    private int initialStock;
    private int threshold;
    private int amountUsed;

    public Part(String partName, String partCode, String partManufacturer, String vehicleType, double price, int stockLevel, int initialStock, int threshold, int amountUsed) {
        this.partName = partName;
        this.partCode = partCode;
        this.partManufacturer = partManufacturer;
        this.vehicleType = vehicleType;
        this.price = price;
        this.stockLevel = stockLevel;
        this.initialStock = initialStock;
        this.threshold = threshold;
        this.amountUsed = amountUsed;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartCode() {
        return partCode;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode;
    }

    public String getPartManufacturer() {
        return partManufacturer;
    }

    public void setPartManufacturer(String partManufacturer) {
        this.partManufacturer = partManufacturer;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public int getInitialStock() {
        return initialStock;
    }

    public void setInitialStock(int initialStock) {
        this.initialStock = initialStock;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public int getAmountUsed() {
        return amountUsed;
    }

    public void setAmountUsed(int amountUsed) {
        this.amountUsed = amountUsed;
    }
    
    
    
    
}
