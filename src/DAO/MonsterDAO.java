package DAO;

//Importações
import DTO.MonsterDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MonsterDAO {
    //Métodos
    public void registerMonster (MonsterDTO monsterDTO) {
        String sql  = "INSERT INTO monster (name, description, family, removed) VALUES (?, ?, ?, ?)";
      
        try (
            Connection c = new ConexaoBanco().conectar();
            PreparedStatement ps = c.prepareStatement(sql);)
        {      
            ps.setString(1, monsterDTO.getName());
            ps.setString(2, monsterDTO.getDescription());
            ps.setString(3, monsterDTO.getFamily());
            ps.setBoolean(4, false);
            
            int rowsRegistered = ps.executeUpdate();
            if(rowsRegistered > 0) {
                JOptionPane.showMessageDialog(null, "Sucesso no Cadastro!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar "+ ex);
        }
    }
    
    public ArrayList<MonsterDTO> selectMonster () {
        String sql  = "SELECT * FROM monster";
        ArrayList<MonsterDTO> list = new ArrayList();
        
        try (
            Connection c = new ConexaoBanco().conectar();
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();) 
        {
            while(rs.next()) {
                MonsterDTO monsterDTO = new MonsterDTO();
                
                monsterDTO.setId(rs.getInt("id"));
                monsterDTO.setName(rs.getString("name"));
                monsterDTO.setDescription(rs.getString("description"));
                monsterDTO.setFamily(rs.getString("family"));
                monsterDTO.setRemoved(rs.getBoolean("removed"));
                
                list.add(monsterDTO);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar "+ ex);
        } return list;
    }
    
     public void updateMonster (MonsterDTO monsterDTO) {
        String sql  = "UPDATE monster "
                    + "SET name = ?, description = ?, family = ? "
                    + "WHERE id = ?";
        
        try (
            Connection c = new ConexaoBanco().conectar();
            PreparedStatement ps = c.prepareStatement(sql);) 
        {
            
            ps.setString(1, monsterDTO.getName());
            ps.setString(2, monsterDTO.getDescription());
            ps.setString(3, monsterDTO.getFamily());
            ps.setInt(4, monsterDTO.getId());
            
           int rowsAtualizados = ps.executeUpdate();
            if(rowsAtualizados > 0) {
                JOptionPane.showMessageDialog(null, "Sucesso em Atualizar!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar "+ ex);
        }
    }
     
     public void removeMonster (MonsterDTO monsterDTO) {
        String sql  = "DELETE FROM monster WHERE id = ?";
        
        try (
            Connection c = new ConexaoBanco().conectar();
            PreparedStatement ps = c.prepareStatement(sql);) 
        {
            ps.setInt(1, monsterDTO.getId());
            
            int rowsRemoved = ps.executeUpdate();
            if(rowsRemoved > 0) {
                JOptionPane.showMessageDialog(null, "Sucesso na remoção!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover "+ ex);
        }
    }
}
