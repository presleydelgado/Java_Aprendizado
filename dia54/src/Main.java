import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        pegaNumero(array);
        System.out.println(Arrays.toString(array));
        apenasPares(array);
        System.out.println("");
        System.out.println("Média : " + calculaMedia(array));
    }
    public static void pegaNumero(int[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha 5 números e digite eles : ");
        for(int a = 0; a < array.length; a++){
            array[a] = scanner.nextInt();
            System.out.println("...");
        }
        scanner.close();
    }
    public static void apenasPares(int[] array2){
        System.out.println("Números pares dessa array : ");
        for (int a = 0 ; a < array2.length; a ++){
            if(array2[a] % 2 == 0){
                System.out.print(array2[a]);
                System.out.print(" ");
            }
        }
    }
    public static double calculaMedia(int[] array){
        int soma = 0;
        for(int a = 0; a < array.length; a++){
            soma += array[a];
        }
        return soma / array.length;
    }
}

/*
Dia 54 — Array com entrada do usuário
Objetivo: popular arrays.
Exercícios:
Pedir 5 números ao usuário e guardar em um array.
Mostrar apenas os números pares do array.
Calcular a média dos valores digitados.
 */