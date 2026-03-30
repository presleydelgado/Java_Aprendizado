void main() {
    Scanner scanner = new Scanner(System.in);
    Carrinho carrinho = new Carrinho();

    int opcao = 0;

    do {
        System.out.println("---Menu---");
        System.out.println("1 - Adicionar item");
        System.out.println("2 - Listar itens");
        System.out.println("3 - Remover item pelo nome");
        System.out.println("0 - Sair");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Nome do item: ");
                String nome = scanner.nextLine();
                System.out.println("Valor: ");
                double valor = scanner.nextDouble();
                carrinho.adicionarItem(new Item(nome,valor));
                break;
            case 2:
                System.out.println(carrinho.listarItens());
                break;
            case 3:
                System.out.println("Qual item deseja tirar da lista ?");
                String tiraItem = scanner.nextLine();
                System.out.println(carrinho.itemParaRemover(tiraItem));
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
    while (opcao != 0);
    scanner.close();
}

/*
Dia 98 — Remover Item
Base: Carrinho
Menu:
1 - Adicionar item
2 - Listar itens
3 - Remover item pelo nome
0 - Sair

Aqui você aprende:

remover do ArrayList
comparar String

dica: usar .equals()
 */