import java.util.ArrayList;

public class Gerenciador {
    ArrayList<Alunos> listaDeAlunos = new ArrayList<>();

    public void adicionaAlunos(Alunos aluno){
        listaDeAlunos.add(aluno); //única parte onde tive que ir ver em código antigo como estava
    }

    public void mostraDados(){
        for (Alunos a : listaDeAlunos){
            System.out.println("Aluno(a): " + a.nome + " - Nota: "  + a.nota);
        }
    }

    public void contarAprovados(){
        int contador = 0;
        for (Alunos a : listaDeAlunos){
            if(a.nota >= 7){
                contador++;
            }
        }
        System.out.println("Alunos aprovados : " + contador);
    }
}