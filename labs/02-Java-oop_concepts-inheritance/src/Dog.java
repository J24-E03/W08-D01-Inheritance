public class Dog extends Animal {
    private static final int NUM_OF_LEGS = 4;
    private static final int NUM_OF_EYES = 2;

    //TODO have a default constructor for Dog, with 4 legs and 2 eyes!
    public Dog() {
        super(NUM_OF_LEGS, NUM_OF_EYES);
    }

    //TODO override the breathe() method!
    public final void breathe() {
        super.breathe();
        System.out.println("Dogs love to breathe with their mouths open.");
    }

    //TODO override the walk() method!
    public void walk() {
        super.walk();
        System.out.println("Dogs love to run.");
    }
}
