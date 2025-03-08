// Defining a class that represents duck's swimming behaviors
public class Swim implements SwimBehavior {
  
    // Defining all possible swimming behaviors
    public enum SwimType { SWIM, FLOAT, DROWN }

    // Declaring a private final variable to store the swimming behavior of the duck
    private final SwimType swimType;

    // Initializing swimming behavior with a specified SwimType
    public Swim(SwimType swimType) {
        this.swimType = swimType;
    }

    // Overriding the swim() method to define swimming behavior
    @Override
    public void swim() {
        // This executes different swimming behaviors based on swimType
        switch (swimType) {
            case SWIM -> System.out.println("This duck is swimming gracefully.");
            case FLOAT -> System.out.println("This duck is floating on the water.");
            case DROWN -> System.out.println("This duck is struggling and drowning.");
        } 
    }
}
