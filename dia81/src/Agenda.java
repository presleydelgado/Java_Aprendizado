import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato addContato){
        contatos.add(addContato);
    }

    public void listarContatos(){
        if(contatos.isEmpty()){
            System.out.println("Lista de contatos vazia");
            return;
        }

        for(Contato a : contatos){
            System.out.println("Contato: " + a.getNome() + " | " + a.getTelefone());
        }
    }
    public void buscarContato(String nome){
        if(contatos.isEmpty()){
            System.out.println("Lista de contatos vazia");
            return;
        }

        for(Contato a : contatos){
            if(a.getNome().toLowerCase().contains(nome.toLowerCase())){
                System.out.println("Contato encontrado: " + a.getNome());
            }
        }
    }
}