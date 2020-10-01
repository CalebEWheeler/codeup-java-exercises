public class MethodsExercises {
    public static void main(String [] args) {
        System.out.println("Output of addition(): " + addition(2,3));
        System.out.println("Output of subtraction(): " + subtraction(2,3));
        System.out.println("Output of multiplication(): " + multiplication(2,3));
        System.out.println("Output of division(): " + division(1,0));
        System.out.println("Output of remainder(): " + remainder(3,10));
        System.out.println("Output of Bonus: " + multiplication2(5,3));
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
}
