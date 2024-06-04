
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class UserDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection dbConnection;
    DBConnect dbConnect = new DBConnect();
    User user = new User();

    // Método para eliminar un usuario
    public boolean deleteUser(int id_user) {
        
        return true;
    }
    
    // Método para actualizar un usuario
    
    // Método para agregar un usuario
    public boolean createUser(User userAdd) {
        String sql = "INSERT INTO users (dni, fullname, username, password, role) VALUES (?, ?, ?, ?, ?)";
        
        try {
            dbConnection = dbConnect.getConnection();
            ps = dbConnection.prepareStatement(sql);
            ps.setString(1, userAdd.getDni());
            ps.setString(2, userAdd.getFullname());
            ps.setString(3, userAdd.getUsername());
            ps.setString(4, userAdd.getPassword());
            ps.setInt(5, userAdd.getRole());
            
            if (ps.executeUpdate() >= 1) {
                return true;
            } else {
                return false;
            }
            
        } catch (SQLException e) {
            return false;
        }
        
    }
    
    // Método para recuperar todos los usuarios de la App
    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        String sql = "SELECT id_user, dni, fullname, username, password, role FROM users";
        
        try {
            dbConnection = dbConnect.getConnection();
            ps = dbConnection.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                user.setId_user(rs.getInt("id_user"));
                user.setDni(rs.getString("dni"));
                user.setFullname(rs.getString("fullname"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getInt("role"));
                users.add(user);
            }
            
            return users;
            
        } catch (SQLException e) {
            return (ArrayList<User>) Collections.EMPTY_LIST;
        }
    }
    
    // Método para recuperar datos de un usuario en Main
    public User userApp(User userMain) {
        User appUser = new User();
        String sql = "SELECT id_user, dni, fullname, username, role FROM users WHERE username = ? AND password = ?";
        
        try {
            dbConnection = dbConnect.getConnection();
            ps = dbConnection.prepareStatement(sql);
            ps.setString(1, userMain.getUsername());
            ps.setString(2, userMain.getPassword());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                appUser.setId_user(rs.getInt("id_user"));
                appUser.setDni(rs.getString("dni"));
                appUser.setFullname(rs.getString("fullname"));
                appUser.setUsername(rs.getString("username"));
                appUser.setRole(rs.getInt("role"));
                return appUser;
                
            } else {
                return userMain;
            }
            
        } catch (SQLException e) {
            return userMain;
            
        }
        
    }
    
    // Método para identificar si un usuario existe en Login
    public boolean loginValidate(User userLogin) {
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
