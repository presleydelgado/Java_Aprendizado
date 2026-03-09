void main() {
    Agenda agenda = new Agenda();

    agenda.adicionarContato(new Contato("Paula","41-33652589"));
    agenda.adicionarContato(new Contato("João","11-31465521"));
    agenda.adicionarContato(new Contato("Maria","44-32526474"));

    agenda.listarContatos();

    agenda.buscarContato("paula");
}

/*
Dia 81 — Agenda de Contatos
Classes

Contato

nome
telefone

Agenda
ArrayList<Contato> contatos

Métodos

adicionarContato()
listarContatos()
buscarContato(nome)

Regra de negócio
Não permitir telefone vazio
 */