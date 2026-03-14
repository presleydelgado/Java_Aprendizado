import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro addLivro){
        livros.add(addLivro);
    }
    public void listarLivros(){
        if(livros.isEmpty()){
            System.out.printf("Lista de livros vazia! ");
            return;
        }
        for(Livro a : livros){
            System.out.println("Titulo: " + a.getTitulo() + " -  autor:  " + a.getAutor());
        }
        System.out.println("");
    }
    public void emprestarLivro(String titulo){
        if(livros.isEmpty()){
            System.out.printf("Lista de livros vazia! ");
            return;
        }
        for(Livro a : livros){
            if(a.getTitulo().equalsIgnoreCase(titulo)){
                if(!a.isEmprestado()){
                    a.setEmprestado(true);
                    System.out.printf("Livro " + a.getTitulo() + " emprestado com sucesso! ");
                }else {
                    System.out.printf("O Livro " + a.getTitulo() + " já está emprestado ! ");
                }
                return;
            }
        }
        System.out.printf("Livro não encontrado");
    }
}