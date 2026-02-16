public class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
    public void mostraDados(){
        System.out.println("Nome: " + nome + " - " + nota);
    }
    public void verificaAprovacao(){
        if(nota >= 7){
            System.out.println("Aluno(a) Aprovado!");
            System.out.println("");
        }else{
            System.out.println("REPROVADO!");
            System.out.println("");
        }
    }
}
