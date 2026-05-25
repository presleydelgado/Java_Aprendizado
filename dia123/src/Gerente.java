public class Gerente implements Autenticar {
    public String nome;

    public Gerente(String nome){
        this.nome = nome;
    }

    @Override
    public boolean login(String senha){
        if (senha.length() >= 8){
            return true;
        }
        return false;
    }
}
