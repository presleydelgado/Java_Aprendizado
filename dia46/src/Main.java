public class Main {
    public static void main(String[] args) {
        int[] arrayNum = {1,2,3,4,5};
        int resultado = somaImpares(arrayNum);
        System.out.println(resultado);
        //============ desafio 46.1 pares
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int total = somarPares(array);
        System.out.println(total);
    }
    public static int somaImpares(int[] array){
        int somar = 0;
        for (int a = 0 ; a < array.length; a++){
            if(array[a] % 2 != 0){
                somar += array[a];
            }
        }
        return somar;
    }
    public static int somarPares(int array2[]){
        int somando = 0;
        for(int i = 0 ; i < array2.length; i++){
            if(array2[i] % 2 == 0){
                somando += array2[i];
            }
        }
        return somando;
    }
}


/*
Dia 46 — Soma apenas dos ímpares
Objetivo: seleção + acumulação
Enunciado:
método recebe int[]
retorna a soma apenas dos números ímpares
Exemplo:
{1,2,3,4,5} → retorna 1+3+5 = 9
Conceito:
% 2 != 0
soma
return
 */