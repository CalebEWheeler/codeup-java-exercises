package shapes;

public class Square extends Quadrilateral {
// ========================  INTERFACES AND ABSTRACT CLASSES EXERCISE  =====================//
    public Square(double side) {
        super(side, side);
    }

    @Override
    double setLength() {
        return this.length;
    }

    @Override
    double setWidth() {
        return this.width;
    }

    @Override
    public double getPerimeter() {
        return (4 * this.length);
    }

    @Override
    public double getArea() {
        return (Math.pow(this.width, 2));
    }
//=========  COMMENTING OUT BELOW LINES FROM INHERITANCE AND POLYMORPHISM EXERCISE  =========//
//    protected int side;
//    //Square constructor
//    public Square(int side) {
//        super(side, side);
//        this.side = side;//this definition will allow the use of utilizing this.side...
//        // see lines 15 & 22 for utilizing inherited values...
//    }
//    @Override
//    //Method to getPerimeter of Square directly
//    public int getPerimeter() {
//        System.out.println("\nusing squares method!");
//        return (4 * this.side);
//        //can also access Length and width from super due to inheritance on line 7...
//        //return (4 * this.length);
//    }
//    //Method to getArea of Square directly
//    public int getArea() {
//        System.out.println("\nusing squares method!");
//        return (int) Math.pow(this.side, 2);
//        //can also access Length and width from super due to inheritance on line 7...
//        //return (4 * this.width);
//    }

}
