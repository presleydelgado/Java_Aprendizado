import java.util.ArrayList;

public class Buscador {
    private ArrayList<Nome> buscaNome = new ArrayList<>();

    public void adicionaNome(Nome addNome){
        buscaNome.add(addNome);
    }
    public boolean isListaVazia(){
        return buscaNome.isEmpty();
    }
    public String listarNomes(){
        if (isListaVazia())return "Lista vazia";

        StringBuilder sb = new StringBuilder();
        for (Nome a : buscaNome){
            sb.append("Nome: ").append(a.getNome()).append("\n");
        }
        return sb.toString();
    }
    public String buscaPorParteDoNome(String nomeBuscado){
        if(isListaVazia())return "Lista vazia";

        StringBuilder sb = new StringBuilder();
        boolean encontrou = false;
        for (Nome a : buscaNome){
            if(a.getNome().toLowerCase().contains(nomeBuscado.trim().toLowerCase())) {
                sb.append("Nome encontrado com : ").append(nomeBuscado).append(" - ").append(a.getNome()).append("\n");
                encontrou = true;
            }
        }
        if (!encontrou){
            return "Nenhum nome encontrado com " + nomeBuscado;
        }
        return sb.toString();
    }
}
