public class Filme {
    private String titulo;
    private String genero;
    private double nota;

    public Filme(String titulo,String genero,double nota){
        this.titulo = titulo;
        this.genero = genero;
        this.nota = nota;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getGenero(){
        return genero;
    }
    public double getNota(){
        return nota;
    }
}
