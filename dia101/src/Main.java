void main() {
    Scanner scanner = new Scanner(System.in);
    Gerenciador gerenciador = new Gerenciador();

    int opcao = 0;

    do {
        System.out.println("--- Tarefas ---");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Marcar tarefa como concluida");
        System.out.println("4 - Remover tarefa");
        System.out.println("0 - Sair do programa");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite a descrição da tarefa: ");
                String descricao = scanner.nextLine();
                gerenciador.adicionarTarefa(new Tarefa(descricao));
                break;
            case 2:
                System.out.println("Lista de tarefas: ");
                System.out.println(gerenciador.listarTarefas());
                System.out.println("Digite o índice:");
                break;
            case 3:
                System.out.println("Digite o número do indice que deseja concluir: ");
                int idxConcluir = scanner.nextInt();
                gerenciador.concluirTarefa(idxConcluir);
                break;
            case 4:
                System.out.println("Digite o número da tarefa que deseja remover: ");
                int idxRemover = scanner.nextInt();
                gerenciador.removerTarefa(idxRemover);
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida !");
                break;
        }
    }while (opcao != 0);
    scanner.close();
}
/*
Dia 101 — Sistema de Tarefas
Menu:
1 - Adicionar tarefa
2 - Listar tarefas
3 - Marcar como concluída
4 - Remover tarefa
0 - Sair
Classe:
descrição
concluída (boolean)

novidade:

usar boolean
mudar estado do objeto
 */