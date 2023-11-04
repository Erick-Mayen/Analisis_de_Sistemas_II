public class Cheese extends IngredientDecorator{
    public Cheese(Hamburguer decoratedHamburguer) {
        super(decoratedHamburguer);
    }

    @Override
    public String description() {
        return super.description() + ", with cheese";
    }

    @Override
    public double price() {
        return super.price() + 1.0;
    }
}
