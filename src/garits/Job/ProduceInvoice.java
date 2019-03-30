/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.Job;

import garits.DBConnectivity.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jaimik
 */
public class ProduceInvoice {
    
    Connection connection;
    String jobNumber;
    
    public ProduceInvoice() {
        this.jobNumber = jobNumber;
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    
    public boolean isConnected() {
        try {
            return !connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public void produceInvoice(String jNumber) throws SQLException {
        
        String partQuery = "SELECT Description, qty FROM PartsUsed WHERE JobSheetjobNumber = ?";
        String partCost = "SELECT price FROM StockLedger WHERE partName = ?";
        String taskTime = "SELECT actualTime FROM JobTask WHERE JobSheetjobNumber = ?";
        
        
        try {
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
