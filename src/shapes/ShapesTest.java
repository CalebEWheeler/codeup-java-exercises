package shapes;

public class ShapesTest {
    public static void main(String[] args) {
// ========================  INTERFACES AND ABSTRACT CLASSES EXERCISE  =====================//
 Measurable myShape[] = {
         new Rectangle(3,4),
         new Square(5)
        };
        for (Measurable shape : myShape) {
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
        //Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
        // - IntelliJ says shapes.Rectangle is not abstract and does not override abstract method
        //      getPerimeter(), I guess when you are implementing you have to override the methods
        //      called in the interface. Measurable is a contract, by not having the requirements for the contract(getPerimeter())
        //      you cannot fulfill the contract.

        //What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//        System.out.println(myShape[0].getLength());
//        System.out.println(myShape[1].getWidth());
        // - the IDE tracks back methods created in the interface Measurable.
        //      Currently getLength and getWidth do not exist inside of the interface,
        //      therefore the IDE gives an error that states it cannot find the above methods.
        //      In other words, getLength() & getWidth() are not in the contract, so bringing them along is a no go.


//=========  COMMENTING OUT BELOW LINES FROM INHERITANCE AND POLYMORPHISM EXERCISE  =========//
        //New box taking getPerimeter() and getArea() from Rectangle.class
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println("The Perimeter of box1: " + box1.getPerimeter());
//        System.out.println("The Area of box1: " + box1.getArea());

        //Polymorphism/Inheritance Example...
        //Square is able to be created by Inheriting the rules from Rectangle()
        // Inheriting getPerimeter() and getArea() from Rectangle.class
        //After the Override is implemented, you'll see that Inheritance is happening
        // but the Override occurs due to the message displayed below
//        Rectangle box2 = new Square(5);
//        System.out.println("The Perimeter of box2: " + box2.getPerimeter());
//        System.out.println("The Area of box2: " + box2.getArea());

        //New box taking getPerimeter() and getArea() from Square.class
//        Square box3 = new Square(6);
//        System.out.println("The Perimeter of box3: " + box3.getPerimeter());
//        System.out.println("The Area of box3: " + box3.getArea() + "\n");

//        System.out.print("Fer's walkthrough:\n");
        //Fer's walkthrough example to do the heavy lifting of lines(6-15)...
//        Rectangle[] group = new Rectangle[2];
//        group[0] = new Rectangle(4,5);
//        group[1] = new Square(5); //

//        for (Rectangle rect: group) {
//            System.out.println("The Perimeter of rect: " + rect.getArea());
//            System.out.println("The Area of rect: " + rect.getPerimeter());
//        }
    }
}
