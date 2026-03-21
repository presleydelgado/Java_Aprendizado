void main() {
    PlataformaCursos plataformaCursos = new PlataformaCursos();

    plataformaCursos.adicionarCurso(new Curso("Soldador",40));
    plataformaCursos.adicionarCurso(new Curso("Recepcionista",20));
    plataformaCursos.adicionarCurso(new Curso("Cudiador de idosos",35));

    plataformaCursos.listarCursos();
    plataformaCursos.cursosLongos();
}
/*
Dia 91 — Sistema de Cursos
Classes

Curso

nome
cargaHoraria

PlataformaCursos

ArrayList<Curso> cursos
Métodos
adicionarCurso()
listarCursos()
cursosLongos()
Regra

Curso longo:

cargaHoraria >= 40
 */