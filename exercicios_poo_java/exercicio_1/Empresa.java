package exercicios_poo_java.exercicio_1;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario> ();

    public void contratarFuncionario(Funcionario funcionario) {
        
        this.listaFuncionarios.add(funcionario);
    }

    public void exibirFuncionarios() {
        for (Funcionario funcionario : this.listaFuncionarios) {
            System.out.println();
            System.out.println("--------------Novo funcionario--------------");
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



