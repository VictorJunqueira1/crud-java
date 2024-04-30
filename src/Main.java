import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá e seja bem-vindo ao nosso gerente de produto!");

        GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nO que você gostaria de fazer?");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Atualizar produto");
            System.out.println("4. Deletar produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do produto: ");
                    int id = scanner.nextInt();
                    System.out.print("Digite o nome do produto: ");
                    scanner.nextLine(); // Consumir a nova linha pendente
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    gerenciador.adicionarProduto(new Produto(id, nome, preco));
                    break;
                case 2:
                    System.out.println("\nLista de produtos:");
                    gerenciador.listarProdutos();
                    break;
                case 3:
                    System.out.print("Digite o índice do produto que deseja atualizar: ");
                    int indiceAtualizar = scanner.nextInt();
                    System.out.print("Digite o novo ID do produto: ");
                    int novoId = scanner.nextInt();
                    System.out.print("Digite o novo nome do produto: ");
                    scanner.nextLine();
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo preço do produto: ");
                    double novoPreco = scanner.nextDouble();
                    gerenciador.atualizarProduto(indiceAtualizar, new Produto(novoId, novoNome, novoPreco));
                    break;
                case 4:
                    System.out.print("Digite o índice do produto que deseja deletar: ");
                    int indiceDeletar = scanner.nextInt();
                    gerenciador.deletarProduto(indiceDeletar);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();

    }
}