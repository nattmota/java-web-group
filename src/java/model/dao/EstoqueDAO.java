package model.dao;


import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Estoque;
import model.bean.Produto;

/**
 *
 * @author Joao Guilherme
 */
public class EstoqueDAO {

    /*try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "";
            
            stmt = conexao.prepareStatement(query);
            
            
            rs.close();
            stmt.close();
            conexao.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
                   
        }*/
    public Estoque selecionarEstoquePorIdProduto(Produto p) {
        Estoque e = new Estoque();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM estoque WHERE produto = ?");
            stmt.setInt(1, p.getIdProduto());

            rs = stmt.executeQuery();

            if (rs.next()) {
                e.setIdEstoque(rs.getInt("idEstoque"));
                e.setProduto(rs.getInt("produto"));
                e.setQuantidade(rs.getInt("quantidade"));
                e.setCusto(rs.getFloat("custo"));
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return e;
    }

    public List<Estoque> listarTodos() {
        List<Estoque> estoque = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM estoque");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Estoque e = new Estoque();
                e.setIdEstoque(rs.getInt("idEstoque"));
                e.setProduto(rs.getInt("produto"));
                e.setQuantidade(rs.getInt("quantidade"));
                e.setCusto(rs.getFloat("custo"));
                estoque.add(e);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return estoque;
    }
}
