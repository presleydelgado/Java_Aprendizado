import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa addTarefa){
        tarefas.add(addTarefa);
    }

    public void listarTarefas(){
        if(tarefas.isEmpty()){
            System.out.println("Lista vazia");
            return;
        }
        for (Tarefa a : tarefas){
            System.out.println("Tarefa: " + a.getDescricao());
        }
        System.out.println("");
    }
    public void marcarComoConcluida(){
        if(tarefas.isEmpty()){
            System.out.println("Lista vazia");
            return;
        }
        for (Tarefa a : tarefas){
            if(a.isConcluida() == true){
                System.out.println(a.getDescricao() + " foi concluido(a) ✔");
            }else{
                System.out.println(a.getDescricao() + " não concluído(a) ❌");
            }
        }
    }
    
}