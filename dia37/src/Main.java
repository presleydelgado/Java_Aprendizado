import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        int[] arrayNum = {5,15,25,50,100};
        int maiorNumero = pegaMaior(arrayNum);
        System.out.println(maiorNumero);
    }
    public static int pegaMaior(int[] maior){
        int maioral = maior[0];
        for(int a = 1; a < maior.length; a++){
            if(maior[a] > maioral){
                maioral = maior[a];
            }
        }
        return maioral;
    }
}

/*
Dia 37 — Retornar o maior número
Objetivo: lógica + retorno
main cria um int[]
Método recebe o array
Percorre o array

Retorna o maior número
main imprime o resultado
Conceito:
método que calcula algo real.
*/