import java.util.ArrayList;

public class Gerenciador {
    ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionaAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }
    public void mostrarResultadoDeDados(){
        for (Aluno a : listaAlunos){
            a.mostraDados();
            a.verificaAprovacao();
        }
    }
}
