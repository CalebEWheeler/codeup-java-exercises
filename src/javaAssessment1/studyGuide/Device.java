package javaAssessment1.studyGuide;

public class Device implements TextEditor{
    private String type;
    private String brand;
    private double price;

    public Device(String type, String brand, double price) throws IllegalArgumentException{
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

    public String openTextFile(String filename) {
        String message = "Opening $FILE with $EDITOR";

        if (this.brand.equals("Apple")) {
            return message.replace("$FILE", filename).replace("$EDITOR", "TextEdit");
        }
        else if (this.brand.equals("Microsoft")) {
            return message.replace("$FILE", filename).replace("$EDITOR", "Notepad");
        }
        else return message;
    }

    public static void main(String[] args) {
        Device phone = new Device("IphoneX", "Apple", 849.99);
        Device phone2 = new Device("somePhone", "Microsoft", 599.99);

        System.out.println("phone.openTextFile(\"contacts.txt\") = " + phone.openTextFile("contacts.txt"));
        System.out.println("phone2.openTextFile(\"studyGuide.txt\") = " + phone2.openTextFile("studyGuide.txt"));

    }
}
