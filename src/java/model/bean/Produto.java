package model.bean;

public class Produto {
    private static int idProduto;
    private String nome;
    private float valor;
    private float valorFinal;
    private Categoria categoria;

    public Produto() {
    }

    public Produto(String nome, float valor, float valorFinal, Categoria categoria) {
        this.nome = nome;
        this.valor = valor;
        this.valorFinal = valorFinal;
        this.categoria = categoria;
    }

    public static int getIdProduto() {
        return idProduto;
    }

    public static void setIdProduto(int idProduto) {
        Produto.idProduto = idProduto;
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

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
