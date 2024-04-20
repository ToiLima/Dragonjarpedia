package View;

public class frmAbout extends javax.swing.JFrame {

    public frmAbout() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSobre = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        spnlAbout = new javax.swing.JScrollPane();
        txtAbout = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(475, 400));
        setMinimumSize(new java.awt.Dimension(475, 400));
        setName("Sobre"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(475, 400));

        lblSobre.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        lblSobre.setText("Sobre");

        btnVoltar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtAbout.setEditable(false);
        txtAbout.setColumns(20);
        txtAbout.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        txtAbout.setRows(5);
        txtAbout.setText("Este programa foi feito como projeto de \nentrega do primeiro bimestre da máteria de \nLinguagem de Programação VI em Java, \nutilizando o Swing e o JDBC(postgreSQL). \n\nBaseado na série de RPG da Square-Enix, \nDragon Quest, lançado desde de 1986.\n\nTodos os conteúdos são propriedades de \nseus respectivos donos.");
        txtAbout.setBorder(null);
        txtAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spnlAbout.setViewportView(txtAbout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnlAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSobre))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSobre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnlAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new frmMain().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAbout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblSobre;
    private javax.swing.JScrollPane spnlAbout;
    private javax.swing.JTextArea txtAbout;
    // End of variables declaration//GEN-END:variables
}
