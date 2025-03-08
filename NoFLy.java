// Defining a class that represents ducks that cannot fly 
public class NoFLy implements FlyBehavior {

    // Overriding the fly() method to define flying behavior
    @Override
    public void fly() {
        System.out.println("This duck cannot fly.");
    }
}
