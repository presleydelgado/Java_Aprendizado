void main() {
    imprimir();
    dia();
    finalizando();
    mudando();
    soma();
}

public static void imprimir(){
    System.out.println("Olá,Mundo!");
    System.out.println("Hoje quase me deixei levar pela preguiça, ");
    System.out.println("e assim quase quebrei o ciclo de 7 dias para sair da inercia...");
}
public static void soma(){
    int a = 5;
    int b = 15;
    System.out.println("A soma entre " + a + " + " + b + " = " + (a+b));
}
public static void dia(){
    System.out.println("Dia 6, já foram 5 dias nesse metodo,que coisa não...");
}
public static void mudando(){
    System.out.println("Vamos mudar de assunto agora: ");
}
public static void finalizando(){
    System.out.println("Não sei bem o que fazer depois disso,mas vamos que vamos !");
}