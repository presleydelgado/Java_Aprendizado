import java.util.ArrayList;

public class Buscador {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente addCliente){
        clientes.add(addCliente);
    }
    public boolean isListaVazia(){
        if(clientes.isEmpty()){
            return true;
        }
        return false;
    }
    public String listarClientes(){
        if (isListaVazia())return "Lista vazia";
        StringBuilder sb = new StringBuilder();

        for (Cliente a : clientes){
            sb.append("Cliente: ").append(a.getNome()).append("\n");
        }
        return sb.toString();
    }
    public String buscarPorNome(String nomeProcurado){
        if(isListaVazia())return "Lista vazia";

        for(Cliente a : clientes){
            if(a.getNome().equalsIgnoreCase(nomeProcurado)){
                return "Cliente(a) encontrado: \nNome: " + a.getNome();
            }
        }
        return "Cliente não encontrado !";
    }
}

