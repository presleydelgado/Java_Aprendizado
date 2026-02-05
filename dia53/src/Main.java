public class Main {
    public static void main(String[] args) {
        int[] arrayNum1 = criaArray1();
        imprimeArray(arrayNum1);
        //2 --------
        int[] arrayNum2 = criaArray2();
        int resultado2 = somaValores(arrayNum2);
        System.out.println("");
        System.out.println("Soma do array : " + resultado2);
        //3 ----------
        int[] arrayNum3 = {1,2,3,4,5,6,7,8,9,10};
        int maiorValor = encontraMaior(arrayNum3);
        System.out.println("");
        System.out.println("Maior valor : " + maiorValor);
        //4 --------
        int[] arrayNum4 = {2,5,7,3,8,10};
        int achaPares = encontraPar(arrayNum4);
        System.out.println("");
        System.out.println("Foi achado : "  + achaPares + " numeros pares!");
    }
    public static int[] criaArray1(){
        return new int[]{10,20,30,40,50};
    }
    public static void imprimeArray(int[] array){
        for(int a : array){
            System.out.println(a);
        }
    }
    //2 ------
    public static int[] criaArray2(){
        return new int[]{5,4,3,2,1,};
    }
    public static int somaValores(int[] array2){
        int soma = 0;
        for (int a : array2){
            soma += a;
        }
        return soma;
    }
    //3 ---------
    public static int encontraMaior(int[] array3){
        int maior = array3[0];
        for(int a = 0; a < array3.length; a++){
            maior = Math.max(maior,array3[a]);
        }
        return maior;
    }
    //4---- 53.5
    public static int encontraPar(int[] array4){
        int contaPares = 0;
        for(int a: array4){
            if(a % 2 == 0){
                contaPares++;
            }
        }
        return contaPares;
    }
}

/*
Dia 53 — Arrays (vetores)
Objetivo: praticar listas simples.
Exercícios:
Criar um array com 5 números e mostrar todos.
Somar todos os valores de um array.
Descobrir o maior valor do array.
 */