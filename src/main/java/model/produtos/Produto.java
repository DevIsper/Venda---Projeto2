package model.produtos;

public class Produto {

    private int id;
    private String nome;
    private String descricao;
    private double preco;

    public Produto(int id, String nome, String descricao, double preco) {
        setId(id);
        setNome(nome);
        setDescricao(descricao);
        setPreco(preco);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
