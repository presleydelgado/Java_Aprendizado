public class Main {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int soma = somaTudo(numeros);
        System.out.println(soma);
    }
    public static int somaTudo(int[] somando){
        int soma = 0; //aqui é curioso porque minha mente já tinha me tido, não esqueça de abrir a variavel para soma,e mesmo assim eu ignorei, aprendendo...
        for(int a : somando){
            soma += a;
        }
        return soma;
    }
}

/*
Dia 39 — Somar todos os números
(versão limpa, sem if)
Método recebe int[]
Soma todos os valores
Retorna a soma
main imprime
Aqui você vai perceber como isso ficou fácil comparado com o dia 32.
 */