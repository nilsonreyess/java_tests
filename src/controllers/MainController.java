
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.User;
import models.UserDAO;
import views.FrmIntro;
import views.FrmMain;
import views.FrmUsers;

public class MainController implements ActionListener{
    FrmMain frmMain = new FrmMain();
    User user = new User();
    UserDAO userDao = new UserDAO();

    public MainController(FrmMain main, User user) {
        this.frmMain = main;
        this.frmMain.MnuFileLogout.addActionListener(this);
        this.frmMain.MnuFileUsers.addActionListener(this);
        // Asigno datos del usuario.
        this.user = userDao.userApp(user);
        this.frmMain.LblUserFullname.setText("Usuario: " + this.user.getFullname());
        String role = this.user.getRole() == 1 ? "Profesor" : "Estudiante";
        this.frmMain.LblUserRole.setText("Rol: " + role);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmMain.MnuFileLogout) {
            FrmIntro frmIntro = new FrmIntro();
            IntroController introController = new IntroController(frmIntro);
            frmIntro.setVisible(true);
            frmIntro.setLocationRelativeTo(null);
            frmMain.dispose();
        }
        
        if (e.getSource() == frmMain.MnuFileUsers) {
            FrmUsers frmUsers = new FrmUsers();
            UsersController userController = new UsersController(frmUsers, user);
            frmUsers.setVisible(true);
            frmUsers.setLocationRelativeTo(null);
        }
    }
    
    
    
}
