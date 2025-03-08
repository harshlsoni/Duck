// Defining a class that represents ducks that quack
public class Quack implements QuackBehavior {

    // Overriding the quack() method to define quacking behavior
    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}
