package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Livro;


public class LivroDAO {
    public List<Livro> read() {
        List<Livro> livro = new ArrayList();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM livro");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Livro l = new Livro();
                l.setIdLivro(rs.getInt("idLivro"));
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setPreco(rs.getFloat("preco"));
                livro.add(l);
            }
            rs.close();
            stmt.close();
            conexao.close();
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return livro;
    }
}
