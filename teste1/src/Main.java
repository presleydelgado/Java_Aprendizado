public class Main {
    public static void main(String[] args) {
        String[] listaDeNomes = arrayDeNomes(); // esse chama o primeiro bloco
        imprimirArray(listaDeNomes); // esse chama o segundo bloco
        //--------------------------------------------

        //primeiro chama o bloco do array,cria um int[] alguma coisa e chama...
        int[] vemLista = numerosLista();
        //agora o bloco que imprime:
        printLista(vemLista);

    }
    public static String[] arrayDeNomes(){
        String[] nomes = {"Pamela","Juliana","Natalia"};
        return nomes;
    }
    public static void imprimirArray(String[] imprimaIsso){
        for(String nome : imprimaIsso){
            System.out.println(nome);
        }
    }
    //vamos ver se eu entendi isso...
    //primeiro o bloco que leva o array
    public static int[] numerosLista(){
        int[] numLista = {1,2,3,4,5,6,7,8,9,10};
        return numLista;
    }
    //agora o bloco que vai imprimir a lista
    public static void printLista(int[] listaPrint){
        for(int lista : listaPrint){
            System.out.println(lista);
        }
    }
}