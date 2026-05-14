import java.util.ArrayList;

public class Usuario {
    private String nome;

    ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome){
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void pegarLivro(Livro livro){
        livrosEmprestados.add(livro);
    }
    public void mostrarMeusLivros(){
        System.out.printf("Livros de: " + nome + ":");
        if (livrosEmprestados.isEmpty()){
            System.out.printf("Nenhum livro no momento");
        }else {
            for (Livro l : livrosEmprestados){
                System.out.printf("- " + l.getDetalhes());
            }
        }
    }

}
