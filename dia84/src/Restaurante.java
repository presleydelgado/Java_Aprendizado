import java.util.ArrayList;

public class Restaurante {
    ArrayList<Pedido> pedidos = new ArrayList<>();

    public void adiionarPedido(Pedido addPedido){
        pedidos.add(addPedido);
    }
    public void listarPedidos(){
        if(pedidos.isEmpty()){
            System.out.println("Lista vazia !");
            return;
        }
        for(Pedido p : pedidos){
            System.out.println("Pedido: " + p.getNomeCliente() + " R$: " + p.getValor());
        }
    }
    public void calcularFaturamento(){
        if(pedidos.isEmpty()){
            System.out.println("Lista vazia !");
            return;
        }
        double total = 0;
        for (Pedido p : pedidos){
            total += p.getValor();

        }
        System.out.println("Total : R$ " + total);
    }
}