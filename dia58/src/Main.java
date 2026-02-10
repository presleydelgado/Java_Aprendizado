public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarNome();
        agenda.mostrarNomes();

    }
}

/*
Dia 58 — Classe com lista interna
Objetivo: classe que guarda dados
Exercício
Crie uma classe Agenda:
Ela deve ter:
ArrayList de nomes
método adicionarNome(String nome)
método mostrarNomes()
No main:
crie uma Agenda
adicione 3 nomes
mostre os nomes
Ideia-chave: a lista pertence à classe.
 */