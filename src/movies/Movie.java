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

    //3. Movie Constructor - to create movies with two params
    public Movie(String movieName, String movieCategory) {
        this.name = movieName;
        this.category = movieCategory;
    }


    //FER'S WALKTHROUGH SETTERS
    public void setName(String movieName) {
        this.name = movieName;
    }

    public void setCategory(String movieCategory) {
        this.category = movieCategory;
    }
}
