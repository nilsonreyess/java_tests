
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.User;
import models.UserDAO;
import views.FrmIntro;
import views.FrmMain;
import views.FrmTests;
import views.FrmUsers;

public class MainController implements ActionListener{
    FrmMain frmMain = new FrmMain();
    User user = new User();
    UserDAO userDao = new UserDAO();

    public MainController(FrmMain main, User user) {
        this.frmMain = main;
        this.frmMain.MnuFileUsers.addActionListener(this);
        this.frmMain.MnuFileLogout.addActionListener(this);
        this.frmMain.MnuTestsSetting.addActionListener(this);
        this.user = userDao.userApp(user);
        if (this.user == null) {
            System.exit(0);
        }
        userMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmMain.MnuFileUsers) {
            FrmUsers frmUsers = new FrmUsers();
            UsersController userController = new UsersController(frmUsers, user);
            frmUsers.setVisible(true);
            frmUsers.setLocationRelativeTo(null);
        }
        
        if (e.getSource() == frmMain.MnuFileLogout) {
            FrmIntro frmIntro = new FrmIntro();
            IntroController introController = new IntroController(frmIntro);
            frmIntro.setVisible(true);
            frmIntro.setLocationRelativeTo(null);
            frmMain.dispose();
        }
        
        if (e.getSource() == frmMain.MnuTestsSetting) {
            FrmTests frmTests = new FrmTests();
            TestsController testsController = new TestsController(frmTests, user);
            frmTests.setVisible(true);
            frmTests.setLocationRelativeTo(frmMain);
            
        }
        
    }
    
    private void userMenu() {
        if (this.user.getRole() == 1) {
            this.frmMain.MnuTestsResponse.setVisible(false);
            this.frmMain.SepMenuTests.setVisible(false);
        } else {
            this.frmMain.SepMenuFile.setVisible(false);
            this.frmMain.MnuFileUsers.setVisible(false);
            this.frmMain.SepMenuTests.setVisible(false);
            this.frmMain.MnuTestsSetting.setVisible(false);
        }
        
        this.frmMain.LblUserFullname.setText("Usuario: " + this.user.getUsername() + " - " + this.user.getFullname());
        String role = this.user.getRole() == 1 ? "Profesor" : "Estudiante";
        this.frmMain.LblUserRole.setText("Rol: " + role);
    }
    
}
