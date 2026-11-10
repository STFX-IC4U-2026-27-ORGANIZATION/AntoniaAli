package assignments;
import templates.Movie;

public class SearchMethod1 {

    public static void main(String[] args) {
        // Search method for data member 1 (Title)
    }

    // DESCRIPTION - Searches if the title is found as a data member in array a
    // PARAMETERS  - Movie[] a, String title, int index
    // RETURN TYPE - int
    public static int searchTitle(Movie[] a, String title, int index) {
        
        // error case
        if (index < 0 || index > (a.length - 1) || a.length <= 0) {
            return -1;
        }

        // base (stop) case - item found
        if (a[index].getTitle().equalsIgnoreCase(title)) {
            return index;
        }

        // base (stop) case - passed target in sorted array (optional, matching SearchMethod2)
        if (a[index].getTitle().compareToIgnoreCase(title) > 0) {
            return -1;
        }

        // recursive call
        return searchTitle(a, title, index + 1);
    }
}