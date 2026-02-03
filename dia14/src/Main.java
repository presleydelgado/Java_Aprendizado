public class Main {
    public static void main(String[] args) {
        int[] numeros = {2,4,6,8,10};
        String[] nomes = {"Ana","Pamela","Lara","Natalia","Paula"};
        Double[] doubles = {12.4,15.5,26.0,36.0};

        mostraNumeros(numeros);
        mostraNomes(nomes);
        mostraDoubles(doubles);
    }
    public static void mostraNumeros(int[] numeros){
        for(int a = 0; a < numeros.length; a++){
            System.out.println("Números: " + numeros[a]);
        }
        System.out.println(" ");
    }
    public static void mostraNomes(String[] nomes){
        for(int a = 0; a < nomes.length; a++) {
            System.out.println("Nomes: " + nomes[a]);
        }
        System.out.println(" ");
    }
    public static void mostraDoubles(Double[] doubles){
        for(int a = 0; a < doubles.length; a++) {
            System.out.println("Doubles: " + doubles[a]);
        }
    }
}