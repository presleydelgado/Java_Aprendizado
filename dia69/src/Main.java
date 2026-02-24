void main() {
    Catalogo catalogo = new Catalogo();
    catalogo.adicionaFilme(new Filme("Procurando Nemo", 100));
    catalogo.adicionaFilme(new Filme("Carros",117));
    catalogo.adicionaFilme(new Filme("Toy Story",81));
    catalogo.adicionaFilme(new Filme("Os Incriveis",115));

    catalogo.listarFilmes();

    catalogo.mostrarFilmeMaisLongo();

    catalogo.duracaoMedia();
}

/*
Dia 69 — Média de duração
Continuando filmes:
método que mostra a duração média dos filmes
 */