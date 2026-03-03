void main() {
    Catalogo catalogo = new Catalogo();
    catalogo.adicionaFilme(new Filme("Procurando Nemo", 100));
    catalogo.adicionaFilme(new Filme("Carros",117));
    catalogo.adicionaFilme(new Filme("Toy Story",81));
    catalogo.adicionaFilme(new Filme("Os Incriveis",115));

    catalogo.mostraCatalogoDeFilmes();

    catalogo.duracaoMediaDosFilmes();

    catalogo.buscarPorParteDoNome("nemo");
}

/*
Dia 75 — Busca flexível
No sistema de filmes ou produtos:
Crie método:
buscarPorParteDoNome(String termo)
Exemplo:
termo: "toy"
encontra: "Toy Story"
Dica: contains() + toLowerCase()
 */