import java.util.ArrayList;

public class Carrinho {
    ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void adicionarProdutos(Produto p){
        listaProdutos.add(p);
    }
    public void mostrarCarrinho(){
        for(Produto p : listaProdutos){
            System.out.println("Produto: " + p.nome + " Preço: " + p.preco);
        }
    }
    public void calcularTotal(){
        double total = 0;
        for(int a = 0; a < listaProdutos.size(); a++){
            total += listaProdutos.get(a).preco;
        }
        System.out.println("Valor Total R$: " + total);
    }
}