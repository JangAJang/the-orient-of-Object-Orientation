package chapter4.alice.domain.witness;

public enum EnumWitnessFactory {

    ALICE{
        @Override
        protected Witness createWitness(String witness) {
            return new Alice(witness);
        }
    },
    COOK{
        @Override
        protected Witness createWitness(String witness) {
            return new Cook(witness);
        }
    },
    MAD_HATTER{
        @Override
        protected Witness createWitness(String witness) {
            return new MadHatter(witness);
        }
    };

    public Witness create(String testimony){
        return createWitness(testimony);
    }

    abstract protected Witness createWitness(String witness);
}

