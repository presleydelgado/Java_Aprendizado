import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Mensagem> mensagens = new ArrayList<>();

    public void adicionarMensagem(Mensagem addMensagem){
        mensagens.add(addMensagem);
    }
    public void enviarMensagem(){
        for (Mensagem a : mensagens){
            a.enviar();
        }
    }
    public String mostrarTodas(){
        StringBuilder sb = new StringBuilder();
        for (Mensagem a : mensagens){
            sb.append("Mensagens: ").append(a.getTexto()).append("\n");
        }
        return sb.toString();
    }
}
