public class Dog extends Animal {
    // Default constructor for Dog, passing values to the Animal constructor
    public Dog() {
        super(4,2);
    }
    // Overriding the breathe() method in Dog class
    public final void breathe() {
        super.breathe();
        System.out.println("Dogs love to breathe with their mouths open.");
    }
    public void walk(){
        super.walk();
        System.out.println("Dogs love to run.");
    }

}
