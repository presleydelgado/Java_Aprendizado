public class Mensagem {
    private String texto;

    public Mensagem(String texto){
        this.texto = texto;
    }

    public String getTexto(){return texto;}

    public void enviar(){
        System.out.println("Enviando mensagem: " + texto);
    }
}
