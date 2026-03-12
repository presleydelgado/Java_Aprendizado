void main() {
    GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();

    gerenciadorTarefas.adicionarTarefa(new Tarefa("Lavar a louça" , false));
    gerenciadorTarefas.adicionarTarefa(new Tarefa("Varrer o chão" , true));
    gerenciadorTarefas.adicionarTarefa(new Tarefa("Tirar o lixo" , false));


    gerenciadorTarefas.listarTarefas();
    gerenciadorTarefas.marcarComoConcluida();
}

/*
Dia 83 — Lista de Tarefas
Classes

Tarefa
descricao
concluida (boolean)

GerenciadorTarefas
ArrayList<Tarefa> tarefas

Métodos
adicionarTarefa()
listarTarefas()
marcarComoConcluida()

Regra
Não permitir descrição vazia
 */