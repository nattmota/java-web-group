package model.bean;

import java.sql.Date;

public class Pedido {
    private int idPedido;
    private int usuario;
    private int enderecoEntrega;
    private Date dataPedido;
    private float valorTotal;

    public Pedido() {
    }

    public Pedido(int idPedido, int usuario, int enderecoEntrega, Date dataPedido, float valorTotal) {
        this.idPedido = idPedido;
        this.usuario = usuario;
        this.enderecoEntrega = enderecoEntrega;
        this.dataPedido = dataPedido;
        this.valorTotal = valorTotal;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(int enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    
    
    
}
