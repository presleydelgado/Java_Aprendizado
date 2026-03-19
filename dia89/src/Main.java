void main() {
    Carrinho carrinho = new Carrinho();

    carrinho.adicionarItem(new Item("Notebook",3500));
    carrinho.adicionarItem(new Item("Mouse",80));

    carrinho.listarItens();
    carrinho.calcularTotal();
}

/*
Dia 89 — Sistema de Carrinho de Compras 🛒
Classes

Item

nome
preco

Carrinho

ArrayList<Item> itens
Métodos
adicionarItem()
listarItens()
calcularTotal()
Saída esperada
Notebook - 3500
Mouse - 80
Total: 3580
 */