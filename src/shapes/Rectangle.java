package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
// ========================  INTERFACES AND ABSTRACT CLASSES EXERCISE  =====================//
    public Rectangle(double aLength, double aWidth) {
        super(aLength, aWidth);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = length;
    }

    @Override
    public double getPerimeter() {
        return ((2 * this.getLength()) + (2 * this.getWidth()));
    }

    @Override
    public double getArea() {
        return (this.getLength() * this.getWidth());
    }

//=========  COMMENTING OUT BELOW LINES FROM INHERITANCE AND POLYMORPHISM EXERCISE  =========//
//    protected int length;
//    protected int width;
//
//    //Rectangle Constructor
//    public Rectangle(int rectangleLength, int rectangleWidth) {
//        this.length = rectangleLength;
//        this.width = rectangleWidth;
//    }
//    //Method to getArea of Rectangle directly (is accessible through inheritance)
//    public int getArea() {
//        return this.length * this.width;
//    }
//    //Method to getPerimeter of Rectangle directly (is accessible through inheritance)
//    public int getPerimeter() {
//        return ((2 * this.length) + (2 * this.width));
//    }
}
