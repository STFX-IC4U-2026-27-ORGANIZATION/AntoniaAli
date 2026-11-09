package assignments;
import templates.Movie;
import assignments.SearchMethod2;

public class SearchMethodAll {

	public static void main(String[] args) {

		// Search method for all data members
		
		
	}
	
	// DESCRIPTION - Checks which search method returns a value that is not -1
	// PARAMETERS - Movie[] a, word, index
	// RETURN TYPE - int
	public static int searchAll (Movie[] a, String word, int index) {
		
		// variables
		int firstSearch = 0;
		int secondSearch = 0;
		int thirdSearch = 0;
		int fourthSearch = 0;
		
		//if ( (firstSearch = assignments.SearchMethod1.searchTitle(a, word, index)) != -1) {
			
		//	return firstSearch;
		//}
		
		if ((secondSearch = assignments.SearchMethod2.searchDirector(a, word, index)) != -1) {
			
			return secondSearch;
			
		}
		
		//else if ((thirdSearch = assignments.SearchMethod2.searchDurationMinutes(a, word, index)) != -1) {
			
		//	return thirdSearch;
			
		//}
		
		else if ((fourthSearch = assignments.SearchMethod4.searchRating(a, word, index)) != -1) {
			
			return fourthSearch;
			
		}
		
		return -1;
		
	}

}
