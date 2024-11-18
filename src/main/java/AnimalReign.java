public class AnimalReign {
    public static void main(String[] args) {
        Animal animal = new Animal(4,2);
        Dog dog = new Dog();
        GermanShepard germanShepard = new GermanShepard();


        // Testing Animal methods
        System.out.println("This is an instance of [Animal]. It has [2] legs and [2] eyes.");
        animal.breathe();  // Animal breathes
        animal.walk();     // Animal walks
        animal.summary();  // Animal summary

        // Testing Dog methods
        System.out.println("This is an instance of [Dog]. It has [4] legs and [2] eyes.");
        dog.breathe();     // Dog breathes
        dog.walk();        // Dog walks
        dog.summary();     // Dog summary

        // Testing GermanShepard methods
        System.out.println("This is an instance of [GermanShepard]. It has [4] legs and [2] eyes.");
        germanShepard.breathe();  // Cannot override breathe()
        germanShepard.walk();     // GermanShepard specific walk
        germanShepard.summary();  // GermanShepherd summary



    }
}
