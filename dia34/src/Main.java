import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] arrayString = {"Pacoca Torta Pizza Bolo"};
        String[] resultado = converterParaCaixaAlta(arrayString);
        System.out.println("Convertido para caixa alta : " + Arrays.toString(arrayString));
    } public static String[] converterParaCaixaAlta(String[] novoArray){
        for(int a = 0; a < novoArray.length; a++){
            novoArray[a] = novoArray[a].toUpperCase();
        }return novoArray;
    }
}

/*
Dia 34 — Método que transforma dados
Objetivo: transformação sem imprimir

Método recebe array de String
Retorna:

novo array com todos os textos em caixa alta

main imprime o array retornado

Conceito: entrada → processamento → saída
 */