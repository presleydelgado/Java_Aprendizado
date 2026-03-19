public class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome,int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public String getNome(){return nome;}
    public int getQuantidade(){return quantidade;}
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