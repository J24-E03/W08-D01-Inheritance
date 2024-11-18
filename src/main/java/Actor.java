import java.util.ArrayList;
import java.util.List;

public class Actor extends User {
    private String nationality;
    private boolean hasWonOscar;
    private int debutYear;
    private List<Movie> movies;


    public Actor(String name, int age, String nationality, boolean hasWonOscar, int debutYear, List<Movie> movies, String email, String userType) {
        super(name, age, email, userType);

        this.nationality = nationality;
        this.hasWonOscar = hasWonOscar;
        this.debutYear = debutYear;
        this.movies = movies;
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

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
    public void displayUserInfo(){
        super.displayUserInfo();
        System.out.println("Nationality: " + nationality);
        System.out.println("Oscar Winner: " + (hasWonOscar ? "Yes" : "No"));
        System.out.println("Debut Year: " + debutYear);
        System.out.println("Movies: ");
    }
}
