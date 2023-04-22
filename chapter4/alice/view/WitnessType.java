package chapter4.alice.view;

public enum WitnessType {

    ALICE("앨리스"),
    COOK("주방장"),
    MAD_HATTER("모자장수");

    private final String name;

    private WitnessType(String name) {
        this.name = name;
    }

    public boolean isTheInput(String input){
        return this.name.equals(input);
    }
}
