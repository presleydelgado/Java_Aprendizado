void main() {
    Gerenciador gerenciador = new Gerenciador();
    Scanner scanner = new Scanner(System.in);

    int opcao = -1;
    while (opcao != 0){
        System.out.println("---Menu de produtos---");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("0 - Sair");
        System.out.println("Faça a sua escolha...");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite o nome do produto:");
                String produtoNome = scanner.nextLine();

                System.out.println("Digite o valor desse produto:");
                double produtoValor = scanner.nextDouble();

                gerenciador.adicionarProduto(new Produto(produtoNome,produtoValor));
                System.out.println("Produto adicionado com sucesso!");
                break;
            case 2 :
                System.out.println(gerenciador.listarProdutos());
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }
    }
}
/*
Dia 114 — O @Override Básico (ToString)

Conceito: Por padrão, quando você imprime um objeto, o Java mostra um código estranho
 (o endereço de memória). Vamos usar o @Override para mudar isso.

Classe: Produto (nome, preco)
Menu:

    Adicionar Produto

    Listar (apenas dar um System.out.println no objeto)

    Sair

Novidade:

    Na classe Produto, digite toString e deixe o IDE gerar ou escreva manualmente o
     @Override public String toString().

    O objetivo é que, ao listar, o Java use a sua versão da descrição do objeto.
 */