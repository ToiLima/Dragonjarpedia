package Controller;

import DAO.MonsterDAO;
import DTO.MonsterDTO;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MonsterController {
    /*Lista os valores disponíveis no banco para a tabela do aplicativo*/
    public static DefaultTableModel listValues(DefaultTableModel table) {
        try {
            MonsterDAO monsterDAO = new MonsterDAO(); //Estância o DAO de monstro
            ArrayList<MonsterDTO> list = monsterDAO.selectMonster(); //Estância uma lista do DTO de monstro
            table.setNumRows(0); //Configura o tamanho da tabela 
            
            for(int num = 0; num < list.size(); num++) {
                table.addRow(new Object[]{
                    list.get(num).getId(),
                    list.get(num).getName(),
                    list.get(num).getDescription(),
                    list.get(num).getFamily()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar Monstros"+ ex);
        }
        return table;
    }
    
    public static void register(String name, String description, String family){
        try {
            if(!"".equals(name) && !"".equals(description) && !"".equals(family)){
                MonsterDTO monsterDTO = new MonsterDTO(null ,name, description, family);
            
                MonsterDAO monsterDAO = new MonsterDAO();
                monsterDAO.registerMonster(monsterDTO);
      
            } else {  
                JOptionPane.showMessageDialog(null, "Por favor preencher todas os campos");
            } 
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Monstro"+ ex);
        }
    }
    
    public static void update(String id, String name, String description, String family){
        
        try {
            if(isNumeric(id) && !"".equals(name) && !"".equals(description) && !"".equals(family)){
                Integer idNum = Integer.valueOf(id);
                MonsterDTO monsterDTO = new MonsterDTO(idNum ,name, description, family);
            
                MonsterDAO monsterDAO = new MonsterDAO();
                monsterDAO.updateMonster(monsterDTO);
            } else {  
                JOptionPane.showMessageDialog(null, "Por favor selecionar monstro");
            } 
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Monstro"+ ex);
        }
    }
    
    public static void remove(String id) {
        try {
            if(isNumeric(id)){
                Integer idNum = Integer.valueOf(id);
                
                MonsterDTO monsterDTO = new MonsterDTO();
                monsterDTO.setId(idNum);
            
                MonsterDAO monsterDAO = new MonsterDAO();
                monsterDAO.removeMonster(monsterDTO);
            } else {  
                JOptionPane.showMessageDialog(null, "Por favor selecionar monstro");
            } 
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Remover Monstro"+ ex);
        }
    }
    
    private static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }

}