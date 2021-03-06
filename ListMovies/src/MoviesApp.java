import java.util.ArrayList;
import java.util.Scanner;

public class MoviesApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean again = true;

		ArrayList<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie("A Quiet Place", "scifi"));
		movieList.add(new Movie("Snowpiercer", "scifi"));
		movieList.add(new Movie("Saw", "horror"));
		movieList.add(new Movie("Texas Chainsaw Massacre", "horror"));
		movieList.add(new Movie("The Graduate", "drama"));
		movieList.add(new Movie("The Bridge On The River Kwai", "drama"));
		movieList.add(new Movie("Snow White And The Seven Dwarfs", "animated"));
		movieList.add(new Movie("Toy Story", "animated"));
		movieList.add(new Movie("A Streetcar Named Desire", "drama"));
		movieList.add(new Movie("A Clockwork Orange", "scifi"));

		System.out.println("Welcome to the Movie List Application!");

		System.out.println("\nThere are 10 movies in this list.\n");

		while (again) {

			System.out.println("What category are you interested in?" + "\nScifi"
					+ "\nHorror" + "\nDrama" + "\nAnimated");

			String input = scan.nextLine();

			for (Movie genre : movieList) {

				if (genre.getCategory().equalsIgnoreCase(input)) {
					System.out.println(genre.toString());
				}
			}

			System.out.println("Continue? (y/n)");
			String userInput = scan.nextLine();

			if (userInput.equalsIgnoreCase("y")) {
				continue;
			} else {
				System.out.println("Okay, bye!");
				break;
			}

		}
		again = false;

	}
}
