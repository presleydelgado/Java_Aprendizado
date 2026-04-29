public class ContaEUA implements Conta{
    private double valor;

    public ContaEUA(double valor){
        this.valor = valor;
    }
    @Override
    public void saldo(){
        System.out.println("Balance (EUA) $: " + valor);
    }
}
