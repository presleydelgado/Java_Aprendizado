import java.util.ArrayList;

public class PlataformaCursos {
    private ArrayList<Curso> cursos = new ArrayList<>();

    public void adicionarCurso(Curso addCurso){
        cursos.add(addCurso);
    }
    public boolean listaVazia(){
        if(cursos.isEmpty()){
            System.out.println("Lista vazia");
            return true;
        }
        return false;
    }
    public void listarCursos(){
        if(listaVazia()) return;
        for (Curso a : cursos){
            System.out.println("Curso: " + a.getNome() + " | Carga horária: " + a.getCargaHoraria() + " horas");
        }
        System.out.println("");
    }
    public void cursosLongos(){
        if(listaVazia()) return;
        for (Curso a : cursos){
            if(a.getCargaHoraria() >= 40){
                System.out.println("Cursos longos: " + a.getNome() + " | " + a.getCargaHoraria() + " horas");
            }
        }
    }
}
