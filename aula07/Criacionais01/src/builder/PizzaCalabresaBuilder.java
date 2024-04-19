package builder;

public class PizzaCalabresaBuilder extends PizzaBuilder {


    @Override
    public void massaBuilder() {
        pizza.setMassa("Integral");
    }

    @Override
    public void molhoBuilder() {
        pizza.setMolho("Molho Tomate");
    }

    @Override
    public void coberturaBuilder() {
        pizza.setCobertura("Abacaxi, Calabresa, Queijo");
    }

    @Override
    public void bordaBuilder() {
        pizza.setBorda("Catupiry");
    }
}
