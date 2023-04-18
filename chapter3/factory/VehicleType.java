package chapter3.factory;

import chapter3.Car;
import chapter3.RacingCar;
import chapter3.Vehicle;

public enum VehicleType {

    CAR("승용차"), SUV("SUV"), RACING_CAR("레이싱카");

    private final String input;

    private VehicleType(String input) {
        this.input = input;
    }

    public boolean isType(String input){
        return this.input.equals(input);
    }
}
