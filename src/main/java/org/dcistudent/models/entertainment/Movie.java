package org.dcistudent.models.entertainment;

import jakarta.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Getter @Setter
public class Movie {
    @NotBlank
    private String title;
    @NotBlank
    private String genre;
    @NotBlank
    private String plot;
    @NotBlank
    private String director;
    @NotNull
    private Double rating;
    @NotNull.List(@NotNull)
    private final List<Actor> actors = new ArrayList<>();
    @NotNull.List(@NotNull)
    private static final List<String> genres = new ArrayList<>();

    static {
        genres.addAll(List.of("Action", "Adventure", "Comedy", "Crime", "Drama"));
    }

    /**
     * Creates a new movie.
     *
     * @param title the title of the movie
     * @param genre the genre of the movie
     * @param plot the plot of the movie
     * @param director the director of the movie
     * @param rating the rating of the movie
     * @param actors the actors in the movie
     */
    public Movie(
        @NotBlank String title,
        @NotBlank String genre,
        @NotBlank String plot,
        @NotBlank String director,
        @NotNull Double rating,
        @NotNull.List(@NotNull) List<Actor> actors
    ) {
        this.setTitle(title);
        this.setGenre(genre);
        this.setPlot(plot);
        this.setDirector(director);
        this.setRating(rating);
        this.getActors().addAll(actors);
    }

    /**
     * Sets the genre of the movie.
     *
     * @param genre the genre of the movie
     * @return the genre of the movie
     */
    public Movie setGenre(@NotBlank String genre) {
        if (genres.contains(genre)) {
            this.genre = genre;

            return this;
        }

        System.out.println(
            "Currently we do not support this genre on our site. Please use the addGenre() method to add a new genre."
        );

        return this;
    }

    /**
     * Adds a new genre to the list of genres.
     *
     * @param genre the genre to add to the list of genres
     * @return true if the genre was added to the list of genres, false otherwise
     */
    public boolean addGenre(@NotBlank String genre) {
        if (genres.contains(genre.toLowerCase())) {
            System.out.println("Genre already exists.");

            return false;
        }

        return genres.add(genre);
    }

    /**
     * Sets the rating of the movie.
     *
     * @param rating the rating of the movie
     * @return the rating of the movie
     */
    public Double setRating(@NotBlank Double rating) {
        if (rating < 0 || rating > 10) {
            System.out.println("Invalid rating. Please enter a value between 0 and 10.");

            return this.rating;
        }

        this.rating = rating;

        return this.rating;
    }

    /**
     * Adds an actor to the movie.
     *
     * @param actor the actor to add to the movie
     * @return true if the actor was added to the movie, false otherwise
     */
    public boolean addActor(@NotBlank Actor actor) {
        if (this.getActors().contains(actor)) {
            System.out.println("Actor already exists in the movie.");

            return false;
        }

        return this.getActors().add(actor);
    }

    /**
     * Displays the movie information.
     *
     * @return String representation of the movie
     */
    public String toString() {
        StringBuilder movieInfo = new StringBuilder();
        movieInfo.append("Title: ").append(this.getTitle()).append("\n");
        movieInfo.append("Genre: ").append(this.getGenre()).append("\n");
        movieInfo.append("Plot: ").append(this.getPlot()).append("\n");
        movieInfo.append("Director: ").append(this.getDirector()).append("\n");
        movieInfo.append("Rating: ").append(this.getRating()).append("\n");
        movieInfo.append("--- Actors ---\n");
        for (Actor actor : this.getActors()) {
            movieInfo.append(actor).append("\n");
        }

        return movieInfo.toString();
    }

    /**
     * Finds an actor in the movie.
     *
     * @param actor the actor to find in the movie
     * @return true if the actor was found in the movie, false otherwise
     */
    public boolean findActor(@NotBlank Actor actor) {
        return this.actors.contains(actor);
    }
}
