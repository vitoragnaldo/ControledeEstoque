import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    // Construtor
    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    // Método para adicionar produto ao estoque
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para remover produto do estoque
    public boolean removerProduto(String nome, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                if (produto.getQuantidade() >= quantidade) {
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    if (produto.getQuantidade() == 0) {
                        produtos.remove(produto);
                    }
                    return true;
                } else {
                    System.out.println("Quantidade insuficiente para remover.");
                    return false;
                }
            }
        }
        System.out.println("Produto não encontrado no estoque.");
        return false;
    }

    // Método para consultar todos os produtos no estoque
    public void consultarEstoque() {
        if (produtos.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto.exibirDetalhes());
            }
        }
    }

    // Método para calcular o valor total do estoque
    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.calcularValorTotal();
        }
        return valorTotal;
    }
}
