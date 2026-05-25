public class Cliente implements Autenticar {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public boolean login(String senha){
        if (senha.length() == 4){
            return true;
        }
        return false;
    }
}
