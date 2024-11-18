import java.time.LocalDate;
import java.util.ArrayList;

public class Actor extends User {
    private String nationality;
    private boolean hasWonOscar;
    private int debutYear;
    private ArrayList<Movie> movies = new ArrayList<>();

    public Actor(String name, int age, String email, int userType, String nationality, int debutYear) {
        super(name, age, email, userType);
        this.nationality = nationality;
        this.debutYear = debutYear;
    }

    @Override
    public String toString() {
        return super.toString() +
                "{" +
                "nationality='" + nationality + '\'' +
                ", hasWonOscar=" + hasWonOscar +
                ", debutYear=" + debutYear +
                ", movies=" + movies +
                '}';
    }

    protected void addMovieToActor(Movie movie) {
        if (movies.contains(movie)) {
            System.out.println("The movie is already on the list!");
        } else {
            movies.add(movie);
        }
    }

    private static void addActorToMovie(Actor actor, Movie movie) {
        movie.addActorToMovie(actor);
    }

    private void validateNationality(String nationality) {
        if (!nationality.isEmpty()) {
            this.nationality = nationality;
        } else {
            System.out.println("Actor's nationality is invalid!");
        }
    }

    private void validateDebutYear(int debutYear) {
        int yearOfBirth = LocalDate.now().getYear() - getAge();
        if (debutYear > yearOfBirth && debutYear < yearOfBirth + 130) {
            this.debutYear = debutYear;
        } else {
            System.out.println("Actor's debut year is invalid!");
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isHasWonOscar() {
        return hasWonOscar;
    }

    public void setHasWonOscar(boolean hasWonOscar) {
        this.hasWonOscar = hasWonOscar;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(int debutYear) {
        this.debutYear = debutYear;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}
