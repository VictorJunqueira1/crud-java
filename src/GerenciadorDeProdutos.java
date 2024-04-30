import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeProdutos {
    private List<Produto> produtos = new ArrayList<>();

    // Create
    public void adicionarProduto(Produto produto) {
        for (int i = 0; i < this.produtos.size(); i++) {
            if (this.produtos.get(i).id == produto.id){
                System.out.println("Produto já existente.");
                return;
            }
        }
        boolean operationSuccess = produtos.add(produto);
        if (operationSuccess) {
            System.out.println("Produto adicionado com sucesso.");
        } else {
            System.out.println("Erro ao adicionar.");
        }
    }

    // Read
    public void listarProdutos() {
        for (int j = 0; j < this.produtos.size(); j++){
            System.out.println("[" + this.produtos.get(j).nome + ", " + "R$ " + this.produtos.get(j).preco + " - " + "ID: " + this.produtos.get(j).id + "]");
        }
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
