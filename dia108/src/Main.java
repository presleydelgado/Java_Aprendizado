void main() {
    Scanner scanner = new Scanner(System.in);
    Lista lista = new Lista();

    int opcao = 0;

    do {
        System.out.println("===Menu===");
        System.out.println("1 - Adicionar item");
        System.out.println("2 - Listar itens");
        System.out.println("3 - Mostrar quantidade total de itens");
        System.out.println("0 - Sair do programa");
        System.out.println("--- Faça a sua escolha ---");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite o nome do item a ser adicionado:");
                String nome = scanner.nextLine();
                System.out.println("Digite a quantidade:");
                int qtd = scanner.nextInt();
                scanner.nextLine();
                lista.adicionarItem(new Item(nome,qtd));
                break;
            case 2:
                System.out.println(lista.listarItems());
                break;
            case 3:
                System.out.println(lista.mostrarTotal() + " itens");
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida!");
                break;

        }
    }while (opcao != 0);
    scanner.close();
}
/*
Dia 108 — Contador de Itens

Base: lista simples

Menu:

1 - Adicionar item
2 - Listar itens
3 - Mostrar quantidade total
0 - Sair

novidade:

usar .size()
retornar número ao invés de string
 */