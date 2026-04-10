import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Lista {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa addTarefa){
        if(addTarefa.getNome().isBlank())return;
        tarefas.add(addTarefa);
    }
    public boolean isListaVazia(){return tarefas.isEmpty();}

    public String listarTarefa(){
        if(isListaVazia())return "Lista vazia";
        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < tarefas.size(); a++){
            sb.append(a + 1).append(". ").append(tarefas.get(a)).append("\n");
        }
        return sb.toString();
    }
    public boolean editarTarefa(int indice,String novoNome,String novoObjetivo){
        if (isListaVazia())return false;
        indice--;
        if (indice < 0 || indice >= tarefas.size()){
            return false;
        }
        Tarefa t = tarefas.get(indice);
        if(!novoNome.isBlank()){
            t.setNome(novoNome);
        }
        if(!novoObjetivo.isBlank()){
            t.setObjetivo(novoObjetivo);
        }
        return true;
    }
    public String removerTarefa(String removeTarefa){
        if (isListaVazia())return "Lista vazia";
        Iterator<Tarefa> iterator = tarefas.iterator();
        while (iterator.hasNext()){
            Tarefa atual = iterator.next();
            if (atual.getNome().toLowerCase().contains(removeTarefa.toLowerCase())){
                iterator.remove();
                return "Tarefa: " + removeTarefa + " removido da lista";
            }
        }
        return "Tarefa não encontrada";
    }
}
