package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner = new Scanner(System.in);
    String getString() {
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }
    boolean yesNo() {
        System.out.println("Enter: y/yes/Yes/YES or enter no");
        String input = scanner.nextLine();
        if (input.equals("y") || input.equalsIgnoreCase("yes") || input.startsWith("Y")) return true;
        else return false;
    }
    int getInt(int min, int max) {
        System.out.println("Please enter a number between 1-10");
        int input = scanner.nextInt();
        if (input >= min && input <= max) return input;
        else return getInt(1, 10);
    }
    double getDouble(double min, double max) {
        System.out.println("Please enter a number between 5-15");
        double input = scanner.nextDouble();
        if (input >= min && input <= max) return input;
        else return getDouble(5.7, 15.7);
    }
    double getDouble() {
        System.out.println("Please enter two numbers: ");
        double input1 = scanner.nextDouble();
        double input2 = scanner.nextDouble();
        System.out.println("Please enter a number that is between the " +
                "two numbers you entered earlier.");
        double input3 = scanner.nextDouble();
        if (input3 >= input1 && input3 <= input2) return input3;
        else return getDouble();

    }

//    public static void main(String[] args) {
//        Input userInput = new Input();
//        System.out.println("Enter a string: ");
//        System.out.println(userInput.getString());
//        System.out.println("Enter: y/yes/Yes/YES or enter no");
//        System.out.println(userInput.yesNo());
//        System.out.println(userInput.getInt(1, 10) + ": is a valid input!");
//        System.out.println(userInput.getDouble(5.7, 15.7) + ": is a valid input!");
//        System.out.println(userInput.getDouble() + ": is a valid input!");
//    }

}
