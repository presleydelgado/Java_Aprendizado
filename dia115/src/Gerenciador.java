import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionar(Funcionario addFuncionario) {
        funcionarios.add(addFuncionario);
    }

    public boolean listar() {
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + " | Bônus: R$ " + f.calcularBonus());
        }
        return false;
    }
    public String listarTrabalhadores(){
        System.out.println("---Lista de pagamentos---");
        StringBuilder sb = new StringBuilder();
        for (Funcionario a : funcionarios){
            sb.append(a.getNome()).append(" | Salário: ").append(a.getSalario()).append("\n");
        }
        return sb.toString();
    }
}