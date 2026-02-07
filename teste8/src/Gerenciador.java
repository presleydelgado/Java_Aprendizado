import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
    ArrayList<String> nomes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void pegaNomes(){
        for(int a = 0; a < 5; a++){
            System.out.print("Digite o " + (a + 1) + "º nome: ");
            String nomeDigitado = scanner.nextLine();
            nomes.add(nomeDigitado);
        }
        scanner.close();
    }
    public void mostraNomes(){
        for(String i : nomes){
            System.out.println("-- " + i);
        }
        System.out.println("Total de nomes : " + nomes.size());
    }
}
