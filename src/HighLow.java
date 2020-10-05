import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        guessGame();
    }

    public static void guessGame() {
        int random = randomizer(0, 100);
        int tries = 6;
        System.out.println("Guess a number between 0-100: ");
//        System.out.print(random);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tries; i++) {
        int enteredNum = Integer.parseInt(sc.nextLine());
        if (enteredNum < 0 || enteredNum > 100) {
            System.out.println("That's not a valid guess!\nGuess again! I'm counting that one. ");
        } else {
                if (enteredNum < random && tries - 1 > i) System.out.println("HIGHER: Guess again!");
                else if (enteredNum > random && tries - 1 > i) System.out.println("LOWER: Guess again!");
                else if (i == tries - 1) {
                    System.out.println("You're all out of tries!\nWould you like to play again? [yes/no]");
                    String playAgain = sc.nextLine();
                    boolean yes = playAgain.equals("yes");
                    boolean no = playAgain.equals("no");
                    if (yes) {
                        guessGame();
                    }
                    else if (no) System.out.println("Bummer, I was having fun winning..");
                }
                else if (enteredNum == random) {
                    System.out.println("GOOD GUESS, YOU WIN!\nWould you like to play again? [yes/no]");
                    String playAgain = sc.nextLine();
                    boolean yes = playAgain.equals("yes");
                    boolean no = playAgain.equals("no");
                    if (yes) {
                        guessGame();
                    }
                    else if (no) System.out.println("Bummer, I wanted to settle the score..");
                }
            }
        }
    }

    public static int randomizer(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
}
