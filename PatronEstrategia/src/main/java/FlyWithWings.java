public class FlyWithWings implements IFly{

    public FlyWithWings() {
    }

    @Override
    public void fly() {
        System.out.print("Estoy volando...");
    }

    @Override
    public String toString() {
        return "FlyWithWings{}";
    }

}
