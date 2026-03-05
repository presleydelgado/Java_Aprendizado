import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();

    public void adicionaLivros(Livro addLivro){
        livros.add(addLivro);
    }
    public void mostraLista(){
        if(livros.isEmpty()){
            System.out.println("Não há nenhum livro na lista");
            return;
        }
        System.out.println("---Catalogo de livros---");

        for (Livro a : livros){
            System.out.println("Ano: " + a.getAno() + " Titulo: " + a.getTitulo() + " Autor: " + a.getAutor() );
        }
        System.out.println(" ");
    }
    public void contaLivrosPorAno(int ano) {
        if(livros.isEmpty()){
            System.out.println("===Lista de livros vazia===");
            return;
        }

        int dataAcima = 0;
        int dataAbaixo = 0;

        for (Livro a : livros) {
            if (a.getAno() > ano) {
                dataAcima++;
            } else {
                dataAbaixo++;
            }
        }
        System.out.println("Livros mais novos que: " + ano + ": " + dataAcima);
        System.out.println("Livros mais velhos que: " + ano + ": " + dataAbaixo);
    }
}
