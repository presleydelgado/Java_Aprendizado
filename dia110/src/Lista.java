import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Lista {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void adicionar(Pessoa addPessoa){
        pessoas.add(addPessoa);
    }
    public boolean isListaVazia(){
        return pessoas.isEmpty();
    }
    public String mostrarLista(){
        if(isListaVazia())return "Lista vazia";
        StringBuilder sb = new StringBuilder();
        for (Pessoa a : pessoas){
            sb.append("Nome: ").append(a.getNome()).append("\n");
        }
        return sb.toString();
    }
    public String buscarPessoa(String buscaNome){
        if (isListaVazia())return "Lista vazia";

        boolean encontrou = false;
        StringBuilder sb = new StringBuilder();
        for (Pessoa a : pessoas){
            if (a.getNome().toLowerCase().contains(buscaNome.toLowerCase())){
                sb.append("Nome encontrado: ").append(a.getNome()).append("\n");
                encontrou = true;
            }
        }
        if (!encontrou){
            return "nenhuma nome encontrado com " + buscaNome;
        }
        return sb.toString();
    }
    public String removePessoa(String removeNome){
        if (isListaVazia())return "Nenhum nome na lista";

        Iterator<Pessoa> pessoa = pessoas.iterator();
        while (pessoa.hasNext()){
            Pessoa atual = pessoa.next();
            if (atual.getNome().contains(removeNome.toLowerCase())){
                pessoa.remove();
                return "Nome: " + removeNome + " removido com sucesso!";
            }
        }
        return "Nome não encontrado";
    }
}
