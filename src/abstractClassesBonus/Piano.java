package abstractClassesBonus;

public abstract class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable{
    public Piano(String instrumentClassification) {
        super(instrumentClassification);
    }
}
