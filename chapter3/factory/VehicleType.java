package chapter3.factory;

import java.util.Arrays;

public enum VehicleType {

    CAR("승용차"), SUV("SUV"), RACING_CAR("레이싱카");

    private final String input;

    private VehicleType(String input) {
        this.input = input;
    }

    public boolean isType(String input){
        return this.input.equals(input);
    }

    public static VehicleType getType(String message) throws IllegalAccessException {
        return Arrays.stream(values()).filter(i -> i.isType(message)).findFirst().orElseThrow(IllegalAccessException::new);
    }
}
