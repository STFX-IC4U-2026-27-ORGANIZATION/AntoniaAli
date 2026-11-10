package assignments;
import templates.Movie;

public class SearchMethod4 {

	public static void main(String[] args) {

		// Search method for data member 4
		// Written by Antonia Dobre!
		
		// Test Cases:
		Movie[] a = assignments.ReadFileMethod.loadMoviesFromFile("Movies.txt");
		
		System.out.println(searchRating(a, "R17", 0));
		
		// Expected Output: 4
		
	}
	
	// DESCRIPTION - Searches if the rating is found as a data member in array a
	// PARAMETERS - Movie[] a, String rating, int index
	// RETURN TYPE - int
	public static int searchRating (Movie[] a, String rating, int index) {
		
		// error case
		if (index < 0 || index >= a.length - 1 || a.length == 0 || a == null) {
			
			return -1;
		}		
		
		// base (stop) case
		if (a[index].getRating().compareToIgnoreCase(rating) == 0) {
			
			return index;
		}
		
		
		// recursive call
		return searchRating(a, rating, index + 1);
				
	}

}
