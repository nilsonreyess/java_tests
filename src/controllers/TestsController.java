
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import models.User;
import views.FrmTests;

public class TestsController implements ActionListener {
    FrmTests frmTests = new FrmTests();
    User userNow;
    
    public TestsController(FrmTests test, User user) {
        this.frmTests = test;
        this.userNow = user;
        this.frmTests.BtnNewTest.addActionListener(this);
        this.frmTests.BtnUpdateTest.addActionListener(this);
        this.frmTests.BtnDeleteTest.addActionListener(this);
        this.frmTests.BtnCancelTest.addActionListener(this);
        this.frmTests.BtnQuestionsTest.addActionListener(this);
        this.frmTests.MnuCloseTest.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                frmTests.dispose();
            }
        });
        startButtons();
        userActual();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    private void userActual() {
        this.frmTests.LblUserTests.setText("Usuario: " + this.userNow.getUsername() + " - " + this.userNow.getFullname());
        String role = this.userNow.getRole() == 1 ? "Profesor" : "Estudiante";
        this.frmTests.LblRoleTests.setText("Rol: " + role);
    }
    
    private void startButtons() {
        frmTests.TxtCodeTest.setText("");
        frmTests.TxtCodeTest.setEnabled(false);
        frmTests.TxtNameTest.setText("");
        frmTests.TxtNameTest.setEnabled(false);
        frmTests.BtnNewTest.setText("Nuevo");
        frmTests.BtnNewTest.setEnabled(true);
        frmTests.BtnUpdateTest.setText("Modificar");
        frmTests.BtnUpdateTest.setEnabled(false);
        frmTests.BtnDeleteTest.setText("Eliminar");
        frmTests.BtnDeleteTest.setEnabled(false);
        frmTests.BtnCancelTest.setText("Cancelar");
        frmTests.BtnCancelTest.setEnabled(false);
        frmTests.BtnQuestionsTest.setEnabled(false);
    }
        
}
