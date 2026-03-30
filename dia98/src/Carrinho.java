import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Carrinho {
    private ArrayList<Item> items = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("0.00");

    public void adicionarItem(Item addItem){
        items.add(addItem);
    }
    public boolean isListaVazia(){
        if(items.isEmpty()){
            return true;
        }
        return false;
    }
    public String listarItens(){
        if(isListaVazia())return "Lista de items vazia";

        StringBuilder sb = new StringBuilder();

        for (Item a : items){
            sb.append("Item: ").append(a.getNome()).append(" | Valor R$: ").append(df.format(a.getValor())).append("\n");
        }
        return sb.toString();
    }
    public String itemParaRemover(String nomeBuscado){
        if (isListaVazia())return "Lista vazia";

        Iterator<Item> it = items.iterator();

        while (it.hasNext()){
            Item atual = it.next();
            if(atual.getNome().equalsIgnoreCase(nomeBuscado)){
                it.remove();
                return "Item " + nomeBuscado + " removido com sucesso!";
            }
        }
        return "Item não encontrado";
    }
}