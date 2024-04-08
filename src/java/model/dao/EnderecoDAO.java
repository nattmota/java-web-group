package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Endereco;

public class EnderecoDAO {
    public List<Endereco> read() {
        List<Endereco> listaEndereco = new ArrayList();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM endereco WHERE idEndereco = ?");
            stmt.setInt(1, Endereco.getIdEndereco());
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Endereco e = new Endereco();
                e.setIdEndereco(rs.getInt("idEndereco"));
                e.setEstado(rs.getString("estado"));
                e.setCidade(rs.getString("cidade"));
                e.setCep(rs.getString("cep"));
                e.setRua(rs.getString("rua"));
                e.setNumero(rs.getInt("numero"));
                listaEndereco.add(e);
            }

            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return listaEndereco;
    }
    
    public boolean cadastro (Endereco e) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;          

            stmt = conexao.prepareStatement("INSERT INTO endereco (estado, cidade, cep, rua, numero) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, e.getEstado());
            stmt.setString(2, e.getCidade());
            stmt.setString(3, e.getCep());
            stmt.setString(4, e.getRua());
            stmt.setInt(5, e.getNumero());

            stmt.executeUpdate();
                                   
            stmt.close();
            conexao.close();            
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex); 
            return false;
        }        
    }
    
    public boolean update (Endereco e) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("UPDATE endereco SET estado = ?, cidade = ?, cep = ?, rua = ?, numero = ? WHERE idEndereco = ? ");

            stmt.setString(1, e.getEstado());
            stmt.setString(2, e.getCidade());
            stmt.setString(3, e.getCep());
            stmt.setString(4, e.getRua());
            stmt.setInt(5, e.getNumero());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();
            
            return true;
            
            
        }catch(SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        }
    }
}
