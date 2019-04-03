package garits.DBConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import garits.InvalidError;
import garits.foreperson.JobsPage;
import javax.swing.JFrame;

public class DBConnection  {

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:src/database/GARTISDatabase.sqlite");
        } catch (ClassNotFoundException ex) {
            JFrame frame = new InvalidError();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
        return null;
    }
}


 