public class AnimalReign {

    public static void main(String[] args) {
        //Behavior of a human.
        Animal human = new Animal(2, 2);
        human.summary();
        System.out.println();
        human.breathe();
        System.out.println();
        human.walk();
        System.out.println("=====");

        //Behavior of a dog.
        Dog dog = new Dog();
        dog.summary();
        System.out.println();
        dog.breathe();
        System.out.println();
        dog.walk();
        System.out.println("=====");

        //Behavior of a German Shepard.
        GermanShepard germanShepard = new GermanShepard();
        germanShepard.summary();
        System.out.println();
        germanShepard.breathe();
        System.out.println();
        germanShepard.walk();
        System.out.println("=====");
    }
}
