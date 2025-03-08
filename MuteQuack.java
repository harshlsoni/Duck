// Defining a class that represents ducks that cannot quack
public class MuteQuack implements QuackBehavior {

    // Overriding the quack() method to define quacking behavior
    @Override
    public void quack() {
        System.out.println("< Silence >");
    }
}
