package shapes;

public class Square extends Rectangle {
    protected int side;
    //Square constructor
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getPerimeter() {
        System.out.println("\nusing squares method!");
        return (4 * this.side);
    }
    public int getArea() {
        System.out.println("\nusing squares method!");
        return (int) Math.pow(this.side, 2);
    }
}
