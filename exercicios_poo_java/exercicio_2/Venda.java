package exercicios_poo_java.exercicio_2;

import java.util.List;
import java.util.ArrayList;

public class Venda {

    private List<Produto> listaPordutosVendidos = new ArrayList<Produto> ();

    void adicionarProdutoVendido(Produto produto){
        listaPordutosVendidos.add(produto);
    }

    double calcularTotalVendido(){
        double totalVendido = 0.0;
        for (Produto produtoVendido : listaPordutosVendidos) {
            totalVendido += produtoVendido.getPreco();
        }
        return totalVendido;
    }

    void listaPordutosVendidos(){
        System.out.println("Produtos vendidos: ");
        for (Produto produtoVendido : listaPordutosVendidos) {
            System.out.println(produtoVendido.getNome());
        }
        System.out.println("O total vendido foi de: R$" + calcularTotalVendido() + ".");
    }

}
