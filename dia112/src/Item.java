public class Item implements Comparable<Item>{
    int valor;

    public Item(int valor){
        this.valor = valor;
    }
    public int getValor(){return valor;}

    @Override
    public int compareTo(Item outro){
        return Integer.compare(this.valor, outro.valor);
    }
}
