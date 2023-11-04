public class Squeak implements ISound {
    public Squeak() {
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak, Squeak");
    }

    @Override
    public String toString() {
        return "Squeak{}";
    }
}
