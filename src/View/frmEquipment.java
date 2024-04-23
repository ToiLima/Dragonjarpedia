package View;

import Controller.EquipmentController;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class frmEquipment extends javax.swing.JFrame {

    public frmEquipment() {
        initComponents();
        this.refreshTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        lblPreco = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        txtPrice = new javax.swing.JTextField();
        btnClean = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipment = new javax.swing.JTable();
        txtHowObtain = new javax.swing.JTextField();
        lblRace = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEquipment = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        txtDescription = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUpdate.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnUpdate.setText("ATUALIZAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblPreco.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblPreco.setText("Preço");

        btnRegister.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnRegister.setText("CADASTRAR");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtPrice.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N

        btnClean.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnClean.setText("LIMPAR");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnGoBack.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnGoBack.setText("Voltar");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblAge.setText("Como obter");

        tblEquipment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição", "Preço", "Como obter", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEquipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEquipmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEquipment);

        txtHowObtain.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N

        lblRace.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblRace.setText("Tipo");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        txtId.setToolTipText("");
        txtId.setActionCommand("<Not Set>");
        txtId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtType.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N

        lblId.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblId.setText("ID");

        lblName.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblName.setText("Nome");

        txtName.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N

        lblEquipment.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        lblEquipment.setText("Equipamento");

        lblDescription.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lblDescription.setText("Descrição");

        btnRemove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        btnRemove.setText("REMOVER");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        txtDescription.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblId)
                        .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(lblName)
                        .addComponent(txtName)
                        .addComponent(lblDescription)
                        .addComponent(txtDescription)
                        .addComponent(lblPreco)
                        .addComponent(txtPrice)
                        .addComponent(lblAge)
                        .addComponent(lblRace)
                        .addComponent(txtHowObtain)
                        .addComponent(txtType))
                    .addComponent(lblEquipment)
                    .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 299, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEquipment)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHowObtain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRace)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Funções de suporte 
    private void refreshTable(){
        this.tblEquipment.setModel(Controller.EquipmentController.listValues((DefaultTableModel) this.tblEquipment.getModel())); 
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
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        String id, name, description, price, howObtain, type;
        id = txtId.getText(); name = txtName.getText(); description = txtDescription.getText(); price = txtPrice.getText();  howObtain = txtType.getText(); type = txtType.getText(); 

        Controller.EquipmentController.update(id, name, description, price, howObtain, type);

        this.refreshTable();
        this.wipeOutField();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String name, description, price, howObtain, type;

        name = txtName.getText(); description = txtDescription.getText(); price = txtPrice.getText();  howObtain = txtType.getText(); type = txtType.getText(); 
        Controller.EquipmentController.register(name, description, price, howObtain, type);

        this.refreshTable();
        this.wipeOutField();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        this.wipeOutField();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        this.setVisible(false);
        new frmMain().setVisible(true);
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void tblEquipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEquipmentMouseClicked
        int rowIndex = tblEquipment.getSelectedRow();

        if(rowIndex != -1) {
            Integer id = (Integer) tblEquipment.getValueAt(rowIndex, 0);
            String name = (String) tblEquipment.getValueAt(rowIndex, 1);
            String description = (String) tblEquipment.getValueAt(rowIndex, 2);
            Float price = (Float) tblEquipment.getValueAt(rowIndex, 3);
            String howObtain = (String) tblEquipment.getValueAt(rowIndex, 4);
            String type = (String) tblEquipment.getValueAt(rowIndex, 5);

            txtId.setText(id.toString());
            txtName.setText(name);
            txtDescription.setText(description);
            txtPrice.setText(price.toString());
            txtHowObtain.setText(howObtain);
            txtType.setText(type);
        }
    }//GEN-LAST:event_tblEquipmentMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        String id = txtId.getText();
        Controller.EquipmentController.remove(id);

        this.refreshTable();
        this.wipeOutField();
    }//GEN-LAST:event_btnRemoveActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEquipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEquipment;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblRace;
    private javax.swing.JTable tblEquipment;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtHowObtain;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
