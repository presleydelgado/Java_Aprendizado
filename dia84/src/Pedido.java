public class Pedido {
    private String nomeCliente;
    private double valor;

    public Pedido(String nomeCliente, double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor não pode ser nulo !");
        }
        this.nomeCliente = nomeCliente;
        this.valor = valor;
    }
    public String getNomeCliente(){return nomeCliente;}
    public double getValor(){return valor;}
}