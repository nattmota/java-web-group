package model.bean;

public class Endereco {
    private static int idEndereco;
    private String estado;
    private String cidade;
    private String cep;
    private String rua;
    private int numero;
    private String complemento;

    public Endereco() {
    }

    public Endereco(String estado, String cidade, String cep, String rua, int numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public static int getIdEndereco() {
        return idEndereco;
    }

    public static void setIdEndereco(int idEndereco) {
        Endereco.idEndereco = idEndereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
    
}
