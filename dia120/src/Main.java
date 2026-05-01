import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        while (opcao != 4){
            System.out.println("---Sistema de Pagamentos---");
            System.out.println("1 - Registrar Pagamento");
            System.out.println("2 - Listar Histórico");
            System.out.println("3 - Total processado no dia");
            System.out.println("4 - Sair");
            System.out.println("Faça sua escolha:");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 1){
                System.out.println("Escolha a forma de pagamento (1-Cartão, 2-PIX):");
                int tipoPagamento = scanner.nextInt();

                System.out.println("Valor: ");
                double valorPagamento = scanner.nextDouble();

                if (tipoPagamento == 1){
                    PagamentoCartao pc = new PagamentoCartao(valorPagamento);
                    pc.valor();
                    pagamentos.add(pc);
                }else {
                    PagamentoPix pp = new PagamentoPix(valorPagamento);
                    pp.valor();
                    pagamentos.add(pp);
                }
                System.out.println("Pagamento efetuado com sucesso!");
            }else if (opcao == 2) {
                for (Pagamento p : pagamentos){
                    p.valor();
                }
            }else if (opcao == 3){
                double total = 0;
                for (Pagamento p : pagamentos){
                    total += p.getValorFinal();
                }
                System.out.println("Total processado hoje R$: " + total);
            }
        }
    }
}
/*
Dia 120 — Mini Sistema Final 3.0 (O Desafio)

Objetivo: Consolidar Herança e Sobrescrita.

Tema: Sistema de Pagamentos.

    Classe Pagamento (valor)

    Subclasse PagamentoCartao (Adiciona 5% de taxa no @Override do valor final)

    Subclasse PagamentoPix (Dá 10% de desconto no @Override do valor final)

Menu:

    Registrar Pagamento (Escolher tipo e valor)

    Listar Histórico (Usando o toString() que você aprendeu no Dia 114)

    Total processado no dia

    Sair
 */