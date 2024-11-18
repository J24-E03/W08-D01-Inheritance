public class Animal {
    int numberOfLegs;
    int numberOfEyes;

    public Animal() {
    }

    public Animal(int numberOfLegs, int numberOfEyes) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void breathe() {
        System.out.println("The " + this.getClass().getSimpleName() + " is breathing.");
    }

    public void walk() {
        System.out.println("Walking with [" + this.getNumberOfLegs() + "] legs.");
    }

    public final void summary() {
        System.out.println("This is an instance of [" + this.getClass().getSimpleName() + "]. It has [" + this.getNumberOfLegs() +
                "] " +
                "legs and [" + this.getNumberOfEyes() + "] eyes.");
    }
}
