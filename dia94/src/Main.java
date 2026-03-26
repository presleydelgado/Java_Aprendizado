void main() {
    Mercado mercado = new Mercado();
    Scanner scanner = new Scanner((System.in));

    int opcao;

    do {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Adicionar item");
        System.out.println("2 - Listar itens");
        System.out.println("3 - Calcular total");
        System.out.println("0 - Sair");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.print("Produto: ");
                String nome = scanner.nextLine();

                System.out.println("Preço: ");
                double valor = scanner.nextDouble();

                mercado.adicionarProduto(new Item(nome,valor));
                break;
            case 2:
                mercado.listarItens();
                break;
            case 3:
                mercado.calcularTotal();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida!");
        }
    }while (opcao != 0);
    scanner.close();

}
/*

Dia 94 — Carrinho de Compras Interativo
Menu:
1 - Adicionar item
2 - Listar itens
3 - Calcular total
0 - Sair
Desafio extra:
Usuário digita nome e preço

Aqui você junta:

entrada de dados
sua lógica do Dia 89
 */