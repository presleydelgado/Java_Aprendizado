public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        boolean achou = acheIsso(array,2);
        System.out.println(achou);
    }
    public static boolean acheIsso(int[] array, int valor){
        for(int numero : array){
            if(numero == valor){
                return true;
            }
        }
        return false;
    }
}


/*
Dia 33 — Buscar valor no array
Objetivo: raciocínio de busca

Método recebe:
array
valor para buscar

Retorna:
true se encontrou
false se não encontrou

main imprime o resultado
Conceito: boolean + controle de fluxo
 */