package DAO;

//Importações
import DTO.CharacterDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CharacterDAO {
    //Métodos
    public void registerCharacter (CharacterDTO characterDTO) {
        String sql  = "INSERT INTO character (name, description, gender, age, race, class) "
                                   + "VALUES (?, ?, ?, ?, ?, ?)";
      
        try (
            Connection c = DBConnection.connect();
            PreparedStatement ps = c.prepareStatement(sql);)
        {      
            ps.setString(1, characterDTO.getName());
            ps.setString(2, characterDTO.getDescription());
            ps.setString(3, characterDTO.getGender());
            ps.setString(4, characterDTO.getAge());
            ps.setString(5, characterDTO.getRace());
            ps.setString(6, characterDTO.getClasse());
            
            int rowsRegistered = ps.executeUpdate();
            if(rowsRegistered > 0) {
                JOptionPane.showMessageDialog(null, "Sucesso no Cadastro de Personagem!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Personagem "+ ex);
        }
    }
    
    public ArrayList<CharacterDTO> selectCharacter () {
        String sql  = "SELECT * FROM character";
        ArrayList<CharacterDTO> list = new ArrayList();
        
        try (
            Connection c = DBConnection.connect();
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();) 
        {
            while(rs.next()) {
                CharacterDTO characterDTO = new CharacterDTO();
                
                characterDTO.setId(rs.getInt("id"));
                characterDTO.setName(rs.getString("name"));
                characterDTO.setDescription(rs.getString("description"));
                characterDTO.setGender(rs.getString("gender"));
                characterDTO.setAge(rs.getString("age"));
                characterDTO.setRace(rs.getString("race"));
                characterDTO.setClasse(rs.getString("class"));
                
                list.add(characterDTO);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar "+ ex);
        } return list;
    }
    
     public void updateCharacter (CharacterDTO characterDTO) {
        String sql  = "UPDATE character "
                    + "SET name = ?, description = ?, gender = ?, age = ?, race = ?, class = ? "
                    + "WHERE id = ?";
        
        try (
            Connection c = DBConnection.connect();
            PreparedStatement ps = c.prepareStatement(sql);) 
        {
            
            ps.setString(1, characterDTO.getName());
            ps.setString(2, characterDTO.getDescription());
            ps.setString(3, characterDTO.getGender());
            ps.setString(4, characterDTO.getAge());
            ps.setString(5, characterDTO.getRace());
            ps.setString(6, characterDTO.getClasse());
            ps.setInt(7, characterDTO.getId());
            
           int rowsAtualizados = ps.executeUpdate();
            if(rowsAtualizados > 0) {
                JOptionPane.showMessageDialog(null, "Sucesso em Atualizar!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar "+ ex);
        }
    }
     
     public void removeCharacter (CharacterDTO characterDTO) {
        String sql  = "DELETE FROM character "
                    + "WHERE id = ?";
        
        try (
            Connection c = DBConnection.connect();
            PreparedStatement ps = c.prepareStatement(sql);) 
        {
            ps.setInt(1, characterDTO.getId());
            
            int rowsRemoved = ps.executeUpdate();
            if(rowsRemoved > 0) {
                JOptionPane.showMessageDialog(null, "Sucesso na remoção!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover "+ ex);
        }
    }
}
