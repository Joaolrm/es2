package exercicios_poo_java.exercicio_2;

public class Main {

    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.adicionarProdutoVendido(new Livro("Os três mosqueteiros", 10.23, "Alexandre Dumas"));
        venda.adicionarProdutoVendido(new Livro("God Of War 1", 15.50, "Matthew Stover"));
        venda.adicionarProdutoVendido(new Livro("Harry Potter e a Pedra Filosofal", 23.70, "J. K. Rowling"));
        venda.adicionarProdutoVendido(new Eletronico("Poco F5", 2500.79, "Xiaomi"));
        venda.adicionarProdutoVendido(new Eletronico("Iphone 14", 6500.19, "Apple"));
        venda.listaPordutosVendidos();
    }
    
}
