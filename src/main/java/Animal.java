public class Animal {
    //properties
    int numberOfLegs;
    int numberOfEyes;
//Constructor
public Animal(int numberOfLegs, int numberOfEyes) {
    this.numberOfLegs = numberOfLegs;
    this.numberOfEyes = numberOfEyes;
}

//Behavior Methods
    public void breathe(){
        System.out.println("Animal is breathing.");
    }
    public void walk() {
        System.out.println("Animal is walking.");
    }
    // Final method that cannot be overridden
    public final void summary() {
        System.out.println("This animal has " + numberOfLegs + " legs and " + numberOfEyes + " eyes.");
    }
}
