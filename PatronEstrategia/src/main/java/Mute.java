public class Mute implements ISound {
    public Mute() {
    }

    @Override
    public void makeSound() {
        System.out.println("No hago ningun sonido");
    }

    @Override
    public String toString() {
        return "Mute{}";
    }
}
