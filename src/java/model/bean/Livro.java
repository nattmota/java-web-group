package model.bean;


public class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private float preco;

    public Livro() {
    }

    public Livro(int idLivro, String titulo, String autor, float preco) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
