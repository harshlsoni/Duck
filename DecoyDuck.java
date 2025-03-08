// Defining DecoyDuck such that it cannot fly and quack, and also drowns
public class DecoyDuck extends Duck {
    // Defining a Constructor such that it sets behavior dynamically
    public DecoyDuck() {
        super("Decoy Duck", 
              new NoFLy(), // Cannot fly
              new MuteQuack(), // Cannot quack
              new Swim(Swim.SwimType.DROWN)); // Drowns
    }

    // Overriding the display() method to describe DecoyDuck 
    @Override
    public void display() {
        System.out.println("Looks like a wooden decoy duck.");
    }
}
