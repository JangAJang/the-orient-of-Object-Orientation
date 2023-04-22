package chapter4.alice.manager;

import chapter4.alice.witness.Witness;

import java.util.List;

public interface Manager {
    Witness moveNextWitness(List<Witness> witnesses);
}
