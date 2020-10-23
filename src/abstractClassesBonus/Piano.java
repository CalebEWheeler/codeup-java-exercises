package abstractClassesBonus;

public abstract class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable{
    private int numberOfKeys;

    public Piano(String instrumentClassification, int numberOfKeys) {
        super(instrumentClassification);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {return this.numberOfKeys;}
    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
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
