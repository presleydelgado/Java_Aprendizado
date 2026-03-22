public class Nota {
    private String nomeAluno;
    private double nota;

    public Nota(String nomeAluno,double nota){
        this.nomeAluno = nomeAluno;
        this.nota = nota;
    }
    public String getNomeAluno(){return nomeAluno;}
    public double getNota(){return nota;}
}
