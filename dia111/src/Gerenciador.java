import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Item> itens = new ArrayList<>();
    int limite = 1;

    public String adicionarItem(Item addItem){
        if (addItem.getNome().trim().isEmpty())return "O campo item não pode estar vazio.";
        if(itens.size() >= limite){
            return "ERRO: Limite de " + limite + " itens atingido.";
        }
        if (isRepetido(addItem.getNome())){
            return "Erro: O item " + addItem.getNome() + " já está cadastrado";
        }
        itens.add(addItem);
        return "Item adicionado!";
    }
    public boolean isRepetido(String nome){
        for (Item a : itens){
            if (a.getNome().trim().equalsIgnoreCase(nome.trim())){
                return true;
            }
        }
        return false;
    }
    public boolean isListaVazia(){
        return itens.isEmpty();
    }
    public String mostrarItens(){
        if (isListaVazia())return "Lista vazia";
        StringBuilder sb = new StringBuilder();

        for (Item a : itens){
            sb.append("Item: ").append(a.getNome()).append(" | Qtd: ").append(a.getQuantidade()).append("\n");
        }
        return sb.toString();
    }
    public int mostrarTotal(){
        int total = 0;
        for (Item a : itens){
            total += a.getQuantidade();
        }
        return total;
    }
}
