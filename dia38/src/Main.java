public class Main {
    public static void main(String[] args) {
        int[] arrayNumeros = {1,2,3,4,5,10,20,50};
        int menor = pegaMenor(arrayNumeros);
        System.out.println("O menor número do array é : " + menor);
    }
    public static int pegaMenor(int[] menorNumero){
        int menorNum = menorNumero[0];
        for(int a : menorNumero){
            if(a < menorNum){
                menorNum = a;
            }
        }
        return menorNum;
    }
}

/*
Dia 38 — Retornar o menor número
Mesmo formato do dia 37, só muda a lógica:

Retornar o menor número do array
main cria um int[]
Método recebe o array
Percorre o array
Retorna o maior número
main imprime o resultado
 */