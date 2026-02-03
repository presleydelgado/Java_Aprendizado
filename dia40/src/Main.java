public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Mesa","Pano","Copo","Prato","Panela"};
        int conta = contaNomes(nomes,2);
        System.out.println(conta);
    }
    public static int contaNomes(String[] totalNomes, int limite){
        if(totalNomes.length > limite){
            return 0;
        }else {
            return totalNomes.length;
        }
    }
}

/*
Dia 40 — Contar nomes com mais de 5 letras
Objetivo: condição + contador
main cria String[] nomes
Método recebe o array
Conta quantos nomes têm length > 5
Retorna esse número
main imprime
 */