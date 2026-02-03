public class Main {
    public static void main(String[] args) {
        int[] arrayNum = {1,2,3,4,5,6,7,8,9,10};
        boolean buscaResultado = buscaNumero(arrayNum,5);
        System.out.println(buscaResultado);
    }
    public static boolean buscaNumero(int[] array, int buscar){
        for (int a : array){
            if(a == buscar){ // fiz esse código todo sem olhar código antigo,a parte que me pegou foi aqui: if(array.equals(buscar)) = esse era o meu erro...
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