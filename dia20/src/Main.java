void main() {
    //pegaNome();
    listaNomes();
}
public static void pegaNome(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um nome: ");
    String nome = scanner.nextLine();
    System.out.println("Olá " + nome);
}

//lista de array com input do usuário,adicionando nomes a uma lista
public static void listaNomes(){
    String[] lista = new String[3];
    Scanner pegaNome = new Scanner(System.in);

    System.out.println("Digite mais de 1 nome para adicionar a lista");

    for (int a = 0; a < lista.length; a++){
        lista[a] = pegaNome.nextLine();
    }
    for(String nome : lista){
        System.out.println(nome);
    }
}

/*
Dia 20 — Leitura de erro (natural)
Objetivo: normalizar falha
Fazer algo parecido com dias anteriores
Se der erro:
ler a mensagem
ajustar
Se não der erro, tudo bem
Não forçar erro.
 */