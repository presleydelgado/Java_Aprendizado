import javax.print.DocFlavor;
import java.sql.SQLOutput;

static Scanner ler = new Scanner(System.in);
void main() {
    //numero();
    numero2();
}

public static void numero(){
    System.out.println("Digite um número : ");
    int num1 = ler.nextInt();
    if(num1 > 10){
        System.out.println(num1 + " É maior que 10");
    }else{
        System.out.println(num1 + " É menor que 10");
    }
}

public static void numero2(){
    System.out.println("Escolha um número entre 0 e 100");
    int num2 = ler.nextInt();
    if(num2 > 100 || num2 < 0){
        System.out.println("Era para ter escolhido um número entre 0 e 100 !!!");
    }else{
        System.out.println("O número escolhido foi : " + num2);
    }
}