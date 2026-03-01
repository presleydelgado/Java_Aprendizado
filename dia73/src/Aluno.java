public class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
    public double getNota() {
        return nota;
    }
    public String getNome() {
        return nome;
    }
}
