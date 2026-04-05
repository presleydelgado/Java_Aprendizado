import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto addProduto){
        produtos.add(addProduto);
    }
    public boolean isListaVazia(){
        return produtos.isEmpty();
    }
    public String listarProdutos(){
        if(isListaVazia()) return "Lista vazia";
        StringBuilder sb = new StringBuilder();

        for (Produto a : produtos){
            sb.append("Produto: ").append(a.getNome()).append(" | Quantidade: ").append(a.getQuantidade()).append("\n");
        }
        return sb.toString();
    }
    public boolean atualizarQuantidade(String nome,int novaQuantidade){
        for(Produto a : produtos){
            if(a.getNome().equalsIgnoreCase(nome)){
                a.alteraQuantidade(novaQuantidade);
                return true;
            }
        }
        return false;
    }
    public String produtosEmFalta(){
        StringBuilder sb = new StringBuilder();
        for (Produto a : produtos){
            if (a.getQuantidade() <= 0){
                sb.append("Produto: ").append(a.getNome()).append(" em falta !").append("\n");
            }
        }
        if(sb.length() == 0){
            return "Nenhum produto em falta";
        }
        return sb.toString();
    }
}
