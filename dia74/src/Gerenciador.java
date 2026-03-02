import java.util.ArrayList;

public class Gerenciador {
    ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public void adicionar(Aluno addAluno){
        listaDeAlunos.add(addAluno);
        System.out.println("Aluno: " + addAluno.getNome() + " adicionado a lista");
    }
    public void listarAlunos(){
        for(Aluno a : listaDeAlunos){
            System.out.println("Nome: " + a.nome + " nota: " + a.nota);
        }
    }
    public void mostrarMedia(){
        double soma = 0;
        for (Aluno a : listaDeAlunos){
            soma += a.nota;
        }
        System.out.println("Média total de notas : " + (soma / listaDeAlunos.size()));
    }

}
