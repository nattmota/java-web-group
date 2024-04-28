package model.bean;

import java.sql.Blob;

public class Produto {
    private int idProduto;
    private String nome;
    private String autor;
    private float valor;
    private int categoria;
    private byte[] imagemBytes;
    private String imagemBase64;

    public Produto() {
    }

    public Produto(int idProduto, String nome, String autor, float valor, int categoria, byte[] imagemBytes, String imagemBase64) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.autor = autor;
        this.valor = valor;
        this.categoria = categoria;
        this.imagemBytes = imagemBytes;
        this.imagemBase64 = imagemBase64;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public byte[] getImagemBytes() {
        return imagemBytes;
    }

    public void setImagemBytes(byte[] imagemBytes) {
        this.imagemBytes = imagemBytes;
    }

    public String getImagemBase64() {
        return imagemBase64;
    }

    public void setImagemBase64(String imagemBase64) {
        this.imagemBase64 = imagemBase64;
    }

    
}
