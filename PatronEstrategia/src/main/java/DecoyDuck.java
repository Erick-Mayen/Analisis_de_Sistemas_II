public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        soundBehavior = new Mute();
    }

    @Override
    public void Display() {
        System.out.print("Hola, soy un pato señuelo");

    }

    @Override
    public String toString() {
        return "DecoyDuck{}";
    }
}