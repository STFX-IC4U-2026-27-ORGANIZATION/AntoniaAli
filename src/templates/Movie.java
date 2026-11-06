package templates;

public class Movie {

    // data members
    String title;
    String director;
    String durationMinutes;
    String rating;

    // default constructor
    public Movie() {
        this.title = "";
        this.director = "";
        this.durationMinutes = ".";
        this.rating = "";
    }

    // parameterized constructor
    public Movie(String title, String director, String durationMinutes, String rating) {
        this.title = title;
        this.director = director;
        this.durationMinutes = durationMinutes;
        this.rating = rating;
    }

    // get method
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getDurationMinutes() {
        return durationMinutes;
    }

    public String getRating() {
        return rating;
    }

    // set method
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDurationMinutes(String durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    // Override toString()
    public String toString() {
        return title.replace("_", " ") + " - " + director.replace("_", " ") + " (" + durationMinutes + " mins, " + rating + ")";
    }
}