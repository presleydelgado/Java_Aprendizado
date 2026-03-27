void main() {
    Scanner scanner = new Scanner(System.in);
    Gestor gestor = new Gestor();

    int opcao = 0;

    do {
        System.out.println("---MENU---");
        System.out.println("1 - Adicionar nota");
        System.out.println("2 - Listar Notas");
        System.out.println("3 - Ver Média");
        System.out.println("0 - Sair");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Nota: ");
                String nome = scanner.nextLine();
                System.out.println("Valor: ");
                double valor = scanner.nextDouble();
                gestor.adicionarNota(new Nota(nome,valor));
                break;
            case 2:
                gestor.listarNotas();
                break;
            case 3:
                gestor.calcularMedia();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida !");
        }

    }
    while (opcao != 0);
    scanner.close();
}
/*
Dia 95 — Sistema de Notas com Média Dinâmica
Menu:
1 - Adicionar nota
2 - Listar notas
3 - Ver média
0 - Sair
Desafio:
Mostrar média atual SEMPRE atualizada

reforça:

cálculo
lógica dinâmica
 */