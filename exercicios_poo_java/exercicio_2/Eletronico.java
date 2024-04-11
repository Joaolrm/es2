package exercicios_poo_java.exercicio_2;

public class Eletronico extends Produto{

    private String marca;

    public Eletronico(String nome, double preco, String marca){
        
        super(nome, preco);
        this.marca = marca;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
