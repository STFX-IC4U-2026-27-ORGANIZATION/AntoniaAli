package assignments;

import java.util.ArrayList;
import templates.Movie;
import java.io.*;

public class ReadFileMethod {

	public static void main(String[] args) {

		// Read file method
		
	}
	
	// DESCRIPTION - Returns Movie[] populated with Movie objects from file
	// PARAMETERS - String fileName
	// RETURN TYPE - Movie[]
	public static Movie[] loadMoviesFromFile (String fileName) {
		
		//variables
		ArrayList<Movie> movies = new ArrayList<Movie>();
		BufferedReader br = null;
		String title, director, durationMinutes, rating, split;
		
		try {
			
			// load file into memory
			br = new BufferedReader(new FileReader(fileName));
			
			while ( (split = br.readLine()) != null) {
				
				String[] movieInfo = split.split(" ");
				title = movieInfo[0];
				director = movieInfo[1];
				durationMinutes = movieInfo[2];
				rating = movieInfo[3];
				
				movies.add(new Movie (title, director, durationMinutes, rating));
				
				
			}
			
			// close BufferedReader
			br.close();
			
		}
		
		catch(Exception e) {
			
			System.out.println("Failed to read file.");
			
		}
		
		// convert ArrayList to array
		Movie[] moviesInfo = new Movie[movies.size()];
		
		// copy all elements from ArrayList to array
		movies.toArray(moviesInfo);
		
		// clear ArrayList
		movies.clear();
		
		return moviesInfo;
		
	}

	

}
