public class Main {
    public static void main(String[] args) {
        int[] array = {5,10,20,3};
        int maiorQue = limite(array,8);
        System.out.println(maiorQue);

        //-------- meu código do zero
        int[] arrayNumeros = {5,10,20,3};
        int limiteNumerico = depoisDesseNumero(arrayNumeros, 8);
        System.out.println(limiteNumerico);
        //ainda meio dificultoso o final
        //mais uma tentativa =====
        int[] listaNumericaFinal = {1,2,3,4,5,6,7,8,9,10};
        int vamosAcharOsNumerosDepoisDesseAqui = maisUmaTentiva(listaNumericaFinal, 5);
        System.out.println("Manda a braba : " +  vamosAcharOsNumerosDepoisDesseAqui);
    }
    public static int limite(int[] arrayNum, int numLimite){
        int contador = 0;
        for(int a = 0; a < arrayNum.length; a++){
            if(arrayNum[a] > numLimite){ // aqui foi onde mais sofri,tive que procurar na internet,tudo isso por erro de lógica,estava fazendo a > limite, ou contado > limite...
                contador++;
            }
        }
        return contador;
    }
    //------ meu código refeito do zero
    public static int depoisDesseNumero(int[] array, int acheEsseNumero){
        int contaOsNumerosMaioresQue = 0;
        for(int a = 0; a < array.length; a++){
            if(array[a] > acheEsseNumero){
                contaOsNumerosMaioresQue++;
            }
        }
        return contaOsNumerosMaioresQue;
    }
    public static int maisUmaTentiva(int[] lista, int conteComigo){
        int apartirDaqui = 0;
        for(int a = 0; a < lista.length; a++){ // achei o culpado do java.lang.Arrayoutofbounds... usando o for each erroneamente,acho que foi a pressa ou má influencia.
            if(lista[a] > conteComigo){
                apartirDaqui++;
            }
        }
        return apartirDaqui; // deu java.lang.ArrayIndexOutOfBoundsException... obvio que ia dar algo errado mas ok...

    }
}

/*
Dia 45 — Contar números maiores que X
Objetivo: parâmetro extra + lógica condicional
Enunciado:
método recebe:
int[] array
int limite
retorna quantos números são maiores que o limite
Exemplo:
array {5,10,20,3}, limite 8 → retorna 2
Conceito:
dois parâmetros
comparação dinâmica
 */