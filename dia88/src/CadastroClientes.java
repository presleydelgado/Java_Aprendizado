import java.util.ArrayList;

public class CadastroClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente addCliente){
        clientes.add(addCliente);
    }
    private boolean listaVazia() {
        if (clientes.isEmpty()) {
            System.out.println("Lista vazia!");
            return true;
        }
        return false;
    }
    public void listarClientes(){
        if (listaVazia()) return;
        for(Cliente a : clientes){
            System.out.println("Nome: " + a.getNome() + " | Idade: " + a.getIdade());
        }
        System.out.println("");
    }
    public void mostrarMaioresDeIdade(){
        if (listaVazia()) return;
        for(Cliente a : clientes){
            if(a.getIdade() >= 18){
                System.out.println("Cliente maior de idade: " + a.getNome() + " - " + a.getIdade());
            }
        }
    }
}