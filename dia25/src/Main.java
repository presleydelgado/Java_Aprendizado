void main() {
    arrayInt();
}
public static void arrayInt(){
    int[] numeros = {1,2,3,4,5,6,7,8,9,10};
    int soma = 0;
    for(int a = 0; a < numeros.length; a++){
        soma += numeros[a];
    }
    System.out.println("Soma: " + soma);
}

/*
Dia 25 — Array + return
Exercício:
Método recebe um array de int
Retorna a soma de todos os elementos
main imprime o resultado
Sem média, sem condição extra.
 */