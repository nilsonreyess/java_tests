
package views;

public class FrmMain extends javax.swing.JFrame {

    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblIcono = new javax.swing.JLabel();
        LblUserFullname = new javax.swing.JLabel();
        BarMenu = new javax.swing.JMenuBar();
        MnuFile = new javax.swing.JMenu();
        MnuFileUsers = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MnuFileLogout = new javax.swing.JMenuItem();
        MnuTest = new javax.swing.JMenu();
        MnuTestResponse = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MnuTestSetting = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de evaluación");
        setResizable(false);

        LblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/test.png"))); // NOI18N

        LblUserFullname.setText("Estudiante: Docente....");

        MnuFile.setText("Archivo");

        MnuFileUsers.setText("Usuarios");
        MnuFile.add(MnuFileUsers);
        MnuFile.add(jSeparator2);

        MnuFileLogout.setText("Salir");
        MnuFile.add(MnuFileLogout);

        BarMenu.add(MnuFile);

        MnuTest.setText("Encuestas");

        MnuTestResponse.setText("Responder");
        MnuTest.add(MnuTestResponse);
        MnuTest.add(jSeparator1);

        MnuTestSetting.setText("Configurar");
        MnuTest.add(MnuTestSetting);

        BarMenu.add(MnuTest);

        setJMenuBar(BarMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(LblIcono))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblUserFullname)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(LblIcono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblUserFullname)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarMenu;
    private javax.swing.JLabel LblIcono;
    private javax.swing.JLabel LblUserFullname;
    private javax.swing.JMenu MnuFile;
    public javax.swing.JMenuItem MnuFileLogout;
    public javax.swing.JMenuItem MnuFileUsers;
    private javax.swing.JMenu MnuTest;
    private javax.swing.JMenuItem MnuTestResponse;
    private javax.swing.JMenuItem MnuTestSetting;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
