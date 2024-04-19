package builder;

public class PizzaHavaianaBuilder extends PizzaBuilder {


    @Override
    public void massaBuilder() {
        pizza.setMassa("Fininha");
    }

    @Override
    public void molhoBuilder() {
        pizza.setMolho("Molho Tomate");
    }

    @Override
    public void coberturaBuilder() {
        pizza.setCobertura("Abacaxi, Presunta, Queijo");
    }

    @Override
    public void bordaBuilder() {
        pizza.setBorda("Chocolate");
    }
}
