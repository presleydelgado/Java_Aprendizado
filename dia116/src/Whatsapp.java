public class Whatsapp extends Mensagem{

    public Whatsapp(String texto){
        super(texto);
    }

    @Override
    public void enviar(){
        System.out.println("[Whatsapp] Enviando para Whatsapp: " + getTexto());
    }
}
