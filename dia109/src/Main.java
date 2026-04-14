void main() {
    Scanner scanner = new Scanner(System.in);
    Gerenciador gerenciador = new Gerenciador();

    int opcao = 0;

    do {
        System.out.println("=== Menu ===");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Listar");
        System.out.println("3 - Filtrar por categoria");
        System.out.println("0 - Sair do Programa");
        System.out.println("Faça a sua escolha:");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Nome: ");
                String nome = scanner.nextLine();
                System.out.println("Categoria: ");
                String categoria = scanner.nextLine();

                gerenciador.adicionarItem(new Item(nome, categoria));
                System.out.println("Item adicionado!");
                break;
            case 2:
                System.out.println(gerenciador.listar());
                break;
            case 3:
                System.out.println("Filtrar por categoria:");
                String filtroCategoria = scanner.nextLine();
                System.out.println(gerenciador.filtrarCategorias(filtroCategoria));
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida !");
        }
    }while (opcao != 0);
    scanner.close();
}
/*
Dia 109 — Sistema com Categorias️
Classe:
nome
categoria (ex: "estudo", "trabalho")
Menu:

1 - Adicionar
2 - Listar
3 - Filtrar por categoria
0 - Sair

novidade:

comparar strings com lógica
filtro mais específico

 */