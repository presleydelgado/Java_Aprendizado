void main() {
    ArrayList<Produto> produtos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    int opcao = 0;

    while (opcao != 3){
        System.out.println("\n---Menu---");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Mostrar produtos");
        System.out.println("3 - Sair");
        System.out.println("Faça sua escolha:");

        opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1){
            System.out.println("Digite o nome do produto:");
            String nome = scanner.nextLine();
            System.out.println("Digite o valor do produto:");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            Produto produto = new Produto(nome,preco);
            produtos.add(produto);
        }
        if (opcao == 2){
            Collections.sort(produtos);
            System.out.println(produtos);
        }
        if (opcao == 3){
            System.out.println("Saindo...");
        }
    }
    scanner.close();
}

/*
Dia 125 — Ordenação (Comparable)

O que é: Aprender a organizar listas (essencial para relatórios).

    A Mágica: Para ordenar uma lista de objetos (como Produto), você
     precisa ensinar ao Java o que é "maior" e o que é "menor".

    O Caminho: Sua classe Produto vai usar implements Comparable<Produto>.
     Isso vai te obrigar a criar um método compareTo.
 */