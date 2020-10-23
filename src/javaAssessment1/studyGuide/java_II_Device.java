package javaAssessment1.studyGuide;

public class java_II_Device implements TextEditor{
    private String type;
    private String brand;
    private double price;

    public java_II_Device(String type, String brand, double price) throws IllegalArgumentException{
        this.type = type;
        this.brand = brand;
        this.price = price;
        try {
            if (type == null || brand == null) {throw new IllegalArgumentException(); }
            if (price == 0) {throw new IllegalArgumentException();}

        } catch(IllegalArgumentException iae) {
            System.err.println(iae);
        }

    }

    public String getType() {return type;}
    public String getBrand() {return brand;}
    public double getPrice() {return price;}

    public void setType(String type) {this.type = type;}
    public void setBrand(String brand) {this.brand = brand;}
    public void setPrice(double price) {this.price = price;}


    public static void main(String[] args) {
        java_II_Device phone = new java_II_Device("galaxy", "samsung", 0);
    }
}
