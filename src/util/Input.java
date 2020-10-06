package util;
import shapes.Circle;
import java.util.Scanner;


public class Input {
    //MY ORIGINAL SCANNER
//    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner;

    //added Input() and placed everything into it
    public Input() {
        //NEW SCANNER GENERATED
        this.scanner = new Scanner(System.in);
    }
        String getString () {
            System.out.println("Enter a string: ");
            return scanner.nextLine();
        }
        boolean yesNo () {
            System.out.println("Enter: y/yes/Yes/YES or enter no");
            String input = scanner.nextLine();
            if (input.equals("y") || input.equalsIgnoreCase("yes") || input.startsWith("Y")) return true;
            else return false;
        }
        int getInt ( int min, int max){
            System.out.println("Please enter a number between 1-10");
            int input = scanner.nextInt();
            if (input >= min && input <= max) return input;
            else return getInt(1, 10);
        }
        double getDouble ( double min, double max){
            System.out.println("Please enter a number between 5.7-15.7");
            double input = scanner.nextDouble();
            if (input >= min && input <= max) return input;
            else return getDouble(5.7, 15.7);
        }
        double getDouble () {
            System.out.println("Please enter two numbers: ");
            double input1 = scanner.nextDouble();
            double input2 = scanner.nextDouble();
            System.out.println("Please enter a number that is between the " +
                    "two numbers you entered earlier.");
            double input3 = scanner.nextDouble();
            if (input3 >= input1 && input3 <= input2) return input3;
            else return getDouble();

        }

        //Circle.class portion
//        public static void getInfo () {
            //will get the radius if only getRadius() is active
//            Circle c1 = new Circle();
//            System.out.printf("This is the radius you entered: %d", c1.getRadius());

            //refactor Circle() to return the radius
//        Circle c1 = new Circle(radius);
//        System.out.println();



//        }

}
