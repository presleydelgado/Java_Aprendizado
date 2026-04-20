import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public boolean isListaVazia(){
        return produtos.isEmpty();
    }
    public void adicionarProduto(Produto addProduto){
        produtos.add(addProduto);
    }
    public String mostrarLista(){
        if (isListaVazia())return "Lista de produtos está vazia!";
        StringBuilder sb = new StringBuilder();
        for (Produto a : produtos){
            sb.append("Produto: ").append(a.getNome()).append(" | Qtd: ").append(a.getQuantidade()).append("\n");
        }
        return sb.toString();
    }
    public String buscarProduto(String buscar){
        if (isListaVazia())return "Lista vazia";

        boolean encontrou = false;
        StringBuilder sb = new StringBuilder();
        for(Produto a : produtos){
            if (a.getNome().toLowerCase().contains(buscar.toLowerCase())){
                sb.append("Produto: ").append(a.getNome()).append(" : ").append("encontrado").append("\n");
                encontrou = true;
            }
        }
        if (!encontrou){
            return "Nenhum nome foi encontrado com esse nome!";
        }
        return sb.toString();
    }
    public String removerProduto(String buscarParaRemover){
        Iterator<Produto> produtoIterator = produtos.iterator();
        while (produtoIterator.hasNext()){
            Produto atual = produtoIterator.next();

            if (atual.getNome().toLowerCase().contains(buscarParaRemover.toLowerCase())){
                produtoIterator.remove();
                return "Produto: " + buscarParaRemover + " removido!";
            }
        }
        return "Produto não encontrado";
    }
    public boolean editarLista(String produto,int novaQuantidade,String novaCategoria){
        if (isListaVazia())return false;
        for (Produto a : produtos){
            if(a.getNome().equalsIgnoreCase(produto)){
                if(novaQuantidade >= 0){
                    a.setQuantidade(novaQuantidade);
                }
                if(!novaCategoria.isBlank()){
                    a.setCategoria(novaCategoria);
                }
                return true;
            }
        }
        return false;
    }
    public String ordernarOrdemAlfabetica(){
        if (isListaVazia())return "Lista vazia";

        Collections.sort(produtos);

        StringBuilder sb = new StringBuilder();

        sb.append("Produtos em ordem alfabetica:");

        for (Produto a : produtos){
            sb.append(a).append("\n");
        }
        return sb.toString();
    }
    public String filtraPorCategoria(String filtrar){
        if (isListaVazia())return "Lista vazia";
        StringBuilder sb = new StringBuilder();

        boolean encontrou = false;
        for (Produto a : produtos){
            if(a.getCategoria().toLowerCase().contains(filtrar.toLowerCase())){
                encontrou = true;
                sb.append("Categoria: ").append(a.getCategoria()).append("\n");
            }
        }
        if (!encontrou){
            return "Categoria não encontrada";
        }
        return sb.toString();
    }
}
