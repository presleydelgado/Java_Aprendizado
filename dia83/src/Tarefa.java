public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao,boolean concluida){
        if(descricao.isBlank()) {
            throw new IllegalArgumentException("A descrição não pode ser nula !!!");
        }
        this.descricao = descricao;
        this.concluida = concluida;
    }
    public String getDescricao(){
        return descricao;
    }
    public Boolean isConcluida(){
        return concluida;
    }
}