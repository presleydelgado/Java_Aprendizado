void main() {
    Biblioteca biblioteca = new Biblioteca();

    biblioteca.adicionarLivro(new Livro("1984","George Orwell",false));
    biblioteca.adicionarLivro(new Livro("A Arte da Guerra","Sun Tzu",false));
    biblioteca.adicionarLivro(new Livro("Moby Dick","Herman Melville",true));
    biblioteca.listarLivros();
    biblioteca.emprestarLivro("a arte da guerra");
}
/*
Dia 85 — Biblioteca Melhorada 📚
Uma evolução do que você já fez.
Classes

Livro
titulo
autor
emprestado (boolean)

Biblioteca
ArrayList<Livro> livros

Métodos
adicionarLivro()
listarLivros()
emprestarLivro(titulo)

Regra
Não permitir emprestar livro já emprestado
 */