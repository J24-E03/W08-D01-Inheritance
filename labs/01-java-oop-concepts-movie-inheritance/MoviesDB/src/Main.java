import movie.database.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Create Users
        User user1 = new User("Tom Hanks", 65, "tom.hanks@gmail.com", "Actor");
        User user2 = new User("Invalid User", -5, "invalid-email", "Director");
        User user3 = new User("", 30, "valid.email@example.com", "Producer");

        user1.displayUserInfo();
        user2.displayUserInfo();
        user3.displayUserInfo();

        System.out.println();

        // Create Actors
        Actor actor1 = new Actor("Leonardo DiCaprio", 46, "American", "leo.dicap@gmai.com", "Actor", true, 1991);
        Actor actor2 = new Actor("Kate Winslet", 45, "British", "kate.winselt@gmailcom", "Actor" , false, 1991);

        // Create Movie
        Movie titanic = new Movie("Titanic", "Drama", "A love story on the doomed ship", "James Cameron", 9.0, new ArrayList<>(Arrays.asList(actor1, actor2)));

        Actor actor3 = new Actor("Billy Zane", 58, "american", "billy.zane@gmail.com", "Actor", false, 1985);
        addActorToMovie(actor3, titanic);

        actor1.addMovieToActor(titanic);
        actor2.addMovieToActor(titanic);
        actor3.addMovieToActor(titanic);

        System.out.println(titanic);
        titanic.displayMovieInfo();

        System.out.println();

        System.out.println(actor1);
        actor1.displayUserInfo();


    }

    public static String compareTwoMovies(Movie movie1, Movie movie2) {
        return (movie1.getRating() > movie2.getRating() ? movie1.getTitle() + " has a better ranking with a rating of " + movie1.getRating() + "." : movie2.getTitle() + " has a better ranking with a rating of " + movie2.getRating() + ".");
    }

    public static void addActorToMovie(Actor actor, Movie movie){
        movie.addNewActor(actor);
    }


}
