import java.util.Scanner;

public class HighLow {
    public static void main(String [] args) {
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        String enteredNum = sc.nextLine();
        System.out.printf("You entered: %s", enteredNum);
    }
}
