import java.text.DecimalFormat;
import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("0.00");

    public void adicionarFuncionario(Funcionario addFuncionario){
        funcionarios.add(addFuncionario);
    }
    public boolean isListaVazia(){
        if(funcionarios.isEmpty()){
            return true;
        }
        return false;
    }
    public String listarFuncionarios(){
        if(isListaVazia())return "Lista vazia !";

        StringBuilder sb = new StringBuilder();

        for (Funcionario a : funcionarios){
            sb.append("Funcionario: ").append(a.getNome()).append(" | Salário R$: ").append(df.format(a.getSalario())).append("\n");
        }
        return sb.toString();
    }
    public String filtrarPorSalario(double valorCorte){
        if(isListaVazia())return "Lista de funcionários está vazia!";

        StringBuilder sb = new StringBuilder();
        sb.append("---Funcionario com salário >= ").append(valorCorte).append(" ---\n");

        boolean encontrou = false;

        for (Funcionario a : funcionarios){
            if(a.getSalario() >= valorCorte){
                sb.append("Nome: ").append(a.getNome()).append(" | R$: ").append(df.format(a.getSalario())).append("\n");
                encontrou = true;
            }
        }
        return encontrou ? sb.toString() : "Nenhum funcionário encontrado com essa média de salário !";
    }
}
