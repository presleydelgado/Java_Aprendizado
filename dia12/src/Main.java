void main() {
    int[] numeros = {1,2,3,4,5,6,7,8,9,10} ;
    array(numeros);
    array2(numeros);
}
public static void array(int[] numeros){
    for(int a = 0; a < numeros.length; a++){
        System.out.println(numeros[a]);
    }
}

public static void array2(int[] numeros){
    for(int b = 0; b < numeros.length; b++){
        System.out.print(numeros[b]);
    }
    System.out.println(" Fim");
}