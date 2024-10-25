
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.User;
import models.UserDAO;
import views.FrmUsers;

public class UsersController implements ActionListener {
    FrmUsers frmUsers = new FrmUsers();
    User user, userNow = new User();
    UserDAO userDao = new UserDAO();

    public UsersController(FrmUsers users, User user) {
        this.frmUsers = users;
        this.userNow = user;
        this.frmUsers.BtnNew.addActionListener(this);
        this.frmUsers.BtnUpdate.addActionListener(this);
        this.frmUsers.BtnDelete.addActionListener(this);
        this.frmUsers.BtnCancel.addActionListener(this);
        this.frmUsers.MnuCloseUsers.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                frmUsers.dispose();
            }
        });
        this.frmUsers.TblUsers.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                readDataTable(e);
            }
        });
        getDataCombo();
        startButtons();
        getDataTable();
        userActual();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmUsers.BtnNew) {
            if (frmUsers.BtnNew.getText().equals("Nuevo")) {
                frmUsers.TxtDni.setEnabled(true);
                frmUsers.TxtFullname.setEnabled(true);
                frmUsers.TxtUsername.setEnabled(true);
                frmUsers.TxtPassword.setEnabled(true);
                frmUsers.CmbRole.setEnabled(true);
                frmUsers.BtnNew.setText("Guardar");
                frmUsers.BtnCancel.setEnabled(true);
                frmUsers.TxtDni.requestFocus();
            } else {
                // Validar los campos ingresados
                user = new User(
                        frmUsers.TxtDni.getText(),
                        frmUsers.TxtFullname.getText(),
                        frmUsers.TxtUsername.getText(),
                        String.valueOf(frmUsers.TxtPassword.getPassword()),
                        frmUsers.CmbRole.getSelectedIndex()
                );
                
                if (userDao.createUser(user)) {
                    JOptionPane.showMessageDialog(frmUsers, "Usuario creado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(frmUsers, "El usuario no pudo ser creado.");
                }
                
                startButtons();
                getDataTable();
            }
        }
        
        if (e.getSource() == frmUsers.BtnUpdate) {
            if (frmUsers.BtnUpdate.getText().equals("Modificar")) {
                frmUsers.TxtDni.setEnabled(true);
                frmUsers.TxtFullname.setEnabled(true);
                frmUsers.TxtUsername.setEnabled(true);
                frmUsers.TxtPassword.setEnabled(true);
                frmUsers.CmbRole.setEnabled(true);
                frmUsers.BtnUpdate.setText("Actualizar");
                frmUsers.TxtDni.requestFocus();
            } else {
                user = new User(
                        Integer.parseInt(frmUsers.LblId_user.getText()),
                        frmUsers.TxtDni.getText(),
                        frmUsers.TxtFullname.getText(),
                        frmUsers.TxtUsername.getText(),
                        String.valueOf(frmUsers.TxtPassword.getPassword()),
                        frmUsers.CmbRole.getSelectedIndex()
                );
                
                if (userDao.updateUser(user)) {
                    JOptionPane.showMessageDialog(frmUsers, "Usuario actualizado correctamente");
                } else {
                    JOptionPane.showMessageDialog(frmUsers, "El usuario NO pudo ser actualizado");
                }
                
                startButtons();
                getDataTable();
            }
        }
        
        if (e.getSource() == frmUsers.BtnDelete) {
            if (userDao.deleteUser(Integer.parseInt(frmUsers.LblId_user.getText()))) {
                JOptionPane.showMessageDialog(frmUsers, "Usuario borrado satisfactoriamente.");
            } else {
                JOptionPane.showMessageDialog(frmUsers, "El usuario NO pudo ser borrado.");
            }
            startButtons();
            getDataTable();
        }
        
        if (e.getSource() == frmUsers.BtnCancel) {
            startButtons();
        }
    }
    
    private void userActual() {
        this.frmUsers.LblUsersUser.setText("Usuario: " + this.userNow.getUsername() + " - " + this.userNow.getFullname());
        String role = this.userNow.getRole() == 1 ? "Profesor" : "Estudiante";
        this.frmUsers.LblUsersRole.setText("Rol: " + role);
    }

    private void getDataCombo() {
        DefaultComboBoxModel mdlCmbRoles = new DefaultComboBoxModel();
        mdlCmbRoles.addElement("Seleccione el rol");
        mdlCmbRoles.addElement("Profesor");
        mdlCmbRoles.addElement("Estudiante");
        frmUsers.CmbRole.setModel(mdlCmbRoles);
    }
    
    private void getDataTable() {
        ArrayList<User> users = userDao.getUsers();
        DefaultTableModel mdlTable = new DefaultTableModel();
        
        mdlTable.addColumn("Id");
        mdlTable.addColumn("Dni");
        mdlTable.addColumn("Password");
        mdlTable.addColumn("It");
        mdlTable.addColumn("Nombre completo");
        mdlTable.addColumn("Usuario");
        mdlTable.addColumn("Rol");
        this.frmUsers.TblUsers.setModel(mdlTable);
        
        int it = 1;
        for (User item : users) {
            Object[] itemTabla = new Object[7];
            itemTabla[0] = item.getId_user();
            itemTabla[1] = item.getDni();
            itemTabla[2] = item.getPassword();
            itemTabla[3] = it;
            itemTabla[4] = item.getFullname();
            itemTabla[5] = item.getUsername();
            itemTabla[6] = item.getRole() == 1 ? "Profesor" : "Estudiante";
            mdlTable.addRow(itemTabla);
            it++;
        }
        this.frmUsers.TblUsers.setModel(mdlTable);
        
        this.frmUsers.TblUsers.getColumnModel().getColumn(0).setMaxWidth(0);
        this.frmUsers.TblUsers.getColumnModel().getColumn(0).setMinWidth(0);
        this.frmUsers.TblUsers.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        this.frmUsers.TblUsers.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        this.frmUsers.TblUsers.getColumnModel().getColumn(1).setMaxWidth(0);
        this.frmUsers.TblUsers.getColumnModel().getColumn(1).setMinWidth(0);
        this.frmUsers.TblUsers.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        this.frmUsers.TblUsers.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);
        this.frmUsers.TblUsers.getColumnModel().getColumn(2).setMaxWidth(0);
        this.frmUsers.TblUsers.getColumnModel().getColumn(2).setMinWidth(0);
        this.frmUsers.TblUsers.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        this.frmUsers.TblUsers.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
        
        this.frmUsers.TblUsers.getColumnModel().getColumn(3).setPreferredWidth(20);
        this.frmUsers.TblUsers.getColumnModel().getColumn(4).setPreferredWidth(150);
        this.frmUsers.TblUsers.getColumnModel().getColumn(5).setPreferredWidth(100);
        this.frmUsers.TblUsers.getColumnModel().getColumn(6).setPreferredWidth(100);
    }
    
    private void startButtons() {
        frmUsers.TxtDni.setText("");
        frmUsers.TxtDni.setEnabled(false);
        frmUsers.TxtFullname.setText("");
        frmUsers.TxtFullname.setEnabled(false);
        frmUsers.TxtUsername.setText("");
        frmUsers.TxtUsername.setEnabled(false);
        frmUsers.TxtPassword.setText("");
        frmUsers.TxtPassword.setEnabled(false);
        frmUsers.CmbRole.setSelectedIndex(0);
        frmUsers.CmbRole.setEnabled(false);
        frmUsers.BtnNew.setText("Nuevo");
        frmUsers.BtnNew.setEnabled(true);
        frmUsers.BtnUpdate.setText("Modificar");
        frmUsers.BtnUpdate.setEnabled(false);
        frmUsers.BtnDelete.setText("Eliminar");
        frmUsers.BtnDelete.setEnabled(false);
        frmUsers.BtnCancel.setText("Cancelar");
        frmUsers.BtnCancel.setEnabled(false);
        frmUsers.LblId_user.setText("0");
        frmUsers.TblUsers.clearSelection();
        frmUsers.BtnNew.requestFocus();
    }
    
    private void readDataTable(MouseEvent e) {
        int row = frmUsers.TblUsers.rowAtPoint(e.getPoint());
        
        frmUsers.LblId_user.setText(String.valueOf(frmUsers.TblUsers.getValueAt(row, 0)));
        frmUsers.TxtDni.setText(String.valueOf(frmUsers.TblUsers.getValueAt(row, 1)));
        frmUsers.TxtPassword.setText(String.valueOf(frmUsers.TblUsers.getValueAt(row, 2)));
        frmUsers.TxtFullname.setText(String.valueOf(frmUsers.TblUsers.getValueAt(row, 4)));
        frmUsers.TxtUsername.setText(String.valueOf(frmUsers.TblUsers.getValueAt(row, 5)));
        frmUsers.CmbRole.setSelectedItem(frmUsers.TblUsers.getValueAt(row, 6));
        
        frmUsers.BtnNew.setEnabled(false);
        frmUsers.BtnUpdate.setEnabled(true);
        frmUsers.BtnDelete.setEnabled(true);
        frmUsers.BtnCancel.setEnabled(true);
    }
}
