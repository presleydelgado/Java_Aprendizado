public class Email extends Mensagem{

    public Email(String texto){
        super(texto);
    }

    @Override
    public void enviar(){
        System.out.println("[E-mail Diretorio academico] Enviando para servidor: " + getTexto());
    }
}
