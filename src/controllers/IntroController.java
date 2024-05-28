
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.FrmIntro;
import views.FrmLogin;

public class IntroController implements ActionListener {
    FrmIntro frmIntro = new FrmIntro();

    public IntroController(FrmIntro intro) {
        this.frmIntro = intro;
        this.frmIntro.BtnIntro.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmIntro.BtnIntro) {
            FrmLogin frmLogin = new FrmLogin();
            LoginController loginController = new LoginController(frmLogin);
            frmLogin.setVisible(true);
            frmLogin.setLocationRelativeTo(null);
            frmIntro.dispose();
        }
    }
    
}
