
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        this.frmLogin.BtnLogin.addActionListener(this);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmLogin.BtnLogin) {
            if (validateUser()) {
                user.setUsername(frmLogin.TxtUsername.getText());
                user.setPassword(String.valueOf(frmLogin.TxtPassword.getPassword()));
                if (userDao.loginValidate(user)) {
                    FrmMain frmMain = new FrmMain();
                    MainController mainController = new MainController(frmMain, user);
                    frmMain.setVisible(true);
                    frmMain.setLocationRelativeTo(null);
                    frmLogin.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Datos de ingreso inválidos.");
                }
            }
                    
        }
        
    }
    
    public boolean validateUser() {
        if (frmLogin.TxtUsername.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Longitud del usuario no cumple las políticas.");
            frmLogin.TxtUsername.requestFocus();
            return false;
        }
        if (frmLogin.TxtPassword.getPassword().length < 5) {
            JOptionPane.showMessageDialog(null, "Longitud del password no cumple las políticas.");
            frmLogin.TxtPassword.requestFocus();
            return false;
        }
        return true;
    }
    
}
