package shapes;
import java.util.Scanner;

public class Circle {
    private int radius;

    public double getRadius() {
        System.out.println("Please enter a radius to get started");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextInt();
        double r = radius;
        return r;
    }
//    public Circle(double radius) {
//
//    }
//    public double getArea() {
//
//    }
//    public double getCircumference() {
//
//    }
}
