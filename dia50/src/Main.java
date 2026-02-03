public class Main {
    public static void main(String[] args) {
        int[] array = {5,8,10};
        int valor = acharValor(array,8);
        System.out.println(valor);
    }
    public static int acharValor(int[] array,int procuraValor){
        for(int a = 0; a < array.length; a++){
            if(array[a] == procuraValor){
                return a;
            }
        }
        return -1;
    }
}

/*
Dia 50 — Repetição consciente (importantíssimo)
Escolher UM exercício dos dias 44–49 e:
refazer do zero
sem olhar código antigo
sem pressa
focar em:
assinatura
parâmetros
retorno
lógica
Esse dia é onde o aprendizado fixa de verdade.
 */

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