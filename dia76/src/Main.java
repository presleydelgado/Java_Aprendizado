void main() {
    Loja lista = new Loja();

    lista.adicionaProduto(new Produto("Sabão",6.87));
    lista.adicionaProduto(new Produto("Vassoura",15.79));
    lista.adicionaProduto(new Produto("Detergente",2.45));

    lista.mostraListaDeProdutos();

    lista.buscaPorNome("vassoura");
}

/*
Dia 76 — Remoção com confirmação
No sistema de alunos ou produtos:
buscar por nome
se encontrar:
mostrar dados
perguntar: "Deseja remover? (s/n)"
Aqui você treina fluxo de decisão.
 */