package javaAssessment1.studyGuide;

public class java_II {
    //MISSED QUESTIONS FROM QUIZ:
    //* Which one of the following definitions is invalid?
    //      abstract class Marker {
    //    public void write();
    //}
    //* What is the difference between an abstract class and an interface?
    //      An interface only contains abstract methods, while an abstract class can
    //      have both abstract methods and regular methods.
    //* Can i write the code for the procedure of a method in a Java Interface? No you can't
    //* Programming which declares variables or methods of an interface or abstract class rather than concrete classes to avoid tightly coupled code.
    //    polymorphism
    //* You can instantiate an abstract class.
    //    False - Cannot be directly instantiated since it is missing implementation details
    //=================================     KNOWLEDGE     =========================================//
    //* I can articulate what OOP is.
    //      creating objects that contain both data and methods
    //* I can identify the four levels of visibility for a class/field/method and the identifiers used.
    //      - public (accessible everywhere)
    //      - private (only accessible within the class that defines it)
    //      - protected (accessible everywhere besides outside of a project) fields and methods are available to the class that defines them, as well as any subclasses.
    //      - no modifier (package private) - accessible within the same package
    //* I know what class of static methods is often used when working with arrays.
    //      you want an array to be static so it belongs to a class and can be accessed through the class
    //* I can explain the difference between static (class) fields/methods and instance fields/methods.
    //      - instance methods allow you to create instance objects with different values for
    //          their instance fields, can carry over to other classes
    //      - static methods belong to a class as a whole, they are accessible through the class
    //          itself, without creating an instance of the class ex: Math.PI || Math.floor() || Class.method()
    //* I can explain the difference between method overloading and method overriding.
    //      - method overloading is creating another method with the same name, but passing different
    //          parameters
    //      - method overriding allows subclasses to define a method with the same name, return type,
    //          and parameters as in the superclass. Allows the subclass to provide it's own
    //          implementation of a method
    //* I can identify the four pillars of object-oriented programming and give examples of each one.
    //      - Abstraction (abstract classes/interfaces/methods hiding unwanted info) ex: public abstract void method() {}
    //      - Polymorphism (engine - polymorphism(I6, I4, I5, v6, v8, v10) defining what kind of engine...
    //      - Inheritance (mutants <= x-men) x-men are all mutants, but not all mutants are x-men...
    //      - Encapsulation (hiding data in a private method encapsulates) ex: private int number;
    //* I can describe the differences between interfaces and abstract classes and their use cases.
    //
    //* I can generally describe what the Java Collections Framework is and specifically
    //      talk about the differences between a list, set, and map.
    //
    //* I can explain the difference between a checked and unchecked exception.
    //
    //* I can explain what a Java annotation is, why they are used, and give examples.
    //      notes developers use to know what is going on with code
    //      - Deprecated (notation for old method)
    //      - Override  (notation that method is being overriden elsewhere)
    //      - SuppressWarnings (notation that will suppress any warnings)
    //* I can explain the difference between the throws and throw keywords with regard to exceptions.
    //

    //===================================     SKILLS     ==========================================//
    //* I can write a class that contains both static and instance fields and
    //      methods, constructors, setters and getters.


    //* I can write a program composed of multiple classes requiring instantiation
    //      (not just using classes as groups of static methods).

    //* I can write my own reference type and fill instances of it in an ArrayList and
    //      HashMap and use it as a return and input type of a method.

    //* I can write an abstract class and a subclass that extends from the abstract class.

    //* I can write multiple interfaces and implement their methods in another class.

    //* I can create arrays of various data types and sizes with and without using an array initializer.

    //* I can get the length of an array, get a specific element or range of elements,
    //      create a new array replacing some portion of it, and iterate over an array of elements.

    //* I can do the above with an ArrayList.

    //* I can comfortably use the helper methods of both Arrays and Collections classes.

    //* I can write a program that throws a runtime exception.

    //* I can write an example of method overloading and method overriding.

    //* I can write a program that reads and writes to a file.

    //* I can write methods and collections that work with a parent class or interface type
    //      but use instances of objects that extend from these parent classes or implement
    //      these interfaces (Polymorphism).

    public static int cube(int input) {
        return input * input * input;
    }

    public static int difference(int num1, int num2) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(cube(2));

    }
}
