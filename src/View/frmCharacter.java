package View;

import Controller.CharacterController;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class frmCharacter extends javax.swing.JFrame {

    public frmCharacter() {
        initComponents();
        this.refreshTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCharacter = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblRace = new javax.swing.JLabel();
        txtRace = new javax.swing.JTextField();
        lblClass = new javax.swing.JLabel();
        txtClass = new javax.swing.JTextField();
        lblPersonagem = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnClean = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearchName = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        setResizable(false);

        tblCharacter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição", "Genêro", "Idade", "Raça", "Classe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCharacter.setPreferredSize(new java.awt.Dimension(345, 600));
        tblCharacter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCharacterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCharacter);
        if (tblCharacter.getColumnModel().getColumnCount() > 0) {
            tblCharacter.getColumnModel().getColumn(0).setResizable(false);
            tblCharacter.getColumnModel().getColumn(1).setResizable(false);
            tblCharacter.getColumnModel().getColumn(2).setResizable(false);
            tblCharacter.getColumnModel().getColumn(3).setResizable(false);
            tblCharacter.getColumnModel().getColumn(4).setResizable(false);
            tblCharacter.getColumnModel().getColumn(5).setResizable(false);
            tblCharacter.getColumnModel().getColumn(6).setResizable(false);
        }

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        txtId.setToolTipText("");
        txtId.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblId.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblId.setText("ID");

        lblName.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblName.setText("Nome");

        txtName.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N

        lblDescription.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblDescription.setText("Descrição");

        txtDescription.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N

        lblGender.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblGender.setText("Genêro");

        txtGender.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N

        lblAge.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblAge.setText("Idade");

        txtAge.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N

        lblRace.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblRace.setText("Raça");

        txtRace.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N

        lblClass.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblClass.setText("Classe");

        txtClass.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N

        lblPersonagem.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        lblPersonagem.setText("Personagem");

        btnClean.setBackground(new java.awt.Color(255, 255, 102));
        btnClean.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnClean.setText("LIMPAR");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(255, 0, 51));
        btnRemove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnRemove.setText("REMOVER");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnGoBack.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnGoBack.setText("Voltar");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(0, 255, 51));
        btnRegister.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnRegister.setText("CADASTRAR");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnUpdate.setText("ATUALIZAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btnClean, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnRemove, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnGoBack, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnRegister, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGoBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btnSearchName.setText(">");
        btnSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPersonagem)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblId)
                                    .addComponent(lblAge)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(lblName)
                                    .addComponent(txtId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchName)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRace)
                                    .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDescription)
                                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClass)
                                    .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGender)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearchName)))
                        .addGap(18, 18, 18)
                        .addComponent(lblAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblGender)
                                    .addGap(31, 31, 31))
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDescription)
                                    .addGap(32, 32, 32))))
                        .addGap(18, 18, 18)
                        .addComponent(lblClass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRace)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Funções de suporte 
    private void refreshTable(){
        this.tblCharacter.setModel(Controller.CharacterController.listValues((DefaultTableModel) this.tblCharacter.getModel())); 
    }
    
    private void wipeOutField(){
        for(int i = 0; i< getContentPane().getComponentCount(); i++){
            Component c = getContentPane().getComponent(i);
            
            if (c instanceof JTextField){
                JTextField field = (JTextField) c;
                field.setText(null);
            }
        }
    }
    
    /**/
    
    //Funções dos componentes
    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        this.setVisible(false);
        new frmMain().setVisible(true);
    }//GEN-LAST:event_btnGoBackActionPerformed

    
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String name, description, gender, age, race, classe;
        
        name = txtName.getText(); description = txtDescription.getText(); gender = txtGender.getText(); race = txtRace.getText(); age = txtRace.getText(); classe = txtClass.getText();
        Controller.CharacterController.register(name, description, gender, age, race, classe);
        
        this.refreshTable();
        this.wipeOutField();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        String id, name, description, gender, age, race, classe;
        id = txtId.getText(); name = txtName.getText(); description = txtDescription.getText(); gender = txtGender.getText(); race = txtRace.getText(); age = txtRace.getText(); classe = txtClass.getText();
        
        Controller.CharacterController.update(id, name, description, gender, age, race, classe);
        
        this.refreshTable();
        this.wipeOutField();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        String id = txtId.getText();
        Controller.CharacterController.remove(id);
        
        this.refreshTable();
        this.wipeOutField();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tblCharacterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCharacterMouseClicked
        int rowIndex = tblCharacter.getSelectedRow();
        
        if(rowIndex != -1) {
            Integer id = (Integer) tblCharacter.getValueAt(rowIndex, 0);
            String name = (String) tblCharacter.getValueAt(rowIndex, 1);
            String description = (String) tblCharacter.getValueAt(rowIndex, 2);
            String gender = (String) tblCharacter.getValueAt(rowIndex, 3);
            String age = (String) tblCharacter.getValueAt(rowIndex, 4);
            String race = (String) tblCharacter.getValueAt(rowIndex, 5);
            String classe = (String) tblCharacter.getValueAt(rowIndex, 6);
            
           
            txtId.setText(id.toString());
            txtName.setText(name);
            txtDescription.setText(description);
            txtGender.setText(gender);
            txtAge.setText(age);
            txtRace.setText(race);
            txtClass.setText(classe);
        }
    }//GEN-LAST:event_tblCharacterMouseClicked

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        this.wipeOutField();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNameActionPerformed
        String name;
        name = txtName.getText();
        
        this.tblCharacter.setModel(Controller.CharacterController.listValues((DefaultTableModel) this.tblCharacter.getModel(), name)); 
    }//GEN-LAST:event_btnSearchNameActionPerformed

    /**/
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCharacter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearchName;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPersonagem;
    private javax.swing.JLabel lblRace;
    private javax.swing.JTable tblCharacter;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRace;
    // End of variables declaration//GEN-END:variables
}
