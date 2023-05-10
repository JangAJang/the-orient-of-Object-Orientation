package chapter4.alice.domain.witness;

import chapter4.alice.domain.judge.Place;
import chapter4.alice.domain.judge.Time;

public interface Witness {
    String tellWhatTheyKnow(Time time, Place place);
    String getName();
}
