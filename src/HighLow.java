import java.util.Scanner;

public class HighLow {
    public static void main(String [] args) {
        System.out.println("Please enter a number between 1 - 100: ");
        Scanner sc = new Scanner(System.in);
        int enteredNum = Integer.parseInt(sc.nextLine());
        if(enteredNum < 0 || enteredNum > 100) {
            System.out.println("That's not a valid number!");
        }
        else System.out.printf("You entered: %d", enteredNum);


    }

}