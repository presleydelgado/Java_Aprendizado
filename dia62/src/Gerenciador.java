import java.util.ArrayList;

public class Gerenciador {
    ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public void adicionarAlunos(Aluno aluno){
        listaDeAlunos.add(aluno);
    }

    public void buscarAlunoPorNome(String buscaNome){
        boolean encontrado = false;
        for (Aluno aluno: listaDeAlunos){
            if(aluno.nome.equalsIgnoreCase(buscaNome)){
                System.out.println("Aluno encontrado: " + aluno.nome + " | Idade: " + aluno.idade);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("Aluno não encontrado !");
        }
    }
    public void buscaIdade(int buscaIdade){
        boolean achou = false;
        for(Aluno aluno : listaDeAlunos){
            if(aluno.idade == buscaIdade){
                System.out.println("Idade encontrada: " + aluno.idade + " | " + aluno.nome);
                achou = true;
            }
        }
        if(!achou){
            System.out.println("Idade não encontrada!!");
        }
    }
}
/*
Dia 62 — Busca na lista
Use classe Aluno.
Faça método na classe Gerenciador:
buscarAlunoPorNome(String nome)
Se encontrar → mostrar dados
Se não → dizer que não existe
Treina lógica de busca.
 */