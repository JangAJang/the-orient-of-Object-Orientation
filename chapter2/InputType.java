package chapter2;

public enum InputType {

    Cake(1),
    Fan(2),
    Tea(3),
    Mushroom_To_Be_Tall(4),
    Mushroom_To_Be_Small(5);

    private int value;

    private InputType(int value) {
        this.value = value;
    }

    public boolean isTheValue(int command) {
        return value == command;
    }
}
