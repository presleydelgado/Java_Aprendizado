import java.text.DecimalFormat;
import java.util.ArrayList;

public class Loja {
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public void adicionaProdutoNaLista(Produto addProduto){
        listaDeProdutos.add(addProduto);
    }
    public void listaItens(){
        if(listaDeProdutos.isEmpty()){
            System.out.println("=====Lista vazia=====");
            return;
        }
        System.out.println("---Lista de Produtos---");
        for(Produto a : listaDeProdutos){
            System.out.println(a.getNome() + " R$ " + a.getPreco());
        }
        System.out.println("--- Fim ---");
        System.out.println("");
    }
    public void mediaTotalValores(){
        if(listaDeProdutos.isEmpty()){
            System.out.println("=====Lista vazia=====");
            return;
        }
        double soma = 0;

        for (Produto a : listaDeProdutos){
            soma += a.getPreco();
        }

        double mediaFinal = soma / listaDeProdutos.size();
        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;

        for(Produto a : listaDeProdutos){
            if(a.getPreco() > mediaFinal){
                acimaDaMedia++;
            } else if (a.getPreco() < mediaFinal) {
                abaixoDaMedia++;
            }
        }

        DecimalFormat valorFinal = new DecimalFormat("0.00");//formata para 2 casas decimais
        System.out.println("Media total R$: " + valorFinal.format(mediaFinal));
        System.out.println("Produtos acima da média: " + acimaDaMedia);
        System.out.println("Produtos abaixo da média: " + abaixoDaMedia);
    }
}
