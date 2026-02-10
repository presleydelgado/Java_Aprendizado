import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        for(int a = 0; a < 3; a++){
            Produto p1 = new Produto();
            System.out.println("Digite o nome do produto: ");
            p1.nome = leitor.nextLine();

            System.out.println("Digite o preço do produto: ");
            p1.preco = leitor.nextDouble();

            leitor.nextLine();

            listaProdutos.add(p1);
            System.out.println("---");
        }
        System.out.println("---Lista final de Produtos---");
        for (Produto p1 : listaProdutos){
            p1.mostrarProduto();
        }
        /*
        System.out.println("Digite o valor do produto: ");
        p1.preco = scanner.nextDouble();
        lista.add(p1.toString());
        */



        /*
        for(int a = 0; a < listaProduto1.size(); a++){ // ignore, to apenas testando com 1 produto ainda
            listaProduto1.add(inputUsuario);
        }
         */
        //System.out.println(p1.nome);
        //System.out.println(p1.preco);
    }
}

/*
Dia 59 — Classe Produto
Objetivo: objeto representando algo real
Crie classe Produto:
Atributos:
nome
preco
Método:
mostrarProduto()
No main:
criar 3 produtos
guardar em ArrayList
mostrar todos
Você começa a ver objetos como “coisas”.
*/