package repository.productRepo;


import model.produtos.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    public List<Produto> findAll() {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(1, "Camiseta Básica", "Camiseta de algodão, várias cores", 29.90));
        produtos.add(new Produto(2, "Jeans Slim", "Calça jeans azul escuro, corte slim", 99.90));
        produtos.add(new Produto(3, "Tênis Running", "Tênis para corrida, com amortecimento", 149.90));
        produtos.add(new Produto(4, "Jaqueta Jeans", "Jaqueta jeans, estilo vintage", 179.90));
        produtos.add(new Produto(5, "Relógio Digital", "Relógio com cronômetro e alarme", 89.90));
        produtos.add(new Produto(6, "Boné Trucker", "Boné estilo trucker, com logo", 49.90));
        produtos.add(new Produto(7, "Mochila Escolar", "Mochila com compartimentos, resistente", 129.90));
        produtos.add(new Produto(8, "Cinto de Couro", "Cinto de couro legítimo, preto", 59.90));
        produtos.add(new Produto(9, "Óculos de Sol", "Óculos de sol UV400, proteção total", 79.90));
        produtos.add(new Produto(10, "Camiseta Estampada", "Camiseta com estampa, várias opções", 34.90));
        produtos.add(new Produto(11, "Sapato Social", "Sapato social de couro, preto", 199.90));
        produtos.add(new Produto(12, "Vestido Floral", "Vestido com estampa floral, leve", 89.90));
        produtos.add(new Produto(13, "Blusa de Tricô", "Blusa de tricô, cores variadas", 69.90));
        produtos.add(new Produto(14, "Calça Legging", "Calça legging, tecido elástico", 49.90));
        produtos.add(new Produto(15, "Casaco de Lã", "Casaco de lã, forrado e quente", 249.90));
        produtos.add(new Produto(16, "Fone de Ouvido", "Fone de ouvido com cancelamento de ruído", 159.90));
        produtos.add(new Produto(17, "Smartphone", "Smartphone com 64GB de armazenamento", 999.90));
        produtos.add(new Produto(18, "Tablet 10", "Tablet com tela de 10 polegadas", 699.90));
        produtos.add(new Produto(19, "Cafeteira Elétrica", "Cafeteira com timer programável", 149.90));
        produtos.add(new Produto(20, "Micro-ondas", "Micro-ondas 20L, várias funções", 399.90));

        return produtos;
    }
}