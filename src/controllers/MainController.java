
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.User;
import views.FrmMain;

public class MainController implements ActionListener{
    FrmMain frmMain = new FrmMain();

    public MainController(FrmMain main, User user) {
        this.frmMain = main;
        this.frmMain.MnuFileLogout.addActionListener(this);
        this.frmMain.MnuFileUsers.addActionListener(this);
        // Asigno datos del usuario.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmMain.MnuFileLogout) {
            System.exit(0);
        }
    }
    
}
