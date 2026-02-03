void main() {
    int[] numeros = arrayNumeros();
    int resultado = somaArray(numeros);
    System.out.println(resultado);
}

public static int[] arrayNumeros(){
    int[] numeros = {1,2,3,4,5,6,7,8,9,10};
    return numeros;
}

public static int somaArray(int[] array){
    int soma = 0;
    for(int a = 0; a < array.length; a++){
        soma += array[a];
    }
    return soma;
}

