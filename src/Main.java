public class Main {
    public static void main(String[] args) {
        System.out.println("Olá e seja bem-vindo ao nosso gerente de produto!");

        GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();

        // Adicionar produtos
        gerenciador.adicionarProduto(new Produto(1, "Caneta", 1.50));
        gerenciador.adicionarProduto(new Produto(2, "Lápis", 0.75));
        gerenciador.adicionarProduto(new Produto(3, "Caderno", 5.90));

        // Listar produtos
        System.out.println("\nLista de produtos:");
        for (Produto produto : gerenciador.listarProdutos()) {
            System.out.println(produto);
        }

        // Atualizar produto
        gerenciador.atualizarProduto(1, new Produto(2, "Lápis Grafite", 1.00));
        System.out.println("\nApós atualização:");
        for (Produto produto : gerenciador.listarProdutos()) {
            System.out.println(produto);
        }

        // Deletar produto
        gerenciador.deletarProduto(0);
        System.out.println("\nApós remoção:");
        for (Produto produto : gerenciador.listarProdutos()) {
            System.out.println(produto);
        }
    }
}
