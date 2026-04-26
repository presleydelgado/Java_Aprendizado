public class Socio {
    private String nome;
    private int id;

    public Socio(String nome,int id){
        this.nome = nome;
        this.id = id;
    }
    public String getNome(){return nome;}
    public int getId(){return id;}

    @Override
    public boolean equals(Object obj) {
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Socio outroSocio = (Socio) obj;
        return this.id == outroSocio.id;

    }

    public void mostrar(){
        System.out.println("ID: " + id + " | Nome: " + nome);
    }
}
