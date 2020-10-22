package javaAssessment1.studyGuide;


import org.w3c.dom.ls.LSOutput;
import util.Input;

import java.lang.reflect.Array;

public class java_I {
    //=================================     KNOWLEDGE     =========================================//
    //* I can explain how Java code runs: from being written to executing on an operating system.
    //    Programmer>writes code to .java file>input from file to compiler>output from compiler to
    //    .class file>.class file runs on JVM(java virtual machine)>JVM runs on OS.
    //* I can explain the difference between a primitive type and a reference type in Java.
    //    A primitive type is a data type that is a value
    //    A reference type refer to an object or an array(they have a default value of "null"
    //* I can name several primitive types in Java.
    //    - byte
    //    - short
    //    - int
    //    - long
    //    - float
    //    - double
    //    - char
    //    - boolean
    //* I can explain why multiple number primitive types are used.
    //    multiple number primitive types are used to allow the programmer
    //    to utilize less storage space when writing code.
    //    Comes down to java compilation and how it allocates data.
    //* I can give an example of implicit and explicit casting.
    //    implicit casting - int myInteger = 900;
    //                       long morePrecise = myInteger;
    //    explicit casting - double pi = 3.14159;
    //                       int almostPi = (int) pi;
    //* I can explain the difference between a runtime and compile-time error.
    //    runtime error - error will occur when the code is running
    //    compile-time error - due to inaccuracies in code and code will not compile
    //* I can identify the major editions of Java.
    //    see curriculum - intro to Java
    //* I can define what a Java wrapper class is.
    //    a class whose object wraps or contains primitive data types


    //===================================     SKILLS     ==========================================//
    public static void main(String[] args) {
        //* I can write a hello world Java program from scratch.
        //System.out.println("Hello, world");

        //* I can write Java control statements (if, if/else, switch, ternary) and loops (while, do-while, for, for-each) from memory.

        int[] numbers = {1, 2, 3, 4, 5};
        String name = "aName";
        Input input = new Input();

        //IF/ELSE
//        System.out.println("Enter the string: aName");
//        if (input.getString().equals(name)) {
//            System.out.printf("name = %s", name);
//        } else {
//            System.out.printf("name != %s", name);
//        }

        //SWITCH
//        System.out.println("Please enter a number between 1-5");
//        int userInput = input.getInt();
//        switch (userInput) {
//            case 1:
//                System.out.printf("You entered the number: %d", userInput);
//                break;
//            case 2:
//                System.out.printf("You entered the number: %d", userInput);
//                break;
//            case 3:
//                System.out.printf("You entered the number: %d", userInput);
//                break;
//            case 4:
//                System.out.printf("You entered the number: %d", userInput);
//                break;
//            case 5:
//                System.out.printf("You entered the number: %d", userInput);
//                break;
//            default:
//                System.out.printf("%d is not a number between 1-5", userInput);
//
//        }

        //TERNARY
//        System.out.println();
//        System.out.println("Enter 2: ");
//        int userInput = input.getInt();
//        int checkInt = 2;
//        int here = (userInput == checkInt) ? userInput : -1;
//        System.out.printf("The number you entered is: %d", here);
//        System.out.println();

        //WHILE LOOP
//        int j = numbers[0];
//        while (j <= numbers.length) {
//            System.out.printf("While loop: %d", j);
//            j++;
//        }
//        System.out.println();

        //DO WHILE LOOP
//        int k = numbers[0];
//        do {
//            System.out.printf("Do while loop: %d", k);
//            k++;
//        } while (k <= numbers.length);
//        System.out.println();

        //FOR LOOP
//        for (int i = numbers[0]; i <= numbers.length; i++) {
//            System.out.printf("For loop: %d\n", i);
//        }
//        System.out.println();

        //ENHANCED FOR LOOP
//        for (int number : numbers) {
//            System.out.printf("Enhanced for loop: %d\n", number);
//        }

        //* I can write examples of the 8 Java primitive types.
        //  - int
        //  - short
        //  - long
        //  - float
        //  - double
        //  - char
        //  - boolean
        //  - byte

        //* I can write examples of explicit casting and implicit casting.
        //  - implicit casting ex:
        //      int num = 0;
        //      double doubleNum = num;
        //  - explicit casting ex:
        //      double doubleNum = (int) num;
        //* I can convert a numeric string to a number and a number to a numeric string.
        //  - numeric string to a number ex:
        //      String numToString = Integer.toString(12);
        //  - numeric string to a num ex:
        //      int stringToNum = Integer.parseInt(num);

        //* I can define a constant.
        //  - final int num = 21;

        //* I can write a program that takes in user input and returns an output to the user.
        //          Input userInput = new Input();
        //          System.out.println(userInput.getString());

        //* I can compare two string values.
        //  Input input2 = new Input();
        //  Input input3 = new Input();
        //  System.out.println("Enter a string: ");
        //  String hi = input2.getString();
        //  System.out.println("Enter another string: ");
        //  String hi1 = input3.getString();
        //  if (hi.equals(hi1)) {System.out.println("The two inputs are the same!");}
        //  else {System.out.println("They arent equal...");}

        //* I can get the length of string, trim it, get a portion of the string, create a new string replacing some portion of it.
//            String stringLength = "     Hi there friends";
//            System.out.printf("The length of stringLength is : %d\n", stringLength.length());
//            String trimStringLength = stringLength.trim();
//            System.out.printf("stringLength = %s\n", stringLength);
//            System.out.printf("stringLength trimmed = %s\n", trimStringLength);
//            String stringLengthPortion = trimStringLength.replace("friends", "pal");
//            System.out.println(stringLengthPortion);
    }

    //* I can write out a program comprised of multiple methods.
    public int returnInt() {
        return 0;
    }
    public String returnString() {
        return "";
    }
}

