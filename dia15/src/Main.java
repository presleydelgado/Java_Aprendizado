void main() {
    array1();
    array2();
    array3();
    cor();
    emojis1();
    emojis2();
}

public static void array1(){
    int[] numeros = {1,2,3,4,5,6,7,8,9,10};
    for(int a = 0; a < numeros.length; a++){
        System.out.print(numeros[a] + "-");
    }
    System.out.println("F I M");
}

public static void array2(){
    int[] numeros2 = {11,12,13,14,15,16,17,18,19,20};
    for(int a = 0; a < numeros2.length; a++){
        System.out.print(numeros2[a] + "-");
    }
    System.out.println("F I M");
}

public static void array3(){
    String[] nomes = {"Laura","Júlia","Manuela","Luna","Catarina"};
    for(int a = 0; a < nomes.length; a++){
        System.out.print(nomes[a] + " - ");
    }
    System.out.println("F I M");
}

public static void cor(){
    String[] cores = {"Preto","Branco","Laranja Claro","Vermelho Escuro","Laranja","Verde","Verde Escuro"};
    for(int a = 0; a < cores.length; a++){
        System.out.print(cores[a] + " - ");
    }
    System.out.println(" F I M ");
}

public static void emojis1(){
    String[] emoji = {"😀","😃","😄","😁","😆","😅","🤣","😂","🙂","🙃"};
    for(int a = 0; a < emoji.length; a++){
        System.out.print(emoji[a] + " - ");
    }
    System.out.println(" F I M ");
}

public static void emojis2(){
    String[] emoji = {"🧡","💛","💚","💙","🩵","💜","🤎","🖤","🩶","🤍"};
    for(int a = 0; a < emoji.length; a++){
        System.out.print(emoji[a] + " - ");
    }
    System.out.println(" F I M ");
}