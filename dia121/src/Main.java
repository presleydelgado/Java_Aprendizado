import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome de usuario:");
        Usuario user = new Usuario(scanner.nextLine());
        int opcao = 0;

        while (opcao != 3){
            System.out.println("\n---Biblioteca---");
            System.out.println("1 - Pegar livro emprestado");
            System.out.println("2 - Ver meus livros");
            System.out.println("3 - Sair");
            System.out.println("Faça sua escolha:");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 1){
                System.out.println("Digite o titulo do livro:");
                String titulo = scanner.nextLine();
                System.out.println("Digite o autor:");
                String autor = scanner.nextLine();

                Livro novoLivro = new Livro(titulo, autor);
                user.pegarLivro(novoLivro);
                System.out.println("Livro emprestado com sucesso");
            } else if (opcao == 2) {
                user.mostrarMeusLivros();
            } else if (opcao == 3) {
                System.out.println("Saindo...");
            }
        }
    }
}