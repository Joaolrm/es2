package exercicios_poo_java.exercicio_1;

class Funcionario extends Object{
    private String nome;
    private int idade;
    private double salario;
    private String cargo;


    public Funcionario(String nome, int idade, double salario, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome; 
    }

    public int getIdade() {
        return idade; 
    }

    public double getSalario() {
        return salario; 
    }

    public String getCargo() {
        return cargo; 
    }


    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public void setIdade(int idade) { 
        this.idade = idade; 
    }

    public void setSalario(double salario) { 
        this.salario = salario; 
    }

    public void setCargo(String cargo) { 
        this.cargo = cargo; 
    }
}