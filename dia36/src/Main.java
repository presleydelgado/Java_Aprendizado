public class Main {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int resultado = quantidadeNum(numeros);
        System.out.print("Tamanho do array: ");
        System.out.println(resultado);
    }
    public static int quantidadeNum(int[] valor){
        for(int a : valor){
            System.out.println(a);
        }
        return valor.length;
    }
}

/*
Dia 36 — Repetição consciente
Objetivo: fixação (importantíssimo)
Escolher UM exercício da semana
Refazer do zero
Sem olhar código antigo
Sem pressa
Conceito: aprendizado real acontece aqui
*/

/*
exercicio escolhido :

Dia 31 — Contar elementos
Objetivo: lógica simples + retorno
Método recebe um array
Retorna:
quantidade de elementos (length)
main imprime o resultado
Conceito: método que devolve informação, não imprime
*/