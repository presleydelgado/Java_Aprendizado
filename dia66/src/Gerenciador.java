import java.util.ArrayList;

public class Gerenciador {
    ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionaAluno(Aluno addAluno){
        listaAlunos.add(addAluno);
    }
    public void mostraAlunos(){
        for (Aluno a : listaAlunos){
            System.out.println("Aluno(a): " + a.nome + " nota : " + a.nota);
        }
    }
    public void melhorAluno(){
        Aluno melhor = listaAlunos.get(0);
        for(Aluno a : listaAlunos){
            if(a.nota >= melhor.nota){
                melhor = a;
            }
        }
        System.out.println("Melhores da turma: " + melhor.nome + " - " + melhor.nota);
    }
    public void piorAluno(){
        Aluno pior = listaAlunos.get(0);
        for(Aluno a : listaAlunos){
            if(a.nota <= pior.nota){
                pior = a;
            }
        }
        System.out.println("Piores alunos(a) da turma: " + pior.nome + " - " + pior.nota);
    }
}
