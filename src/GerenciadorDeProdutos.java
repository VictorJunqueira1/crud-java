import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeProdutos {
    private List<Produto> produtos = new ArrayList<>();

    // Create
    public boolean adicionarProduto(Produto produto) {
        return produtos.add(produto);
    }

    // Read
    public List<Produto> listarProdutos() {
        return produtos;
    }

    // Update
    public boolean atualizarProduto(int index, Produto produtoAtualizado) {
        if (index >= 0 && index < produtos.size()) {
            produtos.set(index, produtoAtualizado);
            return true;
        } else {
            System.out.println("Não possui esse item!");
            return false;
        }
    }

    // Delete
    public boolean deletarProduto(int index) {
        if (index >= 0 && index < produtos.size()) {
            produtos.remove(index);
            return true;
        } else {
            System.out.println("Índice inválido!");
            return false;
        }
    }
}
