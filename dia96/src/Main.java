void main() {
    Gerenciador gerenciador = new Gerenciador();
    Scanner scanner = new Scanner(System.in);

    int opcao = 0;

    do {
        System.out.println("---Menu---");
        System.out.println("1 - Adicionar Funcionario");
        System.out.println("2 - Listar Todos");
        System.out.println("3 - Mostrar Salários acima de: ");
        System.out.println("0 - Sair");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Funcionário: ");
                String nome = scanner.nextLine();
                System.out.println("Salário: ");
                double salario = scanner.nextDouble();
                gerenciador.adicionarFuncionario(new Funcionario(nome,salario));
                break;
            case 2:
                System.out.println(gerenciador.listarFuncionarios());
                break;
            case 3:
                System.out.println("Filtrar salários maiores ou iguais a: ");
                double valorParaFiltro = scanner.nextDouble();
                String resultado = gerenciador.filtrarPorSalario(valorParaFiltro);
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
Dia 96 — Filtro de Funcionários (interativo)
Menu:
1 - Adicionar funcionário
2 - Listar todos
3 - Mostrar salários >= valor digitado
0 - Sair

Usuário escolhe o valor

Aqui você começa a:

usar parâmetro dinâmico
não deixar regra fixa
 */