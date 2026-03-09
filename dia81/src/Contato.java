public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome,String telefone){
        if(telefone.isEmpty()){
            throw new IllegalArgumentException("O campo de telefone está vazio,por favor digite um telefone valido !");
        }
        this.nome = nome;
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
}
