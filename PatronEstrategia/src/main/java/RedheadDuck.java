public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        soundBehavior = new Quack();
    }

    @Override
    public void Display() {
        System.out.print("Hola, soy un pato de cabeza roja");

    }

    @Override
    public String toString() {
        return "RedheadDuck{}";
    }
}