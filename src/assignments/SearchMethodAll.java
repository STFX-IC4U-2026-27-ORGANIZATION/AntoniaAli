package assignments;
import templates.Movie;
import assignments.SearchMethod2;

public class SearchMethodAll {

	public static void main(String[] args) {

		// Search method for all data members
		// Written by Antonia Dobre!
		
		// Test Cases:
		Movie[] a = assignments.ReadFileMethod.loadMoviesFromFile("Movies.txt");
        
        System.out.println("Search 'Inception': index " + searchAll(a, "Inception", 0));
        System.out.println("Search 'DavidLynch': index " + searchAll(a, "DavidLynch", 0));
        System.out.println("Search 'PG13': index " + searchAll(a, "PG13", 0));
		
		
	}
	
	// DESCRIPTION - Checks which search method finds a match
	// PARAMETERS - Movie[] a, word, index
	// RETURN TYPE - int
	public static int searchAll (Movie[] a, String word, int index) {
		
		// variables
		int secondSearch = 0;
		int fourthSearch = 0;
		
		// Checks searchByTitle
		Movie[] title = assignments.SearchMethod1.searchByTitle(a, word);
		
		if (title != null && title.length > 0) {
			
			for (int i = 0; i < a.length; i++) {
				if (a[i] == title[0]) {
					
					return i;
					
				}
				
			}
	
		}
		
		// Checks searchDirector 
		if ((secondSearch = assignments.SearchMethod2.searchDirector(a, word, index)) != -1) {
			
			return secondSearch;
			
		}
		
		// Checks searchByDurationMinutes
		//Movie[] duration = assignments.SearchMethod3.searchByDurationMinutes(a, word);
		
		//if (duration != null && duration.length > 0) {
			
		//	for (int i = 0; i < a.length; i++) {
		//		if (a[i] == duration[0]) {
					
		//			return i;
					
		//		}
				
		//	}
	
		//}
		
		if ((fourthSearch = assignments.SearchMethod4.searchRating(a, word, index)) != -1) {
			
			return fourthSearch;
			
		}
		
		return -1;
		
	}

}
