package abstractClassesBonus;

public abstract class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable{
    public Piano(String instrumentClassification) {
        super(instrumentClassification);
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
