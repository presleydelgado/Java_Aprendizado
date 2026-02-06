import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = lerNomes();
        mostrarNomes(nomes);
        mostrarQuantidade(nomes);

    }
    public static ArrayList<String> lerNomes(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        for (int a = 0; a < 5; a++){
            System.out.println("Digite um nome: ");
            String nome = scanner.nextLine();
            lista.add(nome);
        }
        return lista;
    }
    public static void mostrarNomes(ArrayList<String> lista){
        System.out.println("Nomes : ");
        for(String a : lista){
            System.out.println(a);
        }
    }
    public static void mostrarQuantidade(ArrayList<String> lista){
        System.out.println("Tamanho da lista: " + lista.size());
    }
}

/*
Dia 55 — ArrayList
Objetivo: usar lista dinâmica.
Exercícios:
Criar uma ArrayList<String> de nomes.
Adicionar 5 nomes digitados pelo usuário.
Mostrar todos os nomes.
Mostrar quantos nomes existem na lista.
 */