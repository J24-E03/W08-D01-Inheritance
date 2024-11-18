package org.dcistudent.models.wildness;

import jakarta.validation.constraints.NotNull;

public class Dog extends Animal {
    /**
     * Creates a new dog.
     */
    public Dog() {
        super(4, 2);
    }

    /**
     * Makes the dog breathe.
     */
    @Override
    public final void breathe() {
        super.breathe();
        System.out.println("Dogs love to breathe with their mouths open.");
    }

    /**
     * Makes the dog walk.
     */
    @Override
    public void walk() {
        super.walk();
        System.out.println("Dogs love to run.");
    }
}
