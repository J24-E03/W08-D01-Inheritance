public class Tasks {
    public static void main(String[] args) {
        User user = new User("Tom", 32, "tom@gmail.com", 1);
        System.out.println(user + "\n");
        User user1 = new User("", -1, "tomgmail.com", -1);
        System.out.println(user1 + "\n");
        Actor actor = new Actor("Jack", 25, "jack@gmail.com", 0, "german", 2012);
        System.out.println(actor + "\n");
        Actor actor1 = new Actor("", 360, "jackgmail.com", 25, "american", 2006);
        System.out.println(actor1 + "\n");

        actor.addMovieToActor(new Movie("Spiderman", "Action", "Hello World!", "Tom Cruise", 5.0, null));
        System.out.println(actor.getMovies());
    }
}
