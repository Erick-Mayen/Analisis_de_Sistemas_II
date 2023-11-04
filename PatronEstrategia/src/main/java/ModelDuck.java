public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        soundBehavior = new Mute();
    }

    @Override
    public void Display() {
        System.out.print("Hola, soy un pato modelo");
    }

    @Override
    public String toString(){
        return "ModelDuck{}";
    }

}
