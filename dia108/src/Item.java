public class Item {
    private String nome;
    private int quantidade;

    public Item(String nome,int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }
    @Override
    public String toString(){
        return this.nome + " (Qtd: " + this.quantidade + ")";
    }
    public String getNome(){return nome;}
    public int getQuantidade(){return quantidade;}
}
