public class Main {
    public static void main(String[] args) {
        String[] objetos = {"Panela","Copo","Faca","Garfo","Mesa","Carro"};
        int quantidade = retornaQuantidade(objetos);
        System.out.println(quantidade);
    }
    public static int retornaQuantidade(String[] resultado){
        return resultado.length;
    }
}


/*
Crie um método que:

receba String[]

retorne a quantidade de elementos

o main imprime
 */