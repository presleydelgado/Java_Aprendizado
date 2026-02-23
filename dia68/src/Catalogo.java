import java.util.ArrayList;

public class Catalogo {
    ArrayList<Filme> listaFilmes = new ArrayList<>();

    public void adicionaFilme(Filme addFilme){
        listaFilmes.add(addFilme);
    }
    public void listarFilmes(){
        for (Filme a : listaFilmes){
            System.out.println("Filme: " + a.titulo + " | Duração: " + a.duracao);
        }
    }
    public void mostrarFilmeMaisLongo(){
        Filme longo = listaFilmes.get(0);
        for (Filme a : listaFilmes){
            if(a.duracao > longo.duracao){
                longo = a;
            }
        }
        System.out.println("Filme mais longo da lista: " + longo.titulo + " | " + longo.duracao);
    }
}
