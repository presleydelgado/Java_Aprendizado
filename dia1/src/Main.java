static Scanner scanner = new Scanner(System.in);

void main() {
    //soma();
    subtracao();
}


public static void soma(){
    System.out.println("Digite um número : ");
    int num1 = scanner.nextInt();
    System.out.println("Digite o outro número");
    int num2 = scanner.nextInt();
    int soma = num1 + num2;
    System.out.println("A soma entre : " + num1 + " + " + num2 + " = " + soma);
}

public static void subtracao(){
    System.out.println("Escolha a operação");
    String input = scanner.nextLine();
    String sub = "subtração";
    if(input.equals(sub)){
        System.out.println("Você escolheu subtração");
        System.out.println("Digite os valores a serem subtraídos: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();
        System.out.println("A subtração entre : " + num1 + " - " + num2 + " : " + (num1-num2));
    }
}