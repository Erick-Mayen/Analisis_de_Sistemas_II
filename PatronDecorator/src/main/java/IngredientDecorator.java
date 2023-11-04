public abstract class IngredientDecorator implements Hamburguer{
    protected Hamburguer decoratedHamburguer;

    public IngredientDecorator(Hamburguer decoratedHamburguer) {
        this.decoratedHamburguer = decoratedHamburguer;
    }

    @Override
    public String description() {
        return decoratedHamburguer.description();
    }

    @Override
    public double price() {
        return decoratedHamburguer.price();
    }
}
