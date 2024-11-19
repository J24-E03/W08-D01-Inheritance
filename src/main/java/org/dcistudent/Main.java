package org.dcistudent;

import java.util.List;
import org.dcistudent.models.entertainment.*;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        this.Movies();
    }

    public void Movies() {
        User user1 = new User("User #1", 31, "user1@example.com");
        User user2 = new User("User #2", 33, "user2@example.com");
        Actor actor = new Actor(
            "Tom Hanks", 65, "tom.hanks@gmail.com", "American", true, 1980
        );
        Movie movie = new Movie(
            "Forrest Gump",
            "Drama",
            "The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate, and other historical events unfold.",
            "Robert Zemeckis",
            8.8,
            List.of(actor)
        );
        actor.addMovie(movie);

        System.out.println(actor);
        System.out.println("----------");
        System.out.println(movie);
    }
}