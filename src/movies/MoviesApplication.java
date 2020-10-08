package movies;
import java.util.Scanner;
public class MoviesApplication {
    public static void main(String[] args) {
        //Confused as to how this is targeting info from elsewhere in the package
        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\nEnter your choice: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        boolean exit = userInput.equals("0");
        boolean viewAll = userInput.equals("1");
        boolean viewAnimated = userInput.equals("2");
        boolean viewDrama = userInput.equals("3");
        boolean viewHorror = userInput.equals("4");
        boolean viewScifi = userInput.equals("5");

        if (exit) System.out.println("Goodbye");
        else if (viewAll) {
            for (Movie movie: MoviesArray.findAll()) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
//        else if (viewAnimated) {
//            for (Movie movie: MoviesArray.findAll()) {
//                System.out.println((movie.));
//            }
//        };
//        else if (viewDrama) {
//
//        };
//        else if (viewHorror) {
//
//        };
//        else if (viewScifi) {
//
//        };

    }
}
