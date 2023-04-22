package chapter4.alice.witness;

public class MadHatter implements Witness{

    private final String testimony;

    public MadHatter(String testimony) {
        this.testimony = testimony;
    }

    @Override
    public String tellWhatTheyKnow() {
        return testimony;
    }

    @Override
    public String getName() {
        return "모자장수";
    }
}
