package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner = new Scanner(System.in);
    String getString() {
        return scanner.nextLine();
    }
    boolean yesNo() {
        String input = scanner.nextLine();
        if (input.equals("y") || input.equalsIgnoreCase("yes") || input.startsWith("Y")) return true;
        else return false;
    }
//    int getInt(int min, int max) {
//
//    }
//    double getDouble(double min, double max) {
//
//    }
//    double getDouble() {
//
//    }

    public static void main(String[] args) {
        Input userInput = new Input();
//        System.out.println("Enter a string: ");
//        System.out.println(userInput.getString());
        System.out.println("Enter: y/yes/Yes/YES or enter no");
        System.out.println(userInput.yesNo());

    }

}
