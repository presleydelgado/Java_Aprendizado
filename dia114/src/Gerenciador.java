import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public boolean isListaVazia(){
        return produtos.isEmpty();
    }

    public void adicionarProduto(Produto addProduto){
        produtos.add(addProduto);
    }

    public String listarProdutos(){
        if (isListaVazia())return "Lista de produtos vazia";
        StringBuilder sb = new StringBuilder();
        for (Produto a : produtos){
            sb.append(a).append("\n");
        }
        return sb.toString();
    }
}
