import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Loja {
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public void adicionaProduto(Produto addProduto){
        listaDeProdutos.add(addProduto);
    }
    public void mostraListaDeProdutos(){
        for (Produto a : listaDeProdutos){
            System.out.println("Produto: " + a.nome + " R$ " + a.preco);
        }
    }
    public void buscaPorNome(String nome){
        if(listaDeProdutos.isEmpty()){
            System.out.println("===Lista de produtos vazia===");
            return;
        }

        Scanner leitor = new Scanner(System.in);
        boolean encontrou = false;

        Iterator<Produto> it = listaDeProdutos.iterator();

        while (it.hasNext()){
            Produto a = it.next();
        }

        for (Produto a : listaDeProdutos){
            if(a.nome.toLowerCase().contains(nome.toLowerCase())){
                encontrou = true;
                System.out.println("Item encontrado : " + a.nome + " R$ " + a.preco);
                System.out.println("Deseja remover ? (sim/nao)");

                String resposta = leitor.nextLine();

                if(resposta.equalsIgnoreCase("sim")){
                    it.remove();
                    System.out.println("Produto removido da lista");
                }else{
                    System.out.println("O item continua na lista");
                }
            }
        }
        if(!encontrou){
            System.out.println("Produto não está presente na lista");
        }
    }
}
