void main() {
    Scanner sc = new Scanner(System.in);
    Lista lista = new Lista();

    int opcao = 0;

    do {
        System.out.println("---Lista---");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Mostrar lista de nomes");
        System.out.println("3 - Buscar");
        System.out.println("4 - Remover por parte do nome");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opção");

        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite o nome:");
                String nome = sc.nextLine();
                lista.adicionar(new Pessoa(nome));
                break;
            case 2:
                System.out.println(lista.mostrarLista());
                break;
            case 3:
                System.out.println("Digite o nome a ser buscado:");
                String buscarNome = sc.nextLine();
                System.out.println(lista.buscarPessoa(buscarNome));
                break;
            case 4:
                System.out.println("Digite o nome a ser removido:");
                String removeNome = sc.nextLine();
                System.out.println(lista.removePessoa(removeNome));
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida!");
        }
    }while (opcao != 0);
    sc.close();
}
/*
Dia 110 — Busca + Remoção combinada
Menu:

1 - Adicionar
2 - Buscar
3 - Remover por parte do nome
0 - Sair

novidade:

usar .contains() + remover
cuidado com loop (Iterator ou índice)
 */