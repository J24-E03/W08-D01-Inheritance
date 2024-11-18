import java.util.List;

public class Main {
    public static void main(String[] args) {
//Instantiate a few User objects with valid and invalid data.
        User user1 = new User("Monica", 39, "Monica@gmail.com", "Actor");
        User user2 = new User("Rachael", 14, "Rachael@gmail.com", "Director");
        User user3 = new User("Ross", 30, "Ross@gmail.com", "Director");
        //Will display valid data
        user1.displayUserInfo();
        user2.displayUserInfo();
        user3.displayUserInfo();

        //Instantiate a few Actor objects using the updated class.

        Movie movie1= new Movie("Interstellar", "Drama", "A ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft", "Christopher Nolan", 8.7);
        Movie movie2 = new Movie("Gold", "Action", "Kenny decides to go on an adventure to find gold in a desolate jungle.", "Stephen Gaghan", 10);

        Actor actor1 = new Actor("Tom Hanks", 67, "American, ", true, 1984, List.of(movie1),"Tom@gmail.com","Actor");

        Actor actor2 = new Actor("Emma Watson", 34, "American, ", false, 2001, List.of(movie2),"Emma@gmail.com","Actor");

        //Add movies to an actor’s movies list.

        movie1.addActorToMovie(actor1);
        movie2.addActorToMovie(actor1);
        movie2.addActorToMovie(actor2);

        actor1.displayUserInfo();
        actor2.displayUserInfo();
        movie1.displayMovieInfo();
        movie2.displayMovieInfo();
    }

}
