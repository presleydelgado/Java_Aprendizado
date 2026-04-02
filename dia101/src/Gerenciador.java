import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa addTarefa){
        tarefas.add(addTarefa);
    }
    public boolean isListaVazia(){
        return tarefas.isEmpty();
    }
    public String listarTarefas(){
        if(isListaVazia())return "Lista vazia";

        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < tarefas.size(); a++){
            sb.append(a).append(" - ").append(tarefas.get(a)).append("\n");
        }
        return sb.toString();
    }
    public boolean concluirTarefa(int indice){
        if(isListaVazia())return false;

        if(indice < 0 || indice >= tarefas.size()){
            return false;
        }
        tarefas.get(indice).concluir();
        return true;
    }
    public boolean removerTarefa(int indice){
        if (isListaVazia())return false;
        if(indice < 0 || indice >= tarefas.size()){
            return false;
        }
        tarefas.remove(indice);
        return true;
    }
}
