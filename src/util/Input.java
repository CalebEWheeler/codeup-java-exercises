package util;

import java.util.Scanner;

public class Input {
    //MY ORIGINAL SCANNER
//    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner;

    //    added Input() and placed everything into it
    public Input() {
        //NEW SCANNER GENERATED
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo() {
        return yesNo("Please enter yes or no");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = this.scanner.nextLine();
        return (input.trim().toLowerCase().equals("y") ||
                input.trim().toLowerCase().equals("yes"));
    }

    //PLAY WITH DIFFERENCE BETWEEN parseInt() and valueOf()
    //REFACTORING getInt() and getDouble() to include try/catch methods
    public int getInt() {
        return getInt("Please enter an Integer.");
    }

    public int getInt(int min, int max) {
        //Daniel's method
        while (true) {
            System.out.printf("Please enter an integer between %d and %d.\n", min, max);
            int num;
            try {

                String input = scanner.nextLine();
                num = Integer.parseInt(input);
            } catch (RuntimeException re) {
                System.err.println("You must enter an integer.");
                return getInt(min, max);
            }
            if (num >= min && num <= max)
                return num;
        }
    }

//    public int getInt() {
//        try {
//            String input = scanner.nextLine();
//            int num = Integer.parseInt(input);
//            return num;
//        } catch (NumberFormatException nfex) {
//            System.out.println(nfex.getMessage());
//            return getInt();
//        }
//    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();

        int num;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException nfex) {
            System.err.println("You must enter an integer.");
            return getInt(prompt);
        }
        return num;
    }

//    public int getInt(int min, int max, String prompt) {
//        while (true) {
//            System.out.printf("Please enter an integer between %d and %d.\n", min, max);
//            int num;
//            try {
//
//                String input = scanner.nextLine();
//                num = Integer.parseInt(input);
//            } catch (RuntimeException re) {
//                System.err.println("You must enter an integer.");
//                return getInt(min, max);
//            }
//            if (num >= min && num <= max)
//                return num;
//        }
//    }

    public double getDouble(double min, double max) {
        //Daniel's method
        while (true) {
            System.out.printf("Please enter a double between %.2f and %.2f.\n", min, max);
            double num;
            try {

                String input = scanner.nextLine();
                num = Double.parseDouble(input);
            } catch (RuntimeException re) {
                System.err.println("That's not a double");
                return getDouble(min, max);
            }
            if (num >= min && num <= max)
                return num;
        }
    }

    public double getDouble() {
        try {
            String input = scanner.nextLine();
            return Double.parseDouble(input);
        } catch (NumberFormatException nfex) {
            System.out.println(nfex.getMessage());
            return getDouble();
        }
    }

//    public Input(){
//        this.scanner = new Scanner(System.in);
//    }
//
//    public String getString(){return this.scanner.nextLine(); }
//    public String getString(String prompt){
//        System.out.println(prompt);
//        return getString();
//    }
//
//    public boolean yesNo(){return yesNo("Please enter yes or no"); }
//    public boolean yesNo(String prompt){
//        System.out.println(prompt);
//        String input = this.scanner.nextLine();
//        return (input.trim().toLowerCase().equals("y") ||
//                input.trim().toLowerCase().equals("yes"));
//    }
//
//    public int getInt(int min,int max){
//        return getInt(min,max,"Please enter an integer between "+min+" and "+max);
//    }
//    public int getInt(int min,int max,String prompt){
//        while (true) {
//            System.out.println(prompt);
//
//            String input = scanner.nextLine();
//            int num = Integer.parseInt(input);
//            if (num >= min && num <= max)
//                return num;
//        }
//    }
//
//    public int getInt(){
//        return getInt("Please enter an integer");
//    }
//    public int getInt(String prompt){
//        System.out.println(prompt);
//        String input = scanner.nextLine();
//        return Integer.parseInt(input);
//    }
//
//    public double getDouble(double min,double max){
//        while (true) {
//            System.out.printf("Please enter a number between %f and %f", min, max);
//
//            String input = scanner.nextLine();
//            double num = Double.parseDouble(input);
//            if (num >= min && num <= max)
//                return num;
//        }
//    }
//
//    public double getDouble(){
//        System.out.println("Please enter a number");
//        String input = scanner.nextLine();
//        return Double.parseDouble(input);
//    }
}
