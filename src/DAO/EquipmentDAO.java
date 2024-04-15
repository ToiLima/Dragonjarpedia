package DAO;

//Importações
import DTO.EquipmentDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EquipmentDAO {
    //Métodos
    public void registerEquipment (EquipmentDTO equipmentDTO) {
        String sql  = "INSERT INTO equipment (name, description, price, howObtain, type, removed) "
                                   + "VALUES (?, ?, ?, ?, ?, ?)";
      
        try (
            Connection c = ConexaoBanco.conectar();
            PreparedStatement ps = c.prepareStatement(sql);)
        {      
            ps.setString(1, equipmentDTO.getName());
            ps.setString(2, equipmentDTO.getDescription());
            ps.setFloat(3, equipmentDTO.getPrice());
            ps.setString(4, equipmentDTO.getHowObtain());
            ps.setString(5, equipmentDTO.getType());
            ps.setBoolean(6, false);
            
            int rowsRegistered = ps.executeUpdate();
            if(rowsRegistered > 0) {
                JOptionPane.showMessageDialog(null, "Sucesso no Cadastro!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar "+ ex);
        }
    }
    
    public ArrayList<EquipmentDTO> selectEquipment () {
        String sql  = "SELECT * FROM equipment";
        ArrayList<EquipmentDTO> list = new ArrayList();
        
        try (
            Connection c = ConexaoBanco.conectar();
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();) 
        {
            while(rs.next()) {
                EquipmentDTO equipmentDTO = new EquipmentDTO();
                
                equipmentDTO.setId(rs.getInt("id"));
                equipmentDTO.setName(rs.getString("name"));
                equipmentDTO.setDescription(rs.getString("description"));
                equipmentDTO.setPrice(rs.getFloat("price"));
                equipmentDTO.setHowObtain(rs.getString("howObtain"));
                equipmentDTO.setType(rs.getString("type"));
                equipmentDTO.setRemoved(rs.getBoolean("removed"));
                
                list.add(equipmentDTO);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar "+ ex);
        } return list;
    }
    
     public void updateEquipment (EquipmentDTO equipmentDTO) {
        String sql  = "UPDATE equipment "
                    + "SET name = ?, description = ?, price = ?, howObtain = ?, type = ? "
                    + "WHERE id = ?";
   
        try (
            Connection c = ConexaoBanco.conectar();
            PreparedStatement ps = c.prepareStatement(sql);) 
        {
            
            ps.setString(1, equipmentDTO.getName());
            ps.setString(2, equipmentDTO.getDescription());
            ps.setFloat(3, equipmentDTO.getPrice());
            ps.setString(4, equipmentDTO.getHowObtain());
            ps.setString(5, equipmentDTO.getType());
            ps.setInt(6, equipmentDTO.getId());
            
           int rowsAtualizados = ps.executeUpdate();
            if(rowsAtualizados > 0) {
                JOptionPane.showMessageDialog(null, "Sucesso em Atualizar!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar "+ ex);
        }
    }
     
     public void removeEquipment (EquipmentDTO equipmentDTO) {
        String sql  = "DELETE FROM equipment "
                    + "WHERE id = ?";
        
        try (
            Connection c = ConexaoBanco.conectar();
            PreparedStatement ps = c.prepareStatement(sql);) 
        {
            ps.setInt(1, equipmentDTO.getId());
            
            int rowsRemoved = ps.executeUpdate();
            if(rowsRemoved > 0) {
                JOptionPane.showMessageDialog(null, "Sucesso na remoção!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover "+ ex);
        }
    }
    
}
