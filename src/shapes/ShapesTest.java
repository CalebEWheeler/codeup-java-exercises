package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        //New box taking everything from Rectangle.class
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("The Perimeter of box1: " + box1.getPerimeter());
        System.out.println("The Area of box1: " + box1.getArea());

        //Overriding methods example
        Rectangle box2 = new Square(5);
        System.out.println("The Perimeter of box2: " + box2.getPerimeter());
        System.out.println("The Area of box2: " + box2.getArea());

        //New box taking everything from Square.class
        Square box3 = new Square(6);
        System.out.println("The Perimeter of box3: " + box3.getPerimeter());
        System.out.println("The Area of box3: " + box3.getArea());

    }
}
