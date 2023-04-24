package chapter4.alice.domain.manager;

import chapter4.alice.domain.witness.Witness;

import java.util.List;

public interface Manager {
    Witness moveNextWitness(List<Witness> witnesses);
}
