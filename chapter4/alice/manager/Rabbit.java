package chapter4.alice.manager;

import chapter4.alice.witness.Witness;

import java.util.List;

public class Rabbit implements Manager{

    private int witnessIndex;

    public Rabbit() {
        witnessIndex = 0;
    }

    @Override
    public Witness moveNextWitness(List<Witness> witnesses) {
        Witness witness = witnesses.get(witnessIndex);
        witnessIndex++;
        System.out.println("다음 증인 " + witness.getName() + " 대령했습니다.");
        return witness;
    }
}
