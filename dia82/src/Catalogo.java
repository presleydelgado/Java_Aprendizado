import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Filme> filmes = new ArrayList<>();

    public void adicionarFilme(Filme addFilme){
        filmes.add(addFilme);
    }
    public void listarFilmes(){
        if(filmes.isEmpty()){
            System.out.println("Lista de filmes vazia !");
            return;
        }

        for(Filme a : filmes){
            System.out.println("Filme: " + a.getTitulo() + " | " + a.getGenero() + " | " + a.getNota());
        }
        System.out.println("");
    }
    public void mostrarFilmesBemAvaliados(){
        if(filmes.isEmpty()){
            System.out.println("Lista de filmes vazia !");
            return;
        }

        for(Filme a : filmes){
            if(a.getNota() >= 8){
                System.out.println("Filmes bem avaliados com nota acima de 8 : " + a.getTitulo());
            }
        }
    }
    public void buscarPorGenero(String genero){
        for (Filme a : filmes){
            if(a.getGenero().equalsIgnoreCase(genero)){
                System.out.println(a.getTitulo());
            }
        }
    }
}
