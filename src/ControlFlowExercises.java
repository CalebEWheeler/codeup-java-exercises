import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String [] args) {

        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i+= 2;
//        } while (i < 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

//        for (int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if(i %3 == 0 & i %5 ==0) {
//                System.out.println("FizzBuzz");
//            }
//            else if(i %3 == 0) {
//                System.out.println("Fizz");
//            }
//            else if(i %5 ==0) {
//                System.out.println("Buzz");
//            }
//            else {
//                System.out.println(i);
//            }
//        }

//        Scanner scanner = new Scanner(System.in);


//        System.out.println("What number would you like to go up to?");
//        int userInput = Integer.parseInt(scanner.nextLine());
//
//        String tableHead = "number | squared | cubed\n" + "------ | ------- | -----\n";
//        System.out.printf("%s",tableHead);
//        for (int i = 1; i <= userInput; i++) {
//            int iSquared = i * i; //why do these two variables have to be in the loop to increment both i's?
//            int iCubed = i * iSquared;
//            System.out.printf("%d      | %d       | %d\n", i, iSquared, iCubed);
//        }

//        System.out.println("Please enter a number between 0-100");
//        int userInput = Integer.parseInt(scanner.nextLine());
//        System.out.print("Continue? [yes/no] ");
//
//        String userConfirm = scanner.next();
//        boolean confirmation = userConfirm.equals("yes"); //how to write a condition that will take y || yes || Yes.
//        boolean no = userConfirm.equals("no");
//        if (confirmation) {
//            for (int i = 0; i <= 100; i++ ) {
//                if (userInput <= 59 && i == userInput) System.out.println("You received an F");
//                else if (userInput >= 60 && userInput <= 62 && i == userInput) System.out.println("You received a D-");
//                else if (userInput >= 63 && userInput <= 66 && i == userInput) System.out.println("You received a D");
//                else if (userInput >= 67 && userInput <= 69 && i == userInput) System.out.println("You received a D+");
//                else if (userInput >= 70 && userInput <= 72 && i == userInput) System.out.println("You received a C-");                else if (userInput >= 67 && userInput <= 79 && i == userInput) System.out.println("You received a C");
//                else if (userInput >= 73 && userInput <= 76 && i == userInput) System.out.println("You received a C");
//                else if (userInput >= 77 && userInput <= 79 && i == userInput) System.out.println("You received a C+");
//                else if (userInput >= 80 && userInput <= 82 && i == userInput) System.out.println("You received a B-");
//                else if (userInput >= 83 && userInput <= 86 && i == userInput) System.out.println("You received a B");
//                else if (userInput >= 87 && userInput <= 89 && i == userInput) System.out.println("You received a B+");
//                else if (userInput >= 90 && userInput <= 92 && i == userInput) System.out.println("You received an A-");
//                else if (userInput >= 93 && userInput <= 98 && i == userInput) System.out.println("You received an A");
//                else if (userInput > 93 && userInput <= 98 && i == userInput) System.out.println("You received an A+");
//            }
//        }
//
//        else if (no) System.out.println("Bye boo.");

    }
}
