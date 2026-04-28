import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        ArrayList<Animal> fazenda = new ArrayList<>();

        while (opcao != 4){
            System.out.println("---Fazenda---");
            System.out.println("1 - Adicionar cachorro");
            System.out.println("2 - Adicionar gato");
            System.out.println("3 - Mostrar todos os sons");
            System.out.println("4 - Sair");
            System.out.println("Faça sua escolha:");

            opcao = scanner.nextInt();
            scanner.nextLine();
            if(opcao == 1){
                fazenda.add(new Cachorro());
            }else if (opcao == 2) {
                fazenda.add(new Gato());
            }else if (opcao == 3){
                for (Animal a : fazenda){
                    a.fazerSom();
                }
            }else {
                System.out.println("Saindo...");
            }
        }
    }
}
