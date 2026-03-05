void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();

    biblioteca.adicionaLivros(new Livro("1984",1949,"George Orwell"));
    biblioteca.adicionaLivros(new Livro("If We Were Villains",2017,"M. L. RIO"));
    biblioteca.adicionaLivros(new Livro("Moby Dick",1851,"Herman Melville"));


    biblioteca.mostraLista();

    biblioteca.contaLivrosPorAno(2000);
}

/*
Dia 78 — Mini-projeto livre
Você escolhe um tema simples:
biblioteca 📚
agenda 📒
estoque 🧾
cadastro de jogos 🎮
Regras:
pelo menos 2 classes
ArrayList
adicionar
listar
pelo menos 1 regra de negócio
Esse dia é pra você provar pra si mesmo o quanto evoluiu.
 */