package model.clienteModel;

public class Endereco {

    private String estado;
    private String cidade;
    private String cep;
    private String bairro;
    private String rua;
    private int numero;
    private String complemento;

    private Endereco() {}

    public Endereco(String estado, String cep, String bairro, String rua, int numero) {
        setEstado(estado);
        setCidade(cidade);
        setCep(cep);
        setBairro(bairro);
        setRua(rua);
        setNumero(numero);
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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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
