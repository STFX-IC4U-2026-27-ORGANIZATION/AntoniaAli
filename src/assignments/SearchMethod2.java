package assignments;
import templates.Movie;

public class SearchMethod2 {

	public static void main(String[] args) {

		// Search method for data member 2
		
	}
	
	
	// DESCRIPTION - Searches if the director is found as a data member in array a
	// PARAMETERS - Movie[] a, String director, int index
	// RETURN TYPE - int
	public static int searchDirector (Movie[] a, String director, int index) {
		
		// error case
		if (index < 0 || index > (a.length - 1) || a.length <= 0) {
			
			return -1;
		}		
		
		// base case
		if (a[index].getDirector().equals(director)) {
			
			return index;
			
		}
		
		// recursive call
		return searchDirector(a, director, index + 1);
				
	}

}
