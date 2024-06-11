package model.notafiscal;

import model.clienteModel.Cliente;
import model.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

    Cliente c = new Cliente();

    private int codigoVenda;
    private double totalCompras;

    private List<Produto> produtosComprados = new ArrayList<>();

    public NotaFiscal() {}

    public NotaFiscal(List<Produto> cart, Cliente c) {
        this.c = c;
        produtosComprados = cart;
        setTotalCompras(cart.stream().mapToDouble(Produto::getPreco).sum());
        setCodigoVenda(cart.size());
    }

    private List<String> getAllProducts() {
        List<String> listString = new ArrayList<>();
        produtosComprados.stream()
                .forEach(p -> listString.add(p.getNome()));

        return listString;
    }

    public void Print() {
        System.out.println("\nNome do cliente: " + c.getNome() +
                "\nCpf do cliente: " + c.getCpf() +
                "\nCidade: " + c.getEndereco().getCidade()  +
                "\nRua: " + c.getEndereco().getRua() +
                "\nCasa: " + c.getEndereco().getNumero() +
                "\nCódigo da venda: " + getCodigoVenda() +
                "\nProdutos da venda:" + getAllProducts());
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public double getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(double totalCompras) {
        this.totalCompras = totalCompras;
    }
}
