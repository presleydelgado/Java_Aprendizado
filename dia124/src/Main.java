public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testando Classes Abstratas ---");

        // Não podemos fazer: Veiculo v = new Veiculo("Genérico"); -> Dá erro!

        Moto minhaMoto = new Moto("Honda CB 300");
        Caminhao meuCaminhao = new Caminhao("Scania R450");

        // Testando o método herdado (da mãe)
        minhaMoto.acelerar();
        meuCaminhao.acelerar();

        System.out.println(); // Só pula uma linha

        // Testando o método abstrato (que cada uma customizou)
        minhaMoto.emitirSom();
        meuCaminhao.emitirSom();
    }
}