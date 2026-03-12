void main() {
    Restaurante restaurante = new Restaurante();
    restaurante.adiionarPedido(new Pedido("X-Burguer",12.50));
    restaurante.adiionarPedido(new Pedido("Coca-cola 600ml",6.70));
    restaurante.listarPedidos();
    restaurante.calcularFaturamento();
}

/*
Dia 84 — Sistema de Pedidos
Classes

Pedido
nomeCliente
valor

Restaurante
ArrayList<Pedido> pedidos

Métodos
adicionarPedido()
listarPedidos()
calcularFaturamento()

Regra
Valor mínimo > 0
 */