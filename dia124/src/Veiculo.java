public abstract class Veiculo {
    protected String modelo;
    protected double velocidadeAtual;

    public Veiculo(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public void acelerar() {
        this.velocidadeAtual += 10;
        System.out.println(modelo + " acelerou para " + velocidadeAtual + " km/h");
    }

    // O método abstrato não tem corpo "{}" aqui, ele termina com ";"
    public abstract void emitirSom();
}
