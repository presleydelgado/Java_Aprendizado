public class Main {
    public static void main(String[] args) {
        int[] arrayNumerico = {5,10,15,20,25,30,35,40,45,50};
        //o que fazemos agora ?
        //soma apenas numeros pares:
        int soma = somaPares(arrayNumerico);
        //e agora ?
        //imprime a soma:
        System.out.println(soma);
    }
    //agora faz os metodos:
    public static int somaPares(int[] array){
        //não esqueça de iniciar a variavel de soma...
        int somar = 0;
        for(int a : array){
            if(a %2 == 0){
                somar += a;
            }
        }
        //agora retorna:
        return somar;
    }
}


/*
Dia 32 — Soma com condição
Objetivo: lógica um pouco mais refinada
Método recebe array de números

Soma apenas os números pares
Retorna a soma
main imprime
Conceito: processamento interno
*/