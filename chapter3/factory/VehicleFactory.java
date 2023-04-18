package chapter3.factory;

import chapter3.Car;
import chapter3.RacingCar;
import chapter3.SUV;
import chapter3.Vehicle;

import static chapter3.factory.VehicleType.CAR;
import static chapter3.factory.VehicleType.SUV;

public class VehicleFactory {

    public static Vehicle makeVehicle(VehicleType type, String[] info){
        String name = info[0];
        int location = Integer.parseInt(info[1]);
        if(CAR.equals(type)){
            return new Car(name, location);
        }
        if(SUV.equals(type)){
            return new SUV(name, location);
        }
        return new RacingCar(name, location);
    }
}
