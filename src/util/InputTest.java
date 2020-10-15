package util;

public class InputTest {
    public static void main(String[] args) {
        Input userInput = new Input();
//        System.out.println(userInput.getString());
//        if (userInput.yesNo())
//            System.out.println("This returned a true");
//        else
//            System.out.println("It actually said no");
        System.out.println(userInput.getInt(10, 20));
//        System.out.println(userInput.getInt());
        System.out.println(userInput.getDouble(5.7, 15.7));
//        System.out.println(userInput.getDouble() + ": is a valid input!");
    }


}
