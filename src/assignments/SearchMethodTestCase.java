package assignments;
import templates.Movie; 

public class SearchMethodTestCase {

	public static void main(String[] args) {
		
		
		// Test Cases for searchTitle
		Movie[] library = ReadFileMethod.loadMoviesFromFile("Movies.txt");


		int results = SearchMethod1.searchTitle(library, "Inception", 0);


		System.out.println(results);

		
		// Test Cases for assigbnments.SearchMethodAll.searchAll
		
		Movie[] movies = ReadFileMethod.loadMoviesFromFile("Movies.txt"); int 

		result1 = assignments.SearchMethodAll.searchAll(movies, "ToyStory", 0); 

		System.out.println("Test 1 Result: " + result1);

		int result2 = assignments.SearchMethodAll.searchAll(movies, "PeterWeir", 0); 

		System.out.println("Test 2 Result: " + result2);


		try { Movie invalid = movies[movies.length]; 
		}
		 
		catch (Exception e) { System.out.println("Caught out of bounds exception"); 
		}
		
		int result5 = assignments.SearchMethodAll.searchAll(movies, "whiPlaSh", 0); 

		System.out.println(result5);
		
		// Test Cases for SearchMethod2
		

		int result4 = assignments.SearchMethod2.searchDirector(movies, "david_lynch", 0); 
		
		System.out.println("Test 4 Result: " + result4);

		
		
	}

}
