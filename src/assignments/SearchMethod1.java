package assignments;

import templates.Movie;
import java.util.ArrayList;
import java.util.List;

public class SearchMethod1 {

    // DESCRIPTION - main method to run test cases for search by title
    // PARAMETERS - String[] args
    // RETURN TYPE - void
    public static void main(String[] args) {
        Movie[] library = ReadFileMethod.loadMoviesFromFile("Movies.txt");

        // Test Case 1: Search existing title
        Movie[] results1 = searchByTitle(library, "Inception");
        if (results1.length > 0) {
            System.out.println(results1[0].getTitle());
        }

        // Test Case 2: Case-insensitive search
        Movie[] results2 = searchByTitle(library, "inception");
        if (results2.length > 0) {
            System.out.println(results2[0].getTitle());
        }

        // Test Case 3: Search non-existent title
        Movie[] results3 = searchByTitle(library, "Avatar");
        System.out.println(results3.length);
    }

    // DESCRIPTION - searches array of Movie objects by Title using dynamic ArrayList filtering
    // PARAMETERS - Movie[] movies, String searchTitle
    // RETURN TYPE - Movie[]
    public static Movie[] searchByTitle(Movie[] movies, String searchTitle) {
        if (movies == null || searchTitle == null || searchTitle.trim().isEmpty()) {
            return new Movie[0];
        }

        List<Movie> matches = new ArrayList<>();
        String query = searchTitle.trim();

        for (Movie movie : movies) {
            if (movie != null && movie.getTitle().equalsIgnoreCase(query)) {
                matches.add(movie);
            }
        }

        return matches.toArray(new Movie[0]);
    }
}