public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo,String autor,boolean emprestado){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = emprestado;
    }
    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }
    public String getTitulo(){return titulo;}
    public String getAutor(){return autor;}
    public boolean isEmprestado(){return emprestado;}
}