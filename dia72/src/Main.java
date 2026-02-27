void main() {
  Catalogo catalogo = new Catalogo();
  catalogo.adicionaFilme(new Filme("Procurando Nemo", 100));
  catalogo.adicionaFilme(new Filme("Carros",117));
  catalogo.adicionaFilme(new Filme("Toy Story",81));
  catalogo.adicionaFilme(new Filme("Os Incriveis",115));

  catalogo.mostraCatalogoDeFilmes();

  catalogo.duracaoMediaDosFilmes();

  catalogo.duracaoMediaDosFilmes();
}

/*
Dia 72 — Refatoração consciente
Objetivo: aprender a melhorar código sem mudar o resultado.
Pegue qualquer exercício antigo (alunos, filmes ou produtos) e:
extraia a lógica repetida para métodos
melhore nomes de variáveis
melhore a saída do console
Nada novo. Só deixar mais bonito e legível.
 */