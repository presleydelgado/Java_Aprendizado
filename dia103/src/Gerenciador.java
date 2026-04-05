import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Nota> notas = new ArrayList<>();

    public void adicionarNota(Nota addNota){
        notas.add(addNota);
    }
    public boolean isListaVazia(){
        return notas.isEmpty();
    }
    public String listarNotas(){
        if(isListaVazia())return "Lista vazia";
        StringBuilder sb = new StringBuilder();

        for (Nota a : notas){
            sb.append("Nota: ").append(a.getNota()).append("\n");
        }
        return sb.toString();
    }
    public double mostrarMedia(){
        if (isListaVazia())return 0;

        double soma = 0;
        for (Nota a : notas){
            soma += a.getNota();
        }
        double media = soma / notas.size();
        return media;
    }
    public String mostrarAprovados(){
        StringBuilder sb = new StringBuilder();
        for (Nota a : notas){
            if(a.getNota() >= 7){
                sb.append("Aprovado: ").append(a.getNota()).append("\n");
            }
        }
        if(sb.length() == 0){
            return "Ninguem foi aprovado !";
        }
        return sb.toString();
    }
}
