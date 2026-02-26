void main() {
  Gerenciador g = new Gerenciador();

  g.adicionaAluno(new Aluno("Fulano"));
  g.adicionaAluno(new Aluno("Ciclano"));
  g.removerPorNome("Fulano");
}

/*
Dia 70 — Remover aluno
Objetivo
Aprender remoção.
No Gerenciador:
removerPorNome(String nome)
Se encontrar:
remove da lista
mostra "removido"
Se não:
"não encontrado"
 */