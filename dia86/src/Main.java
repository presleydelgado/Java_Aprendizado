public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();
        turma.adicionarAluno(new Aluno("Paula",7));
        turma.adicionarAluno(new Aluno("Jorge",6.5));
        turma.adicionarAluno(new Aluno("Natalia",4.8));
        turma.adicionarAluno(new Aluno("Mateus",8.8));
        turma.adicionarAluno(new Aluno("João",10.0));

        turma.listarAlunos();
        turma.mostrarAprovados();
    }
}

/*
📅 Dia 86 — Sistema de Alunos
Classes

Aluno

nome
nota

Turma

ArrayList<Aluno> alunos
Métodos
adicionarAluno()
listarAlunos()
mostrarAprovados()
Regra

Aluno aprovado se:

nota >= 7

Saída exemplo:

Aprovado: João
Aprovado: Maria
 */