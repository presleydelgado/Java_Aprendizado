public class Main {
    public static void main(String[] args) {
        Gerenciador g = new Gerenciador();

        g.adicionaAluno(new Aluno("Paulo",6));
        g.adicionaAluno(new Aluno("Carolina",8));
        g.adicionaAluno(new Aluno("João",10));
        g.adicionaAluno(new Aluno("Maria",3));
        g.adicionaAluno(new Aluno("Carlos",0));

        g.mostraAlunos();
        g.melhorAluno();
        g.piorAluno();
    }
}

/*
Dia 66 — Pior aluno
Objetivo
Treinar lógica de menor valor.
Exercício
Criar método:
piorAluno()
Mesma lógica do melhor aluno, mas procurando a MENOR nota.
 */