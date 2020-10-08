package movies;
import java.util.Arrays;

//take Movies and break them down into a single movie
public class Movie {
    private String name;
    private String category;

    //1. Name getter
    public String getName() {
        return this.name;
    }
    //2. Category getter
    public String getCategory() {
        return this.category;
    }
    //3. Movie Constructor
    public Movie(String movieName, String movieCategory) {
        this.name = movieName;
        this.category = movieCategory;
    }

    public static void main(String[] args) {
        //4. Print out the constructed Movie from MoviesArray
        for (Movie movie: MoviesArray.findAll()) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }
}
