package sandbox;
import templates.Movie; 
import assignments.ReadFileMethod; 

public class SearchMethodTestCase {

	public static void main(String[] args) {
		
				
		Movie[] movies = ReadFileMethod.loadMoviesFromFile("Movies.txt"); int 

		result1 = assignments.SearchMethodAll.searchAll(movies, "ToyStory", 0); 

		System.out.println("Test 1 Result: " + result1);

		int result2 = assignments.SearchMethodAll.searchAll(movies, "PeterWeir", 0); 

		System.out.println("Test 2 Result: " + result2);


		try { Movie invalid = movies[movies.length]; 
		}
		 
		catch (Exception e) { System.out.println("Caught out of bounds exception"); 
		}

		
	}

}
