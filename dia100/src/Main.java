void main() {
  Scanner scanner = new Scanner(System.in);
  Cadastro cadastro = new Cadastro();

  int opcao = 0;

  do {
    System.out.println("=== Cadastro ===");
    System.out.println("1 - Cadastrar Usuário");
    System.out.println("2 - Fazer login");
    System.out.println("3 - Listar Usuários");
    System.out.println("0 - Sair");

    opcao = scanner.nextInt();
    scanner.nextLine();

    switch (opcao){
      case 1:
        System.out.println("Digite um nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.println("Digite uma senha: ");
        String senhaUsuario = scanner.nextLine();
        cadastro.cadastrarUsuario(new Usuario(nomeUsuario,senhaUsuario));
        System.out.println("Usuario cadastrado com sucesso");
        break;
      case 2:
        System.out.println("--- Login ---");
        System.out.println("Usuário: ");
        String loginNome = scanner.nextLine();
        System.out.println("Senha: ");
        String loginSenha = scanner.nextLine();

        if(cadastro.fazerLogin(loginNome,loginSenha)){
          System.out.println("Acesso Permitido!");
        }else {
          System.out.println("Usuário ou senha incorretos!");
        }
        break;
      case 3:
        System.out.println(cadastro.listarUsuarios());
        break;
      case 0:
        System.out.println("Saindo...");
        break;
      default:
        System.out.println("Opção invalida");
        break;
    }
  }while (opcao != 0);
  scanner.close();
}
/*
Dia 100 — Sistema de Login Simples
Menu:
1 - Cadastrar usuário
2 - Fazer login
3 - Listar usuários
0 - Sair
Regras:
Usuário tem:
nome
senha
Login só funciona se nome E senha baterem

você vai usar:

equals
lógica dupla (&&)
 */