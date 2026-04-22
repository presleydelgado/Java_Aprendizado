import java.text.DecimalFormat;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Item: " + nome + " | Preço R$: " + df.format(preco);
    }
}
