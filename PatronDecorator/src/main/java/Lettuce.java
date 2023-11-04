public class Lettuce extends IngredientDecorator{
    public Lettuce(Hamburguer decoratedHamburguer) {
        super(decoratedHamburguer);
    }

    @Override
    public String description() {
        return super.description() + ", with lettuce";
    }

    @Override
    public double price() {
        return super.price() + 0.5;
    }
}
