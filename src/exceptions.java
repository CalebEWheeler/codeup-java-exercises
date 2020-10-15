import java.util.Arrays;
import util.Input;
public class exceptions {

    public static void first() throws BIOException{
//        try {
//            //how to have all exception messages print?
//
//            //ArrayIndexOutOfBoundsException
//            int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
//            System.out.println("Number @ index 8: " + numbers[8]);
//            //NumberFormatException
//            Input input = new Input();
//            int goodbyeInt = input.getInt();
//            System.out.println("goodbye = " + goodbyeInt);
//            //ArithmeticException
//            int num = 1000 / 0;
//            System.out.println("Value of num is: " + num);
//            //NullPointerException
//            String getName = new String("");
//            if (getName.equals("got name!")) {
//                System.out.println("Here's the name I got: " + getName);
//            }
//            //IllegalArgumentException
//            System.out.println();
//            //RuntimeException
//            System.out.println();
//        } catch (ArrayIndexOutOfBoundsException aibex) {
//            System.out.println("ArrayIndexOutOfBoundsException");
//            System.out.println(aibex.getMessage());
//        } catch (NumberFormatException nfex) {
//            System.out.println("NumberFormatException");
//            System.out.println(nfex.getMessage());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }


        //Custom Exception implementation
//        try {
//            Exception ex = new BIOException();
//            throw ex;
////            throw new BIOException();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }

    }

    public static void dangerZone() throws BIOException{
        //throw an Exception 1/3 of the time
        if (Math.floor(Math.random() * 3) == 0) {
            throw new BIOException();
        }
        else {
            System.out.println("Mmm, that hits the spot!");
        }
    }

    public static void main(String [] args) throws Exception {
//        first();

        //Checked vs Unchecked?
        System.out.println("Freshly awake, you take your first sip of coffee...\n");
//        if (Math.floor(Math.random() * 3) == 0)
//            throw new Exception("A problem happend!");
//        System.out.println("Program Finished Successfully. Yay!!");
        try {
            dangerZone();
        } catch (BIOException bex) {
            System.out.println("A sudden movement bubbles from within!\nFrantically swivel your head side to side!\nSpot the bathroom, and proceed to stiffly waddle in that direction!\n\n" +
                    "Moments later you emerge victorious.");
        } finally {
            System.out.println("Time to start the day!");
        }

    }
}

//Custom Exception
class BIOException extends Exception {}