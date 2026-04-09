import java.util.ArrayList;
import java.util.Iterator;

public class Lista {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa addTarefa){
        if (addTarefa.getNome().isBlank()) return;
        tarefas.add(addTarefa);
    }
    public boolean isListaVazia(){return tarefas.isEmpty();}

    public String listarTarefas(){
        if(isListaVazia())return "Lista vazia";
        StringBuilder sb = new StringBuilder();
        for(int a = 0; a < tarefas.size(); a++){
            sb.append(a + 1).append(". ").append(tarefas.get(a)).append("\n");
        }
        return sb.toString();
    }
    public String buscarTarefa(String tarefaProcura){
        if(isListaVazia())return "Lista vazia";
        for(Tarefa a : tarefas){
            if(a.getNome().equalsIgnoreCase(tarefaProcura)){
                return "Tarefa encontrada: " + a.getNome();
            }
        }
        return "Tarefa não encontrada";
    }
    public String removerTarefa(String tarefaRemove){
        if(isListaVazia())return "Lista vazia";
        Iterator<Tarefa> iterator = tarefas.iterator();
        while (iterator.hasNext()){
            Tarefa atual = iterator.next();
            if(atual.getNome().toLowerCase().contains(tarefaRemove.toLowerCase())){
                iterator.remove();
                return "Tarefa: " + tarefaRemove + " removido da lista !";
            }
        }
        return "Tarefa não encontrada";
    }
    public boolean concluirTarefa(int indice){
        if (isListaVazia())return false;

        indice--;

        if(indice < 0 || indice >= tarefas.size()){
            return false;
        }
        tarefas.get(indice).concluir();
        return true;
    }
}
