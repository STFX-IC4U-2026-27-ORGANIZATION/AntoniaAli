package assignments;
import templates.Movie;

public class MovieTestCase {

	public static void main(String[] args) {


		// Test Case 1:

		Movie m1 = new Movie();

		System.out.println(m1.getTitle());
		
		// Expected Output: Empty
		
		// Test Case 2:
		Movie m2 = new Movie("Inception", "Christopher_Nolan", "148", "PG-13");

		System.out.println(m2.getDirector()); 
		
		// Expected Output: Christopher_Nolan


		// All Test Cases work!
		
		
		
	}

}
