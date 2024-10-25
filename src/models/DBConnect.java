
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnect {

    public final String URLDB = "jdbc:mysql://localhost:3306/";
    public final String USERDB = "root";
    public final String PASSDB = "";
    public final String DBNAME = "tests";
    Connection dbConnection;

    public Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            dbConnection = (Connection) DriverManager.getConnection(URLDB + DBNAME, USERDB, PASSDB);

        } catch (ClassNotFoundException|SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: No es posible conectar a la base de datos.");
            System.exit(0);
        }

        return dbConnection;
    }
    
}
