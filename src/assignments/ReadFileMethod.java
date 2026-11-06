package assignments;

import java.util.ArrayList;
import templates.Movie;
import java.io.*;

public class ReadFileMethod {

	public static void main(String[] args) {

		// Read file method
		
	}
	
	// DESCRIPTION -
	// PARAMETERS -
	// RETURN TYPE -
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
				//movies.add(temp, temp, temp, temp);
				
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
