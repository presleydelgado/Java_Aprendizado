void main() {
    Estoque estoque = new Estoque();

    estoque.adicionarProduto(new Produto("Veja",3.50,1));
    estoque.adicionarProduto(new Produto("Coca Cola",8.59,2));
    estoque.adicionarProduto(new Produto("Arroz 5kg",23.89,1));
    estoque.adicionarProduto(new Produto("Feijão 1kg",5.89,2));

    estoque.listarProdutos();

    estoque.calcularValorTotalEstoque();
}

/*
Dia 80 — Controle de Produtos
Classes

Produto
nome
preço
quantidade

Estoque
ArrayList<Produto> produtos

Métodos
adicionarProduto()
listarProdutos()
calcularValorTotalEstoque()

Regra de negócio
Não permitir preço negativo
 */