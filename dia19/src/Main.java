void main() {
    int[] numeros = {1,2,3,4,5,6,7,8,9,10};
    int[] numerosPrimos = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
    String[] nomesFemininos = {"Juliana","Ana","Carolina","Laura","Pamela","Natalia","Lara","Catarina"};
    String[] objetosVariados = {"Colher","Sapato","Balde","Microondas","Martelo","Serrote","Carro","Casa","Armario","Pá"};

    recebeArray(numeros);
    recebeNumPrimos(numerosPrimos);
    recebeNomes(nomesFemininos);
    recebeObjetos(objetosVariados);
}
public static void recebeArray(int[] numeros){
    for(int a = 0; a < numeros.length;a++){
        System.out.print(numeros[a]);
        System.out.print(" - ");
    }
    System.out.println(" ");
}

public static void recebeNumPrimos(int[] numerosPrimos){
    for(int a = 0; a < numerosPrimos.length; a++){
        System.out.print(numerosPrimos[a]);
        System.out.print(" , ");
    }
    System.out.println(" ");
}
public static void recebeNomes(String[] nomesFemininos){
    for(int a = 0; a < nomesFemininos.length; a++){
        System.out.print(nomesFemininos[a]);
        System.out.print(" , ");
    }
    System.out.println(" ");
}
public static void recebeObjetos(String[] objetosVariados){
    for(int a = 0; a < objetosVariados.length; a++){
        System.out.print(objetosVariados[a]);
        System.out.print(" - ");
    }
    System.out.println(" ");
    System.out.println("F I M");
}
/*
Dia 19 — Array + método
Objetivo: integração leve
Método recebe um array
Método imprime os valores
main cria e passa o array
 */