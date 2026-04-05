public class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome,int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public void alteraQuantidade(int novaQuantidade){
        this.quantidade = novaQuantidade;
    }
    public String getNome(){return nome;}
    public int getQuantidade(){return quantidade;}
}
