public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }
    @Override
    public String toString(){
        return (concluida ? " [X] " : " [ ] ") + descricao;
    }
    public void concluir(){
        this.concluida = true;
    }
}
