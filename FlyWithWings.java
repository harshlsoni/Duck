// Defining a class that represents ducks that can fly using wings
public class FlyWithWings implements FlyBehavior {
    
    // Overriding the fly() method to define flying behavior
    @Override
    public void fly() {
        System.out.println("This duck flies with wings.");
    }
}
