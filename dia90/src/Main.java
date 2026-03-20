void main() {
    Empresa empresa = new Empresa();

    empresa.adicionarFuncionario(new Funcionario("Funcionario 1",5000));
    empresa.adicionarFuncionario(new Funcionario("Funcionario 2",4200));
    empresa.adicionarFuncionario(new Funcionario("Funcionario 3",6000));
    empresa.adicionarFuncionario(new Funcionario("Funcionario 4",2500));

    empresa.listarFuncionarios();
    empresa.mostrarSalariosAltos();
}
/*
📅 Dia 90 — Sistema de Funcionários
Classes

Funcionario

nome
salario

Empresa

ArrayList<Funcionario> funcionarios
Métodos
adicionarFuncionario()
listarFuncionarios()
mostrarSalariosAltos()
Regra

Mostrar salários:

>= 5000
 */