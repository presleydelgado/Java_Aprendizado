import java.util.ArrayList;

public class CadastroCliente {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente addCliente){
        clientes.add(addCliente);
    }
    public void listarClientes(){
        for (Cliente a : clientes){
            System.out.println("Nome: " + a.getNome() + " | Idade: " + a.getIdade());
        }
    }
    public void maiorDeIdade(){
        for(Cliente a : clientes){
            if(a.getIdade() >= 18){
                System.out.println("Maior de idade: " + a.getNome() + " | " + a.getIdade());
            }
        }
    }
}
