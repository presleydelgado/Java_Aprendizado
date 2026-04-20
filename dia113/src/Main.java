import javax.swing.plaf.metal.MetalScrollBarUI;

void main() {
    Scanner scanner = new Scanner(System.in);
    Estoque estoque = new Estoque();
    int opcao = -1;

    while (opcao != 0){
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Buscar produto");
        System.out.println("4 - Remover produto");
        System.out.println("5 - Editar produto");
        System.out.println("6 - Ordenar por ordem alfabética");
        System.out.println("7 - Filtrar produtos por categoria");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");

        opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao){
            case 1:
                System.out.println("Digite o nome do produto:");
                String nome = scanner.nextLine();

                System.out.println("Digite a quantidade:");
                int qtd = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite a categoria desse produto:");
                String categoria = scanner.nextLine();

                estoque.adicionarProduto(new Produto(nome,qtd,categoria));
                System.out.println("Produto adiciona com sucesso!");
                break;
            case 2:
                System.out.println(estoque.mostrarLista());
                break;
            case 3:
                System.out.println("Qual produto deseja buscar ?");

                String buscarEsseProduto = scanner.nextLine();

                System.out.println(estoque.buscarProduto(buscarEsseProduto));
                break;
            case 4:
                System.out.println("Digite o produto que deseja remover da lista:");

                String removerProduto = scanner.nextLine();

                System.out.println(estoque.removerProduto(removerProduto));
                break;
            case 5:
                System.out.println("Digite o nome do produto que deseja editar:");
                String nomeEditar = scanner.nextLine();

                System.out.println("Nova quantidade:");
                int novaQtd = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Nova categoria:");
                String novaCategoria = scanner.nextLine();

                if(estoque.editarLista(nomeEditar, novaQtd, novaCategoria)){
                    System.out.println("Produto atualizado!");
                } else {
                    System.out.println("Produto não encontrado.");
                }
                break;
            case 6:
                System.out.println(estoque.ordernarOrdemAlfabetica());
                break;
            case 7:
                System.out.println("Digite a categoria:");
                String buscaCategoria = scanner.nextLine();
                System.out.println(estoque.filtraPorCategoria(buscaCategoria));
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Operação invalida!");
        }
    }
}
/*
Dia 113 — Mini Sistema Final 2.0

Escolha um:

tarefas (melhorar o seu)
estoque
usuários

Deve ter:

adicionar -1
listar - 2
buscar - 3
remover - 4
editar - 5
validações - 6 - 7
(extra) ordenação ou filtro

objetivo:

juntar TUDO que você aprendeu
 */