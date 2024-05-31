
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.User;
import models.UserDAO;
import views.FrmUsers;

public class UsersController implements ActionListener {
    FrmUsers frmUsers = new FrmUsers();
    User user = new User();
    UserDAO userDao = new UserDAO();

    public UsersController(FrmUsers users, User user) {
        this.frmUsers = users;
        this.frmUsers.TxtDni.addActionListener(this);
        this.frmUsers.TxtFullname.addActionListener(this);
        this.frmUsers.TxtUsername.addActionListener(this);
        this.frmUsers.TxtPassword.addActionListener(this);
        this.frmUsers.CmbRole.addActionListener(this);
        this.frmUsers.BtnNew.addActionListener(this);
        this.frmUsers.BtnUpdate.addActionListener(this);
        this.frmUsers.BtnDelete.addActionListener(this);
        this.frmUsers.BtnCancel.addActionListener(this);
        this.frmUsers.TblUsers.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Hola desde la tabla.");
            }
        });
        getDataTable();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void getDataTable() {
        ArrayList<User> users = userDao.getUsers();
        DefaultTableModel mdlTable = new DefaultTableModel();
        
        mdlTable.addColumn("Id");
        mdlTable.addColumn("It");
        mdlTable.addColumn("Nombre completo");
        mdlTable.addColumn("Usuario");
        mdlTable.addColumn("Rol");
        this.frmUsers.TblUsers.setModel(mdlTable);
        
        int it = 1;
        for (User item : users) {
            Object[] itemTabla = new Object[5];
            itemTabla[0] = item.getId_user();
            itemTabla[1] = it;
            itemTabla[2] = item.getFullname();
            itemTabla[3] = item.getUsername();
            itemTabla[4] = item.getRole() == 1 ? "Profesor" : "Estudiante";
            mdlTable.addRow(itemTabla);
            it++;
        }
        this.frmUsers.TblUsers.setModel(mdlTable);
        
        this.frmUsers.TblUsers.getColumnModel().getColumn(0).setMaxWidth(0);
        this.frmUsers.TblUsers.getColumnModel().getColumn(0).setMinWidth(0);
        this.frmUsers.TblUsers.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        this.frmUsers.TblUsers.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        
        this.frmUsers.TblUsers.getColumnModel().getColumn(1).setPreferredWidth(20);
        this.frmUsers.TblUsers.getColumnModel().getColumn(2).setPreferredWidth(150);
        this.frmUsers.TblUsers.getColumnModel().getColumn(3).setPreferredWidth(100);
        this.frmUsers.TblUsers.getColumnModel().getColumn(4).setPreferredWidth(100);
        
    }
    
}
