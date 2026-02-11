import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        for(int a = 0 ; a < 3 ; a++){
            Produto p1 = new Produto("" , 0);

            System.out.println("Nome do produto " + (a + 1) + ": ");
            p1.nome = scanner.nextLine();

            System.out.println("Digite o valor: ");
            p1.preco = scanner.nextDouble();

            carrinho.adicionarProdutos(p1);

            scanner.nextLine();
        }
        carrinho.mostrarCarrinho();
        carrinho.calcularTotal();
    }
}

/*
Dia 60 — Carrinho de Compras
Objetivo: classe que gerencia objetos
Classe Carrinho:
ArrayList de Produto
método adicionarProduto(Produto p)
método mostrarCarrinho()
método calcularTotal()
No main:
criar carrinho
adicionar produtos
mostrar total
Aqui começa mentalidade de sistema.
 */