void main() {
    Escola escola = new Escola();

    escola.adicionarAluno(new Aluno("Maria",01,7.5));
    escola.adicionarAluno(new Aluno("Pedro",02,5.4));
    escola.adicionarAluno(new Aluno("Julia",03,2.8));
    escola.adicionarAluno(new Aluno("Carolina",04,9.3));

    escola.listarAlunos();
    escola.mostrarAprovados();
}

/*
Dia 79 — Sistema de Alunos 🎓
Classes
Aluno (entidade)
nome
matricula
nota
Escola (serviço)
ArrayList<Aluno> alunos
Métodos
adicionarAluno()
listarAlunos()
mostrarAprovados()
Regra de negócio
Aluno aprovado se nota >= 7
 */