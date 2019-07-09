
public class Movie {
	
	private String moviename;
	private String category;
	
	
	
	public Movie(String moviename, String category) {  //constructor
		this.moviename = moviename;
		this.category = category;
	}
	
	public String getMovieName() { //getter
		return moviename;
	} 
	
	public String getCategory() { //getter
		return category;
	} 
	
	public void setMovieName (String moviename) {  //setter
		this.moviename = moviename;
	}
	
	public void setCategory (String category) {  //setter
		this.category = category;
	}
	
	

}
