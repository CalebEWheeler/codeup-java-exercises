package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int rectangleLength, int rectangleWidth) {
        this.length = rectangleLength;
        this.width = rectangleWidth;
    }

    public int getArea() {
        return this.length * this.width;
    }
    public int getPerimeter() {
        return ((2 * length) + (2 * width));
    }
}
