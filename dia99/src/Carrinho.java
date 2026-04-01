import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("0.00");

    public void adicionarProduto(Produto addProduto){
        produtos.add(addProduto);
    }
    public boolean isListaVazia() {
        return produtos.isEmpty();
    }
    public String listarProdutos(){
        if(isListaVazia())return "Lista vazia";
        StringBuilder sb = new StringBuilder();
        for (Produto a : produtos){
            sb.append("Produto: ").append(a.getNome()).append(" | Valor R$: ").append(df.format(a.getValor())).append("\n");
        }
        return sb.toString();
    }
    public String buscarProduto(String procurado){
        if(isListaVazia())return "Lista vazia";
        for(Produto a : produtos){
            if(a.getNome().equalsIgnoreCase(procurado)){
                return  "Produto encontrado: " + a.getNome();
            }
        }
        return "Produto não encontrado";
    }
    public String removerProduto(String produtoBuscado){
        if(isListaVazia())return "Lista vazia";
        Iterator<Produto> produtoIterator = produtos.iterator();
        while (produtoIterator.hasNext()){
            Produto atual = produtoIterator.next();
            if(atual.getNome().equalsIgnoreCase(produtoBuscado)){
                produtoIterator.remove();
                return "Produto : " + produtoBuscado + " removido da lista";
            }
        }
        return "Item não encontrado";
    }
    public String calcularTotal(){
        if(isListaVazia()){
            return "0.00";
        }
        double soma = 0;
        for(Produto a : produtos){
            soma += a.getValor();
        }
        return df.format(soma);
    }
}
