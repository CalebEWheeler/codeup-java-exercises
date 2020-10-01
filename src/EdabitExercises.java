public class EdabitExercises {
//ALL PROBLEMS SHOWN BELOW ARE PASTED TO THIS REPO FROM
//  AFTER THEY HAVE BEEN TESTED AND SUBMITTED.

    public static void main (String [] args) {
        System.out.println("The output of problem 1: " + returnTrue());
        System.out.println("The output of problem 2: " + sum(2,3));
        System.out.println("The output of problem 3: " + findPerimeter(2,3));
        System.out.println("The output of problem 4: " + isSameNum(2,3));
        System.out.println("The output of problem 5: " + nextEdge(2,3));
        System.out.println("The output of problem 6: " + lessThanOrEqualToZero(-3));
        System.out.println("The output of problem 7: " + triArea(5,9));
        System.out.println("The output of problem 8: " + helloName("Caleb"));
        System.out.println("The output of problem 9: " + remainder(7,9));
    }

    //1. All you have to do is type return true; between the curly braces { }
        public static boolean returnTrue() {
            return true;

        }

    //2. Create a method that takes two integers as arguments and return their sum.
        public static int sum(int a, int b) {
            return a + b;
        }

    //3. Create a function that takes length and width and finds the perimeter of a rectangle.
        public static int findPerimeter(int length, int width) {
            int perimeter = ((length * 2)+(width * 2));
            return perimeter;
        }

    //4. Create a function that returns true when x is equal to y; otherwise return false.
        public static boolean isSameNum(int x, int y) {
            if (x == y) return true;
            else return false;
        }


    //5. Create a function that finds the maximum range of a triangle's third edge,
    // where the side lengths are all integers.
        public static int nextEdge(int side1, int side2) {
            int maxEdge = ((side1 + side2) - 1);
            return maxEdge;
        }

    //6. Create a method that takes an integer as its only argument and returns true
    // if it's less than or equal to zero, otherwise return false.
        public static boolean lessThanOrEqualToZero(int num) {
            if (num <= 0) return true;
            else return false;
        }

    //7. Write a function that takes the base and height of a triangle and return its area.
        public static int triArea(int base, int height) {
            int area = (base * height) / 2;
            return area;
        }

    //8. Create a function that takes a name and returns a greeting in the form of a string.
        public static String helloName(String name) {
            String greeting = String.format("Hello %s!", name);
            return greeting;
        }

    //9. There is a single operator in Java, capable of providing the remainder of a division
    // operation. Two numbers are passed as parameters. The first parameter divided by the
    // second parameter will have a remainder, possibly zero. Return that value.
        public static int remainder(int a, int b) {
            int findRemainder = (a%b);
            return findRemainder;
        }

    //10. Create a method that returns the number of frames shown in a given number of
    // minutes for a certain FPS.




}