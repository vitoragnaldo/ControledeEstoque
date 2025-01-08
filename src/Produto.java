public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    // Construtor
    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir detalhes do produto
    public String exibirDetalhes() {
        return "Produto: " + nome + " | Quantidade: " + quantidade + " | Preço: R$ " + preco;
    }

    // Método para calcular o valor total do produto no estoque
    public double calcularValorTotal() {
        return quantidade * preco;
    }
}
