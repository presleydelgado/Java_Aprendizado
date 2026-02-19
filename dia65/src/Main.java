public class Main {
    public static void main(String[] args) {
        Gerenciador g = new Gerenciador();
        g.adicionaAlunos(new Alunos("Maria",7));
        g.adicionaAlunos(new Alunos("Ciclano",4.6));
        g.adicionaAlunos(new Alunos("Fulano",3.5));
        g.adicionaAlunos(new Alunos("João",8.9));
        g.adicionaAlunos(new Alunos("Carolina",8.9));
        g.adicionaAlunos(new Alunos("Pamela",5.5));
        g.adicionaAlunos(new Alunos("Marcio",6.7));


        g.mostraDados();
        g.contarAprovados();
    }
}

/*
Dia 65 — Contar aprovados
Objetivo
Treinar contagem com objetos.
Exercício
No sistema de alunos:
Criar método no Gerenciador:
contarAprovados()
Ele deve:
percorrer lista
contar quem tem nota ≥ 7
mostrar total
 */