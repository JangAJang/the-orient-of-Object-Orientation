package chapter4.alice.domain.witness;

public class Cook implements Witness{

    private final String testimony;

    public Cook(String testimony) {
        this.testimony = testimony;
    }

    @Override
    public String tellWhatTheyKnow() {
        return testimony;
    }

    @Override
    public String getName() {
        return "요리사";
    }
}
