public class Produto implements Comparable<Produto> {
    private String nome;
    private int quantidade;
    private String categoria;

    public Produto(String nome,int quantidade,String categoria){
        this.nome = nome;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Produto outro){
        return  this.nome.compareToIgnoreCase(outro.nome);
    }
    @Override
    public String toString(){
        return nome + " (" + quantidade + ")  - " + categoria;
    }

    public String getNome(){return nome;}
    public int getQuantidade(){return quantidade;}
    public void setQuantidade(int quantidade){this.quantidade = quantidade;}
    public String getCategoria(){return categoria;}
    public  void setCategoria(String categoria){this.categoria = categoria;}

}
