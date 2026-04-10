void main() {
    Scanner scanner = new Scanner(System.in);
    Lista lista = new Lista();

    int opcao = 0;

    do {
        System.out.println("=== Menu ===");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Editar tarefa");
        System.out.println("4 - Remover tarefa");
        System.out.println("0 - Sair do Programa");
        System.out.println("Faça a sua escolha:");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite a tarefa: ");
                String nome = scanner.nextLine();
                System.out.println("Objetivo: ");
                String objetivo = scanner.nextLine();
                lista.adicionarTarefa(new Tarefa(nome,objetivo));
                break;
            case 2:
                System.out.println(lista.listarTarefa());
                break;
            case 3:
                System.out.println("Digite o número da tarefa a ser editada: ");
                int editaTarefa = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Novo nome (ou ENTER para manter)");
                String novoNome = scanner.nextLine();

                System.out.println("Novo objetivo (ou ENTER para manter)");
                String novoObjetivo = scanner.nextLine();

                if (lista.editarTarefa(editaTarefa,novoNome,novoObjetivo)){
                    System.out.println("Tarefa atualizada");
                }else {
                    System.out.println("Indice invalido!");
                }
                break;
            case 4:
                System.out.println("Digite o nome da tarefa a ser removido da lista: ");
                String removeTarefa = scanner.nextLine();
                System.out.println(lista.removerTarefa(removeTarefa));
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida !");
        }
    }while (opcao != 0);
    scanner.close();
}
/*
Dia 107 — Sistema com Edição

Base: seu sistema de tarefas

Menu:

1 - Adicionar tarefa
2 - Listar tarefas
3 - Editar tarefa
4 - Remover tarefa
0 - Sair

Regra:
Editar permite mudar nome OU objetivo
 */