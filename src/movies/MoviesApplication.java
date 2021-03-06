package movies;
import util.Input;

public class MoviesApplication {
    //Storing MoviesArray.findAll() to this class as the array movies;
    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - view movies in the musical category\n" +
                "7 - view movies in the comedy category\n" +
                "\nEnter your choice: ");


        switch(userInput.getInt(0,7)) {
            case 0:
//                System.out.println("Goodbye");
                //FER'S INTERESTING METHOD TO EXIT
                System.exit(0);
                break;
            case 1:
                getMovies(movies);
                break;
            case 2:
                getMovies(movies, "animated");
                break;
            case 3:
                getMovies(movies, "drama");
                break;
            case 4:
                getMovies(movies, "horror");
                break;
            case 5:
                getMovies(movies, "scifi");
                break;
            case 6:
                getMovies(movies, "musical");
                break;
            case 7:
                getMovies(movies, "comedy");
                break;
            default:
        }
    }

    public static void getMovies(Movie[] movies) {
        for(Movie movie: movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void getMovies(Movie[] movies, String category) {
        for (Movie movie: movies) {
            String moviesCategory = movie.getCategory();
            if (moviesCategory.equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    //OG METHOD TO UTILIZE AN IMPORTED SCANNER AND UTILIZING IF/ELSE BLOCKS

//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.next();

//        boolean exit = userInput.equals("0");
//        boolean viewAll = userInput.equals("1");
//        boolean viewAnimated = userInput.equals("2");
//        boolean viewDrama = userInput.equals("3");
//        boolean viewHorror = userInput.equals("4");
//        boolean viewScifi = userInput.equals("5");

//        if (exit) System.out.println("Goodbye");
//        else if (viewAll) {
//            for (Movie movie : MoviesArray.findAll()) {
//                System.out.println(movie.getName() + " -- " + movie.getCategory());
//            }
//        } else if (viewAnimated) {
//            for (Movie movie : MoviesArray.findAll()) {
//                if(movie.getCategory().equals("animated"))
//                System.out.println(movie.getName() + " -- " + movie.getCategory());
//            }
//        }
//        else if (viewDrama) {
//            for (Movie movie : MoviesArray.findAll()) {
//                if(movie.getCategory().equals("drama"))
//                    System.out.println(movie.getName() + " -- " + movie.getCategory());
//            }
//        }
//        else if (viewHorror) {
//            for (Movie movie : MoviesArray.findAll()) {
//                if(movie.getCategory().equals("horror"))
//                    System.out.println(movie.getName() + " -- " + movie.getCategory());
//            }
//        }
//        else if (viewScifi) {
//            for (Movie movie : MoviesArray.findAll()) {
//                if(movie.getCategory().equals("scifi"))
//                    System.out.println(movie.getName() + " -- " + movie.getCategory());
//            }
//        }
}

