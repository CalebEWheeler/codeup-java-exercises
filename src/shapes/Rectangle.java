package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    //Rectangle Constructor
    public Rectangle(int rectangleLength, int rectangleWidth) {
        this.length = rectangleLength;
        this.width = rectangleWidth;
    }
    //Method to getArea of Rectangle directly (is accessible through inheritance)
    public int getArea() {
        return this.length * this.width;
    }
    //Method to getPerimeter of Rectangle directly (is accessible through inheritance)
    public int getPerimeter() {
        return ((2 * this.length) + (2 * this.width));
    }
}
