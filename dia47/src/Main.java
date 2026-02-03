public class Main {
    public static void main(String[] args) {
        int[] array = {5,8,10};
        int valor = busca(array,3);
        System.out.println(valor);
        //-------- segunda tentativa...
        int[] numeros = {5,8,10};
        int resultado = numeroLocalizacao(numeros,5);
        System.out.println(resultado);
    }
    public static int busca(int[] array, int onde){
        for(int a = 0; a < array.length; a++){
            if(array[a] == onde){
                return a;
            }
        }
        return -1;
    }
    //-------------
    public static int numeroLocalizacao(int[] lista, int acheEsseNumero){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == acheEsseNumero){
                return i;
            }
        }
        return -1;
    }

}

/*
Dia 47 — Encontrar índice de um número
Objetivo: retorno mais inteligente
Enunciado:
método recebe:
int[] array
int valor
retorna:
posição (índice) onde o número aparece
ou -1 se não existir
Exemplo:
array {5,8,10}, buscar 8 → retorna 1
buscar 3 → retorna -1
Conceito MUITO importante:
retorno significativo
controle de fluxo
 */