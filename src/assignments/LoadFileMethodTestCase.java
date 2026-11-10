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
		
		// Test Case
		// ....
		
	}
	
}
