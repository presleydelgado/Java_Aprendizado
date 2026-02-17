public class Main {
    public static void main(String[] args) {
        Gerenciador g = new Gerenciador();

        g.adicionarAluno(new Aluno("Pamela",4));
        g.adicionarAluno(new Aluno("Juliana",7));
        g.adicionarAluno(new Aluno("Carolina",8));
        g.adicionarAluno(new Aluno("Natalia",9));
        g.listarAlunos();
        g.mostraMedia();
        g.melhorAluno();
    }
}

/*
Dia 64 — Mini-sistema completo
Juntar tudo
Sistema de alunos:
Gerenciador deve:

adicionar aluno
listar alunos
mostrar média das notas
mostrar melhor aluno

Sem pressa. Um método de cada vez.
 */