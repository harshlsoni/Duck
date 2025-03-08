// Defining RubberDuck such that it cannot fly, but it can squeak and float
public class RubberDuck extends Duck {
    public RubberDuck() {
        super("Rubber Duck", new NoFLy(), new Squeak(), new Swim(Swim.SwimType.FLOAT));
    }
}
