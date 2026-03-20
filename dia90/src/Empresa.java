import java.text.DecimalFormat;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private DecimalFormat df = new DecimalFormat("0.00");

    public void adicionarFuncionario(Funcionario addFuncionario){
        funcionarios.add(addFuncionario);
    }
    private boolean listaVazia(){
        if(funcionarios.isEmpty()){
            System.out.println("Lista vazia! ");
            return true;
        }
        return false;
    }
    public void listarFuncionarios(){
        if(listaVazia())return;
        for (Funcionario a : funcionarios){
            System.out.println("Funcionario(a): " + a.getNome() + "  | Salário R$: " + df.format(a.getSalario()));
        }
        System.out.println("");
    }
    public void mostrarSalariosAltos(){
        if(listaVazia())return;
        for (Funcionario a : funcionarios){
            if(a.getSalario() >= 5000){
                System.out.println("Salário alto: " + a.getNome() + " | R$: " + df.format(a.getSalario()));
            }
        }
    }
}
