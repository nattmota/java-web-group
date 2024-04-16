package model.bean;

import java.sql.Blob;

public class Produto {
    private int idProduto;
    private String nome;
    private float valor;
    private Blob imagem;
    private int categoria;

    public Produto() {
    }

    public Produto(int idProduto, String nome, float valor, Blob imagem, int categoria) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.valor = valor;
        this.imagem = imagem;
        this.categoria = categoria;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Blob getImagem() {
        return imagem;
    }

    public void setImagem(Blob imagem) {
        this.imagem = imagem;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    
    
    
}
