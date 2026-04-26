import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Socio> socios = new ArrayList<>();

    public void adicionarSocio(Socio novoSocio){
        if (socios.contains(novoSocio)){
            System.out.println("ERRO: Já existe um sócio com esse ID: " + novoSocio.getNome());
        }else {
            socios.add(novoSocio);
            System.out.println("Sócio adicionado com sucesso !");
        }
    }
    public void mostrarSocios(){
        if (socios.isEmpty()){
            System.out.println("Lista vazia.");
            return;
        }
        for (Socio a : socios){
            a.mostrar();
        }
    }
}
