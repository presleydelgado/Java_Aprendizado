public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,-2,3};
        boolean resultado = valor(array1);
        System.out.println(resultado);
    }
    public static boolean valor(int[] array){
        int verificador = 0;
        for(int a = 0 ; a < array.length; a ++){
            if(array[a] <= verificador){
                return false;
            }
        }
        return true;
    }
}

/*
Dia 48 — Verificar se todos são positivos
Objetivo: boolean mais avançado
Enunciado:
método recebe int[]
retorna:
true se TODOS forem positivos
false se algum for zero ou negativo
Exemplo:
{1,5,10} → true
{1,-2,3} → false
Conceito:
validação
retorno antecipado
 */