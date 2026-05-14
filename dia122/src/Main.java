import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        boolean entradaValida = false;

        System.out.println("--- Validador de Acesso ---");

        while (!entradaValida){
        System.out.print("Digite sua idade: ");
            try {
                idade = scanner.nextInt();
                if (idade >= 18) {
                    System.out.println("Acesso liberado.");
                } else {
                    System.out.println("Acesso negado.");
                }
                entradaValida = true;
            }catch (InputMismatchException e){
                System.out.println("Algo está errado, por favor digite novamente a idade:");
                scanner.nextLine();
            }
        }
        System.out.println("Fim do programa.");
        scanner.close();
    }
}