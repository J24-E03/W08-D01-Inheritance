package movie.database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Actor extends User{
    private String nationality;
    private boolean hasWonOscar;
    private int debutYear;
    private ArrayList<Movie> movies;

    // Constructor
    public Actor(String name, int age, String nationality, String email, String userType, boolean hasWonOscar, int debutYear) {
        super(name, age, email, userType);
        checkNationalityValidity(nationality);
        checkDebutYearValidity(debutYear);
        this.hasWonOscar = hasWonOscar;
        this.movies = new ArrayList<>();

    }

    // Getters
    public boolean getHasWonOscar() {
        return hasWonOscar;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public String getNationality() {

        return nationality;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    // Setters
    public void setHasWonOscar(boolean hasWonOscar) {
        this.hasWonOscar = hasWonOscar;
    }

    public void setDebutYear(int debutYear) {
        checkDebutYearValidity(debutYear);
    }

    public void setNationality(String nationality) {
       checkNationalityValidity(nationality);
    }

    public void setMovies(ArrayList<Movie> movies) {
        if (!movies.isEmpty()) {
            this.movies = movies;
        }
    }

    private void checkNationalityValidity(String nationality) {
        if (nationality.isBlank()) {
            System.out.println("User's nationality cannot be blank!");
            this.nationality = "Unknown nationality";
            return;

        }
        this.nationality = nationality;
    }

    private void checkDebutYearValidity(int debutYear) {
        if (debutYear < LocalDate.now().getYear() - this.getAge()) {
            System.out.println("Actor's debut year is invalid!\n");
            return;
        }
        this.debutYear = debutYear;
    }

    public void displayUserInfo() {
        super.displayUserInfo();
        System.out.println(Colors.DARK_GREEN + "Nationality" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + nationality );
        System.out.println(Colors.DARK_GREEN + "WonOscar" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + hasWonOscar) ;
        System.out.println(Colors.DARK_GREEN + "Movies" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + movies) ;
    }

    public void addMovieToActor(Movie movie) {
        if (movies.contains(movie)) {
            System.out.println("Movie already in the list.\n");
            return;
        }
        movies.add(movie);
    }

    public String toString() {
        return super.toString() +", Nationality = " + nationality + ", hasWonOscar = " + hasWonOscar + ", debuteYear = " + debutYear;
    }
}
