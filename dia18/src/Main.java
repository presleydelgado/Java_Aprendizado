void main() {
    mostraNumero(15);
    mostraNumero(30);
    mostraNumero(500-20);
    mostraNome("Natalia");
    mostraNome("Lara");
    mostraNome("Carolina");
    mostraIdade(27);
}

public static void mostraNumero(int numero){
    System.out.println("O número é = " + numero);
}
public static void mostraNome(String nome){
    System.out.println("O nome a ser mostrado é : " + nome);
}
public static void mostraIdade(int idade){
    System.out.println("Idade: " + idade);
}

/*
Dia 18 — Método com parâmetro
Objetivo: reforçar entendimento do ()
Método recebe um número
Usa esse número dentro do método
Chamada clara no main
Nada de retorno.
 */