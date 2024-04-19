package exercicios_poo_java.exercicio_3;

public class CartaoCredito implements Pagamento{

    @Override
    public double calcularPagamento(double valorPedido) {
        return valorPedido + (valorPedido * 0.01);
    }
    
}
