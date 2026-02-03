public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Pamela","Juliana","Natalia","Debora","Carolina"};
        imprimeNomes(nomes);
        int resultado = contaNomes(nomes);
        System.out.println(resultado);

    }
    public static String imprimeNomes(String[] array){
        System.out.println("----- Lista de nomes -----");
        for(String a : array){
            System.out.println(a);
        }
        return "";
    }
    public static int contaNomes(String[] nomes){
        System.out.println("--- Total de nomes ---");
        for(String i : nomes){
        }
        return nomes.length;
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