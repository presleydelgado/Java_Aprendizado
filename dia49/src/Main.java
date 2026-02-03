import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arrayNomes = {"BruNA","PAmELa","NaTALIa"};
        String[] resultado = minusculo(arrayNomes); // o que mais me pegou nesse exercicio foi os [] , esqueci que era retorno de uma array,e faltava os [] aqui
        System.out.println(Arrays.toString(resultado));
    }
    public static String[] minusculo(String[] array){ // faltou os [] aqui no public static String "[]" também
        for(int a = 0; a < array.length; a++){
            array[a] = array[a].toLowerCase();
        }
        return array;
    }
}

/*
Dia 49 — Converter array para caixa baixa
Objetivo: consolidar transformação em String[]
Enunciado:
método recebe String[]
devolve novo array com tudo em minúsculo
Usar:
.toLowerCase()
Conceito:
manipulação de string
laço
retorno de array
 */