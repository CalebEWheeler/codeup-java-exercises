package javaAssessment1.studyGuide;

public class Tablet extends java_II_Device{
    protected boolean physicalKeyboard;

    public Tablet(String type, String brand, double price, boolean physicalKeyboard) {
        super(type, brand, price);
        this.physicalKeyboard = physicalKeyboard;
    }
}
