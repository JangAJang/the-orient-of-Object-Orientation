package chapter4.alice.domain.witness;

public class Alice implements Witness{

    private final String testimony;

    public Alice(String testimony) {
        this.testimony = testimony;
    }

    @Override
    public String tellWhatTheyKnow() {
        return testimony;
    }

    @Override
    public String getName() {
        return "앨리스";
    }
}
