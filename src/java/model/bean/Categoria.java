package model.bean;

public class Categoria {
    private static int idCategoria;
    private String nome;

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public static int getIdCategoria() {
        return idCategoria;
    }

    public static void setIdCategoria(int idCategoria) {
        Categoria.idCategoria = idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
