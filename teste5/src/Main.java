public class Main {
    public static void main(String[] args) {
        String[] nomes = {"aba","bea","cea","dea"};
        imprimirNomes(nomes);
        int contar = resultado(nomes);
        System.out.println(contar);
    }
    public static void imprimirNomes(String[] array){
        for (String a : array){
            System.out.println(a);
        }
    }
    public static int resultado(String[] array2){
        return array2.length;
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