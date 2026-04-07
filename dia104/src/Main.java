void main() {
    Scanner scanner = new Scanner(System.in);
    Buscador buscador = new Buscador();

    int opcao = 0;

    do {
        System.out.println("Buscador de nomes");
        System.out.println("1 - Adicionar nome");
        System.out.println("2 - Listar nomes");
        System.out.println("3 - Buscar por parte do nome");
        System.out.println("0 - Sair do programa");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite um nome");
                String nome = scanner.nextLine();
                buscador.adicionaNome(new Nome(nome));
                System.out.println("Nome adicionado com sucesso!");
                break;
            case 2:
                System.out.println(buscador.listarNomes());
                break;
            case 3:
                System.out.println("Digite uma parte do nome: ");
                String parteNome = scanner.nextLine();
                System.out.println(buscador.buscaPorParteDoNome(parteNome));
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
Dia 104 — Sistema de Busca Parcial
Menu:
1 - Adicionar nome
2 - Listar nomes
3 - Buscar por parte do nome
0 - Sair
Exemplo:
busca: "jo"
retorna: João, Jonas

novidade:

.contains()
 */