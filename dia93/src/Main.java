void main() {
    Scanner sc = new Scanner(System.in);
    CadastroCliente cadastroCliente = new CadastroCliente();

    int opcao;

    do {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Adicionar cliente");
        System.out.println("2 - Listar clientes");
        System.out.println("3 - Maiores de idade");
        System.out.println("0 - Sair");

        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao){

            case 1:
                System.out.println("Nome: ");
                String nome = sc.nextLine();

                System.out.println("Idade: ");
                int idade = sc.nextInt();

                cadastroCliente.adicionarCliente(new Cliente(nome,idade));
                break;
            case 2:
                cadastroCliente.listarClientes();
                break;
            case 3:
                cadastroCliente.maiorDeIdade();
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
📅 Semana 2 — Nível Up (Interativo)
📅 Dia 93 — Cadastro de Clientes (com menu)

💡 Baseado no que você já fez, mas agora interativo

Requisitos:
Menu:
1 - Adicionar cliente
2 - Listar clientes
3 - Mostrar maiores de idade
0 - Sair
Usar Scanner
Usar while (loop do menu)

👉 Esse é MUITO importante — base de tudo
 */