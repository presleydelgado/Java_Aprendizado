import java.util.ArrayList;

public class Gerenciador {
    ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }
    public void listarAlunos(){
        if(listaAlunos.isEmpty()){
            System.out.println("A lista está vazia!");
            return;
        }
        for (Aluno a : listaAlunos){
            System.out.println("Nome: " + a.nome + " nota: " + a.nota);
        }
    }
    public void mostraMedia(){

        double soma = 0;

        if(listaAlunos.isEmpty()){
            System.out.println("A lista está vazia!");
            return;
        }
        for (Aluno a : listaAlunos){
            soma += a.nota;
        }
        double media = soma / listaAlunos.size();
        System.out.println("A média de todos os alunos = " + media);
    }
    public void melhorAluno(){
        if(listaAlunos.isEmpty()){
            System.out.println("A lista está vazia!");
            return;
        }

        Aluno melhor = listaAlunos.get(0);

        for (Aluno a : listaAlunos){
            if (a.nota > melhor.nota){
                melhor = a;
            }
        }
        System.out.println("Melhor aluno da turma: " + melhor.nome + " - " + melhor.nota);
    }
}
