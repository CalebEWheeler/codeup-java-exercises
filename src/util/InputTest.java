package util;

public class InputTest {
    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println(userInput.getString());
        System.out.println(userInput.yesNo());
        System.out.println(userInput.getInt(1, 10) + ": is a valid input!");
        System.out.println(userInput.getDouble(5.7, 15.7) + ": is a valid input!");
        System.out.println(userInput.getDouble() + ": is a valid input!");
    }


}
