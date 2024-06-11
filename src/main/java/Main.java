import model.clienteModel.Cliente;
import model.produtos.Produto;
import model.venda.Vendas;
import repository.productRepo.ProdutoRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtos = new ProdutoRepository().findAll();
        Cliente c = new Cliente("Pedro", "111.222.333-44", 100);
        Vendas v = new Vendas();


        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descricao: " + produto.getDescricao());
            System.out.println("Preco: " + produto.getPreco());
            System.out.println("---------------------");
        }

        c.addToCart(produtos.get(0));
        c.displayCart();
        c.buyItems();

        v.printFaturamento();
        v.printLucro();

    }
}
