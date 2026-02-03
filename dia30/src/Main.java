void main() {
    String[] listaDeNomes = arrayDeNomes();
    imprimeArray(listaDeNomes);

    int[] listaDosNumeros = listaDeNumeros();
    imprimeNumeros(listaDosNumeros);
}

public static String[] arrayDeNomes(){
    String[] nomes = {"Natalia","Ana","Luana","Pamela"};
    return nomes;
}
public static void imprimeArray(String[] imprimeIsso){
    for(String nomes : imprimeIsso){
        System.out.println("Nomes: " + nomes);
    }
}

//tentativa 3

public static int[] listaDeNumeros(){
    int[] numeros = {10,20,30,40,50};
    return numeros;
}
public static void imprimeNumeros(int[] imprimaEssesNumeros){
    for(int a : imprimaEssesNumeros){
        System.out.println("Numeros: " + a);
    }
}



/*
Dia 30 — Método que retorna array (String)
Objetivo: reforçar retorno de array

Criar um método que retorna um array de nomes
main recebe esse array

main chama outro método para imprimir
Conceito: dados não nascem no main
 */