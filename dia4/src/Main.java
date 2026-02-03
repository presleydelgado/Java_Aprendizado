void main() {
    //soma();
    //somaWhile();
    //somaSemDuvida();
    teste();
}

public static void soma(){
    for(int a = 1; a <= 10; a++){
        int soma = 0;
        System.out.println(soma + a);
    }
}

public static void somaWhile(){
    int a = 1;
    int soma = 0;
    while(a <= 10){
        System.out.println(soma + a++);
    }
}

public static void somaSemDuvida(){
    int soma = 5;
    for(int x = 1; x <= 10; x++){
        System.out.println(soma += x);
    }
}

public static void teste(){
    int j = 0;
    while (j < 85){
        j += 15;
        System.out.println(j);
    }
}