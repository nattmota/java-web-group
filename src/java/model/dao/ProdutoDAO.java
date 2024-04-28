package model.dao;

import conexao.Conexao;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Categoria;
import model.bean.Produto;

public class ProdutoDAO {

    public List<Produto> listarTodosDisponiveis() {
        List<Produto> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "SELECT * FROM produto AS p INNER JOIN estoque AS e ON p.idProduto = e.produto WHERE e.quantidade > 0";

            stmt = conexao.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getInt("categoria"));
                p.setValor(rs.getFloat("valor"));

                produtos.add(p);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return produtos;
    }

    public List<Produto> listarTodos() {
        List<Produto> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            ResultSet r2 = null;
            String query = "SELECT * FROM produto";

            stmt = conexao.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setValor(rs.getFloat("valor"));
                // if(rs.getBlob("imagem") == null) {
                //     String stmt2  = "select * from produto where idProduto = 1";
                //     PreparedStatement stmt3 = conexao.prepareStatement(stmt2);
                //     r2 = stmt3.executeQuery();
                //     if(r2.next()){
                //         p.setImagem(r2.getBlob("imagem"));
                //     } 
                // } else{
                //     p.setImagem(rs.getBlob("imagem"));
                // }
                produtos.add(p);
            }

            rs.close();
            //r2.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return produtos;
    }

    public List<Produto> listarTodos8() {
        List<Produto> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "(SELECT * FROM produto WHERE categoria = 1 LIMIT 2)\n"
                    + "UNION ALL\n"
                    + "(SELECT * FROM produto WHERE categoria = 2 LIMIT 2)\n"
                    + "UNION ALL\n"
                    + "(SELECT * FROM produto WHERE categoria = 3 LIMIT 2)\n"
                    + "UNION ALL\n"
                    + "(SELECT * FROM produto WHERE categoria = 4 LIMIT 2)\n"
                    + "LIMIT 8;";

            stmt = conexao.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setValor(rs.getFloat("valor"));
                Blob imagemBlob = rs.getBlob("imagem");
                if (imagemBlob != null) {
                    byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());
                    p.setImagemBytes(imagemBytes);
                }

                produtos.add(p);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return produtos;
    }

    public List<Produto> listarPorCategoriaLivros() {
        List<Produto> produtos = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "SELECT * FROM produto WHERE categoria = 1";

            stmt = conexao.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getInt("categoria"));
                p.setValor(rs.getFloat("valor"));
                Blob imagemBlob = rs.getBlob("imagem");
                if (imagemBlob != null) {
                    byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());
                    p.setImagemBytes(imagemBytes);
                }
                produtos.add(p);
            }
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public List<Produto> listarPorCategoriaPapelaria() {
        List<Produto> produtos = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "SELECT * FROM produto WHERE categoria = 2";

            stmt = conexao.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getInt("categoria"));
                p.setValor(rs.getFloat("valor"));
                Blob imagemBlob = rs.getBlob("imagem");
                if (imagemBlob != null) {
                    byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());
                    p.setImagemBytes(imagemBytes);
                }
                produtos.add(p);
            }
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public List<Produto> listarPorCategoriaBiblia() {
        List<Produto> produtos = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "SELECT * FROM produto WHERE categoria = 3";

            stmt = conexao.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getInt("categoria"));
                p.setValor(rs.getFloat("valor"));
                Blob imagemBlob = rs.getBlob("imagem");
                if (imagemBlob != null) {
                    byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());
                    p.setImagemBytes(imagemBytes);
                }
                produtos.add(p);
            }
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public List<Produto> listarPorCategoriaBrinquedo() {
        List<Produto> produtos = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "SELECT * FROM produto WHERE categoria = 4";

            stmt = conexao.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getInt("categoria"));
                p.setValor(rs.getFloat("valor"));
                Blob imagemBlob = rs.getBlob("imagem");
                if (imagemBlob != null) {
                    byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());
                    p.setImagemBytes(imagemBytes);
                }
                produtos.add(p);
            }
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public List<Produto> listarPorPesquisa(String search) {
        List<Produto> produtos = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produto WHERE nome LIKE '%?%'");
            stmt.setString(1, search);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getInt("categoria"));
                p.setValor(rs.getFloat("valor"));
                Blob imagemBlob = rs.getBlob("imagem");
                if (imagemBlob != null) {
                    byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());
                    p.setImagemBytes(imagemBytes);
                }
                produtos.add(p);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return produtos;
    }

    public Produto readById(int id) {
        Produto p = null;
        try (Connection conexao = Conexao.conectar();
                PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM produto WHERE idProduto = ?")) {

            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    p = new Produto();
                    p.setIdProduto(rs.getInt("idProduto"));
                    p.setNome(rs.getString("nome"));
                    p.setAutor(rs.getString("autor"));
                    p.setCategoria(rs.getInt("categoria"));
                    p.setValor(rs.getFloat("valor"));

                    // Recuperar a imagem como um array de bytes
                    Blob imagemBlob = rs.getBlob("imagem");
                    if (imagemBlob != null) {
                        byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());
                        p.setImagemBytes(imagemBytes);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    public boolean inserirProduto(Produto produto) {
        try (Connection conexao = Conexao.conectar();
                PreparedStatement stmt = conexao.prepareStatement("INSERT INTO produto (nome, autor, valor, imagem, categoria) VALUES (?, ?, ?, ?, ?)")) {

            // Defina os parâmetros do PreparedStatement com os valores do produto
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getAutor());
            stmt.setFloat(3, produto.getValor());
            stmt.setBytes(4, produto.getImagemBytes());
            stmt.setInt(5, produto.getCategoria());
            stmt.executeUpdate();

            // Execute o PreparedStatement
            int linhasAfetadas = stmt.executeUpdate();

            // Verifique se a inserção foi bem-sucedida (verifique se uma linha foi afetada)
            return linhasAfetadas > 0;

        } catch (SQLException e) {
            // Você pode lidar com a exceção aqui, talvez registrando-a ou lançando-a novamente
            e.printStackTrace();
            return false;
        }
    }

    public void update(Produto p) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("UPDATE produto SET nome = ?, valor = ?, imagem = ?, categoria = ? WHERE idProduto = ?");
            stmt.setString(1, p.getNome());
            stmt.setFloat(2, p.getValor());
            stmt.setBytes(3, p.getImagemBytes());
            stmt.setInt(4, p.getCategoria());
            stmt.setInt(5, p.getIdProduto());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean updateImg(Produto p) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("UPDATE produto SET imagem = ? WHERE idProduto = ?");
            stmt.setBytes(1, p.getImagemBytes());
            stmt.setInt(2, p.getIdProduto());

            int linhasAfetadas = stmt.executeUpdate();

            // Verifique se a inserção foi bem-sucedida (verifique se uma linha foi afetada)
            return linhasAfetadas > 0;

                     
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void delete(int id) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("DELETE FROM produto WHERE idProduto = ?");
            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt = conexao.prepareStatement("DELETE FROM produto_imagem WHERE produto = ?");
            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
