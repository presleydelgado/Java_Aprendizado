import java.text.DecimalFormat;
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> itens = new ArrayList<>();

    private DecimalFormat df = new DecimalFormat("0.00");

    private boolean listaVazia(){
        if(itens.isEmpty()){
            System.out.println("Lista vazia!");
            return true;
        }
        return false;
    }

    public void adicionarItem(Item addItem){
        itens.add(addItem);
    }

    public void listarItens(){
        if(listaVazia()) return;
        for (Item a : itens){
            System.out.println("Item: " + a.getNome() + " | Valor R$: " + df.format(a.getPreco()));
        }
        System.out.println("");
    }

    public void calcularTotal(){
        if(listaVazia()) return;
        double total = 0;
        for (Item a : itens){
            total += a.getPreco();
        }
        System.out.println("Total R$: " + df.format(total));
    }
}
