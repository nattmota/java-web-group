package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Usuario;

public class UsuarioDAO {
    public boolean login (Usuario u) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM usuario WHERE nome = ? AND senha = ?");
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSenha());
            
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                Usuario.setIdUsuario(rs.getInt("idUsuario"));
                rs.close();
                stmt.close();
                conexao.close();
                
                return true;
            } else {
                rs.close();
                stmt.close();
                conexao.close();
                
                return false;
            }
            
        }catch(SQLException ex) {
            System.out.println("Erro: " + ex);    
            return false;
        }
    }
    
    public boolean verificarUsuario(Usuario u) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM usuario WHERE nome = ?");
            stmt.setString(1, u.getNome());
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                rs.close();
                stmt.close();
                conexao.close();
                return true;

            } else {
                rs.close();
                stmt.close();
                conexao.close();
                return false;
            }
            
        }catch(SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        }
    }
    
    public void cadastro (Usuario u) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;          

            stmt = conexao.prepareStatement("INSERT INTO usuario (nome, senha, email, cpf, telefone) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getEmail());
            stmt.setString(4, u.getCpf());
            stmt.setString(5, u.getTelefone());

            stmt.executeUpdate();
                                   
            stmt.close();
            conexao.close();            

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);          
        }        
    }
}
