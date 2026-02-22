import java.lang.reflect.Array;
import java.util.ArrayList;

public class Gerenciador {

    ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionaAluno(Aluno addAluno){
        listaAlunos.add(addAluno);
    }
    public void buscarPorNome(String nome){
        boolean encontrado = false;
        for (Aluno a : listaAlunos){
            if(a.nome.equalsIgnoreCase(nome)){
                System.out.println("Aluno : " + nome + " está presente na lista !");
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Aluno : " + nome + " não encontrado");
        }
    }
}
