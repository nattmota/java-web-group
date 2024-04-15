package model.bean;

public class CarrinhoProduto {
    private int idCarrinhoProduto;
    private Carrinho carrinho;
    private Produto produto;

    public CarrinhoProduto() {
    }

    public CarrinhoProduto(int idCarrinhoProduto, Carrinho carrinho, Produto produto) {
        this.idCarrinhoProduto = idCarrinhoProduto;
        this.carrinho = carrinho;
        this.produto = produto;
    }

    public int getIdCarrinhoProduto() {
        return idCarrinhoProduto;
    }

    public void setIdCarrinhoProduto(int idCarrinhoProduto) {
        this.idCarrinhoProduto = idCarrinhoProduto;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
