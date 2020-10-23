package abstractClassesBonus;

public abstract class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable{
    public Sax(String instrumentClassification) {
        super(instrumentClassification);
    }
}
