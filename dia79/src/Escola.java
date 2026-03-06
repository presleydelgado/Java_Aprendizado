import java.util.ArrayList;

public class Escola {
    ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno addAluno){
        listaDeAlunos.add(addAluno);
    }
    public void listarAlunos(){
        if(listaDeAlunos.isEmpty()){
            System.out.println("---Lista de alunos vazia---");
            return;
        }

        System.out.println("Lista de alunos matriculados: ");
        for (Aluno a : listaDeAlunos){
            System.out.println("Aluno(a): " + a.getNome() + " - Matricula: " + a.getMatricula() + " - Nota: " + a.getNota());
        }
    }
    public void mostrarAprovados(){
        if(listaDeAlunos.isEmpty()){
            System.out.println("---Lista de alunos vazia---");
            return;
        }

        double media = 7;
        for (Aluno a : listaDeAlunos){
            if (a.getNota() >= media){
                System.out.println("Aluno(a) aprovado: " + a.getNome());
            }else {
                System.out.println("Aluno(a) reprovado: " + a.getNome() + " nota abaixo da média: " + a.getNota());
            }
        }
    }
}
