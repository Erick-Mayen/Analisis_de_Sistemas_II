public class SimpleHamburguer implements Hamburguer {
    public String description() {
        return "Simple Hamburguer";
    }

    @Override
    public double price() {
        return 5.0;
    }
}
