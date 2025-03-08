// Defining a class that represents ducks that squeak (like RubberDuck)
public class Squeak implements QuackBehavior {

    // Overriding the quack() method to define quacking behavior
    @Override
    public void quack() {
        System.out.println("This duck squeaks.");
    }
}
