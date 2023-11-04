public class MallarDuck extends Duck{
    public MallarDuck() {
        super.flyBehavior = new FlyWithWings();
        soundBehavior = new Quack();
    }

    @Override
    public void Display() {
        System.out.println("Hola, soy un pato silvestre");
    }

    @Override
    public String toString(){
        return "MallarDuck{}";
    }

}
