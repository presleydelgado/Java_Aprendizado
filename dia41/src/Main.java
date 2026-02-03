public class Main {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        boolean achar = achou(numeros , 3);
        System.out.println(achar);
    }
    public static boolean achou(int[] array, int acharIsso){
        for(int valor : array){
            if(valor == acharIsso){
                return true;
            }
        }
        return false;
    }
}

/*
Dia 41 — Verificar se um valor existe no array
(reprise consciente do dia 33)
main cria int[]
Define um número para buscar
Método recebe:
o array
o número buscado
Retorna true se existir, false se não
main imprime o boolean
Sem print dentro do método.
*/