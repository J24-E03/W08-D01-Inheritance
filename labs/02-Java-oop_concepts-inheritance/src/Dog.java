public class Dog extends Animal {
    //TODO have a default constructor for Dog, with 4 legs and 2 eyes!
    public Dog(){
        super(4,2);
    }

    //TODO override the breathe() method!

    public final void breathe() {
        System.out.println("TheDogs love to breathe with their mouths open.");
    }

    //TODO override the walk() method!

    public void walk() {
        System.out.println("Dogs love to run.");
    }
}
