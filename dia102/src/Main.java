void main() {
    Scanner scanner = new Scanner(System.in);
    Estoque estoque = new Estoque();

    int opcao = 0;

    do {
        System.out.println("--- MENU ---");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Atualizar quantidade");
        System.out.println("4 - Produtos em falta (<= 0)");
        System.out.println("0 - Sair do programa");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite o nome do produto: ");
                String adicionaProduto = scanner.nextLine();
                System.out.println("Digite a quantidade desse produto: ");
                int quantidadeProduto = scanner.nextInt();
                estoque.adicionarProduto(new Produto(adicionaProduto,quantidadeProduto));
                break;
            case 2:
                System.out.println("Lista de produtos: ");
                System.out.println(estoque.listarProdutos());
                break;
            case 3:
                System.out.println("Nome do produto: ");
                String nome = scanner.nextLine();
                System.out.println("Nova quantidade: ");

                int novaQtd = scanner.nextInt();
                scanner.nextLine();

                if(estoque.atualizarQuantidade(nome,novaQtd)){
                    System.out.println("Atualizado!");
                }else {
                    System.out.println("Produto não encontrado");
                }
                break;
            case 4:
                System.out.println(estoque.produtosEmFalta());
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida !");
                break;
        }
    }while (opcao != 0);
    scanner.close();
}
/*
Dia 102 — Estoque com Quantidade
Menu:
1 - Adicionar produto
2 - Listar produtos
3 - Atualizar quantidade
4 - Produtos em falta (<= 0)
0 - Sair

novidade:

alterar valor dentro do objeto
não só adicionar/remover
 */