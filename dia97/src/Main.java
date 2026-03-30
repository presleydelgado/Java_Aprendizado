void main() {
  Scanner scanner = new Scanner(System.in);
  Buscador buscador = new Buscador();

  int opcao = 0;

  do {
    System.out.println("---Menu---");
    System.out.println("1 - Adicionar cliente");
    System.out.println("2 - Listar clientes");
    System.out.println("3 - Buscar cliente por nome");
    System.out.println("0 - Sair");

    opcao = scanner.nextInt();
    scanner.nextLine();

    switch (opcao){
      case 1:
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        buscador.adicionarCliente(new Cliente(nome));
        break;
      case 2:
        System.out.println(buscador.listarClientes());
        break;
      case 3:
        System.out.println("Cliente a ser procurado: ");
        String nomeFiltrado = scanner.nextLine();
        String resultado = buscador.buscarPorNome(nomeFiltrado);
        System.out.println(resultado);
        break;
      case 0:
        System.out.println("Saindo...");
        break;
      default:
        System.out.println("Opção invalida!");
    }
  }
  while (opcao != 0);
  scanner.close();
}

/*
Dia 97 — Buscar Cliente
Menu:
1 - Adicionar cliente
2 - Listar clientes
3 - Buscar cliente por nome
0 - Sair
Desafio:
Se encontrar → mostrar dados
Se não → "Cliente não encontrado"

Isso é MUITO usado no mundo real

 */