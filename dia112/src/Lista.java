import java.util.ArrayList;
import java.util.Collections;

public class Lista {
    private ArrayList<Item> itens = new ArrayList<>();

    public boolean isListaVazia(){
        return itens.isEmpty();
    }
    public void adicionarItem(Item addItem){
        itens.add(addItem);
    }
    public String listar(){
        if (isListaVazia())return "Lista vazia";
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < itens.size(); i++){
            sb.append(itens.get(i).getValor());
            if (i < itens.size() - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public String ordenar(){
        if (isListaVazia())return "lista vazia";

        Collections.sort(itens);

        StringBuilder sb = new StringBuilder();
        for (Item a : itens){
            sb.append("Valor: ").append(a.getValor()).append("\n");
        }
        return sb.toString();
    }
}
