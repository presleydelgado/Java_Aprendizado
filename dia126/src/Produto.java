public class Produto {
    private String nome;
    private double preco;
    private boolean ativo;

    //Construtor
    public Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
        this.ativo = true;
    }

    //Getters e Setters
    public String getNome(){return nome;}
    public double getPreco(){return preco;}

    public boolean isAtivo(){return ativo;} //checa o status
    public void setAtivo(boolean ativo){this.ativo = ativo;} //muda o status

    @Override
    public String toString(){
        return nome + " - R$ " + preco + " (Status: " + (ativo ? "Ativo" : "Inativo") + ")";
    }

}
