public class FlyLikeRocket implements IFly{
    public FlyLikeRocket() {
    }

    @Override
    public void fly() {
        System.out.print("Vuelo como cohete");
    }

    @Override
    public String toString() {
        return "FlyLikeRocket{}";
    }
}
