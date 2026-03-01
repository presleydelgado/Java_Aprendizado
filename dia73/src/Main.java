void main() {
    Gerenciador g = new Gerenciador();
    g.adicionaAluno(new Aluno("Fulano",7.8));
    g.adicionaAluno(new Aluno("Ciclano",5.5));
    g.mostrarRelatorio();
}

/*
Dia 73 — Relatório completo
Sistema de alunos
No Gerenciador, crie um método:
mostrarRelatorio()
Ele deve mostrar:
total de alunos
média geral
melhor aluno
pior aluno
quantidade de aprovados
Você já sabe fazer tudo isso — agora é só juntar.
 */