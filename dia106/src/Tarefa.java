public class Tarefa {
    private String nome;
    private String objetivo;
    private boolean concluida;

    public Tarefa(String nome,String objetivo){
        this.nome = nome;
        this.objetivo = objetivo;
        this.concluida = false;
    }

    @Override
    public String toString() {
        return (concluida ? " [Concluida] " : " [Pendente] ") + "Nome: " + nome + " | Obj: " + objetivo;
    }
    public void concluir(){this.concluida = true;}

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    public String getObjetivo(){return objetivo;}
    public void setObjetivo(String objetivo){this.objetivo = objetivo;}
}
