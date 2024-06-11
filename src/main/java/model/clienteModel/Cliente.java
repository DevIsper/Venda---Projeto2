package model.clienteModel;

import model.notafiscal.NotaFiscal;
import model.produtos.Produto;
import model.venda.Vendas;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements ICliente {

    private String nome;
    private String cpf;
    private double carteira;
    private Endereco endereco;

    private List<Produto> cart = new ArrayList<>();
    private List<NotaFiscal> notas = new ArrayList<>();

    public Cliente() {}

    public Cliente(String nome, String cpf, double carteira) {
        setNome(nome);
        setCpf(cpf);
        setCarteira(carteira);
        setEndereco(new Endereco("SP", "123456-78", "Junqueira", "Rua Santo Antonio", 17));
    }

    @Override
    public void addToCart(Produto p) {
        if (p != null) {
            cart.add(p);
        } else System.out.println("Produto inválido!");
    }

    @Override
    public void removeFromCart(Produto p) {
        if (p != null) {
            cart.remove(p);
        } else System.out.println("Produto inválido!");
    }

    @Override
    public Object displayCart() {
        double precoTotalLocal = 0;

        for (Produto p : cart) {
            precoTotalLocal += p.getPreco();
            System.out.println("\nItem: " + p.getNome() +
                    "\nPreço: " + p.getPreco());
        }

        System.out.println("\n\nPreço total: " + precoTotalLocal);
        return null;
    }

    @Override
    public double displayCartTotal(List<Produto> cart) {
        return cart.stream().mapToDouble(Produto::getPreco).sum();
    }

    @Override
    public void buyItems() {
        if (cart.isEmpty()) {
            System.out.println("O carrinho está vazio!");
        } else if (carteira < displayCartTotal(cart)) {
            System.out.printf("\nDinheiro Insuficiente! Faltaram: %.2f reais.", Math.abs(carteira - displayCartTotal(cart)));
        } else {
            NotaFiscal n = new NotaFiscal(cart, this);
            notas.add(n);
            Vendas.addNotaFiscal(n);
            carteira -= displayCartTotal(cart);
            System.out.println("\nCompra realizada com sucesso! Imprimindo nota fiscal: ");
            n.Print();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getCarteira() {
        return carteira;
    }

    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
