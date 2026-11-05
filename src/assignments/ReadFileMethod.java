package assignments;

import assignments.Movie;
import java.util.ArrayList;
import java.io.*;

public class ReadFileMethod {

	public static void main(String[] args) {

		// Read file method
		
	}
	
	// DESCRIPTION -
	// PARAMETERS -
	// RETURN TYPE -
	public static Movie[] readMoviesFromFile (String fileName) {
		
		//variables
		ArrayList<Movie> movies = new ArrayList<Movie>();
		BufferedReader br = null;
		String title;
		
		try {
			
			// load file into memory
			br = new BufferedReader(new FileReader(fileName));
			
			while ( (title = br.readLine()) != null) {
				
				//movies.add(tile, br.readLine(), br.readLine(), br.readLine());
				
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
