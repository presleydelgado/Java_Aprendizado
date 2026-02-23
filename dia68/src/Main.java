void main() {
    Catalogo catalogo = new Catalogo();
    catalogo.adicionaFilme(new Filme("Procurando Nemo", 100));
    catalogo.adicionaFilme(new Filme("Carros",117));
    catalogo.adicionaFilme(new Filme("Toy Story",81));
    catalogo.adicionaFilme(new Filme("Os Incriveis",115));

    catalogo.listarFilmes();

    catalogo.mostrarFilmeMaisLongo();
}

/*
Dia 68 — Sistema de filmes 🎬
Classe Filme
Atributos:
titulo
duracao (minutos)
Método:

mostrarDados()

Classe Catalogo
Atributo:
ArrayList de filmes
Métodos:
adicionarFilme
listarFilmes
mostrarFilmeMaisLongo
 */