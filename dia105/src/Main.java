void main() {
    Scanner scanner = new Scanner(System.in);
    Carrinho carrinho = new Carrinho();

    int opcao = 0;

    do {
        System.out.println("\n--- MENU CARRINHO ---");
        System.out.println("1 - Adicionar item");
        System.out.println("2 - Mostrar todos os itens");
        System.out.println("0 - Sair");
        System.out.println("Escolha: ");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite o nome do item");
                String nome = scanner.nextLine();

                System.out.println("Digite a quantidade desse item");
                int quantidadeItem = scanner.nextInt();
                scanner.nextLine();

                if(carrinho.adicionarItem(new Item(nome, quantidadeItem))){
                    System.out.println("Item adicionado!");
                } else {
                    System.out.println("Carrinho cheio!");
                }

                carrinho.adicionarItem(new Item(nome,quantidadeItem));
                break;
            case 2:
                System.out.println(carrinho.mostrarItems());
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
Dia 105 — Sistema com Limite

Exemplo: Carrinho com limite
Regras:
máximo 5 itens
se tentar adicionar mais → erro

novidade:

controle de limite
validação
 */