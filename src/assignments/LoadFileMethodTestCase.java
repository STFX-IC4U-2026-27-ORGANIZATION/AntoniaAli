package assignments;
import templates.Movie;
import assignments.ReadFileMethod;

public class LoadFileMethodTestCase {

	public static void main(String[] args) {

		// Test Case 1:
		
		String fileName = "Movies.txt";

		Movie[] movies = ReadFileMethod.loadMoviesFromFile(fileName);

		System.out.println(movies[0].getTitle());
		System.out.println(movies[1].getTitle());

		
		// Test Case 2:
		
		Movie[] movies1 = ReadFileMethod.loadMoviesFromFile("NonexistentFile.txt");
		System.out.println(movies1.length);
		
		// Test Case 3:
		
		Movie[] movies2 = ReadFileMethod.loadMoviesFromFile("Empty.txt");

		System.out.println(movies2.length);

		
		// Text Case 4:
		System.out.println(movies[0].getTitle() + "\n" + movies[0].getDirector() + "\n" + movies[0].getDurationMinutes() + "\n" + movies[0].getRating());
		
		// Test Case 5:
		System.out.println("Loaded " + movies.length + " movies");
		
		// Test Case 6:
		System.out.println(movies.length);
		System.out.println("Movie 2 Director: " + movies[1].getDirector());
		
		// Test Case 7:
		System.out.println("Index 0 exists:" + (movies[0] != null && movies.length > 0));
		
		// Test Case 8:
		System.out.println("Array exists: " + (movies != null));
		
		// Test Case 9:
		System.out.println("Last index: " + (movies.length - 1));
		
		// Test Case 10:
		try { 
		    
			Movie invalid =    movies[movies.length]; 
		
		} 

		catch (Exception e) { 
			
			System.out.println("Caught out of bounds exception"); 
		} 


		
	}
	
}
