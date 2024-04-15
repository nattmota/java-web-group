package model.bean;

public class Estoque {
    private int idEstoque;
    private int produto;
    private int quantidade;
    private float custo;

    public Estoque() {
    }

    public Estoque(int idEstoque, int produto, int quantidade, float custo) {
        this.idEstoque = idEstoque;
        this.produto = produto;
        this.quantidade = quantidade;
        this.custo = custo;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    
}
