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
import garits.InvalidError;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

public class RemoveAccount {
    
    Connection connection;
    
    public RemoveAccount() {
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException exception) {
            JFrame frame = new InvalidError();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }
    
    public boolean isConnected() {
        try {
            return !connection.isClosed();
        } catch (SQLException e) {
            JFrame frame = new InvalidError();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
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
            JFrame frame = new InvalidError();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            
            
        } finally {
            
            if (pStatement !=null) {
                pStatement.close();
            } 

        }
    }
}
