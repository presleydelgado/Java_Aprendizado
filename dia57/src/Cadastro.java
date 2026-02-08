import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cadastro {
    ArrayList<String> listaNomes = new ArrayList<>();
    ArrayList<Integer> listaIdades = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void pegaDados(){
        System.out.println("Qual a quantidade de pessoas a serem cadastradas ?");
        int nomeQuantidade = scanner.nextInt();
        scanner.nextLine();

        for(int a = 0; a < nomeQuantidade; a++){

            System.out.println("Digite o nome : ");
            String nome = scanner.nextLine();
            listaNomes.add(nome);

            System.out.println("Digite a idade dessa pessoa : ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            listaIdades.add(idade);
        }
    }
    public void imprimeDados(){
        System.out.println("---Lista de pessoas cadastradas---");
        for(int a = 0  , b = 0 ; a < listaNomes.size() && b < listaIdades.size(); a++ , b++){
            System.out.println("Nome: " + listaNomes.get(a) + " tem " + listaIdades.get(b) + " anos" );
        }
    }
    public void maiorIdade(){
        Integer maiorValor = Collections.max(listaIdades);

        int indice = listaIdades.indexOf(maiorValor);

        String pessoaMaiorIdade = listaNomes.get(indice);

        System.out.println("Maior idade cadastrado na lista: " + pessoaMaiorIdade + " com " + maiorValor + " anos");

    }
}

