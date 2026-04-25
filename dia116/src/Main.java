void main() {
    Scanner scanner = new Scanner(System.in);
    Gerenciador gerenciador = new Gerenciador();
    int opcao = 0;

    while (opcao != 5){
        System.out.println("---Enviar mensagens---");
        System.out.println("1 - Enviar SMS (digitar texto)");
        System.out.println("2 - Enviar E-mail (digitar texto)");
        System.out.println("3 - Enviar Whatsapp (digitar texto)");
        System.out.println("4 - Mostrar todas mensagems");
        System.out.println("5 - Sair");
        System.out.println("Faça sua escolha:");
        opcao = scanner.nextInt();
        scanner.nextLine();

        if(opcao == 1 || opcao == 2 || opcao == 3){
            System.out.println("Texto:");
            String textoMsg = scanner.nextLine();

            if (opcao == 1){
                gerenciador.adicionarMensagem(new SMS(textoMsg));
            }else if (opcao == 2){
                gerenciador.adicionarMensagem(new Email(textoMsg));
            }else {
                gerenciador.adicionarMensagem(new Whatsapp(textoMsg));
            }
            System.out.println("Mensagem adicionada com sucesso");
        }else if (opcao == 4){
            gerenciador.enviarMensagem();
        }
        if (opcao == 5){
            System.out.println("Saindo...");
        }
    }
}
/*
Dia 116 — Sistema de Notificações

Conceito: Diferentes formas de "enviar" uma mensagem usando a mesma base.

Classe Base: Mensagem (método enviar())
Subclasses: SMS e Email

Menu:

    Enviar SMS (digitar texto)

    Enviar Email (digitar texto)

    Sair

Novidade:

    Cada subclasse terá um @Override public void enviar().

    O SMS pode imprimir: [SMS] + texto, o Email: [Diretório Acadêmico] + texto.
 */