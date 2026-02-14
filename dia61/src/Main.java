import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        System.out.println("Quantos alunos serão cadastrados nessa lista ? ");
        int numAlunos = scanner.nextInt();
        scanner.nextLine();

        for(int a = 0 ; a < numAlunos; a++){
            Aluno aluno = new Aluno();

            System.out.println("Digite o nome do aluno: ");
            aluno.nome = scanner.nextLine();

            System.out.println("Digite a nota desse aluno: ");
            aluno.nota = scanner.nextDouble();

            alunos.add(aluno);
            scanner.nextLine();
        }
        for (Aluno i : alunos){
            i.mostrarDados();
            i.aprovadoOuNao();
        }
    }
}
/*
Dia 61 — Classe Aluno
Atributos:
nome
nota
Métodos:
mostrarDados()
aprovadoOuNao() (nota ≥ 7)
No main:
criar lista de alunos
mostrar quem foi aprovado
Introduz regra de negócio.
 */