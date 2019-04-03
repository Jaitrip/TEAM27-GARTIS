package garits;

import garits.Control.User;
import garits.DBConnectivity.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    
    Connection connection;
    
    public Login() {
        //Connect to the database
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    
    public boolean isConnected() {
        //Check the connection is succesfull
        try {
            return !connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean isLogin(String username, String password, String role) throws SQLException {
        //Statement to check if the user exists in the table
        PreparedStatement pStatement = null;
        ResultSet rSet = null;
        String sqlQuery = "SELECT * FROM Employee WHERE username=? and password=? and role=?";
        
        try {
            //Prepare statement for execution
            pStatement = connection.prepareStatement(sqlQuery);
            pStatement.setString(1, username);
            pStatement.setString(2, password);
            pStatement.setString(3, role);
            
            //Execute the log in query
            rSet = pStatement.executeQuery();
            System.out.println("query executed");
            
            if (rSet.next()) {
                //It was found in the table (Login Succesful)
                return true;
            } else {
                //Log in failed
                System.out.println("no result set");
                return false;
            }
            
            
        } catch (Exception exception) {
            System.out.println("Exception");
            exception.printStackTrace();
            return false;
            
        } finally {
            //Close result set and prepared statement.
            if (pStatement !=null) {
                pStatement.close();
            } 
            
            if (rSet !=null) {
                rSet.close();
            }
             
             
        }
    }
}