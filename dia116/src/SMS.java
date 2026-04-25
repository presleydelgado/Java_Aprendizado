public class SMS extends Mensagem{

    public SMS(String texto){
        super(texto);
    }

    @Override
    public void enviar(){
        System.out.println("[SMS] Enviando para celular: " + getTexto());
    }
}
