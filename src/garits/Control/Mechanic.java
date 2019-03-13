/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.Control;

/**
 *
 * @author jaimik
 */
public class Mechanic extends User {
    private double labourRate;

    public Mechanic(String employeeID, String employeeName, String username, String password, String role, double labourRate) {
        super(employeeID, employeeName, username, password, role);
        this.labourRate = labourRate;
    }

    public double getLabourRate() {
        return labourRate;
    }

    public void setLabourRate(double labourRate) {
        this.labourRate = labourRate;
    }
    
    
    
    
}
