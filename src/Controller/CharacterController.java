package Controller;

import DAO.CharacterDAO;
import DTO.CharacterDTO;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CharacterController {
    /*Lista os valores disponíveis no banco para a tabela do aplicativo*/
    public static DefaultTableModel listValues(DefaultTableModel table) {
        try {
            CharacterDAO characterDAO = new CharacterDAO(); //Estância o DAO de personagem
            ArrayList<CharacterDTO> list = characterDAO.selectCharacter(); //Estância uma lista do DTO de personagem
            table.setNumRows(0); //Configura o tamanho da tabela 
            
            for(int num = 0; num < list.size(); num++) {
                table.addRow(new Object[]{
                    list.get(num).getId(),
                    list.get(num).getName(),
                    list.get(num).getDescription(),
                    list.get(num).getGender(),
                    list.get(num).getAge(),
                    list.get(num).getRace(),
                    list.get(num).getClasse()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar Personagens"+ ex);
        }
        return table;
    }
    
    public static void register(String name, String description, String gender, String age, String race, String classe){
        try {
            if(!"".equals(name) && !"".equals(description) && !"".equals(gender) && !"".equals(age) && !"".equals(race) && !"".equals(classe)){
                CharacterDTO characterDTO = new CharacterDTO(null ,name, description, gender, age, race, classe);
            
                CharacterDAO characterDAO = new CharacterDAO();
                characterDAO.registerCharacter(characterDTO);
      
            } else {  
                JOptionPane.showMessageDialog(null, "Por favor preencher todas os campos");
            } 
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Personagem"+ ex);
        }
    }
    
    public static void update(String id, String name, String description, String gender, String age, String race, String classe){
        
        try {
            if(isNumeric(id) && !"".equals(name) && !"".equals(description) && !"".equals(gender) && !"".equals(age) && 
                !"".equals(race) && !"".equals(classe)){
                Integer idNum = Integer.valueOf(id);
                CharacterDTO characterDTO = new CharacterDTO(idNum ,name, description, gender, age, race, classe);
            
                CharacterDAO characterDAO = new CharacterDAO();
                characterDAO.updateCharacter(characterDTO);
            } else {  
                JOptionPane.showMessageDialog(null, "Por favor selecionar personagem");
            } 
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Personagem"+ ex);
        }
    }
    
    public static void remove(String id) {
        try {
            if(isNumeric(id)){
                Integer idNum = Integer.valueOf(id);
                
                CharacterDTO characterDTO = new CharacterDTO();
                characterDTO.setId(idNum);
            
                CharacterDAO characterDAO = new CharacterDAO();
                characterDAO.removeCharacter(characterDTO);
            } else {  
                JOptionPane.showMessageDialog(null, "Por favor selecionar personagem");
            } 
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Remover Personagem"+ ex);
        }
    }
    
    private static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }

}