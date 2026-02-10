import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    ArrayList<String> nomes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adicionarNome(){//pronto,pega os nomes e por na lista
        System.out.println("Digite 3 nomes para adicionar a lista: ");
        String dadosUsuario;

        for(int a = 0 ; a < 3; a++){
            dadosUsuario = scanner.nextLine();
            nomes.add(dadosUsuario);
        }
    }
    public void mostrarNomes(){ //pronto,mostra os nomes corretamente
        System.out.println("---Lista de Nomes---");
        for (int a = 0 ; a < nomes.size(); a++ ){
            System.out.println(nomes.get(a));
        }
    }

}


