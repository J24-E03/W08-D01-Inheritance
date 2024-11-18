package exercise;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Lucky",2,"brown");

        Animal dog2 = new Dog("Sparky",3,"White");


        System.out.println(dog.toString());

        System.out.println(dog.equals("SOme string"));
    }
}
