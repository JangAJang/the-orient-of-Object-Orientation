package chapter4.alice.domain.witness;

import chapter4.alice.domain.judge.Place;
import chapter4.alice.domain.judge.Time;

public class MadHatter implements Witness{

    private final String testimony;

    public MadHatter(String testimony) {
        this.testimony = testimony;
    }

    @Override
    public String tellWhatTheyKnow(Time time, Place place) {
        if(time.isInTestimony(testimony) && place.isInTestimony(testimony))
            return testimony;
        return time.getMessage() + "에 " + place.getMessage()+"에서 아무것도 본 것이 없습니다.";
    }

    @Override
    public String getName() {
        return "모자장수";
    }
}
