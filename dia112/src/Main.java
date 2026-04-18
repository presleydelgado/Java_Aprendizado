void main() {
    Scanner scanner = new Scanner(System.in);
    Lista lista = new Lista();
    int opcao = -1;

    while (opcao != 0) {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Adicionar números");
        System.out.println("2 - Listar");
        System.out.println("3 - Ordenar crescente");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite um número para adicionar: ");
                int num = scanner.nextInt();
                lista.adicionarItem(new Item(num));
                System.out.println("Número adicionado!");
                break;

            case 2:
                System.out.println("Lista atual: " + lista.listar());
                break;

            case 3:
                System.out.println(lista.ordenar());
                System.out.println("Lista ordenada com sucesso!");
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
    scanner.close();
}
/*
Dia 112 — Ordenação simples
Menu:

1 - Adicionar números
2 - Listar
3 - Ordenar crescente
0 - Sair

novidade:

Collections.sort(lista)
 */