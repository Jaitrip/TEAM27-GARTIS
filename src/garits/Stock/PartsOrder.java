/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package garits.Stock;
import java.util.List;

/**
 *
 * @author jaimik
 */
public class PartsOrder {
    private List<Part> parts;

    public PartsOrder(List<Part> parts) {
        this.parts = parts;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }
    
    
}
