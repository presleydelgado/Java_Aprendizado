void main() {
    Scanner scanner = new Scanner(System.in);
    Lista lista = new Lista();

    int opcao = 0;

    do {
        System.out.println("=== Menu ===");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Buscar tarefa");
        System.out.println("4 - Remover tarefa");
        System.out.println("5 - Marcar tarefa como concluida");;
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
                System.out.println(lista.listarTarefas());
                break;
            case 3:
                System.out.println("Digite o nome da tarefa a ser buscado: ");
                String buscaTarefa = scanner.nextLine();
                System.out.println(lista.buscarTarefa(buscaTarefa));
                break;
            case 4:
                System.out.println("Digite o nome da tarefa a ser removido da lista: ");
                String removeTarefa = scanner.nextLine();
                System.out.println(lista.removerTarefa(removeTarefa));
                break;
            case 5:
                System.out.println("Digite o número da tarefa a ser concluida: ");
                int tarefaConcluir = scanner.nextInt();
                if(lista.concluirTarefa(tarefaConcluir)){
                    System.out.println("Tarefa concluída!");
                }else {
                    System.out.println("Índice inválido!");
                }
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
Dia 106 — Mini Sistema 2 (Desafio final)
igual ao Dia 99, mas melhorado

Deve ter:
adicionar
listar
buscar
remover
atualizar algo (novo)
validações (novo)

escolha:

tarefas (recomendado)
estoque
usuários
 */