import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Item> itens = new ArrayList<>();

    public void adicionarItem(Item addItens){
        itens.add(addItens);
    }
    public boolean isListaVazia(){
        return itens.isEmpty();
    }
    public String listar(){
        if (isListaVazia())return "Lista vazia";

        StringBuilder sb = new StringBuilder();

        for (Item a : itens){
            sb.append("Item: ").append(a.getNome()).append(" | ").append(a.getCategoria()).append("\n");
        }
        return sb.toString();
    }
    public String filtrarCategorias(String filtro){
        if(isListaVazia())return "Lista vazia";

        StringBuilder sb = new StringBuilder();
        boolean encontrou = false;

        for (Item a : itens){
            if(a.getCategoria().equalsIgnoreCase(filtro)){
                sb.append(a.getNome()).append("\n");
                encontrou = true;
            }
        }
        if(!encontrou){
            return "Nenhum item nessa categoria";
        }
        return sb.toString();
    }
}
