public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Carlos");
        Gerente gerente = new Gerente("Ana");

        System.out.println("--- Teste de Login ---");

        // Teste do Cliente (Deve dar true)
        System.out.println("Cliente com senha '1234': " + cliente.login("1234"));

        // Teste do Gerente (Deve dar true)
        System.out.println("Gerente com senha 'admin123': " + gerente.login("admin123"));
    }
}