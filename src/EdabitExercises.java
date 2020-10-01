public class EdabitExercises {
//ALL PROBLEMS SHOWN BELOW ARE PASTED TO THIS REPO FROM
// EDABIT AFTER THEY HAVE BEEN TESTED AND SUBMITTED.


    //1. All you have to do is type return true; between the curly braces { }
    public static class Program {
        public boolean returnTrue() {
            return true;

        }
    }


    //2. Create a method that takes two integers as arguments and return their sum.
    public class SumOfTwoNumbers {
        public static int sum(int a, int b) {
            return a + b;
        }
    }

    //3. Create a function that takes length and width and finds the perimeter of a rectangle.
    public class Challenge {
        public static int findPerimeter(int length, int width) {
            int perimeter = ((length * 2)+(width * 2));
            return perimeter;
        }
    }

    //4. Create a function that returns true when x is equal to y; otherwise return false.
    public class Program {
        public static boolean isSameNum(int x, int y) {
            if (x == y) return true;
            else return false;
        }
    }

    //5. Create a function that finds the maximum range of a triangle's third edge,
    // where the side lengths are all integers.
    public class Challenge {
        public static int nextEdge(int side1, int side2) {
            int maxEdge = ((side1 + side2) - 1);
            return maxEdge;
        }
    }

    //6. Create a method that takes an integer as its only argument and returns true
    // if it's less than or equal to zero, otherwise return false.
    public class Program {
        public static boolean lessThanOrEqualToZero(int num) {
            if (num <= 0) return true;
            else return false;
        }
    }

    //7. Write a function that takes the base and height of a triangle and return its area.
    public class Challenge {
        public static int triArea(int base, int height) {
            int area = (base * height) / 2;
            return area;
        }
    }

    //8. Create a function that takes a name and returns a greeting in the form of a string.
    public class Challenge {
        public static String helloName(String name) {
            String greeting = String.format("Hello %s!", name);
            return greeting;
        }
    }

    //9.


}
