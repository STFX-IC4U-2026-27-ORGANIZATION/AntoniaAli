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
		int firstSearch = 0;
		int secondSearch = 0;
		int thirdSearch = 0;
		int fourthSearch = 0;
		
		// Checks searchTitle
		if ((firstSearch = assignments.SearchMethod1.searchTitle(a, word, index)) != -1) {
			
			return firstSearch;
			
		}
		
		// Checks searchDirector 
		if ((secondSearch = assignments.SearchMethod2.searchDirector(a, word, index)) != -1) {
			
			return secondSearch;
			
		}
		
		// Checks searchDuration
		//if ((thirdSearch = assignments.SearchMethod3.searchDuration(a, word, index)) != -1) {
		
		//	return thirdSearch;
			
		//}
		
		// Checks searchRating
		if ((fourthSearch = assignments.SearchMethod4.searchRating(a, word, index)) != -1) {
			
			return fourthSearch;
			
		}
		
		return -1;
		
	}

}
