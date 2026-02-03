void main() {
    //arrayInput();
    arrayNomes();
}
public static void arrayInput(){
    int[] numeros = new int[5];

    Scanner input = new Scanner(System.in);
    System.out.println("Digite 5 numeros: ");
    for(int a = 0; a < numeros.length; a++) {
        numeros[a] = input.nextInt();
        System.out.println("Numeros digitados: " + numeros[a]);
    }
}

public static void arrayNomes(){
    String[] nomes = new String[5];

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite 5 nomes : ");
    for(int a = 0; a < nomes.length;a++){
        nomes[a] = sc.nextLine();
        System.out.println("Nomes digitados : " + nomes[a]);
    }
}