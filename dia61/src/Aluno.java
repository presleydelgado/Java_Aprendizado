public class Aluno {
    String nome;
    double nota;

    public void mostrarDados(){
        System.out.println(nome + " " + nota);
    }
    public void aprovadoOuNao(){
        if(nota >= 7){
            System.out.println("Aprovado!");
        }else{
        System.out.println("Não aprovado!");
        }
    }
}
