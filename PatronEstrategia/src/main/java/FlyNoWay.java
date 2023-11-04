public class FlyNoWay implements IFly{
    public FlyNoWay() {
    }

    @Override
    public void fly() {
        System.out.print("No puedo Volar");
    }

    @Override
    public String toString() {
        return "FlyNoWay{}";
    }
}
