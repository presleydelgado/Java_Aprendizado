void main() {
    Scanner scanner = new Scanner(System.in);
    Carrinho carrinho = new Carrinho();

    int opcao = 0;

    do {
        System.out.println("=== Menu ===");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Lista Produtos");
        System.out.println("3 - Buscar Produto");
        System.out.println("4 - Remover Produto");
        System.out.println("5 - Calcular Total");
        System.out.println("0 - Sair do Programa");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Produto: ");
                String produto = scanner.nextLine();
                System.out.println("Valor: ");
                double valor = scanner.nextDouble();
                carrinho.adicionarProduto(new Produto(produto,valor));
                break;
            case 2:
                System.out.println(carrinho.listarProdutos());
                break;
            case 3:
                System.out.println("Digite o nome do produto a ser buscado: ");
                String buscaNome = scanner.nextLine();
                System.out.println(carrinho.buscarProduto(buscaNome));
                break;
            case 4:
                System.out.println("Digite o nome do produto a ser removido da lista: ");
                String removeProduto = scanner.nextLine();
                System.out.println(carrinho.removerProduto(removeProduto));
                break;
            case 5:
                System.out.println("Valor Total R$: " + carrinho.calcularTotal());
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
Dia 99 — Mini Sistema Completo (Desafio final da semana)

Junta TUDO

Sistema:

Pode escolher um:

clientes
produtos
notas
Menu:
1 - Adicionar
2 - Listar
3 - Buscar
4 - Remover
5 - Função extra (ex: média, filtro, etc)
0 - Sair
 */