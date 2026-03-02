void main() {
  Scanner scanner = new Scanner(System.in);
  Gerenciador g = new Gerenciador();

  System.out.println("=== MENU DA ESCOLA ===");
  System.out.println("1 - Adicionar aluno");
  System.out.println("2 - Listar alunos");
  System.out.println("3 - Mostrar média");
  System.out.print("Escolha uma opção: ");

  int opcao = scanner.nextInt();
  scanner.nextLine();
  switch (opcao){
    case 1:
      System.out.println("Nome: ");
      String nome = scanner.nextLine();
      System.out.println("Nota: ");
      double nota = scanner.nextDouble();
      g.adicionar(new Aluno(nome,nota));
      break;
    case 2:
      g.listarAlunos();
      break;
    case 3:
      g.mostrarMedia();
      break;
    default:
      System.out.println("Opção invalida !");
  }
  scanner.close();
}

/*

Dia 74 — Menu simples (sem loop infinito)
Objetivo: simular interação.
No main:
Mostrar opções:
1 - Adicionar aluno
2 - Listar alunos
3 - Mostrar média
Executar uma opção apenas (sem while ainda)
Foco é organização, não interface.
 */