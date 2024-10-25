
package views;

public class FrmMain extends javax.swing.JFrame {

    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblIcono = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        LblUserFullname = new javax.swing.JLabel();
        LblUserRole = new javax.swing.JLabel();
        BarMenu = new javax.swing.JMenuBar();
        MnuFile = new javax.swing.JMenu();
        MnuFileUsers = new javax.swing.JMenuItem();
        SepMenuFile = new javax.swing.JPopupMenu.Separator();
        MnuFileLogout = new javax.swing.JMenuItem();
        MnuTests = new javax.swing.JMenu();
        MnuTestsResponse = new javax.swing.JMenuItem();
        SepMenuTests = new javax.swing.JPopupMenu.Separator();
        MnuTestsSetting = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de evaluación");
        setPreferredSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        LblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/test.png"))); // NOI18N

        LblUserFullname.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LblUserFullname.setText("Usuario: usuario - fullname");

        LblUserRole.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LblUserRole.setText("Rol: Estudiante");

        MnuFile.setText("Archivo");

        MnuFileUsers.setText("Usuarios");
        MnuFile.add(MnuFileUsers);
        MnuFile.add(SepMenuFile);

        MnuFileLogout.setText("Salir");
        MnuFile.add(MnuFileLogout);

        BarMenu.add(MnuFile);

        MnuTests.setText("Encuestas");

        MnuTestsResponse.setText("Responder");
        MnuTests.add(MnuTestsResponse);
        MnuTests.add(SepMenuTests);

        MnuTestsSetting.setText("Configurar");
        MnuTests.add(MnuTestsSetting);

        BarMenu.add(MnuTests);

        setJMenuBar(BarMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(LblIcono)
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblUserFullname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblUserRole)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(LblIcono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUserFullname)
                    .addComponent(LblUserRole))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarMenu;
    private javax.swing.JLabel LblIcono;
    public javax.swing.JLabel LblUserFullname;
    public javax.swing.JLabel LblUserRole;
    private javax.swing.JMenu MnuFile;
    public javax.swing.JMenuItem MnuFileLogout;
    public javax.swing.JMenuItem MnuFileUsers;
    private javax.swing.JMenu MnuTests;
    public javax.swing.JMenuItem MnuTestsResponse;
    public javax.swing.JMenuItem MnuTestsSetting;
    public javax.swing.JPopupMenu.Separator SepMenuFile;
    public javax.swing.JPopupMenu.Separator SepMenuTests;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

}
