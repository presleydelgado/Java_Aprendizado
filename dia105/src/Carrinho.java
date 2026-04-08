import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> itens = new ArrayList<>();
    private int limiteMaximo = 5;

    public boolean adicionarItem(Item addItem){
        if(itens.size() >= limiteMaximo){
            return false;
        }
        itens.add(addItem);
        return true;
    }

    public boolean isListaVazia(){
        return itens.isEmpty();
    }

    public String mostrarItems(){
        if (isListaVazia())return "Lista vazia";
        StringBuilder sb = new StringBuilder();
        sb.append("--- Itens no Carrinho --- ");

        for (Item a : itens){
            sb.append("Item: ").append(a.getNome()).append(" | Qtd: ").append(a.getQuantidade()).append("\n");
        }
        return sb.toString();
    }
}
