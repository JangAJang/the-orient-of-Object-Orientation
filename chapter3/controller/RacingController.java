package chapter3.controller;

import chapter3.CommandType;
import chapter3.Vehicle;
import chapter3.Vehicles;
import chapter3.factory.VehicleFactory;
import chapter3.factory.VehicleType;
import chapter3.view.InputView;
import chapter3.view.OutputView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static chapter3.CommandType.*;

public class RacingController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final Vehicles vehicles;
    private final int end;

    public RacingController() throws IOException {
        end = inputView.getEndLocation();
        int count = inputView.getCarCount();
        List<String> names = new ArrayList<>();
        Vehicle[] inputs = new Vehicle[count];
        for(int index = 0; index < count; index++){
            VehicleType type = inputView.getVehicleType();
            String[] info = inputView.getCarInfo(names, end);
            names.add(info[0]);
            inputs[index] = VehicleFactory.makeVehicle(type, info);
        }
        vehicles = new Vehicles(inputs);
    }

    public void startGame() throws IOException {
        while(true){
            CommandType commandType = inputView.getNextCommand();
            doCommand(commandType);
        }
    }

    private void doCommand(CommandType commandType){
        if(commandType.equals(MOVE)){
            move();
            return;
        }
        checkLocation();
    }

    private void move(){
        Vehicle vehicle = vehicles.move(end);
        if(vehicle == null) return;
        outputView.showWinner(vehicle);
        System.exit(0);
    }

    private void checkLocation(){
        List<String> location = vehicles.getLocations();
        outputView.showLocation(location);
    }
}
