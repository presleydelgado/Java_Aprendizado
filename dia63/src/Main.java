import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gerenciador g = new Gerenciador();

        g.adicionaAluno(new Aluno("Pamela",7));
        g.adicionaAluno(new Aluno("Natalia",8));
        g.adicionaAluno(new Aluno("João",4));

        g.mostrarResultadoDeDados();
    }
}

/*
Dia 63 — Remover da lista
Na classe Gerenciador:
removerAluno(String nome)
Treina manipulação de lista.

O programa precisa:
- guardar nome e nota do aluno
- mostrar os dados
- dizer se foi aprovado
- ter vários alunos





 */