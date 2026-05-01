public class PagamentoPix implements Pagamento{
    private double valorBase;

    public PagamentoPix(double valor){
        this.valorBase = valor;
    }

    @Override
    public double getValorFinal() {
        return valorBase * 0.90;
    }

    @Override
    public void valor(){
        System.out.println("[PIX] - Valor com desconto de 10% R$: " + getValorFinal());
    }
}
