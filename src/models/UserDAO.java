
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UserDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection dbConnection;
    DBConnect dbConnect = new DBConnect();
    User user = new User();
    
    // Método para el Login
    public boolean loginValidate(User userLogin) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        
        try {
            dbConnection = dbConnect.getConnection();
            
            ps = dbConnection.prepareStatement(sql);
            ps.setString(1, userLogin.getUsername());
            ps.setString(2, userLogin.getPassword());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
            
        } catch (SQLException e) {
            return false;
        }
        
    }
    
}
