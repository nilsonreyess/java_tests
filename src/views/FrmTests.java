
package views;

public class FrmTests extends javax.swing.JFrame {

    public FrmTests() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblImgTest = new javax.swing.JLabel();
        LblTitleTest = new javax.swing.JLabel();
        LblSubtitleTest = new javax.swing.JLabel();
        LblIdTest = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LblCodeTest = new javax.swing.JLabel();
        TxtCodeTest = new javax.swing.JTextField();
        LblNameTest = new javax.swing.JLabel();
        TxtNameTest = new javax.swing.JTextField();
        LblUserTest = new javax.swing.JLabel();
        LblFullnameTest = new javax.swing.JLabel();
        BtnNewTest = new javax.swing.JButton();
        BtnUpdateTest = new javax.swing.JButton();
        BtnDeleteTest = new javax.swing.JButton();
        BtnCancelTest = new javax.swing.JButton();
        BtnQuestionsTest = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblTests = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        LblUserTests = new javax.swing.JLabel();
        LblRoleTests = new javax.swing.JLabel();
        MnuBarTest = new javax.swing.JMenuBar();
        MnuCloseTest = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurar encuestas");

        LblImgTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/users_3.png"))); // NOI18N

        LblTitleTest.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTitleTest.setText("Configuración");

        LblSubtitleTest.setText("Encuestas");

        LblIdTest.setText("000");

        LblCodeTest.setText("Código");

        LblNameTest.setText("Encuesta");

        LblUserTest.setText("Profesor");

        LblFullnameTest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblFullnameTest.setText("Pepito Pérez");

        BtnNewTest.setText("Nuevo");

        BtnUpdateTest.setText("Modificar");

        BtnDeleteTest.setText("Eliminar");

        BtnCancelTest.setText("Cancelar");

        BtnQuestionsTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ajuste.png"))); // NOI18N
        BtnQuestionsTest.setToolTipText("Cargar preguntas a la encuesta");
        BtnQuestionsTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TblTests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "It", "Código", "Encuesta", "Profesor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblTests);
        if (TblTests.getColumnModel().getColumnCount() > 0) {
            TblTests.getColumnModel().getColumn(0).setResizable(false);
            TblTests.getColumnModel().getColumn(0).setPreferredWidth(0);
            TblTests.getColumnModel().getColumn(1).setResizable(false);
            TblTests.getColumnModel().getColumn(1).setPreferredWidth(20);
            TblTests.getColumnModel().getColumn(2).setResizable(false);
            TblTests.getColumnModel().getColumn(2).setPreferredWidth(80);
            TblTests.getColumnModel().getColumn(3).setResizable(false);
            TblTests.getColumnModel().getColumn(3).setPreferredWidth(200);
            TblTests.getColumnModel().getColumn(4).setResizable(false);
            TblTests.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        LblUserTests.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LblUserTests.setText("Usuario: usuario - Fullname");

        LblRoleTests.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LblRoleTests.setText("Role: Estudiante");

        MnuCloseTest.setText("Cerrar");
        MnuBarTest.add(MnuCloseTest);

        setJMenuBar(MnuBarTest);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblImgTest)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblSubtitleTest)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblTitleTest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LblIdTest)
                                        .addGap(21, 21, 21))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LblUserTest, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LblNameTest, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LblCodeTest, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LblFullnameTest)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(TxtCodeTest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TxtNameTest, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(BtnNewTest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnUpdateTest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnDeleteTest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnCancelTest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                        .addComponent(BtnQuestionsTest))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblUserTests)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblRoleTests)))
                .addContainerGap())
            .addComponent(jSeparator3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblImgTest)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblTitleTest)
                            .addComponent(LblIdTest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblSubtitleTest)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCodeTest)
                    .addComponent(TxtCodeTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNameTest)
                    .addComponent(TxtNameTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUserTest)
                    .addComponent(LblFullnameTest))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnNewTest)
                        .addComponent(BtnUpdateTest)
                        .addComponent(BtnDeleteTest)
                        .addComponent(BtnCancelTest))
                    .addComponent(BtnQuestionsTest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblRoleTests)
                    .addComponent(LblUserTests))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnCancelTest;
    public javax.swing.JButton BtnDeleteTest;
    public javax.swing.JButton BtnNewTest;
    public javax.swing.JButton BtnQuestionsTest;
    public javax.swing.JButton BtnUpdateTest;
    private javax.swing.JLabel LblCodeTest;
    public javax.swing.JLabel LblFullnameTest;
    private javax.swing.JLabel LblIdTest;
    private javax.swing.JLabel LblImgTest;
    private javax.swing.JLabel LblNameTest;
    public javax.swing.JLabel LblRoleTests;
    private javax.swing.JLabel LblSubtitleTest;
    private javax.swing.JLabel LblTitleTest;
    private javax.swing.JLabel LblUserTest;
    public javax.swing.JLabel LblUserTests;
    private javax.swing.JMenuBar MnuBarTest;
    public javax.swing.JMenu MnuCloseTest;
    private javax.swing.JTable TblTests;
    public javax.swing.JTextField TxtCodeTest;
    public javax.swing.JTextField TxtNameTest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
