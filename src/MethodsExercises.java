import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println("Output of addition(): " + addition(2,3));
//        System.out.println("Output of subtraction(): " + subtraction(2,3));
//        System.out.println("Output of multiplication(): " + multiplication(2,3));
//        System.out.println("Output of division(): " + division(1,0));
//        System.out.println("Output of remainder(): " + remainder(3,10));
//        System.out.println("Output of Bonus: " + multiplication2(5,3));

//        System.out.println(getInteger(1, 10));
        System.out.println(getFactorialNum());
//        diceGame();
        dice();
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static float division(float a, float b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    //BONUS: create a multiplication method without the "*" operator.
    //       Then refactor it to utilize recursion
    public static int multiplication2(int a, int b) {
//        int result = 0;
//        for (int i = 0; i < b; i++) {
//            result += a;
//        }
//        return result;

        if ((a == 0) || (b == 0)) return 0;
        else return (a + multiplication2(a, b - 1));

    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = sc.nextInt();
        if ((userInput >= min) && (userInput <= max)) return userInput;
        else return getInteger(min, max);
    }

    public static String getFactorialNum() {
        Scanner sc = new Scanner(System.in);
        String userInput = Integer.toString(getInteger(1, 10));
        String calculatedInput = Long.toString(calculateFactorial(Integer.parseInt(userInput)));

        String factorial = (userInput + "!");
        System.out.println(factorial);

        System.out.println("Would you like to continue? [yes/no]");
        String userConfirm = sc.next();
        boolean confirmation = userConfirm.equals("yes");
        boolean no = userConfirm.equals("no");
        if (confirmation) return "Here's your factorial number: " + calculatedInput;
        else if (no) return "You're no fun!";
        else return getFactorialNum();
    }

    public static long calculateFactorial(long n) {
        long storedNum = n;
        long fact = 1;
        for (long i = 1; i <= storedNum; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static String diceGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of sides on the dice.");
        double inputDieFaces = Double.parseDouble(sc.nextLine());

        if (inputDieFaces > 1) {
            double[] dieFaces = (diceRoll(inputDieFaces));
            double dieValue = (dieFaces[0] + dieFaces[1]);
            System.out.printf("Would you like to roll the %.0f sided dice? [yes/no]", inputDieFaces);
            String startGame = sc.next();
            boolean start = startGame.equals("yes");
            boolean no = startGame.equals("no");
            if (start)
                System.out.printf("The first die is: %.0f\nThe second die is: %.0f\nYou rolled a %.0f\n", dieFaces[0], dieFaces[1], dieValue);
            else if (no) return "Then leave the table! You're taking up seats!";
        }
        else if (inputDieFaces < 0 || inputDieFaces == 0 || inputDieFaces == 1) System.out.print("Looks like we have a real joker in tonight.\n Look if you want to play tell me a real die!\n\n");
        return diceGame();
    }

    public static double[] diceRoll(double n) {
        double firstDie = (Math.floor(Math.random() * n));
        double secondDie = (Math.floor(Math.random() * n));
        double[] dice = new double[]{firstDie, secondDie};
        return dice;
    }


    //Cruzanio's Dice Game
    public static int randomizer(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
    public static void results(int die1, int die2) {
        int dieResult1 = randomizer(1, die1);
        int dieResult2 = randomizer(1, die2);
//        String combinedResults = "Die 1 result: "+dieResult1+"\nDie 2 result: "+dieResult2;
        System.out.println("Die 1 result: "+dieResult1);
        System.out.println("Die 2 result: "+dieResult2);
        System.out.println("Roll again? [y/N]");
        Scanner toRollAgain = new Scanner(System.in);
        String rollAgain = toRollAgain.nextLine();
        if (rollAgain.equalsIgnoreCase("y")) {
            results(die1, die2);
        } else {
            System.out.println("Would you like to pick new die? [y/N]");
            if (toRollAgain.nextLine().equalsIgnoreCase("y")) {
                dice();
            }
        }
    }
    public static void dice() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number of sides for Die 1: ");
        int die1 = userInput.nextInt();
        System.out.print("Enter number of sides for Die 2: ");
        int die2 = userInput.nextInt();
        System.out.print("Type 'roll' to roll the dice: ");
        userInput.nextLine();
        String answerToRoll = userInput.nextLine();
        if (answerToRoll.isEmpty() || !answerToRoll.equalsIgnoreCase("roll")) {
            dice();
        } else {
            results(die1, die2);
        }
    }
}
