void main() {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4){
            System.out.println("\n--- SISTEMA CAIXA (Soft Delete) ---");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Listar Produtos Ativos");
            System.out.println("3 - Inativar Produto (Soft Delete)");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            if (opcao == 1){
                System.out.println("Nome do produto: ");
                String nome = scanner.nextLine();
                System.out.println("Preço: ");
                double preco = scanner.nextDouble();

                listaProdutos.add(new Produto(nome,preco));
                System.out.println("Produto cadastrado com sucesso !");
            }

            else if (opcao == 2){
                System.out.println("\n--- Produtos em estoque ---");
                boolean encontrou = false;

                for (Produto p : listaProdutos){
                    if (p.isAtivo()) {
                        System.out.println(p);
                        encontrou = true;
                    }
                }
                if (!encontrou){
                    System.out.println("Nenhum produto ativo cadastrado.");
                }
            }

            else if (opcao == 3){
                System.out.println("\n--- Inativar Produto ---");
                System.out.print("Digite o nome exato do produto que deseja excluir: ");
                String nomeExcluir = scanner.nextLine();

                boolean achou = false;
                for (Produto p : listaProdutos){
                    if(p.getNome().equalsIgnoreCase(nomeExcluir)) {
                        p.setAtivo(false);
                        achou = true;
                        System.out.println("Produto: " + p.getNome() + " 'inativado com sucesso' ");
                        break;
                    }
                }
                if (!achou){
                    System.out.println("Produto não encontrado.");
                }
            }
        }
        System.out.println("Sistema encerrado.");
        scanner.close();
}

/*
Dia 126 — "Soft Delete" (Inativação)

O que é: Em bancos de dados profissionais, quase nunca deletamos um dado de verdade (para não perder o histórico).
Nós apenas o "escondemos".

    O Atributo: Adicione private boolean ativo = true; na sua classe.

    O Filtro: No seu loop for, você adiciona um if (item.isAtivo()). Se for falso, o programa pula aquele item e ele
    "desaparece" da lista do usuário, mas continua na memória.
 */