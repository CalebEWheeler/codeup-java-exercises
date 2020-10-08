package movies;

public class MoviesApplication {
    public static void main(String[] args) {
        //Confused as to how this is targeting info from elsewhere in the package
        //4. Print out the constructed Movie from MoviesArray
        for (Movie movie: MoviesArray.findAll()) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }
}
