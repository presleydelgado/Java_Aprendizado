package dia31;

public class dia31 {

	public static void main(String[] args) {
		int[] listaDeNumeros = {1,2,3,4,5,6,7,8,9,10};
		int total = contaNumeros(listaDeNumeros);
		System.out.println(total);
	}
	public static int contaNumeros(int[] lista) {
		return lista.length;
	}
}

/*
Dia 31 — Contar elementos
Objetivo: lógica simples + retorno
Método recebe um array
Retorna:

quantidade de elementos (length)
main imprime o resultado
Conceito: método que devolve informação, não imprime
*/