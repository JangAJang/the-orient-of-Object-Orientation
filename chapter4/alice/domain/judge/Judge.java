package chapter4.alice.domain.judge;

import chapter4.alice.domain.manager.Manager;
import chapter4.alice.domain.witness.Witness;

import java.util.List;

public interface Judge {

    void startCourt();
    Witness callNextWitness(Manager manager, List<Witness> witnesses);
    void startTestimony(Witness witness);
}
