/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.admin;

/**
 *
 * @author jaimik
 */
import garits.DBConnectivity.DBConnection;

import garits.DBConnectivity.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RemoveAccount {
    
    Connection connection;
    
    public RemoveAccount() {
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
    
    public void removeAccount(String employeeID) throws SQLException {
        PreparedStatement pStatement = null;
        String sqlQuery = "DELETE FROM Employee WHERE employeeID=?";
        
        try {
            
            pStatement = connection.prepareStatement(sqlQuery);
            pStatement.setString(1, employeeID);
            pStatement.executeUpdate();
            System.out.println("Worked");
            
            
           
        } catch (Exception exception) {
            System.out.println("Exception");
            exception.printStackTrace();
            
            
        } finally {
            
            if (pStatement !=null) {
                pStatement.close();
            } 

        }
    }
}
