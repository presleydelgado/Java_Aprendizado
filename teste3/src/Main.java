import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //dia35 teste aprendizado
        String[] nomes = {"Bom","Dia","Boa","Noite"};
        String imprimeNome = Arrays.toString(imprimir(nomes));
        int contaNomes = contar(nomes);
        System.out.println(contaNomes);
    }
    public static String[] imprimir(String[] array){
        for(int a = 0; a < array.length; a++){
            System.out.println(array[a]);
        }
        return array;
    }
    public static int contar(String[] arrayNum){
        return arrayNum.length;
    }
}


/*
Dia 35 — Pequeno programa funcional
Objetivo: juntar tudo de forma real
Criar um array de nomes
Criar métodos:
imprimir nomes
contar nomes
main organiza tudo
Conceito: mini-programa coeso
 */