void main() {
    Loja l = new Loja();

    l.adicionaProdutoNaLista(new Produto("Desengordurante",4.69));
    l.adicionaProdutoNaLista(new Produto("Papel Higienico",22.89));
    l.adicionaProdutoNaLista(new Produto("Esponja",1.87));
    l.adicionaProdutoNaLista(new Produto("Shampoo",7.29));
    l.adicionaProdutoNaLista(new Produto("Qboa",10.59));

    l.listaItens();

    l.mediaTotalValores();
}

/*
Dia 77 — Estatísticas simples
Escolha um sistema e implemente:
quantos itens acima da média
quantos abaixo da média
Esse dia fortalece muito a lógica.
 */