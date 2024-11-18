package org.dcistudent.models.wildness;

public class AnimalReign {
    public static void main(String[] args) { new AnimalReign(); }

    public AnimalReign() {
        Animal human = new Animal(2, 2);
        System.out.println(human.stringRepresentation());
        human.breathe();
        human.walk();

        System.out.println("=====");

        Dog dog = new Dog();
        System.out.println(dog.stringRepresentation());
        dog.breathe();
        dog.walk();

        System.out.println("=====");

        GermanShepard germanShepard = new GermanShepard();
        System.out.println(germanShepard.stringRepresentation());
        germanShepard.breathe();
        germanShepard.walk();
    }
}
