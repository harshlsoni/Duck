// Defining MallardDuck such that it can fly, quack and swim
public class MallardDuck extends Duck {
    public MallardDuck() {
        super("Mallard Duck", new FlyWithWings(), new Quack(), new Swim(Swim.SwimType.SWIM));
    }
}
