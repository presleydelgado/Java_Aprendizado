import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para descobrir o seu dobro: ");
        double inputUsuario = scanner.nextDouble();
        double resultado = dobro(inputUsuario);
        System.out.println(resultado);
        //2 -
        System.out.println("Digite um nome : ");
        String inputNome = scanner.next();
        scanner.nextLine();
        recebeNome(inputNome);
        //3 -
        System.out.println("Digite 2 números para saber a média entre eles : ");
        double numMedia1 = scanner.nextDouble();
        double numMedia2 = scanner.nextDouble();
        double resultadoMedia = media(numMedia1,numMedia2);
        System.out.println(resultadoMedia);
        scanner.close();
    }
    public static double dobro(double a){
        return a * 2;
    }
    public static void recebeNome(String nome){
        System.out.println("Olá " + nome + "!");
    }
    public static double media(double a , double b){
        return (a + b) / 2;
    }
}

/*
Dia 52 — Métodos + Scanner
Objetivo: usar entrada do usuário com métodos.
Exercícios:
Método que recebe um número digitado pelo usuário e retorna o dobro.
Método que recebe um nome e imprime:
Olá, [nome]!
Método que recebe dois números e mostra a média.
 */