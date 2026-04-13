import java.util.ArrayList;

public class Lista {

    private ArrayList<Item> items = new ArrayList<>();

    public boolean isListaVazia(){
        return items.isEmpty();
    }
    public void adicionarItem(Item addItem){
        if(addItem.getNome().isBlank())return;

        items.add(addItem);
    }
    public String listarItems(){
        if(isListaVazia())return "Lista vazia";
        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < items.size(); a ++){
            sb.append(a + 1).append(". ").append(items.get(a)).append("\n");
        }
        return sb.toString();
    }
    public int mostrarTotal(){
        int soma = 0;

        for (Item a : items){
            soma += a.getQuantidade();
        }
        return soma;
    }
}
