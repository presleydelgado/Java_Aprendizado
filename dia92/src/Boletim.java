import java.text.DecimalFormat;
import java.util.ArrayList;

public class Boletim {
    private ArrayList<Nota> notas = new ArrayList<>();

    DecimalFormat df = new DecimalFormat("0.0");

    public void adicionarNota(Nota addNota){
        notas.add(addNota);
    }
    public boolean listaVazia(){
        if(notas.isEmpty()){
            System.out.println("Lista vazia!");
            return true;
        }
        return false;
    }
    public void listarNotas(){
        if(listaVazia())return;
        for(Nota a : notas){
            System.out.println("Aluno(a): " + a.getNomeAluno() + " | Nota: " + a.getNota());
        }
        System.out.println("");
    }
    public void calcularMedia(){
        if(listaVazia())return;
        double soma = 0;
        for (Nota a : notas){
            soma += a.getNota();
        }
        double media = soma / notas.size();

        System.out.println("Média da turma: " + df.format(media));
    }
}
