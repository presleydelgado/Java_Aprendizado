void main() {
    Scanner scanner = new Scanner(System.in);
    Gerenciador gerenciador = new Gerenciador();
    int opcao = 0;

    while (opcao != 3){
        System.out.println("---Sócios---");
        System.out.println("1 - Adicionar sócio");
        System.out.println("2 - Mostrar sócios");
        System.out.println("3 - Sair");
        System.out.println("Faça sua escolha:");
        opcao = scanner.nextInt();
        scanner.nextLine();

        if(opcao == 1){
            System.out.println("Sócio:");
            String nome = scanner.nextLine();
            System.out.println("ID:");
            int id = scanner.nextInt();
            gerenciador.adicionarSocio(new Socio(nome,id));

            }else if (opcao == 2){
                gerenciador.mostrarSocios();
            }else if (opcao == 3) {
                System.out.println("Saindo...");
        }
    }
}
/*
Dia 117 — Verificação de Igualdade (.equals)

Conceito: O Java não sabe se dois objetos são "iguais" pelo conteúdo, apenas pela memória. Vamos mudar isso.

Classe: Socio (id, nome)
Regra: Não pode adicionar dois sócios com o mesmo ID.

Novidade:

    Use o @Override no método equals(Object obj).

    Na hora de adicionar, use lista.contains(novoObject) para validar. O Java agora usará a sua lógica de ID para decidir se já existe.
 */