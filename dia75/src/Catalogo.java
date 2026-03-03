import java.util.ArrayList;

public class Catalogo {
    ArrayList<Filme> listaFilmes = new ArrayList<>();

    public void adicionaFilme(Filme addFilme){
        listaFilmes.add(addFilme);
    }
    public void mostraCatalogoDeFilmes(){
        if(listaFilmes.isEmpty()){
            System.out.println("---Lista de filmes vazia---");
            return;
        }
        for (Filme a : listaFilmes){
            System.out.println("Filme: " + a.titulo + " | Duração: " + a.duracao);
        }
    }
    public void mostraFilmeMaisLongo(){
        if(listaFilmes.isEmpty()){
            System.out.println("---Lista de filmes vazia---");
            return;
        }
        Filme longo = listaFilmes.get(0);
        for (Filme a : listaFilmes){
            if(a.duracao > longo.duracao){
                longo = a;
            }
        }
        System.out.println("Filme mais longo da lista: " + longo.titulo + " | " + longo.duracao);
    }
    public void duracaoMediaDosFilmes(){
        if(listaFilmes.isEmpty()){
            System.out.println("---Lista vazia---");
            return;
        }
        double soma = 0;
        for(Filme a : listaFilmes){
            soma += a.duracao;
        }
        double media = soma / listaFilmes.size();
        System.out.println("A média de duração de todos os filmes é de: " + media + " minutos!");
    }
    public void buscarPorParteDoNome(String termo){
        for(Filme a : listaFilmes){
            if(a.titulo.toLowerCase().contains(termo.toLowerCase())){
                System.out.println("Filme: " + a.titulo + " encontrado !");
            }
        }
    }
}
