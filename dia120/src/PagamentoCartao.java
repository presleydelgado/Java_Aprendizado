public class PagamentoCartao implements Pagamento {
    private double valorBase;

    public PagamentoCartao(double valor){
        this.valorBase = valor;
    }

    @Override
    public double getValorFinal() {
        return valorBase * 1.05;
    }

    @Override
    public void valor(){
        System.out.println("[CARTÃO] - Taxa de 5% no valor R$: " + getValorFinal());
    }
}
