import java.text.DecimalFormat;
import java.util.ArrayList;

public class Mercado {
    private ArrayList<Item> itensNoCarrinho = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("0.00");

    public void adicionarProduto(Item addItem){
        itensNoCarrinho.add(addItem);
    }
    public boolean listaVazia(){
        if (itensNoCarrinho.isEmpty()){
            System.out.println("lista vazia! Por favor insira algum produto a lista");
            return true;
        }
        return false;
    }
    public void listarItens(){
        if(listaVazia())return;
        for (Item a : itensNoCarrinho){
            System.out.println("Produto: " + a.getProduto() + " | Preço R$: " + df.format(a.getPreco()));
        }
    }
    public void calcularTotal(){
        if(listaVazia())return;
        double soma = 0;
        for (Item a : itensNoCarrinho){
            soma += a.getPreco();
        }
        System.out.println("Total R$: " + df.format(soma));
    }
}
