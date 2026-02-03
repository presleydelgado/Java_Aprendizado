public class Main {
    public static void main(String[] args) {
        //1-
        int maiorNumero = retornaMaior(10 , 5);
        System.out.println("O maior número é : " + maiorNumero);
        //2-
        boolean recebeNumero = retornaVerdade(10);
        System.out.println(recebeNumero);
        //3-
        String idade = recebeIdade(25);
        System.out.println(idade);
    }
    public static int retornaMaior(int a , int b){
        if(a > b){
            return a;
        }
        return b;
    }
    public static boolean retornaVerdade(int a){
            return a % 2 == 0;
    }
    public static String recebeIdade(int a){
        if(a >= 18){
            return "Maior de idade" ;
        }
        return "Menor de idade";
    }
}

/*
Dia 51 — Métodos com retorno
Objetivo: entender melhor return.
Exercícios:
Crie um método que receba dois números e retorne o maior.
Crie um método que receba um número e retorne true se for par.
Crie um método que receba a idade de uma pessoa e retorne se ela é maior de idade.
*/