package chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Vehicles {

    private final Vehicle[] vehicles;

    public Vehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public Vehicle move(int end){
        for(Vehicle vehicle : vehicles){
            vehicle.move();
            if(vehicle.isFinished(end)) return vehicle;
        }
        return null;
    }

    public List<String> getLocations(){
        return Arrays.stream(vehicles).map(Vehicle::getLocation).collect(Collectors.toList());
    }
}
