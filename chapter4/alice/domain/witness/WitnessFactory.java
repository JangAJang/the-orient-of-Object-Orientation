package chapter4.alice.domain.witness;

import chapter4.alice.view.WitnessType;

public class WitnessFactory {

    public static Witness createWitness(WitnessType witnessType, String testimony){
        if(witnessType.equals(WitnessType.ALICE)){
            return new Alice(testimony);
        }
        if(witnessType.equals(WitnessType.COOK)){
            return new Cook(testimony);
        }
        return new MadHatter(testimony);
    }
}
