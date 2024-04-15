package model.bean;

public class ProdutoPedido {
    private int idProdutoPedido;
    private Pedido pedido;
    private Produto produto;

    public ProdutoPedido() {
    }

    public ProdutoPedido(int idProdutoPedido, Pedido pedido, Produto produto) {
        this.idProdutoPedido = idProdutoPedido;
        this.pedido = pedido;
        this.produto = produto;
    }

    public int getIdProdutoPedido() {
        return idProdutoPedido;
    }

    public void setIdProdutoPedido(int idProdutoPedido) {
        this.idProdutoPedido = idProdutoPedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
