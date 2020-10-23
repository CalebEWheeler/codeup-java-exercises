package javaAssessment1.studyGuide;

public class Tablet extends java_II_Device{
    protected boolean physicalKeyboard;

    public Tablet(String type, String brand, double price, boolean physicalKeyboard) {
        super(type, brand, price);
        this.physicalKeyboard = physicalKeyboard;
    }

    public boolean hasPhysicalKeyboard() {
        return this.physicalKeyboard;
    }

    public static void main(String[] args) {
        Tablet ipad = new Tablet("ipad pro", "apple", 999.99, true);
        System.out.println("ipad.hasPhysicalKeyboard() = " + ipad.hasPhysicalKeyboard());
    }
}
