import java.util.ArrayList;

public class Gerenciador {
    ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public void adicionaAluno(Aluno addAluno){
        listaDeAlunos.add(addAluno);
    }

    public void mostrarRelatorio(){
        if(listaDeAlunos.isEmpty()){
            System.out.println("---Lista Vazia---");
            return;
        }
        int totalAlunos = listaDeAlunos.size();
        double somaNotas = 0;
        Aluno melhorAluno = listaDeAlunos.get(0);
        Aluno piorAluno = listaDeAlunos.get(0);
        int aprovados = 0;

        for(Aluno a : listaDeAlunos){
            somaNotas += a.getNota();
            if(a.getNota() > melhorAluno.getNota()) melhorAluno = a;
            if(a.getNota() < piorAluno.getNota()) piorAluno = a;
            if(a.getNota() >= 7.0) aprovados++;
        }
        double mediaGeral = somaNotas / totalAlunos;

        System.out.println("---Relátorio final---");
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Média Geral: " + mediaGeral);
        System.out.println("Melhor aluno: " + melhorAluno.getNome() + " (" + melhorAluno.getNota() + ")");
        System.out.println("Pior aluno: " + piorAluno.getNome() + " (" + piorAluno.getNota() + ")");
        System.out.println("Quantidade de aprovados: " + aprovados);
    }
}
