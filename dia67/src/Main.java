void main() {
    Gerenciador gerencia = new Gerenciador();

    gerencia.adicionaAluno(new Aluno("Fulano"));
    gerencia.adicionaAluno(new Aluno("Beltrano"));
    gerencia.adicionaAluno(new Aluno("Ciclano"));

    gerencia.buscarPorNome("ciclano");
}

/*
Dia 67 — Busca por nome
Objetivo
Treinar busca em lista.
Exercício

Criar método:
buscarPorNome(String nome)

Deve:
ignorar maiúsc/minúsc (equalsIgnoreCase)
mostrar aluno se encontrar
avisar se não achar
 */