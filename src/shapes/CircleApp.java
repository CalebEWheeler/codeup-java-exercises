package shapes;
import util.Input;

public class CircleApp {
    public static void main(String [] args) {
        Input input = new Input();
        double rad = input.getDouble(0,100000);
        Circle c1 = new Circle(rad);
        System.out.println("c1.getCircumference() = " + c1.getCircumference());
        System.out.println("c1.getArea() = " + c1.getArea());
    }
}
