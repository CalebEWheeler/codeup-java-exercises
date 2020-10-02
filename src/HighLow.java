import java.util.Scanner;

public class HighLow {
    public static void main(String [] args) {
        int random = randomizer(0, 100);
        System.out.println("Guess a number between 0-100:");
        Scanner sc = new Scanner(System.in);
        int enteredNum = Integer.parseInt(sc.nextLine());
        if(enteredNum < 0 || enteredNum > 100) {
            System.out.println("That's not a valid guess!");
        }
        else {
            if (enteredNum < random) System.out.println("HIGHER");
            else if (enteredNum > random) System.out.println("LOWER");
            else System.out.println("GOOD GUESS");
        }
    }

    public static int randomizer(int min, int max) {
        int range = (max-min) + 1;
        return (int) (Math.random() * range) + min;
    }

//    public static String guessGame() {
//
//    }
}