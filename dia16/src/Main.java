void main() {

    /*🔹 Dia 2 — Array + condição simples
    Objetivo: lógica sem pressão
    Array de números
    Imprimir apenas os pares ou maiores que um valor fixo
    Valor fixo no código, nada de input.
     */
    array1();
}
public static void array1(){
    int[] num1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    for (int a = 1; a <= num1.length; a++){
        if(a % 2 == 0){
            System.out.println("Par = " + a);
        }else {
            System.out.println("Impar = " + a);
        }
    }
}