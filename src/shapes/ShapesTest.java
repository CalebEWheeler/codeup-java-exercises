package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        //New box taking getPerimeter() and getArea() from Rectangle.class
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("The Perimeter of box1: " + box1.getPerimeter());
        System.out.println("The Area of box1: " + box1.getArea());

        //Polymorphism/Inheritance Example...
        //Square is able to be created by Inheriting the rules from Rectangle()
        // Inheriting getPerimeter() and getArea() from Rectangle.class
        //After the Override is implemented, you'll see that Inheritance is happening
        // but the Override occurs due to the message displayed below
        Rectangle box2 = new Square(5);
        System.out.println("The Perimeter of box2: " + box2.getPerimeter());
        System.out.println("The Area of box2: " + box2.getArea());

        //New box taking getPerimeter() and getArea() from Square.class
        Square box3 = new Square(6);
        System.out.println("The Perimeter of box3: " + box3.getPerimeter());
        System.out.println("The Area of box3: " + box3.getArea() + "\n");

        System.out.print("Fer's walkthrough:\n");
        //Fer's walkthrough example to do the heavy lifting of lines(6-15)...
        Rectangle[] group = new Rectangle[2];
        group[0] = new Rectangle(4,5);
        group[1] = new Square(5); //

        for (Rectangle rect: group) {
            System.out.println("The Perimeter of rect: " + rect.getArea());
            System.out.println("The Area of rect: " + rect.getPerimeter());
        }
    }
}
