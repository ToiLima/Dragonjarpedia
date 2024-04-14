package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    static String conexao = "jdbc:postgres://localhost:5432/dragonjarpedia";
    static String usuario = "postgres";
    static String senha = "postgres"; //Lembre-se de verificar se o usuario e a senha estão corretos
    
    public Connection conectar() {
        try {
            return DriverManager.getConnection(conexao, usuario, senha);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
