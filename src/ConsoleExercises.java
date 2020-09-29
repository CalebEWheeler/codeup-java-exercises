import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String [] args) {

//=========================  EXERCISE TO FORMAT PI  ======================//

//        double pi = 3.14159;
//        String strDouble = String.format("%.2f", pi);
//        System.out.printf("The value of pi is approximately %s. \n", strDouble);

        //or

//        double pi = 3.14159;
//        System.out.printf("The value of pi is appoximately %.2f", pi);

//======================  EXERCISE TO EXPLORE SCANNER  =================//


//        Scanner scanner = new Scanner(System.in);
        //ADDED FROM BONUS
//        scanner.useDelimiter("\n");

//        System.out.println("Please enter your name: ");
//        String firstName = scanner.next();
//        String middleName = scanner.next();
//        String lastName = scanner.next();
//        System.out.printf("Hello, %s %s %s!\n", firstName, middleName, lastName);

            //Another sample
//        System.out.println("Enter some numbers: ");
//        int firstNum = scanner.nextInt();
//        int secondNum = scanner.nextInt();
//        int thirdNum = scanner.nextInt();
//        System.out.printf("The first number is:  %d\nThe second number is: %d\nThe third number is:  %d", firstNum, secondNum, thirdNum);

//==============  EXERCISE THAT CALCULATES THE PERIMETER AND AREA  =============//

//        System.out.println("Please enter the length, width, and height of the Codeup Classroom: ");
//        String length = scanner.nextLine();
//        String width = scanner.nextLine();
//        String height = scanner.nextLine();

//        int l = Integer.parseInt(length);
//        int w = Integer.parseInt(width);
//        int h = Integer.parseInt(height);
//        int perimeter = (l*2) + (w*2);
//        int area = (l * w);
//        int volume = (l * w * h);

        //WILL RETURN THE PROPER PERIMETER AND AREA
//        System.out.printf("The perimeter is: %d\nThe area is: %d\nThe volume is: %d", perimeter, area, volume);



//============================  BONUS EXERCISE  =========================//

        //REFACTORED TO ACCEPT DECIMAL VALUES
//        float l = Float.parseFloat(length);
//        float w = Float.parseFloat(width);
//        float h = Float.parseFloat(height);
//        float perimeter = (l*2) + (w*2);
//        float area = (l * w);
//        float volume = (l * w * h);

//        System.out.printf("The perimeter is: %.2f\nThe area is: %.2f\nThe volume is: %.2f", perimeter, area, volume);

//============================  END OF BONUS EXERCISE  =========================//






//==========================  WALKTHROUGH ==============================//

//        System.out.println("Console Exercise");
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.\n", pi);

        //Explore the Scanner
        //Create the scanner
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
//        System.out.println("Please enter your number.");
//        int number = sc.nextInt();
//        System.out.printf("The number entered is %s.", number);

//        System.out.println("Please enter three words");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        System.out.printf("Your three words are %s %s %s.\n", word1, word2, word3);
//        sc.nextLine();
//
//        System.out.println("Tell me something.");
//        String something = sc.nextLine();
//        System.out.printf("%s is very interesting.", something);

        System.out.println("Please enter the length of the classroom.");
        int length = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter the width of the classroom.");
        int width = Integer.parseInt(sc.nextLine());

        int area = length * width;
        int perimeter = (2 * length) + (2 * width);

        System.out.printf("The area is: %d\n", area);
        System.out.printf("The perimeter is: %d\n", perimeter);


    }

}
