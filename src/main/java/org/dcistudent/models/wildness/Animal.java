package org.dcistudent.models.wildness;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Animal {
    @NotNull private int numberOfLegs;
    @NotNull int numberOfEyes;

    /**
     * Creates a new animal.
     *
     * @param numberOfLegs the number of legs of the animal
     * @param numberOfEyes the number of eyes of the animal
     */
    protected Animal(@NotNull int numberOfLegs, @NotNull int numberOfEyes) {
        this.setNumberOfLegs(numberOfLegs);
        this.setNumberOfEyes(numberOfEyes);
    }

    /**
     * Makes the animal breathe.
     */
    public void breathe() {
        System.out.println("The " + this.getClass().getSimpleName() + " is breathing.");
    }

    /**
     * Makes the animal walk.
     */
    public void walk() {
        System.out.println("Walking with [" + this.getNumberOfLegs() + "] legs.");
    }

    public final String stringRepresentation() {
        return
            "This is an instance of [" + this.getClass().getSimpleName() +
            "]. It has [" + this.getNumberOfLegs() +
            "] legs and [" + this.getNumberOfEyes() +
            "] eyes.";
    }
}
