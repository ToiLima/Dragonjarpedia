package View;

public class frmMain extends javax.swing.JFrame {

    
    public frmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnMonster = new javax.swing.JButton();
        btnCharacter = new javax.swing.JButton();
        btnEquipment = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(475, 400));
        setMinimumSize(new java.awt.Dimension(475, 400));
        setName("Dragonjarpedia"); // NOI18N
        setPreferredSize(new java.awt.Dimension(475, 400));
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        lblTitle.setLabelFor(this);
        lblTitle.setText("Dragonjarpedia");
        lblTitle.setToolTipText("");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTitle.setMaximumSize(new java.awt.Dimension(375, 60));
        lblTitle.setMinimumSize(new java.awt.Dimension(375, 60));
        lblTitle.setName(""); // NOI18N
        lblTitle.setPreferredSize(new java.awt.Dimension(375, 60));
        lblTitle.setVerifyInputWhenFocusTarget(false);

        btnMonster.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        btnMonster.setText("Monstros");
        btnMonster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonsterActionPerformed(evt);
            }
        });

        btnCharacter.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        btnCharacter.setText("Personagens");
        btnCharacter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCharacterActionPerformed(evt);
            }
        });

        btnEquipment.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        btnEquipment.setText("Equipamento");
        btnEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipmentActionPerformed(evt);
            }
        });

        btnAbout.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        btnAbout.setText("Sobre");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMonster, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAbout, btnCharacter, btnEquipment, btnMonster});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMonster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCharacter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEquipment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbout)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        this.setVisible(false);
        new frmAbout().setVisible(true);
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharacterActionPerformed
        this.setVisible(false);
        new frmCharacter().setVisible(true);
    }//GEN-LAST:event_btnCharacterActionPerformed

    private void btnEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipmentActionPerformed
        this.setVisible(false);
        new frmEquipment().setVisible(true);
    }//GEN-LAST:event_btnEquipmentActionPerformed

    private void btnMonsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonsterActionPerformed
        this.setVisible(false);
        new frmMonster().setVisible(true);
    }//GEN-LAST:event_btnMonsterActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnCharacter;
    private javax.swing.JButton btnEquipment;
    private javax.swing.JButton btnMonster;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
