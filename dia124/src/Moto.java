public class Moto extends Veiculo {

    public Moto(String modelo) {
        super(modelo); // O "super" joga o modelo lá para o construtor do Veiculo
    }

    @Override
    public void emitirSom() {
        System.out.println(modelo + " fazendo: RANDANDANDANDAN TÁ TÁ TÁ!");
    }
}