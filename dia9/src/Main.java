void main() {
/*🔹 Dia 9 — Array + condição

Objetivo: pensar sem complicar

Use um array de números

Imprima apenas os maiores que X (ex: > 10)

Pode ser fixo, não precisa pedir X ao usuário.
*/
    //arrayNumerico();
    //arrayNumerico2();
    arrayNumero3();
}
public static void arrayNumerico(){
    int x = 5;
    int[] numeros = {5,8,10,12,15,20,50,100,3425,5555};
    for(int a = 0; a < numeros.length; a++){
        if(numeros[a] > x){
            System.out.println(numeros[a]);
        }
    }
}

public static void arrayNumerico2(){
    int b = 15;
    int[] numeros = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    for(int i = 0; i < numeros.length; i++){
        if(numeros[i] > b){
            System.out.println("Numeros maiores do que " + b + " = " + numeros[i]);
        }
    }
}

public static void arrayNumero3(){
    int numLimite = 100;
    int[] numeros = {10,20,30,40,600,50,340,40,1010,11,214,5353,2,1,0};
    for(int a = 0; a < numeros.length; a++){
        if(numeros[a] > numLimite){
            System.out.println("Esses números são maiores do que o número : " + numLimite + " = " + numeros[a]);
        }
    }
}