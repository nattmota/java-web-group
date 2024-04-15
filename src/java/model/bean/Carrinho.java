package model.bean;

public class Carrinho {
    private int idCarrinho;
    private Usuario usuario;

    public Carrinho() {
    }

    public Carrinho(int idCarrinho, Usuario usuario) {
        this.idCarrinho = idCarrinho;
        this.usuario = usuario;
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
