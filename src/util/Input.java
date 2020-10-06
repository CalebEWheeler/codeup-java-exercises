package util;
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
            return this.scanner.nextLine();
        }
        public boolean yesNo () {
            System.out.println("Enter: yes or no");
            String input = this.scanner.nextLine();
//            if (input.equals("y") || input.equalsIgnoreCase("yes") || input.startsWith("Y")) return true;
//            else return false;

            //Daniel's method
            return (input.trim().toLowerCase().startsWith("y") ||
                    input.trim().toLowerCase().startsWith("yes"));
        }
        public int getInt ( int min, int max){
//            System.out.println("Please enter a number between 1-10");
//            int input = scanner.nextInt();
//            if (input >= min && input <= max) return input;
//            else return getInt(1, 10);

            //Daniel's method
            while (true) {
                System.out.printf("Please enter an integer between %d and %d.\n", min, max);

                String input = scanner.nextLine();
                int num = Integer.parseInt(input);
                if (num >= min && num <= max)
                    return num;
            }
        }
        public int getInt() {
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            return num;
        }
        public double getDouble ( double min, double max){
//            System.out.println("Please enter a number between 5.7-15.7");
//            double input = scanner.nextDouble();
//            if (input >= min && input <= max) return input;
//            else return getDouble(5.7, 15.7);

            //Daniel's method
            while (true) {
                System.out.printf("Please enter a double between %.2f and %.2f.\n", min, max);

                String input = scanner.nextLine();
                double num = Double.parseDouble(input);
                if (num >= min && num <= max)
                    return num;
            }
        }
        public double getDouble () {
            String input = scanner.nextLine();
            return Double.parseDouble(input);
        }

}
