void main() {
    int[] numeros = {1,2,3,4,5,6,7,8,9,10};
    int resultado = somaArray(numeros);
    System.out.println(resultado);
}
public static int somaArray(int[] numeros){
    int soma = 0;
    for(int a = 0; a < numeros.length; a++){
        soma += numeros[a];
    }
    return soma;
}

//temos que aprender isso corretamente!

/*
Dia 28 — Integração leve
Exercício:
Crie:
um array de números
um método que soma
um método que imprime o resultado
Separação clara de responsabilidades.
 */