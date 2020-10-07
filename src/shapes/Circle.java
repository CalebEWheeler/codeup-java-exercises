package shapes;

public class Circle {
    private double radius;

    public Circle(double rad) {
        this.radius = rad;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumference() {
        return (Math.PI * 2) * this.radius;
    }
}
