public class Caminhao extends Veiculo {

    public Caminhao(String modelo) {
        super(modelo);
    }

    @Override
    public void emitirSom() {
        System.out.println(modelo + " fazendo: VRRRRUMMMMM... fiiiiissss (barulho do freio a ar)!");
    }
}