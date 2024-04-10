package exercicios_poo_java;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Funcionario> listaFuncionarios;

    public void contratarFuncionario(Funcionario funcionario) {
        listaFuncionarios = new ArrayList<Funcionario> ();
        this.listaFuncionarios.add(funcionario);
    }

    public void exibirFuncionarios() {
        for (Funcionario funcionario : this.listaFuncionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Idade: " + funcionario.getIdade());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Cargo: " + funcionario.getCargo());
        }
    }

    public double calcularMediaSalarial() {
        double totalSalario = 0;
        for (Funcionario funcionario : this.listaFuncionarios) {
            totalSalario += funcionario.getSalario();
        }
        return totalSalario / this.listaFuncionarios.size();
    }
    
}



