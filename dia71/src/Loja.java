import java.util.ArrayList;

public class Loja {
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public void adicionarProduto(Produto addProduto){
        listaDeProdutos.add(addProduto);
    }
    public void listarProdutos(){
        if(listaDeProdutos.isEmpty()){
            System.out.println("---Lista de produtos vazia---");
            return;
        }
        for(Produto a : listaDeProdutos){
            System.out.println("Produto: " + a.nome + " R$ " + a.preco);
        }
    }
    public void produtoMaisCaro(){
        if(listaDeProdutos.isEmpty()){
            System.out.println("---A lista já está vazia,impossível achar o produto mais caro---");
            return;
        }
        Produto maisCaro = listaDeProdutos.get(0);
        for (Produto a : listaDeProdutos){
            if(a.preco >= maisCaro.preco){
                maisCaro = a;
            }
        }
        System.out.println("Produto mais caro da lista: " + maisCaro.nome + " R$ " + maisCaro.preco);
    }
    public void calcularTotal(){
        if(listaDeProdutos.isEmpty()){
            System.out.println("---Lista vazia,impossível calcular o total---");
            return;
        }
        double total = 0;
        for (Produto a : listaDeProdutos){
            total += a.preco;
        }
        System.out.println("Total - R$ " + total);
    }

}