public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro){
        if (this.preco < outro.preco){
            return -1;
        }
        if (this.preco > outro.preco){
            return 1;
        }
        return 0;
    }
    @Override
    public String toString(){
        return nome + " - R$ " + preco;
    }
}
