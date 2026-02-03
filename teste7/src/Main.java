public class Main {
    public static void main(String[] args) {
        boolean parOuImpar = retornando(7);
        System.out.println(parOuImpar);
    }
    public static boolean retornando(int a){
        if(a % 2 == 0){
            return true;
        }
        return false;
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
