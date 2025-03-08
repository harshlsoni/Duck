// Defining RedheadDuck such that it can fly, quack and swim
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super("Redhead Duck", new FlyWithWings(), new Quack(), new Swim(Swim.SwimType.SWIM));
    }
}
