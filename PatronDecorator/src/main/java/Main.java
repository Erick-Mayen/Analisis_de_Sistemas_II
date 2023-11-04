public class Main {
    public static void main(String[] args) {
        Hamburguer hamburguer = new SimpleHamburguer();
        System.out.println("Description: " + hamburguer.description());
        System.out.println("Price: $" + hamburguer.price());

        hamburguer = new Cheese(hamburguer);
        System.out.println("Description: " + hamburguer.description());
        System.out.println("Price: $" + hamburguer.price());

        hamburguer = new Lettuce(hamburguer);
        System.out.println("Description: " + hamburguer.description());
        System.out.println("Price: $" + hamburguer.price());
    }
}
