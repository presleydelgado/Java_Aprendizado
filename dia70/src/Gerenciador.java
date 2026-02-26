import java.util.ArrayList;
import java.util.Iterator;

public class Gerenciador {
    ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionaAluno(Aluno addAlunos){
        listaAlunos.add(addAlunos);
    }
    public void removerPorNome(String nome){
        boolean encontrado = false;
        Iterator<Aluno> iterator = listaAlunos.iterator();

        while (iterator.hasNext()){
            Aluno a = iterator.next();
            if(nome.equals(a.nome)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("Removido");
        }else{
            System.out.println("Não encontrado!");
        }
    }
}