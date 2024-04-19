package builder;

public class Main {

    public static void main(String[] args) {
        Pizzaiolo pizzaioloDirector = new Pizzaiolo();

        PizzaBuilder pizzaHavaianaBuilder = new PizzaHavaianaBuilder();
        PizzaBuilder pizzaCalabresaBuilder = new PizzaCalabresaBuilder();

        pizzaioloDirector.setPizzaBuilder(pizzaHavaianaBuilder);
        pizzaioloDirector.construirPizza();
        Pizza pizzaHavaiana = pizzaioloDirector.getPizza();
        System.out.println(pizzaHavaiana);

    }

}
