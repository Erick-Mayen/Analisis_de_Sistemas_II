import lombok.Setter;

public abstract class Duck {
    @Setter
    protected IFly flyBehavior;

    @Setter
    protected ISound soundBehavior;

    public Duck(){}

    @Override
    public String toString() {
        return "Duck{}";
    }

    public void swim(){

        System.out.println("Estoy nadando, incluso puedo flotar");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performSound(){
       soundBehavior.makeSound();
    }
    public abstract void Display();
}

