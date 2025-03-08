// Defining an abstract class for common Duck properties
public abstract class Duck {
    // Defining protected variables for Duck's name and its behaviors
    protected String name;
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected SwimBehavior swimBehavior;

    // Defining a Constructor to initialize Duck properties
    public Duck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior, SwimBehavior swimBehavior) {
        this.name = name;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.swimBehavior = swimBehavior;
    }

    // Method to display the duck's name and type
    public void display() {
        System.out.println("\n" + name + " behavior:");
    }

    // Method to execute the duck's fly behaviour
    public void performFly() {
        flyBehavior.fly();
    }

    // Method to execute the duck's quack behaviour
    public void performQuack() {
        quackBehavior.quack();
    }

    // Method to execute the duck's swim behaviour
    public void performSwim() {
        swimBehavior.swim();
    }
}
