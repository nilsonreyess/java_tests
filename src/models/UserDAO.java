
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
    DBConnect dbConnect = new DBConnect();
    Connection dbConnection = dbConnect.getConnection();

    // Método para eliminar un usuario
    public boolean deleteUser(int id_user) {
        String sql = "DELETE FROM users WHERE id_user = ?";
        
        try {
            ps = dbConnection.prepareStatement(sql);
            ps.setInt(1, id_user);
            
            return ps.executeUpdate() >= 1;

        } catch (SQLException e) {
            return false;
        }
        
    }
    
    // Método para actualizar un usuario
    public boolean updateUser(User userUpdate) {
        String sql = "UPDATE users SET dni = ?, fullname = ?, username = ?, password = ?, role = ? WHERE id_user = ?";
        
        try {
            ps = dbConnection.prepareStatement(sql);
            ps.setString(1, userUpdate.getDni());
            ps.setString(2, userUpdate.getFullname());
            ps.setString(3, userUpdate.getUsername());
            ps.setString(4, userUpdate.getPassword());
            ps.setInt(5, userUpdate.getRole());
            ps.setInt(6, userUpdate.getId_user());
            
            return ps.executeUpdate() >= 1;

        } catch (SQLException e) {
            return false;
        }
        
    }
    
    // Método para agregar un usuario
    public boolean createUser(User userAdd) {
        String sql = "INSERT INTO users (dni, fullname, username, password, role) VALUES (?, ?, ?, ?, ?)";
        
        try {
            ps = dbConnection.prepareStatement(sql);
            ps.setString(1, userAdd.getDni());
            ps.setString(2, userAdd.getFullname());
            ps.setString(3, userAdd.getUsername());
            ps.setString(4, userAdd.getPassword());
            ps.setInt(5, userAdd.getRole());
            
            return ps.executeUpdate() >= 1;

        } catch (SQLException e) {
            return false;
        }
        
    }
    
    // Método para recuperar todos los usuarios de la App
    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        String sql = "SELECT id_user, dni, fullname, username, password, role FROM users";
        
        try {
            ps = dbConnection.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                User userDao = new User(
                    rs.getInt("id_user"),
                    rs.getString("dni"),
                    rs.getString("fullname"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getInt("role")
                );
                users.add(userDao);
            }
            
            return users;
            
        } catch (SQLException e) {
            return (ArrayList<User>) Collections.EMPTY_LIST;
        }
    }
    
    // Método para recuperar datos de un usuario en Main
    public User userApp(User userMain) {
        String sql = "SELECT id_user, dni, fullname, username, role FROM users WHERE username = ? AND password = ?";
        
        try {
            ps = dbConnection.prepareStatement(sql);
            ps.setString(1, userMain.getUsername());
            ps.setString(2, userMain.getPassword());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                User appUser = new User(
                    rs.getInt("id_user"),
                    rs.getString("dni"),
                    rs.getString("fullname"),
                    rs.getString("username"),
                    rs.getInt("role")
                );
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
            ps = dbConnection.prepareStatement(sql);
            ps.setString(1, userLogin.getUsername());
            ps.setString(2, userLogin.getPassword());
            rs = ps.executeQuery();
            
            return rs.next();

        } catch (SQLException e) {
            return false;
            
        }
        
    }
    
}
