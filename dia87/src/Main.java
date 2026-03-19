void main() {
    Estoque estoque = new Estoque();

    estoque.adicionarProduto(new Produto("Caderno",10));
    estoque.adicionarProduto(new Produto("Lapis",0));
    estoque.adicionarProduto(new Produto("Caneta",2));
    estoque.adicionarProduto(new Produto("Borracha",10));
    estoque.adicionarProduto(new Produto("Cola",0));

    estoque.listarProdutos();
    estoque.produtosEmFalta();
}

/*
📅 Dia 87 — Controle de Estoque
Classes

Produto

nome
quantidade

Estoque

ArrayList<Produto> produtos
Métodos
adicionarProduto()
listarProdutos()
produtosEmFalta()
Regra

Mostrar produtos com:

quantidade <= 0
 */