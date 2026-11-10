package assignments;
import templates.Movie;

public class SearchMethod2 {

	public static void main(String[] args) {

		// Search method for data member 2
		// Written by Antonia Dobre!
		
		// Test Cases:
		Movie[] a = assignments.ReadFileMethod.loadMoviesFromFile("Movies.txt");
		
		System.out.println(searchDirector(a, "DavidLynch", 0));
		
		// Expected Output: 8
		
	}
	
	
	// DESCRIPTION - Searches if the director is found as a data member in array a
	// PARAMETERS - Movie[] a, String director, int index
	// RETURN TYPE - int
	public static int searchDirector (Movie[] a, String director, int index) {
		
		// error case
		if (index < 0 || index >= a.length || a == null || a.length == 0) {
			
			return -1;
		}		
		
		// base (stop) case
		if (a[index].getDirector().compareToIgnoreCase(director) == 0) {
			
			return index;
		}
		
		// recursive call
		return searchDirector(a, director, index + 1);
				
	}

}
