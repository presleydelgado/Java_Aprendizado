void main() {
    Scanner scanner = new Scanner(System.in);
    Gerenciador gerenciador = new Gerenciador();
    int opcao = 0;

    while (opcao != 4) {
        System.out.println("\n--- Calculadora de Bônus ---");
        System.out.println("1. Adicionar Funcionario");
        System.out.println("2. Adicionar Gerente");
        System.out.println("3. Listar nomes e bônus");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1 || opcao == 2) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            if (opcao == 1) {
                gerenciador.adicionar(new Funcionario(nome, salario));
            } else {
                gerenciador.adicionar(new Gerente(nome, salario));
            }
            System.out.println("Adicionado com sucesso!");
        }else if(opcao == 3) {
            System.out.println(gerenciador.listar());
        }
    }
}
