void main() {
    //numeros();
    //numeros2();
    //numeros3();
    //numeros4();
    numeros5();
}

public static void numeros(){
    for(int i = 1; i <= 5; i++){
        System.out.println(i) ;
    }
}
public static void numeros2(){
    int a = 15;
    for(int i = 1; i <= a; i++){
        System.out.println(i);
    }
}

public static void numeros3(){
    int limite = 20;
    for(int a = 1;a <= limite; a++){
        System.out.print(a);
        System.out.print(" - ");
    }
    System.out.println("Fim");
}

public static void numeros4(){
    int a = 30;
    for(int s = 1; s <= a; s++){
        System.out.print(s + " - ");
    }
    System.out.print("FIM DA CONTAGEM!");
}

public static void numeros5(){
    int a = 8;
    for(int q = 1; q <= a; q++){
        System.out.println(q);
    }
    System.out.println("FIM");
}