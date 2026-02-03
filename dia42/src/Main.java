import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] objetos = {"Panela","Carro","Toalha","Copo","Geladeira"};
        String[] caixaAlta = maiusculo(objetos);
        System.out.println(Arrays.toString(caixaAlta));
        //----------
        String[] nomes = {"Julia","Alessandra","Carolina"};
        String[] converter = letraGrande(nomes);
        System.out.println(Arrays.toString(converter));
    }
    public static String[] maiusculo(String[] transformar){
        for (int a = 0 ; a < transformar.length; a++){
            transformar[a] = transformar[a].toUpperCase();
        }
        return transformar;
    }
    //vou fazer outra vez tentando não olhar o código antigo...
    public static String[] letraGrande(String[] array){
        for(int a = 0; a < array.length; a++){
            array[a] = array[a].toUpperCase();
        }
        return array;
    }//essa segunda tentativa foi muito mais facil porque eu lembrei como tinha que fazer o for() , e como chamar para toUpperCase
}

/*
Dia 42 — Converter array de String para caixa alta
(reprise consciente do dia 34)
main cria String[]
Método recebe o array
Converte tudo para maiúsculo
Retorna o novo array
main imprime com Arrays.toString()
 */