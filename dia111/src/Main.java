void main() {
    Scanner scanner = new Scanner(System.in);
    Gerenciador gerenciador = new Gerenciador();

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
                System.out.println(gerenciador.adicionarItem(new Item(nome,qtd)));
                break;
            case 2:
                System.out.println(gerenciador.mostrarItens());
                break;
            case 3:
                System.out.println(gerenciador.mostrarTotal() + " itens");
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
Dia 111 — Sistema com Limite Inteligente️
Regra:
máximo 5 itens
NÃO pode adicionar nome repetido

novidade:

validação dupla:
limite + duplicado
 */