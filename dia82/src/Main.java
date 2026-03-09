void main() {
    Catalogo catalogo = new Catalogo();
    catalogo.adicionarFilme(new Filme("Toy Story","Infantil",8.3));
    catalogo.adicionarFilme(new Filme("Procurando Nemo","Infantil",8.2));
    catalogo.adicionarFilme(new Filme("Super-Heróis: A Liga da Injustiça","Comedia",1.9));

    catalogo.listarFilmes();
    catalogo.mostrarFilmesBemAvaliados();
    catalogo.buscarPorGenero("comedia");
}
/*
Dia 82 — Sistema de Filmes
Classes

Filme
titulo
genero
nota

Catalogo
ArrayList<Filme> filmes

Métodos
adicionarFilme()
listarFilmes()
mostrarFilmesBemAvaliados()

Regra
Filmes bons: nota >= 8}
 */
