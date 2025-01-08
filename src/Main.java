import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        int opcao;

        do {
            System.out.println("\n--- Sistema de Controle de Estoque ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Consultar Estoque");
            System.out.println("4. Calcular Valor Total do Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    // Adicionar Produto
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Digite o preço: R$ ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();  // Limpar o buffer de entrada
                    Produto novoProduto = new Produto(nome, quantidade, preco);
                    estoque.adicionarProduto(novoProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    // Remover Produto
                    System.out.print("Digite o nome do produto a ser removido: ");
                    nome = scanner.nextLine();
                    System.out.print("Digite a quantidade a ser removida: ");
                    quantidade = scanner.nextInt();
                    scanner.nextLine();  // Limpar o buffer de entrada
                    boolean sucesso = estoque.removerProduto(nome, quantidade);
                    if (sucesso) {
                        System.out.println("Produto removido com sucesso.");
                    }
                    break;

                case 3:
                    // Consultar Estoque
                    System.out.println("\n--- Estoque Atual ---");
                    estoque.consultarEstoque();
                    break;

                case 4:
                    // Calcular Valor Total do Estoque
                    double valorTotal = estoque.calcularValorTotalEstoque();
                    System.out.println("Valor total do estoque: R$ " + valorTotal);
                    break;

                case 5:
                    // Sair
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
