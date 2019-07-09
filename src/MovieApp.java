import java.util.Scanner;

public class MovieApp {

	private static final String IsValid = null;

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		char end;
		String input = " ";
						
		Movie [] movie = new Movie[10];
		
		 movie[0] = new Movie("Grease", "muscial");
		 movie[1] = new Movie("Chicago", "muscial");
		 movie[2] = new Movie("An Affair to Remember", "drama");
		 movie[3] = new Movie("Grease II", "muscial");
		 movie[4] = new Movie("Batman", "adventure");
		 movie[5] = new Movie("Postcards from the Edge", "drama");
		 movie[6] = new Movie("Eron", "documentary");
		 movie[7] = new Movie("Black Panther", "sci-fi");
		 movie[8] = new Movie("Star Trek", "sci-fi");
		 movie[9] = new Movie("Star Wars", "sci-fi");
		 
		do {
			 System.out.println("Movie categories: ");
			 System.out.println("------------------");
			 System.out.println("Drama, Sci-fi, Adventure, Musical");
			 System.out.println();
			 System.out.println("Enter catergory of movie: ");
			  input = scnr.nextLine();
			  input = input.toLowerCase();
			  
			  for (int i = 0; i < movie.length; i++) {
				  				  
				  if (movie[i].getCategory().equals(input)) {
				  System.out.println("Movie: " + movie[i].getMovieName());
				  }
			  }
			  scnr.nextLine();
			  System.out.println("Do you want to continue? ");
			  end = scnr.next().charAt(0);
			  
			  
		}while (end == 'y');
		System.out.println("Bye");
		
				
		scnr.close();
		
	}

}
