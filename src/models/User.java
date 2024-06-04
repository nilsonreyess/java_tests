
package models;

public class User {
    
    private int id_user;
    private String dni;
    private String fullname;
    private String username;
    private String password;
    private int role;

    public User() {
    }

    public User(int id_user, String dni, String fullname, String username, int role) {
        this.id_user = id_user;
        this.dni = dni;
        this.fullname = fullname;
        this.username = username;
        this.role = role;
    }

    public User(String dni, String fullname, String username, String password, int role) {
        this.dni = dni;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User(int id_user, String dni, String fullname, String username, String password, int role) {
        this.id_user = id_user;
        this.dni = dni;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
}
