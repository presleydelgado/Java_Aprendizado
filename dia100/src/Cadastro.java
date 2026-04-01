import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public boolean isListaVazia(){
        return usuarios.isEmpty();
    }
    public void cadastrarUsuario(Usuario addUsuario){
        usuarios.add(addUsuario);
    }
    public boolean fazerLogin(String nomeDigitado , String senhaDigitada){
        for(Usuario a : usuarios){
            if(a.getNome().equals(nomeDigitado) && a.getSenha().equals(senhaDigitada)){
                return true;
            }
        }
        return false;
    }
    public String listarUsuarios(){
        if(isListaVazia())return "Lista vazia";

        StringBuilder sb = new StringBuilder();
        for(Usuario a : usuarios){
            sb.append("Usuario: ").append(a.getNome()).append("\n");
        }
        return sb.toString();
    }

}
