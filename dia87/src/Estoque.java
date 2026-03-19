import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto addProtudo){
        produtos.add(addProtudo);
    }
    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Lista vazia!");
            return;
        }
        for (Produto a : produtos){
            System.out.println("Produto: " + a.getNome()  + " quantidade: " + a.getQuantidade());
        }
        System.out.println("");
    }
    public void produtosEmFalta(){
        if(produtos.isEmpty()){
            System.out.println("Lista vazia!");
            return;
        }
        for (Produto a : produtos){
            if(a.getQuantidade() <= 0){
                System.out.println(a.getNome() + " está em falta : " + a.getQuantidade());
            }
        }
    }
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
