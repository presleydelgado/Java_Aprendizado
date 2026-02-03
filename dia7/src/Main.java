void main() {
    arrayCarros();
    arrayNomes();
    arrayNumeros();
    arrayTeste();
}


public static void arrayTeste(){
    String aaa[] = {"Olá Mundo !"};
    for(int a = 0; a < aaa.length;a++) System.out.println(aaa[a]);
}

public static void arrayCarros(){
    String carros[] = {"Bentley","Ford","GM"};
    for(int a = 0;a < carros.length; a++){
        System.out.println(carros[a]);
    }
}
public static void arrayNomes(){
    String nomes[] = {"Juliana,Natalia,Lara"};
    for(int a = 0; a < nomes.length; a++){
        System.out.println(nomes[a]);
    }
}
public static void arrayNumeros(){
    int numeros[] = {7,9,10};
    for(int a = 0; a < numeros.length; a++){
        System.out.println(numeros[a]);
    }
}