import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno addAluno){
        alunos.add(addAluno);
    }

    public void listarAlunos(){
        if(alunos.isEmpty()){
            System.out.println("Lista de alunos vazia! ");
            return;
        }
        for(Aluno a : alunos){
            System.out.println("Aluno(a) " + a.getNome() + " nota : " + a.getNota());
        }
        System.out.println("");
    }
    public void mostrarAprovados(){
        if(alunos.isEmpty()){
            System.out.println("Lista de alunos vazia! ");
            return;
        }
        for(Aluno a : alunos){
            if(a.getNota() >= 7){
                System.out.println("Aprovado(a): " + a.getNome());
            }
        }
    }

}
