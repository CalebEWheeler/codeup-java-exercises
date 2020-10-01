import java.util.Scanner;

public class Bob {
    public static void main(String [] args) {
        System.out.println("What would you like to say to Bob?");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String respondQuestion = "Sure.";
        String respondExclaimation = "Woah, chill out!";
        String noResponse = "Fine be that way!";
        String genericResponse = "Whatever.";
        if (userInput.endsWith("?")) System.out.printf("%s", respondQuestion);
        else if (userInput.endsWith("!")) System.out.printf("%s", respondExclaimation);
        else if (userInput.equals("")) System.out.printf("%s", noResponse);
        else System.out.printf("%s", genericResponse);
    }
}
