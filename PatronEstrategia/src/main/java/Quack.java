public class Quack implements ISound {
    public Quack() {
    }

    @Override
    public void makeSound() {
        System.out.println("Quack, Quack");
    }

    @Override
    public String toString() {
        return "Quack{}";
    }
}
