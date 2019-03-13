package garits.DBConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import static com.sun.corba.se.impl.util.Utility.printStackTrace;

public class DBConnection  {

    

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:/Users/jaimik/Downloads/GARITS-3/GARTISDatabase.sqlite");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}


