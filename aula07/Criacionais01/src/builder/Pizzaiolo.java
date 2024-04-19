package builder;

public class Pizzaiolo {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return  pizzaBuilder.getPizza();
    }

    public void construirPizza(){
        pizzaBuilder.criaNovaPizza();
        pizzaBuilder.coberturaBuilder();
        pizzaBuilder.molhoBuilder();
        pizzaBuilder.massaBuilder();
        pizzaBuilder.bordaBuilder();
    }

}
