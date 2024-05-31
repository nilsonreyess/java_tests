
package views;

public class FrmUsers extends javax.swing.JFrame {

    public FrmUsers() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblImageUsers = new javax.swing.JLabel();
        LblTitle = new javax.swing.JLabel();
        LblSubtitle = new javax.swing.JLabel();
        LblId_user = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LblDni = new javax.swing.JLabel();
        TxtDni = new javax.swing.JTextField();
        LblFullname = new javax.swing.JLabel();
        TxtFullname = new javax.swing.JTextField();
        LblUsername = new javax.swing.JLabel();
        TxtUsername = new javax.swing.JTextField();
        LblPassword = new javax.swing.JLabel();
        TxtPassword = new javax.swing.JPasswordField();
        LblRole = new javax.swing.JLabel();
        CmbRole = new javax.swing.JComboBox<>();
        BtnNew = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblUsers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuración - Usuarios");
        setResizable(false);

        LblImageUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/users_2.png"))); // NOI18N

        LblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTitle.setText("Configuración");

        LblSubtitle.setText("Usuarios");

        LblId_user.setText("000");

        LblDni.setText("Documento");

        LblFullname.setText("Nombre completo");

        LblUsername.setText("Usuario");

        LblPassword.setText("Contraseña");

        LblRole.setText("Rol");

        CmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el rol", "Estudiante", "Profesor" }));

        BtnNew.setText("Nuevo");
        BtnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnUpdate.setText("Modificar");
        BtnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnDelete.setText("Eliminar");
        BtnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnCancel.setText("Cancelar");
        BtnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "It", "Nombre completo", "Usuario", "Rol"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblUsers);
        if (TblUsers.getColumnModel().getColumnCount() > 0) {
            TblUsers.getColumnModel().getColumn(0).setResizable(false);
            TblUsers.getColumnModel().getColumn(0).setPreferredWidth(0);
            TblUsers.getColumnModel().getColumn(1).setResizable(false);
            TblUsers.getColumnModel().getColumn(1).setPreferredWidth(50);
            TblUsers.getColumnModel().getColumn(2).setResizable(false);
            TblUsers.getColumnModel().getColumn(2).setPreferredWidth(150);
            TblUsers.getColumnModel().getColumn(3).setResizable(false);
            TblUsers.getColumnModel().getColumn(3).setPreferredWidth(100);
            TblUsers.getColumnModel().getColumn(4).setResizable(false);
            TblUsers.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblImageUsers)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblSubtitle)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LblId_user)
                                .addGap(17, 17, 17))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblDni, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblFullname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblRole, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(TxtPassword)
                            .addComponent(TxtFullname)
                            .addComponent(TxtDni)
                            .addComponent(CmbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(BtnNew)
                .addGap(18, 18, 18)
                .addComponent(BtnUpdate)
                .addGap(18, 18, 18)
                .addComponent(BtnDelete)
                .addGap(18, 18, 18)
                .addComponent(BtnCancel)
                .addGap(15, 15, 15))
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblTitle)
                            .addComponent(LblId_user))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblSubtitle))
                    .addComponent(LblImageUsers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDni)
                    .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblFullname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblRole))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNew)
                    .addComponent(BtnUpdate)
                    .addComponent(BtnDelete)
                    .addComponent(BtnCancel))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnCancel;
    public javax.swing.JButton BtnDelete;
    public javax.swing.JButton BtnNew;
    public javax.swing.JButton BtnUpdate;
    public javax.swing.JComboBox<String> CmbRole;
    private javax.swing.JLabel LblDni;
    private javax.swing.JLabel LblFullname;
    public javax.swing.JLabel LblId_user;
    private javax.swing.JLabel LblImageUsers;
    private javax.swing.JLabel LblPassword;
    private javax.swing.JLabel LblRole;
    private javax.swing.JLabel LblSubtitle;
    private javax.swing.JLabel LblTitle;
    private javax.swing.JLabel LblUsername;
    public javax.swing.JTable TblUsers;
    public javax.swing.JTextField TxtDni;
    public javax.swing.JTextField TxtFullname;
    public javax.swing.JPasswordField TxtPassword;
    public javax.swing.JTextField TxtUsername;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
