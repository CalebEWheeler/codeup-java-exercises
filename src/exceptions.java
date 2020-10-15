import java.util.Arrays;
import util.Input;
public class exceptions {

    public static void first() {

        try {
            //how to have all exception messages print?

            //ArrayIndexOutOfBoundsException
            int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
            System.out.println("Number @ index 8: " + numbers[8]);
            //NumberFormatException
            Input input = new Input();
            int goodbyeInt = input.getInt();
            System.out.println("goodbye = " + goodbyeInt);
            //ArithmeticException
            int num = 1000 / 0;
            System.out.println("Value of num is: " + num);
            //NullPointerException
            String getName = new String("");
            if (getName.equals("got name!")) {
                System.out.println("Here's the name I got: " + getName);
            }
            //IllegalArgumentException
            System.out.println();
            //RuntimeException
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException aibex) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(aibex.getMessage());
        } catch (NumberFormatException nfex) {
            System.out.println("NumberFormatException");
            System.out.println(nfex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

    public static void main(String [] args) throws Exception {
        //        first();

        //Checked vs Unchecked?
        System.out.println("Hello World");
        if (Math.floor(Math.random() * 3) == 0)
            throw new Exception("A problem happend!");
        System.out.println("Program Finished Successfully. Yay!!");

    }
}

//Custom Exception
class BIOException extends Exception {}