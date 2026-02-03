void main() {
    //arrayInt();
    arrayString();
}

public static void arrayInt(){
    int[] numeros = {10,20,30,40,50};
    for(int i = 0; i < numeros.length; i++){
        System.out.println(numeros[i]);
    }
}

public static void arrayString(){
    String[] nomes = {"Roberta \uD83E\uDEE5","Ana \uD83E\uDD23","Natalia \uD83D\uDE0D","Juliana \uD83E\uDEE3","Lara \uD83D\uDE1B","Carolina \uD83E\uDD2A","Laura \uD83D\uDE0F"};
    for(int a = 0; a < nomes.length; a++){
        System.out.println(nomes[a]);
    }
}