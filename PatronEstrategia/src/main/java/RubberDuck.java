public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        soundBehavior = new Squeak();
    }

    @Override
    public void Display() {
        System.out.print("Hola, soy un pato de goma");

    }

    @Override
    public String toString() {
        return "RubberDuck{}";
    }
}
