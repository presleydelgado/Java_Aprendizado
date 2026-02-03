public class Main {
    public static void main(String[] args) {
        int[] arrayNum = {1,2,3,4,5,6,7,8,9,10};
        int par = pares(arrayNum);
        System.out.println(par);
    }
    public static int pares(int[] array){
        int contador = 0;
        for(int a = 0; a < array.length; a++){
            if(array[a] % 2 == 0){
                contador ++;
            }
        }
        return contador ;
    }
}

/*
Dia 44 — Contar números pares
Objetivo: filtro + contador
Enunciado:
método recebe int[]
retorna quantos números são pares no array
main imprime o resultado
Exemplo mental:
{1,2,3,4,6} → retorna 3
Conceito treinado:
for
if
contador
return
 */