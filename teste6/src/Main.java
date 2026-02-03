public class Main {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int somarNumeros = soma(numeros);
        System.out.println(somarNumeros);
        //---------------------------
        int[] arrayNumerico = {5,10,15,20,25,30,35,40,45,50};
        int biggerNumber = maiorNumero(arrayNumerico);
        System.out.println(biggerNumber);
    }
    public static int soma(int[] array) {
        int somando = 0;
        for(int a = 0; a < array.length; a++){
            somando += array[a];
        }
        return somando;
    }
    //-------------
    public static int maiorNumero(int[] pegaMaior){
        int max = pegaMaior[0];
        for(int a = 0; a < pegaMaior.length; a++){
            if(pegaMaior[a] > max){
                max = pegaMaior[a];
            }
        }
        return max;
    }
}

//for complexo = mexer com o array
//for each apenas para retornar o valor do array
