
package views;

import controllers.IntroController;

public class FrmIntro extends javax.swing.JFrame {

    public FrmIntro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblTitle = new javax.swing.JLabel();
        LblImage = new javax.swing.JLabel();
        BtnIntro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de evaluación");
        setResizable(false);

        LblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTitle.setText("Bienvenido a mi aplicación");

        LblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/test.png"))); // NOI18N

        BtnIntro.setText("Ingresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(LblImage)))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(BtnIntro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LblTitle)
                .addGap(18, 18, 18)
                .addComponent(LblImage)
                .addGap(18, 18, 18)
                .addComponent(BtnIntro)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FrmIntro frmIntro = new FrmIntro();
        IntroController introController = new IntroController(frmIntro);
        frmIntro.setVisible(true);
        frmIntro.setLocationRelativeTo(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnIntro;
    private javax.swing.JLabel LblImage;
    private javax.swing.JLabel LblTitle;
    // End of variables declaration//GEN-END:variables
}
