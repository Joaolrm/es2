package exercicios_poo_java.exercicio_3;

public class Boleto implements Pagamento{

    @Override
    public double calcularPagamento(double valorPedido) {
        return valorPedido + 3.00;
    }
    
}
