void main() {
    Boletim boletim = new Boletim();

    boletim.adicionarNota(new Nota("João",8));
    boletim.adicionarNota(new Nota("Maria",6));
    boletim.adicionarNota(new Nota("Pedro",9));

    boletim.listarNotas();
    boletim.calcularMedia();
}
/*
Dia 92 — Sistema de Notas (primeiro mini desafio)
Classes

Nota

nomeAluno
nota

Boletim

ArrayList<Nota> notas
Métodos
adicionarNota()
listarNotas()
calcularMedia()
Saída exemplo
João - 8
Maria - 6
Pedro - 9

Média da turma: 7.6
 */