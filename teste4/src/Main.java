public class Main {
    public static void main(String[] args) {
        String[] arrayNomes = {"Pamela","Lara","Luna","Paula"};
        imprimeNomes(arrayNomes);
        System.out.println(contaNomes(arrayNomes));
    }
    public static void imprimeNomes(String[] array){
        for(int a = 0 ; a < array.length; a++){
            System.out.println(array[a]);
        }
    }
    public static int contaNomes(String[] contador){
        return contador.length;
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