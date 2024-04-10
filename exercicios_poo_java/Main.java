package exercicios_poo_java;

// Exercício 1: Sistema de Cadastro de Funcionários
// Enunciado: Crie uma classe chamada "Funcionario" com os seguintes atributos privados: nome, idade, salário e cargo. Adicione métodos getters e setters para cada atributo. Crie uma classe chamada "Empresa" que possui uma lista de funcionários. Adicione métodos para adicionar um funcionário à lista, exibir a lista de funcionários e calcular a média salarial dos funcionários. Crie objetos da classe "Empresa", adicione funcionários à lista e exiba a lista de funcionários e a média salarial.

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.contratarFuncionario(new Funcionario("João", 20, 1000.00, "Estagiário"));
        empresa.contratarFuncionario(new Funcionario("Eduarda", 28, 2500.00, "Suporte"));
        empresa.exibirFuncionarios();
        System.out.println("Média Salarial: " + empresa.calcularMediaSalarial());
    }
}