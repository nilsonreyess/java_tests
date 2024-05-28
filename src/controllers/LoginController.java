
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.User;
import models.UserDAO;
import views.FrmLogin;
import views.FrmMain;

public class LoginController implements ActionListener{
    FrmLogin frmLogin = new FrmLogin();
    User user = new User();
    UserDAO userDao = new UserDAO();
    
    public LoginController(FrmLogin login) {
        this.frmLogin = login;
        this.frmLogin.TxtUsername.addActionListener(this);
        this.frmLogin.TxtPassword.addActionListener(this);
        this.frmLogin.BtnLogin.addActionListener(this);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmLogin.BtnLogin) {
            try {
                String username = frmLogin.TxtUsername.getText();
                String password = String.valueOf(frmLogin.TxtPassword.getPassword());
                user.setUsername(username);
                user.setPassword(password);
                
                if (userDao.loginValidate(user)) {
                    FrmMain frmMain = new FrmMain();
                    MainController mainController = new MainController(frmMain, user);
                    frmMain.setVisible(true);
                    frmMain.setLocationRelativeTo(null);
                    frmLogin.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Datos de ingreso inválidos.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: Ocurrio un error con la base de datos.");
            }

                    
        }
        
    }
    
}
