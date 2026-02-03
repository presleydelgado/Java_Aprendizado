void main() {
    receberNumero();
    digiteNome();
}

public static void receberNumero(){
    try {Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número : ");
        int input = sc.nextInt();
        System.out.println("O número digitado foi :" + input);
    }catch (Exception e){
        System.out.println("Não é aceito letras!");
        System.out.println("Apenas números são aceitos!");
    }
}

public static void digiteNome(){
    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String input = sc.nextLine();
        System.out.println("O nome digitado foi : " + input);
    }catch (Exception e){
        System.out.println("Apenas caracteres são aceitos nesse programa !");
    }
}