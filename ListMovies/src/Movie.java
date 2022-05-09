import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {

	//instance variables
	public String title;
	public String category;
	
	//getters and setters
	public String getTitle() {
		return title;
	}
	
	public void setTitle() {
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory() {
		this.category = category;
	}

	
	//Constructors
	public Movie(String title, String genre) {
			this.title = title;
			this.category = genre;
	
	}
	
	@Override
	public String toString() {
		return String.format(title, category);
	}
	


	


}
