package exercicios_poo_java.exercicio_3;

public class Main {
    
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Item("Café", 13.00));
        pedido.adicionarItem(new Item("Ovo", 0.5));
        pedido.listarItens();
    }

}
