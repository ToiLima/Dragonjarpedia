package Controller;

import DAO.EquipmentDAO;
import DTO.EquipmentDTO;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EquipmentController {
    /*Lista os valores disponíveis no banco para a tabela do aplicativo*/
    public static DefaultTableModel listValues(DefaultTableModel table) {
        try {
            EquipmentDAO equipmentDAO = new EquipmentDAO(); //Estância o DAO de equipamento
            ArrayList<EquipmentDTO> list = equipmentDAO.selectEquipment(); //Estância uma lista do DTO de equipamento
            table.setNumRows(0); //Configura o tamanho da tabela 
            
            for(int num = 0; num < list.size(); num++) {
                table.addRow(new Object[]{
                    list.get(num).getId(),
                    list.get(num).getName(),
                    list.get(num).getDescription(),
                    list.get(num).getPrice(),
                    list.get(num).getHowObtain(),
                    list.get(num).getType()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar Personagens"+ ex);
        }
        return table;
    }
    
    public static void register(String name, String description, String price, String howObtain, String type){
        try {
            if(!"".equals(name) && !"".equals(description) && isNumeric(price) && !"".equals(howObtain) && !"".equals(type)){
                Float priceNum = Float.valueOf(price);
                EquipmentDTO equipmentDTO = new EquipmentDTO(null ,name, description, priceNum, howObtain, type);
            
                EquipmentDAO equipmentDAO = new EquipmentDAO();
                equipmentDAO.registerEquipment(equipmentDTO);
      
            } else {  
                JOptionPane.showMessageDialog(null, "Por favor preencher todas os campos");
            } 
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Equipamento "+ ex);
        }
    }
    
    public static void update(String id, String name, String description, String price, String howObtain, String type){
        
        try {
            if(isNumeric(id) && !"".equals(description) && isNumeric(price) && !"".equals(howObtain) && !"".equals(type)){
                Integer idNum = Integer.valueOf(id);
                Float priceNum = Float.valueOf(price);
                
                EquipmentDTO equipmentDTO = new EquipmentDTO(idNum ,name, description, priceNum, howObtain, type);
            
                EquipmentDAO equipmentDAO = new EquipmentDAO();
                equipmentDAO.updateEquipment(equipmentDTO);
            } else {  
                JOptionPane.showMessageDialog(null, "Por favor selecionar equipamento");
            } 
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Equipamento "+ ex);
        }
    }
    
    public static void remove(String id) {
        try {
            if(isNumeric(id)){
                Integer idNum = Integer.valueOf(id);
                
                EquipmentDTO equipmentDTO = new EquipmentDTO();
                equipmentDTO.setId(idNum);
            
                EquipmentDAO equipmentDAO = new EquipmentDAO();
                equipmentDAO.removeEquipment(equipmentDTO);
            } else {  
                JOptionPane.showMessageDialog(null, "Por favor selecionar equipamento");
            } 
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Remover Equipamento "+ ex);
        }
    }
    
    private static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }
}