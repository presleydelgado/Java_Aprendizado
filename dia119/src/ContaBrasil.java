public class ContaBrasil implements Conta {
    private double valor;

    public ContaBrasil(double valor){
        this.valor = valor;
    }

    @Override
    public void saldo(){
        System.out.println("Saldo (BR) R$: " + valor);
    }
}
