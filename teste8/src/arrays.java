import java.util.ArrayList;
import java.util.Scanner;

public class arrays {
    ArrayList<String> nomes = new ArrayList<>();

    public void pegaNomes(String[] lista){
        Scanner scanner = new Scanner(System.in);
        String pegandoNome = scanner.nextLine();
        System.out.println("Digite algum nome : ");
        for(int a = 0; a < lista.length; a++){
            nomes.add(pegandoNome);
        }
        scanner.close();
    }
}


/*
teste do dia 55 em modo de classes e objetos...
Dia 55 — ArrayList
Objetivo: usar lista dinâmica.
Exercícios:
Criar uma ArrayList<String> de nomes.
Adicionar 5 nomes digitados pelo usuário.
Mostrar todos os nomes.
Mostrar quantos nomes existem na lista.
*/