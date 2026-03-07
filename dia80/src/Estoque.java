import java.util.ArrayList;

public class Estoque {
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public void adicionarProduto(Produto addProduto){
        listaDeProdutos.add(addProduto);
    }
    public void listarProdutos(){
        if(listaDeProdutos.isEmpty()){
            System.out.println("Lista de produtos vazia !");
            return;
        }

        for(Produto a : listaDeProdutos){
            System.out.println(a.getQuantidade() + " - " + a.getNome() + " - R$: " + a.getPreco());
        }
    }
    public void calcularValorTotalEstoque(){
        if(listaDeProdutos.isEmpty()){
            System.out.println("Lista de produtos vazia !");
            return;
        }

        double soma = 0;
        for(Produto a : listaDeProdutos){
            soma += a.getQuantidade() * a.getPreco();
        }
        System.out.println("Total = R$ " + soma);
    }
}