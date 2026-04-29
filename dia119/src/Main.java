import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        ArrayList<Conta> contas = new ArrayList<>();

        while (opcao != 3){
            System.out.println("---Formatador de Preços---");
            System.out.println("1 - Adicionar saldo");
            System.out.println("2 - Exibir formatado");
            System.out.println("3 - Sair");
            System.out.println("Faça sua escolha:");

            opcao = scanner.nextInt();
            scanner.nextLine();
            if(opcao == 1){
                System.out.println("Escolha o tipo (1-Brasil, 2-EUA):");
                int tipo = scanner.nextInt();

                System.out.println("Valor: ");
                double valorDigitado = scanner.nextDouble();

                if (tipo == 1){
                    ContaBrasil cb = new ContaBrasil(valorDigitado);
                    cb.saldo();
                    contas.add(cb);
                }else {
                    ContaEUA ce = new ContaEUA(valorDigitado);
                    ce.saldo();
                    contas.add(ce);
                }
                System.out.println("Saldo adicionado!");
            }else if (opcao == 2) {
                for (Conta c : contas){
                    c.saldo();
                }
            }else {
                System.out.println("Saindo...");
            }
        }
    }
}
/*
Dia 119 — Formatador de Preços (Moedas)

Conceito: Sobrescrever um método para mudar a estética do dado.

Classe: Conta (saldo)
Subclasses: ContaBrasil, ContaEUA

Menu:

    Adicionar saldo

    Exibir formatado

    Sair

Novidade:

    O método exibir() na ContaBrasil usa @Override para colocar R$. Na ContaEUA, usa $.
 */