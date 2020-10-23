package abstractClassesBonus;

public abstract class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable{
    private String saxType;

    public Sax(String instrumentClassification, String saxType) {
        super(instrumentClassification);
        this.saxType = saxType;
    }

    public String getSaxType() {return this.saxType;}
    public void setSaxType(String saxType) {
        this.saxType = saxType;
    }

    public void tuneInstrument() {
        System.out.println("Tuning instrument");
    }
    public void detuneInstrument() {
        System.out.println("Detuning instrument");
    }
    public void volumeUp() {
        System.out.println("Turning the volume up");
    }
    public void volumeDown() {
        System.out.println("Turning the volume down");
    }
}
