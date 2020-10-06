package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner = new Scanner(System.in);
    String getString() {
        return scanner.nextLine();
    }
//    boolean yesNo() {
//
//    }
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
        System.out.println("Enter a string: ");
        System.out.println(userInput.getString());

    }

}
