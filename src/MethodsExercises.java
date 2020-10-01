public class MethodsExercises {
    public static void main(String [] args) {
        System.out.println("Output of addition(): " + addition(2,3));
        System.out.println("Output of subtraction(): " + subtraction(2,3));
        System.out.println("Output of multiplication(): " + multiplication(2,3));
        System.out.println("Output of division(): " + division(1,0));
        System.out.println("Output of remainder(): " + remainder(3,10));

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

    //BONUS: refactor the above methods to utilize recursion

}
