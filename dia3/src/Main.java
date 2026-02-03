void main() {
    //repeticaoFOR();
    //repeticaoWHILE();
    //repeticao10for();
    //repeticao10while();
    //repeticaoFORinf();
    repeticaoWHILEinf();
}

public static void repeticaoFOR(){
    for (int x = 1; x <= 5; x++) {
        System.out.println("Números de 1 a 5 usando for(): " + x);
    }
}

public static void repeticaoWHILE(){
    int x = 1;
    while (x <= 5){
        System.out.println("Repetição de 1 a 5 usando while(): " + x++);
    }
}

public static void repeticao10for(){
    for(int x = 1; x <= 10; x++){
        System.out.println("Repetição for() até o 10: " + x);
    }
}

public static void repeticao10while(){
    int x = 1;
    while(x <= 10){
        System.out.println("Repetição while() até o 10: " + x++);
    }
}

public static void repeticaoFORinf(){
    for(int x = 1; x <= 50; x++){
        System.out.println(x);
    }
}

public static void repeticaoWHILEinf(){
    int x = 1;
    while(x <= 50){
        System.out.println("while " + x++);
    }
}