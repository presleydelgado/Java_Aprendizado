import java.text.DecimalFormat;
import java.util.ArrayList;

public class Gestor {
    private ArrayList<Nota> notas = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("0.00");

    public void adicionarNota(Nota addNota){
        notas.add(addNota);
    }
    public boolean listaVazia(){
        if(notas.isEmpty()){
            System.out.println("Lista de notas vazia !");
            return true;
        }
        return false;
    }
    public void listarNotas(){
        if(listaVazia())return;

        for(Nota a : notas){
            System.out.println("Nota: " + a.getNota() + " | Valor R$: " + df.format(a.getValor()));
        }
    }
    public void calcularMedia(){
        if(listaVazia())return;
        double soma = 0;
        for (Nota a : notas){
            soma += a.getValor();
        }
        double media = soma / notas.size();
        System.out.println("Média: " + df.format(media));
    }
}

