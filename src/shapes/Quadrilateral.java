package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double aLength, double aWidth) {
        this.length = aLength;
        this.width = aWidth;
    }

    //GETTERS
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    //SETTERS
    abstract double setLength();
    abstract double setWidth();
}
