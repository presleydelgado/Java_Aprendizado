void main() {
    Loja lista = new Loja();

    lista.adicionarProduto(new Produto("Açucar 1KG",5.49));
    lista.adicionarProduto(new Produto("Feijão 1kg",7.99));
    lista.adicionarProduto(new Produto("Arroz 5KG",23.99));
    lista.adicionarProduto(new Produto("vinagre",1.50));

    lista.listarProdutos();
    lista.produtoMaisCaro();
    lista.calcularTotal();
}

/*
Dia 71 — Mini-desafio
Sistema de produtos:
Classe Produto
nome
preco
Classe Loja
ArrayList<Produto>
Métodos:
adicionarProduto
listarProdutos
produtoMaisCaro
calcularTotal
Dica importante
Continue fazendo como você está:
✅ um método por vez
✅ testa
✅ depois faz outro
Sem pressa.
 */