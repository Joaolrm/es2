package exercicios_poo_java.exercicio_3;

import java.util.ArrayList;

public class Pedido {
    
    CartaoCredito cartaoCredito = new CartaoCredito();
    Boleto boleto = new Boleto();
    private ArrayList<Item> listaItens = new ArrayList<Item> ();

    void adicionarItem(Item item){
        listaItens.add(item);
    }

    double calcularTotalItens(){
        double totalVendido = 0.0;
        for (Item item : listaItens) {
            totalVendido += item.getPreco();
        }
        return totalVendido;
    }

    void listarItens(){
        System.out.println("Itens do pedido:");
        for(Item item : listaItens){
            System.out.println("Item: " + item.getNome() + " Valor sem taxa: R$" + item.getPreco());
        }
        System.out.println("Total no dinheiro: R$" + calcularTotalItens());
        System.out.println("Total no cartão de credito: R$" + cartaoCredito.calcularPagamento(calcularTotalItens()));
        System.out.println("Total no boleto: R$" + boleto.calcularPagamento(calcularTotalItens()));
        
    }


}
