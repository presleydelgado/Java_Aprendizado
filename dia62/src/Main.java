public class Main {
    public static void main(String[] args) {
        Gerenciador g = new Gerenciador();
        g.adicionarAlunos(new Aluno("Ana",22));
        g.adicionarAlunos(new Aluno("Pamela",25));
        g.adicionarAlunos(new Aluno("Carlos" , 29));
        g.adicionarAlunos(new Aluno("Carolina",18));
        g.adicionarAlunos(new Aluno("Roberto",20));
        g.adicionarAlunos(new Aluno("Cristiano" , 30));
        g.buscarAlunoPorNome("carlos");
        g.buscaIdade(18);
    }
}
/*
Dia 62 — Busca na lista
Use classe Aluno.
Faça método na classe Gerenciador:
buscarAlunoPorNome(String nome)
Se encontrar → mostrar dados
Se não → dizer que não existe
Treina lógica de busca.
 */