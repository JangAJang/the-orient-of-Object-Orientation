package chapter4.alice.domain.judge;

import chapter4.alice.domain.manager.Manager;
import chapter4.alice.domain.witness.Witness;

import java.util.ArrayList;
import java.util.List;

public class HeartKing implements Judge{

    private final List<Witness> valuableWitness = new ArrayList<>();
    private final Time time;
    private final Place place;

    public HeartKing(Time time, Place place) {
        this.time = time;
        this.place = place;
    }

    @Override
    public void startCourt() {
        System.out.println("이제부터 재판을 시작하겠다.");
    }

    @Override
    public Witness callNextWitness(Manager manager, List<Witness> witnesses) {
        return manager.moveNextWitness(witnesses);
    }

    @Override
    public void startTestimony(Witness witness) {
        System.out.println("증인은 증언을 시작하라.");
        String testimony = witness.tellWhatTheyKnow(time, place);
        if(testimony.contains("하트 잭")){
            valuableWitness.add(witness);
            System.out.println("쓸만한 정보구나.");
            return;
        }
        System.out.println("쓸모없는 정보구나.");
    }

    public void checkUsefulTestimonies(){
        for(Witness testimony : valuableWitness){
            System.out.println(testimony.getName() + " : " + testimony.tellWhatTheyKnow(time, place));
        }
    }
}
