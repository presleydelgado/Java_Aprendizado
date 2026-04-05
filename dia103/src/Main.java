void main() {
  Scanner scanner = new Scanner(System.in);
  Gerenciador gerenciador = new Gerenciador();

  int opcao = 0;

  do {
    System.out.println("---Menu notas---");
    System.out.println("1 - Adicionar nota");
    System.out.println("2 - Listar notas");
    System.out.println("3 - Mostrar média");
    System.out.println("4 - Mostrar aprovados");
    System.out.println("0 - Sair");

    opcao = scanner.nextInt();
    scanner.nextLine();

    switch (opcao){
      case 1:
        System.out.println("Digite a nota: ");
        double nota = scanner.nextDouble();
        scanner.nextLine();
        gerenciador.adicionarNota(new Nota(nota));
        System.out.println("Nota adicionada com sucesso !");
        break;
      case 2:
        System.out.println(gerenciador.listarNotas());
        break;
      case 3:
        System.out.printf("Média: %.2f\n", gerenciador.mostrarMedia());
        break;
      case 4:
        System.out.println(gerenciador.mostrarAprovados());
        break;
      case 0:
        System.out.println("Saindo...");
        break;
      default:
        System.out.println("Opção invalida");
        break;
    }
  }while (opcao != 0);
  scanner.close();
}
/*
Dia 103 — Sistema de Notas (com aprovação)
Menu:
1 - Adicionar nota
2 - Listar notas
3 - Mostrar média
4 - Mostrar aprovados
0 - Sair
Regra:
aprovado ≥ 7

reforça:

filtro
lógica combinada
 */