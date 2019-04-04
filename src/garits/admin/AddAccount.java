/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.admin;

import garits.DBConnectivity.DBConnection;
import garits.InvalidError;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

public class AddAccount {
    
    Connection connection;
    
    public AddAccount() {
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    
    public boolean isConnected() {
        //Connect to the database
        try {
            return !connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public void isAddAccount(String employeeID, String role, String firstName, String lastName, String password, String username) throws SQLException {
        //Prepare query
        PreparedStatement pStatement = null;
        String sqlQuery = "INSERT INTO Employee (employeeID, role, first_name, last_name, password, username) VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            //execute query to add account
            pStatement = connection.prepareStatement(sqlQuery);
            pStatement.setString(1, employeeID);
            pStatement.setString(2, role);
            pStatement.setString(3, firstName);
            pStatement.setString(4, lastName);
            pStatement.setString(5, password);
            pStatement.setString(6, username);
            pStatement.executeUpdate();
            System.out.println("Worked");
            
            
           
        } catch (Exception exception) {
            //Show error if the query doesnt work
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
