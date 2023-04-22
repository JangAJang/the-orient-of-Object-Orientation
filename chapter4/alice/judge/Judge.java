package chapter4.alice.judge;

import chapter4.alice.manager.Manager;
import chapter4.alice.witness.Witness;

import java.util.List;

public interface Judge {

    void startCourt();
    Witness callNextWitness(Manager manager, List<Witness> witnesses);
    void startTestimony(Witness witness);
}
