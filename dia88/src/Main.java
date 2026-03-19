void main() {
  CadastroClientes cadastroClientes = new CadastroClientes();


  cadastroClientes.adicionarCliente(new Cliente("João",20));
  cadastroClientes.adicionarCliente(new Cliente("Paula",24));
  cadastroClientes.adicionarCliente(new Cliente("Marcos",33));
  cadastroClientes.adicionarCliente(new Cliente("Lucas",14));
  cadastroClientes.adicionarCliente(new Cliente("Natalia",17));

  cadastroClientes.listarClientes();
  cadastroClientes.mostrarMaioresDeIdade();
}

/*
Dia 88 — Sistema de Clientes
Classes

Cliente

nome
idade

CadastroClientes

ArrayList<Cliente> clientes
Métodos
adicionarCliente()
listarClientes()
mostrarMaioresDeIdade()
Regra
idade >= 18
 */